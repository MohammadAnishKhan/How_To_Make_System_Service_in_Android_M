
+++ b/services/core/java/com/android/server/myservice/MySampleSystemService.java
@@ -0,0 +1,58 @@
+package com.android.server.myservice;
+
+import android.util.Log;
+import android.os.IBinder;
+import android.content.Context;
+import android.manandaidl.IMySampleSystemService;
+import com.android.server.SystemService;
+
+
+public class MySampleSystemService extends SystemService {
+	
+	private final Context mContext;
+	
+	private static final String TAG = "anish";
+	private long mNativePointer;
+	
+	public MySampleSystemService(Context ctx) {
+		super(ctx);
+		mContext =ctx;
+		publishBinderService(Context.MY_SYSTEM_SERVICE, mService);
+	}
+	
+	/**
+* Called when service is started by the main system service
+*/
+   @Override
+   public void onStart() {
+    Log.d(TAG, "Start service");
+    mNativePointer = init_native();
+   }
+   
+   /**
+* Implementation of AIDL service interface
+*/
+private final IBinder mService = new IMySampleSystemService.Stub() {
+/**
+* Implementation of the methods described in AIDL interface
+*/
+@Override
+public void callJNIMethod() {
+Log.d(TAG, "Call native service");
+
+/*
+* We do not really need the nativePointer here;
+* Just to show how arguments are passed to JNI from Java
+*/
+calling_func_hal(mNativePointer);
+}
+};
+	
+
+
+
+	/* Native functions declarations */
+private static native long init_native();
+private static native void calling_func_hal(long nativePointer);
+	}
+
