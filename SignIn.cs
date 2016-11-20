using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.Support.V7.App;
using Firebase.Auth;
using Android.Gms.Tasks;
using Android.Util;

namespace XamarinChatApp
{
    [Activity(Label = "SignIn", Theme = "@style/Theme.AppCompat.Light.NoActionBar")]
    public class SignIn : AppCompatActivity, IOnCompleteListener
    {
        FirebaseAuth auth;

        public void OnComplete(Task task)
        {
            if (task.IsSuccessful)
            {
                Toast.MakeText(this, "SignIn successfully !", ToastLength.Short).Show();
                Finish();
            }
            else
            {

                Toast.MakeText(this, "SignIn failed!", ToastLength.Short).Show();
                Finish();

            }
        }

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            SetContentView(Resource.Layout.SignIn);

            auth = FirebaseAuth.Instance;

            var edtEmail = FindViewById<EditText>(Resource.Id.edtEmail);
            var edtPassword = FindViewById<EditText>(Resource.Id.edtPassword);
            var btnRegister = FindViewById<Button>(Resource.Id.btnRegister);
            btnRegister.Click += delegate {
                auth.CreateUserWithEmailAndPassword(edtEmail.Text, edtPassword.Text)
                .AddOnCompleteListener(this);
            };
        }
    }
}