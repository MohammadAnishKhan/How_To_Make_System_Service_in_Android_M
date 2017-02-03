--- /dev/null
+++ b/core/java/android/manandaidl/MySampleSystemServiceManager.java
@@ -0,0 +1,58 @@
+package android.manandaidl;
+
+
+import android.manandaidl.IMySampleSystemService;
+import android.util.AndroidException;
+import android.util.Log;
+import android.content.Context;
+import android.os.RemoteException;
+
+
+
+public class MySampleSystemServiceManager  {
+	 
+	 //private final Context mContext;
+	 private final IMySampleSystemService mService;
+	
+	
+/**
+* Initialize the remote service and execution context
+* ContextImpl will build this manager object and provide the
+* remote service stub as parameter
+*
+* 
+* @param service
+*/
+public MySampleSystemServiceManager(IMySampleSystemService service) {
+Log.d("anish", " MySampleSystemServiceManager got the service "+service);
+    mService = service;
+}
+	
+	
+	/**
+ *Perform a call to the remote service;
+ *We have only one method, call it!
+*/
+public void callJNIMethod() {
+try{
+mService.callJNIMethod();
+Log.d("anish", " MySampleSystemServiceManager calling jni metod "+mService);
+} catch (RemoteException ex){
+Log.e("anish", " MySampleSystemServiceManager Unable to contact the remote Joffee Service");
+}
+}
+	
+	
+	/**
+* This method (which does nothing)
+* is hidden from system API
+* Have a look at 'reflection' to see how you can
+* access hidden class members
+*
+* @hide
+*/
+public void hiddenMethod(){
+Log.d("anish", "Hello I'm hidden");
+}
+
+}
