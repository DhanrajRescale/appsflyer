package q3;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f31622a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f31623b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f31624c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f31625d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f31626e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f31627f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f31628g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(2:2|3)|4|(2:5|6)|7|(2:8|9)|10|(12:33|34|13|(6:29|30|16|(3:24|25|26)|20|21)|15|16|(1:18)|24|25|26|20|21)|12|13|(0)|15|16|(0)|24|25|26|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            q3.j.f31628g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            q3.j.f31622a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            q3.j.f31623b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r0 = r1
        L31:
            q3.j.f31624c = r0
            java.lang.Class r0 = q3.j.f31622a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            if (r0 != 0) goto L40
        L3e:
            r0 = r1
            goto L53
        L40:
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L3e
            r8[r6] = r7     // Catch: java.lang.Throwable -> L3e
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L3e
            r8[r2] = r9     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r5] = r9     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r8)     // Catch: java.lang.Throwable -> L3e
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L3e
        L53:
            q3.j.f31625d = r0
            java.lang.Class r0 = q3.j.f31622a
            if (r0 != 0) goto L5b
        L59:
            r0 = r1
            goto L6a
        L5b:
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L59
            r8[r6] = r7     // Catch: java.lang.Throwable -> L59
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L59
            r8[r2] = r9     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r8)     // Catch: java.lang.Throwable -> L59
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L59
        L6a:
            q3.j.f31626e = r0
            java.lang.Class r0 = q3.j.f31622a
            java.lang.Class<android.content.res.Configuration> r4 = android.content.res.Configuration.class
            java.lang.Class<java.util.List> r8 = java.util.List.class
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            if (r9 == r10) goto L7c
            r10 = 27
            if (r9 != r10) goto La9
        L7c:
            if (r0 != 0) goto L7f
            goto La9
        L7f:
            java.lang.String r9 = "requestRelaunchActivity"
            r10 = 9
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> La9
            r10[r6] = r7     // Catch: java.lang.Throwable -> La9
            r10[r2] = r8     // Catch: java.lang.Throwable -> La9
            r10[r5] = r8     // Catch: java.lang.Throwable -> La9
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> La9
            r10[r3] = r5     // Catch: java.lang.Throwable -> La9
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> La9
            r5 = 4
            r10[r5] = r3     // Catch: java.lang.Throwable -> La9
            r5 = 5
            r10[r5] = r4     // Catch: java.lang.Throwable -> La9
            r5 = 6
            r10[r5] = r4     // Catch: java.lang.Throwable -> La9
            r4 = 7
            r10[r4] = r3     // Catch: java.lang.Throwable -> La9
            r4 = 8
            r10[r4] = r3     // Catch: java.lang.Throwable -> La9
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r9, r10)     // Catch: java.lang.Throwable -> La9
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> La9
            r1 = r0
        La9:
            q3.j.f31627f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.j.<clinit>():void");
    }
}
