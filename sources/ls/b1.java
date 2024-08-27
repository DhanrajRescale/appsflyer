package ls;

import android.content.Context;
import android.util.DisplayMetrics;

/* loaded from: classes2.dex */
public final class b1 {

    /* renamed from: h, reason: collision with root package name */
    public static b1 f25124h;

    /* renamed from: i, reason: collision with root package name */
    public static final Object f25125i = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f25126a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f25127b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f25128c;

    /* renamed from: d, reason: collision with root package name */
    public final DisplayMetrics f25129d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25130e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f25131f;

    /* renamed from: g, reason: collision with root package name */
    public final String f25132g;

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:2|3)|(2:4|5)|6|(2:8|(1:10)(1:35))(1:36)|11|12|13|(5:19|20|22|23|24)(1:15)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b1(android.content.Context r10) {
        /*
            r9 = this;
            java.lang.String r0 = "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it."
            java.lang.String r1 = "MixpanelAPI.SysInfo"
            r9.<init>()
            r9.f25126a = r10
            android.content.pm.PackageManager r2 = r10.getPackageManager()
            r3 = 0
            r4 = 0
            java.lang.String r5 = r10.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            android.content.pm.PackageInfo r5 = r2.getPackageInfo(r5, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            java.lang.String r6 = r5.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            int r5 = r5.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            goto L27
        L20:
            r6 = r4
        L21:
            java.lang.String r5 = "System information constructed with a context that apparently doesn't exist."
            el.l.V0(r1, r5)
            r5 = r4
        L27:
            android.content.pm.ApplicationInfo r7 = r10.getApplicationInfo()
            int r8 = r7.labelRes
            r9.f25130e = r6
            r9.f25131f = r5
            if (r8 != 0) goto L3f
            java.lang.CharSequence r10 = r7.nonLocalizedLabel
            if (r10 != 0) goto L3a
            java.lang.String r10 = "Misc"
            goto L43
        L3a:
            java.lang.String r10 = r10.toString()
            goto L43
        L3f:
            java.lang.String r10 = r10.getString(r8)
        L43:
            r9.f25132g = r10
            java.lang.Class r10 = r2.getClass()
            r5 = 1
            java.lang.String r6 = "hasSystemFeature"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L57
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r3] = r8     // Catch: java.lang.NoSuchMethodException -> L57
            java.lang.reflect.Method r10 = r10.getMethod(r6, r7)     // Catch: java.lang.NoSuchMethodException -> L57
            goto L58
        L57:
            r10 = r4
        L58:
            if (r10 == 0) goto L81
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.IllegalAccessException -> L74 java.lang.reflect.InvocationTargetException -> L76
            java.lang.String r7 = "android.hardware.nfc"
            r6[r3] = r7     // Catch: java.lang.IllegalAccessException -> L74 java.lang.reflect.InvocationTargetException -> L76
            java.lang.Object r6 = r10.invoke(r2, r6)     // Catch: java.lang.IllegalAccessException -> L74 java.lang.reflect.InvocationTargetException -> L76
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.IllegalAccessException -> L74 java.lang.reflect.InvocationTargetException -> L76
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.IllegalAccessException -> L78 java.lang.reflect.InvocationTargetException -> L7d
            java.lang.String r7 = "android.hardware.telephony"
            r5[r3] = r7     // Catch: java.lang.IllegalAccessException -> L78 java.lang.reflect.InvocationTargetException -> L7d
            java.lang.Object r10 = r10.invoke(r2, r5)     // Catch: java.lang.IllegalAccessException -> L78 java.lang.reflect.InvocationTargetException -> L7d
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.IllegalAccessException -> L78 java.lang.reflect.InvocationTargetException -> L7d
        L72:
            r4 = r6
            goto L82
        L74:
            r6 = r4
            goto L78
        L76:
            r6 = r4
            goto L7d
        L78:
            el.l.V0(r1, r0)
        L7b:
            r10 = r4
            goto L72
        L7d:
            el.l.V0(r1, r0)
            goto L7b
        L81:
            r10 = r4
        L82:
            r9.f25127b = r4
            r9.f25128c = r10
            android.util.DisplayMetrics r10 = new android.util.DisplayMetrics
            r10.<init>()
            r9.f25129d = r10
            android.content.Context r0 = r9.f25126a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.b1.<init>(android.content.Context):void");
    }

    public static b1 a(Context context) {
        synchronized (f25125i) {
            try {
                if (f25124h == null) {
                    f25124h = new b1(context.getApplicationContext());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f25124h;
    }
}
