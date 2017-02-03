+import android.manandaidl.MySampleSystemServiceManager;
+        Log.d("anish","onResume of SettingsActivity");
+        
+        MySampleSystemServiceManager mymanager =(MySampleSystemServiceManager)getSystemService(Context.MY_SYSTEM_SERVICE);
+        mymanager.callJNIMethod();
+        Log.d("anish","SettingsActivity onresume");
+    
