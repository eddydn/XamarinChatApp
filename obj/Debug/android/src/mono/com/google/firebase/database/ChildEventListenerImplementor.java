package mono.com.google.firebase.database;


public class ChildEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.firebase.database.ChildEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCancelled:(Lcom/google/firebase/database/DatabaseError;)V:GetOnCancelled_Lcom_google_firebase_database_DatabaseError_Handler:Firebase.Database.IChildEventListenerInvoker, Xamarin.Firebase.Database\n" +
			"n_onChildAdded:(Lcom/google/firebase/database/DataSnapshot;Ljava/lang/String;)V:GetOnChildAdded_Lcom_google_firebase_database_DataSnapshot_Ljava_lang_String_Handler:Firebase.Database.IChildEventListenerInvoker, Xamarin.Firebase.Database\n" +
			"n_onChildChanged:(Lcom/google/firebase/database/DataSnapshot;Ljava/lang/String;)V:GetOnChildChanged_Lcom_google_firebase_database_DataSnapshot_Ljava_lang_String_Handler:Firebase.Database.IChildEventListenerInvoker, Xamarin.Firebase.Database\n" +
			"n_onChildMoved:(Lcom/google/firebase/database/DataSnapshot;Ljava/lang/String;)V:GetOnChildMoved_Lcom_google_firebase_database_DataSnapshot_Ljava_lang_String_Handler:Firebase.Database.IChildEventListenerInvoker, Xamarin.Firebase.Database\n" +
			"n_onChildRemoved:(Lcom/google/firebase/database/DataSnapshot;)V:GetOnChildRemoved_Lcom_google_firebase_database_DataSnapshot_Handler:Firebase.Database.IChildEventListenerInvoker, Xamarin.Firebase.Database\n" +
			"";
		mono.android.Runtime.register ("Firebase.Database.IChildEventListenerImplementor, Xamarin.Firebase.Database, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ChildEventListenerImplementor.class, __md_methods);
	}


	public ChildEventListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ChildEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Firebase.Database.IChildEventListenerImplementor, Xamarin.Firebase.Database, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCancelled (com.google.firebase.database.DatabaseError p0)
	{
		n_onCancelled (p0);
	}

	private native void n_onCancelled (com.google.firebase.database.DatabaseError p0);


	public void onChildAdded (com.google.firebase.database.DataSnapshot p0, java.lang.String p1)
	{
		n_onChildAdded (p0, p1);
	}

	private native void n_onChildAdded (com.google.firebase.database.DataSnapshot p0, java.lang.String p1);


	public void onChildChanged (com.google.firebase.database.DataSnapshot p0, java.lang.String p1)
	{
		n_onChildChanged (p0, p1);
	}

	private native void n_onChildChanged (com.google.firebase.database.DataSnapshot p0, java.lang.String p1);


	public void onChildMoved (com.google.firebase.database.DataSnapshot p0, java.lang.String p1)
	{
		n_onChildMoved (p0, p1);
	}

	private native void n_onChildMoved (com.google.firebase.database.DataSnapshot p0, java.lang.String p1);


	public void onChildRemoved (com.google.firebase.database.DataSnapshot p0)
	{
		n_onChildRemoved (p0);
	}

	private native void n_onChildRemoved (com.google.firebase.database.DataSnapshot p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
