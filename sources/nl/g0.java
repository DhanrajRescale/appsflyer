package nl;

import java.util.TreeSet;

/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public TreeSet f28856a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:34:0x0004, B:36:0x0008, B:8:0x0033, B:10:0x0037, B:15:0x003d, B:16:0x0042, B:18:0x0046, B:20:0x0054, B:25:0x0061, B:23:0x0064, B:4:0x001b, B:7:0x0031, B:32:0x002d, B:29:0x0027), top: B:33:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:34:0x0004, B:36:0x0008, B:8:0x0033, B:10:0x0037, B:15:0x003d, B:16:0x0042, B:18:0x0046, B:20:0x0054, B:25:0x0061, B:23:0x0064, B:4:0x001b, B:7:0x0031, B:32:0x002d, B:29:0x0027), top: B:33:0x0004, inners: #1 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 != 0) goto L1b
            java.util.TreeSet r4 = r3.f28856a     // Catch: java.lang.Throwable -> L19
            if (r4 == 0) goto L1b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L19
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L19
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L19
            boolean r4 = kotlin.jvm.internal.Intrinsics.a(r4, r1)     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L33
            goto L1b
        L19:
            r4 = move-exception
            goto L6b
        L1b:
            nl.h0 r4 = nl.h0.f28857a     // Catch: java.lang.Throwable -> L19
            java.lang.Class<nl.h0> r1 = nl.h0.class
            boolean r2 = sl.a.b(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L27
        L25:
            r4 = r0
            goto L31
        L27:
            java.util.TreeSet r4 = r4.f(r3)     // Catch: java.lang.Throwable -> L2c
            goto L31
        L2c:
            r4 = move-exception
            sl.a.a(r1, r4)     // Catch: java.lang.Throwable -> L19
            goto L25
        L31:
            r3.f28856a = r4     // Catch: java.lang.Throwable -> L19
        L33:
            java.util.TreeSet r4 = r3.f28856a     // Catch: java.lang.Throwable -> L19
            if (r4 == 0) goto L3d
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L19
            if (r4 == 0) goto L69
        L3d:
            r4 = r3
            nl.f0 r4 = (nl.f0) r4     // Catch: java.lang.Throwable -> L19
            int r4 = r4.f28854b     // Catch: java.lang.Throwable -> L19
            switch(r4) {
                case 2: goto L46;
                default: goto L45;
            }     // Catch: java.lang.Throwable -> L19
        L45:
            goto L69
        L46:
            android.content.Context r4 = com.facebook.FacebookSdk.getApplicationContext()     // Catch: java.lang.Throwable -> L19
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L19
            int r4 = r4.targetSdkVersion     // Catch: java.lang.Throwable -> L19
            r1 = 30
            if (r4 < r1) goto L69
            java.lang.Class<nl.h0> r4 = nl.h0.class
            boolean r1 = sl.a.b(r4)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L5d
            goto L64
        L5d:
            java.lang.String r0 = "nl.h0"
            goto L64
        L60:
            r1 = move-exception
            sl.a.a(r4, r1)     // Catch: java.lang.Throwable -> L19
        L64:
            java.lang.String r4 = "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration."
            android.util.Log.w(r0, r4)     // Catch: java.lang.Throwable -> L19
        L69:
            monitor-exit(r3)
            return
        L6b:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nl.g0.a(boolean):void");
    }

    public abstract String b();
}
