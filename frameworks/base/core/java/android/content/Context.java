//Define SystemService name in frameworks/base/core/java/android/content/Context.java
--- a/core/java/android/content/Context.java
+++ b/core/java/android/content/Context.java
@@ -2958,6 +2958,14 @@ public abstract class Context {
      * @hide
      */

+    /**
+* Use with {@link #getSystemService} to retrieve a {@link
+* android.manandaidl.MySampleSystemServiceManager} instance
+* @see #getSystemService
+* @see android.manandaidl.MySampleSystemServiceManager
+*/
+public static final String MY_SYSTEM_SERVICE = "my";
