using System;
using System.Collections.Generic;
using Android.Views;
using Android.Widget;
using Java.Lang;
using Android.Content;

namespace XamarinChatApp
{
    internal class ListViewAdapter : BaseAdapter
    {
        private List<MessageContent> lstMessage;
        private MainActivity mainActivity;

        public ListViewAdapter(MainActivity mainActivity, List<MessageContent> lstMessage)
        {
            this.mainActivity = mainActivity;
            this.lstMessage = lstMessage;
        }

        public override int Count
        {
            get
            {
                return lstMessage.Count;
            }
        }

        public override Java.Lang.Object GetItem(int position)
        {
            return position;
        }

        public override long GetItemId(int position)
        {
            return position;
        }

        public override View GetView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflater = (LayoutInflater)mainActivity.BaseContext.GetSystemService(Context.LayoutInflaterService);
            View itemView = inflater.Inflate(Resource.Layout.List_Item, null);

            TextView message_user, message_time, message_content;
            message_user = itemView.FindViewById<TextView>(Resource.Id.message_user);
            message_content = itemView.FindViewById<TextView>(Resource.Id.message_text);
            message_time = itemView.FindViewById<TextView>(Resource.Id.message_time);

            message_user.Text = lstMessage[position].Email;
            message_time.Text = lstMessage[position].Time;
            message_content.Text = lstMessage[position].Message;

            return itemView;
        }
    }
}