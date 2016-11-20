using Android.App;
using Android.Widget;
using Android.OS;
using Android.Support.V7.App;
using Firebase.Xamarin.Database;
using System.Collections.Generic;
using com.refractored.fab;
using Firebase.Database;
using System;
using Firebase.Auth;
using Android.Content;
using Android.Runtime;

namespace XamarinChatApp
{
    [Activity(Label = "XamarinChatApp", MainLauncher = true, Icon = "@drawable/icon",Theme="@style/Theme.AppCompat.Light.NoActionBar")]
    public class MainActivity : AppCompatActivity,IValueEventListener
    {
        private FirebaseClient firebase;
        private List<MessageContent> lstMessage = new List<MessageContent>();
        private ListView lstChat;
        private EditText edtChat;
        private FloatingActionButton fab;

        public int MyResultCode = 1;


        protected override void OnActivityResult(int requestCode, [GeneratedEnum] Result resultCode, Intent data)
        {
            base.OnActivityResult(requestCode, resultCode, data);
        }



        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);
            SetContentView (Resource.Layout.Main);

            firebase = new FirebaseClient(GetString(Resource.String.firebase_database_url));
            FirebaseDatabase.Instance.GetReference("chats").AddValueEventListener(this);

            fab = FindViewById<FloatingActionButton>(Resource.Id.fab);
            edtChat = FindViewById<EditText>(Resource.Id.input);
            lstChat = FindViewById<ListView>(Resource.Id.list_of_messages);


            fab.Click += delegate
            {

                PostMessage();
            };

           

            if (FirebaseAuth.Instance.CurrentUser == null)
                StartActivityForResult(new Android.Content.Intent(this, typeof(SignIn)), MyResultCode);
            else
            {
                Toast.MakeText(this, "Welcome " + FirebaseAuth.Instance.CurrentUser.Email, ToastLength.Short).Show();
                DisplayChatMessage();
            }
        }

        private async void PostMessage()
        {
            var items = await firebase.Child("chats").PostAsync(new MessageContent(FirebaseAuth.Instance.CurrentUser.Email, edtChat.Text));
            edtChat.Text = "";
        }

        public void OnCancelled(DatabaseError error)
        {
            
        }

        public void OnDataChange(DataSnapshot snapshot)
        {
            DisplayChatMessage();
        }

        private async void DisplayChatMessage()
        {
            lstMessage.Clear();
            var items = await firebase.Child("chats")
                .OnceAsync<MessageContent>();
           
            foreach (var item in items)
                lstMessage.Add(item.Object);
            ListViewAdapter adapter = new ListViewAdapter(this, lstMessage);
            lstChat.Adapter = adapter;
            }
        }
    }


