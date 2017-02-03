+import android.manandaidl.MySampleSystemServiceManager;
+import android.manandaidl.IMySampleSystemService;
+            
+            registerService(Context.MY_SYSTEM_SERVICE, MySampleSystemServiceManager.class,
+                new StaticServiceFetcher<MySampleSystemServiceManager>() {
+            @Override
+            public MySampleSystemServiceManager createService() {
+                IBinder b = ServiceManager.getService(Context.MY_SYSTEM_SERVICE);
+return new MySampleSystemServiceManager(IMySampleSystemService.Stub.asInterface(b));
+            }});
