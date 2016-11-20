package mono.com.google.firebase.database;


public class DatabaseReference_CompletionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.firebase.database.DatabaseReference.CompletionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onComplete:(Lcom/google/firebase/database/DatabaseError;Lcom/google/firebase/database/DatabaseReference;)V:GetOnComplete_Lcom_google_firebase_database_DatabaseError_Lcom_google_firebase_database_DatabaseReference_Handler:Firebase.Database.DatabaseReference/ICompletionListenerInvoker, Xamarin.Firebase.Database\n" +
			"";
		mono.android.Runtime.register ("Firebase.Database.DatabaseReference+ICompletionListenerImplementor, Xamarin.Firebase.Database, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", DatabaseReference_CompletionListenerImplementor.class, __md_methods);
	}


	public DatabaseReference_CompletionListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == DatabaseReference_CompletionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Firebase.Database.DatabaseReference+ICompletionListenerImplementor, Xamarin.Firebase.Database, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onComplete (com.google.firebase.database.DatabaseError p0, com.google.firebase.database.DatabaseReference p1)
	{
		n_onComplete (p0, p1);
	}

	private native void n_onComplete (com.google.firebase.database.DatabaseError p0, com.google.firebase.database.DatabaseReference p1);

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
