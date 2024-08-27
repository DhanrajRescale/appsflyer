package k8;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.u;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22676a = u.C("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z10) {
        int i10;
        Object obj;
        String str = "disabled";
        String str2 = f22676a;
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i10, 1);
            u w10 = u.w();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (!z10) {
                obj = "disabled";
            } else {
                obj = "enabled";
            }
            objArr[1] = obj;
            w10.u(str2, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e10) {
            u w11 = u.w();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (z10) {
                str = "enabled";
            }
            objArr2[1] = str;
            w11.u(str2, String.format("%s could not be %s", objArr2), e10);
        }
    }
}
