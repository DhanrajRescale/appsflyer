package k8;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.work.u;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22677a = u.C("ProcessUtils");

    public static boolean a(Context context, androidx.work.d dVar) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            str = Application.getProcessName();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, i.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th2) {
                u.w().u(f22677a, "Unable to check ActivityThread for processName", th2);
            }
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
            }
            str = null;
        }
        dVar.getClass();
        if (!TextUtils.isEmpty(null)) {
            return TextUtils.equals(str, null);
        }
        return TextUtils.equals(str, context.getApplicationInfo().processName);
    }
}
