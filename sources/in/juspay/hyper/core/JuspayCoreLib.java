package in.juspay.hyper.core;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes2.dex */
public class JuspayCoreLib {
    private static Context applicationContext;

    public static Context getApplicationContext() {
        return applicationContext;
    }

    public static boolean isAppDebuggable() {
        Context applicationContext2 = getApplicationContext();
        if (applicationContext2 == null || (applicationContext2.getApplicationInfo().flags & 2) == 0) {
            return false;
        }
        return true;
    }

    public static void setApplicationContext(@NonNull Context context) {
        applicationContext = context;
    }
}
