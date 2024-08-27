package q3;

import android.app.AppOpsManager;
import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class m {
    public static int a(AppOpsManager appOpsManager, @NonNull String str, int i10, @NonNull String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i10, str2);
    }

    @NonNull
    public static String b(@NonNull Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager c(@NonNull Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
