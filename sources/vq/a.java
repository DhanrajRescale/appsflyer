package vq;

import com.google.firebase.perf.config.RemoteConfigManager;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final yq.a f38248d = yq.a.d();

    /* renamed from: e, reason: collision with root package name */
    public static volatile a f38249e;

    /* renamed from: a, reason: collision with root package name */
    public final RemoteConfigManager f38250a = RemoteConfigManager.getInstance();

    /* renamed from: b, reason: collision with root package name */
    public fr.c f38251b = new fr.c();

    /* renamed from: c, reason: collision with root package name */
    public final w f38252c = w.b();

    public static synchronized a e() {
        a aVar;
        synchronized (a.class) {
            try {
                if (f38249e == null) {
                    f38249e = new a();
                }
                aVar = f38249e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public static boolean l(long j10) {
        return j10 >= 0;
    }

    public static boolean m(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            String trim = str2.trim();
            Boolean bool = tq.a.f36350a;
            if (trim.equals("20.3.2")) {
                return true;
            }
        }
        return false;
    }

    public static boolean n(long j10) {
        return j10 >= 0;
    }

    public static boolean p(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    public final fr.d a(bl.j jVar) {
        w wVar = this.f38252c;
        String B = jVar.B();
        if (B == null) {
            wVar.getClass();
            w.f38274c.a("Key is null when getting boolean value on device cache.");
            return new fr.d();
        }
        if (wVar.f38276a == null) {
            wVar.c(w.a());
            if (wVar.f38276a == null) {
                return new fr.d();
            }
        }
        if (!wVar.f38276a.contains(B)) {
            return new fr.d();
        }
        try {
            return new fr.d(Boolean.valueOf(wVar.f38276a.getBoolean(B, false)));
        } catch (ClassCastException e10) {
            w.f38274c.b("Key %s from sharedPreferences has type other than long: %s", B, e10.getMessage());
            return new fr.d();
        }
    }

    public final fr.d b(bl.j jVar) {
        w wVar = this.f38252c;
        String B = jVar.B();
        if (B == null) {
            wVar.getClass();
            w.f38274c.a("Key is null when getting double value on device cache.");
            return new fr.d();
        }
        if (wVar.f38276a == null) {
            wVar.c(w.a());
            if (wVar.f38276a == null) {
                return new fr.d();
            }
        }
        if (!wVar.f38276a.contains(B)) {
            return new fr.d();
        }
        try {
            try {
                return new fr.d(Double.valueOf(Double.longBitsToDouble(wVar.f38276a.getLong(B, 0L))));
            } catch (ClassCastException e10) {
                w.f38274c.b("Key %s from sharedPreferences has type other than double: %s", B, e10.getMessage());
                return new fr.d();
            }
        } catch (ClassCastException unused) {
            return new fr.d(Double.valueOf(Float.valueOf(wVar.f38276a.getFloat(B, s0.g.f34069a)).doubleValue()));
        }
    }

    public final fr.d c(bl.j jVar) {
        w wVar = this.f38252c;
        String B = jVar.B();
        if (B == null) {
            wVar.getClass();
            w.f38274c.a("Key is null when getting long value on device cache.");
            return new fr.d();
        }
        if (wVar.f38276a == null) {
            wVar.c(w.a());
            if (wVar.f38276a == null) {
                return new fr.d();
            }
        }
        if (!wVar.f38276a.contains(B)) {
            return new fr.d();
        }
        try {
            return new fr.d(Long.valueOf(wVar.f38276a.getLong(B, 0L)));
        } catch (ClassCastException e10) {
            w.f38274c.b("Key %s from sharedPreferences has type other than long: %s", B, e10.getMessage());
            return new fr.d();
        }
    }

    public final fr.d d(bl.j jVar) {
        w wVar = this.f38252c;
        String B = jVar.B();
        if (B == null) {
            wVar.getClass();
            w.f38274c.a("Key is null when getting String value on device cache.");
            return new fr.d();
        }
        if (wVar.f38276a == null) {
            wVar.c(w.a());
            if (wVar.f38276a == null) {
                return new fr.d();
            }
        }
        if (!wVar.f38276a.contains(B)) {
            return new fr.d();
        }
        try {
            return new fr.d(wVar.f38276a.getString(B, HttpUrl.FRAGMENT_ENCODE_SET));
        } catch (ClassCastException e10) {
            w.f38274c.b("Key %s from sharedPreferences has type other than String: %s", B, e10.getMessage());
            return new fr.d();
        }
    }

    public final boolean f() {
        d a02 = d.a0();
        fr.d h10 = h(a02);
        if (h10.b()) {
            return ((Boolean) h10.a()).booleanValue();
        }
        fr.d dVar = this.f38250a.getBoolean("fpr_experiment_app_start_ttid");
        if (dVar.b()) {
            this.f38252c.g("com.google.firebase.perf.ExperimentTTID", ((Boolean) dVar.a()).booleanValue());
            return ((Boolean) dVar.a()).booleanValue();
        }
        fr.d a10 = a(a02);
        if (a10.b()) {
            return ((Boolean) a10.a()).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [vq.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [vq.b, java.lang.Object] */
    public final Boolean g() {
        b bVar;
        Boolean bool;
        c cVar;
        synchronized (b.class) {
            try {
                if (b.f38253b == null) {
                    b.f38253b = new Object();
                }
                bVar = b.f38253b;
            } finally {
            }
        }
        fr.d h10 = h(bVar);
        if (h10.b()) {
            bool = (Boolean) h10.a();
        } else {
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            return Boolean.FALSE;
        }
        synchronized (c.class) {
            try {
                if (c.f38254b == null) {
                    c.f38254b = new Object();
                }
                cVar = c.f38254b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        fr.d a10 = a(cVar);
        if (a10.b()) {
            return (Boolean) a10.a();
        }
        fr.d h11 = h(cVar);
        if (h11.b()) {
            return (Boolean) h11.a();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [fr.d] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final fr.d h(bl.j r3) {
        /*
            r2 = this;
            fr.c r0 = r2.f38251b
            java.lang.String r3 = r3.G()
            if (r3 == 0) goto L12
            android.os.Bundle r1 = r0.f16213a
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L12:
            r0.getClass()
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L1e
            fr.d r3 = new fr.d
            r3.<init>()
            goto L4b
        L1e:
            android.os.Bundle r0 = r0.f16213a     // Catch: java.lang.ClassCastException -> L36
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.ClassCastException -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.ClassCastException -> L36
            if (r0 != 0) goto L2f
            fr.d r0 = new fr.d     // Catch: java.lang.ClassCastException -> L36
            r0.<init>()     // Catch: java.lang.ClassCastException -> L36
            r3 = r0
            goto L4b
        L2f:
            fr.d r1 = new fr.d     // Catch: java.lang.ClassCastException -> L36
            r1.<init>(r0)     // Catch: java.lang.ClassCastException -> L36
            r3 = r1
            goto L4b
        L36:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            yq.a r0 = fr.c.f16212b
            java.lang.String r1 = "Metadata key %s contains type other than boolean: %s"
            r0.b(r1, r3)
            fr.d r3 = new fr.d
            r3.<init>()
        L4b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vq.a.h(bl.j):fr.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final fr.d i(bl.j r3) {
        /*
            r2 = this;
            fr.c r0 = r2.f38251b
            java.lang.String r3 = r3.G()
            if (r3 == 0) goto L12
            android.os.Bundle r1 = r0.f16213a
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L12:
            r0.getClass()
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L1e
            fr.d r3 = new fr.d
            r3.<init>()
            goto L5d
        L1e:
            android.os.Bundle r0 = r0.f16213a
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L2c
            fr.d r3 = new fr.d
            r3.<init>()
            goto L5d
        L2c:
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L41
            java.lang.Float r0 = (java.lang.Float) r0
            double r0 = r0.doubleValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            fr.d r0 = new fr.d
            r0.<init>(r3)
            r3 = r0
            goto L5d
        L41:
            boolean r1 = r0 instanceof java.lang.Double
            if (r1 == 0) goto L4d
            java.lang.Double r0 = (java.lang.Double) r0
            fr.d r3 = new fr.d
            r3.<init>(r0)
            goto L5d
        L4d:
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            yq.a r0 = fr.c.f16212b
            java.lang.String r1 = "Metadata key %s contains type other than double: %s"
            r0.b(r1, r3)
            fr.d r3 = new fr.d
            r3.<init>()
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vq.a.i(bl.j):fr.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.Bundle, android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.Bundle, android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v13, types: [fr.d] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [fr.d] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [fr.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final fr.d j(bl.j r3) {
        /*
            r2 = this;
            fr.c r0 = r2.f38251b
            java.lang.String r3 = r3.G()
            if (r3 == 0) goto L12
            android.os.Bundle r1 = r0.f16213a
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L12:
            r0.getClass()
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L1e
            fr.d r3 = new fr.d
            r3.<init>()
            goto L4b
        L1e:
            android.os.Bundle r0 = r0.f16213a     // Catch: java.lang.ClassCastException -> L36
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.ClassCastException -> L36
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.ClassCastException -> L36
            if (r0 != 0) goto L2f
            fr.d r0 = new fr.d     // Catch: java.lang.ClassCastException -> L36
            r0.<init>()     // Catch: java.lang.ClassCastException -> L36
            r3 = r0
            goto L4b
        L2f:
            fr.d r1 = new fr.d     // Catch: java.lang.ClassCastException -> L36
            r1.<init>(r0)     // Catch: java.lang.ClassCastException -> L36
            r3 = r1
            goto L4b
        L36:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            yq.a r0 = fr.c.f16212b
            java.lang.String r1 = "Metadata key %s contains type other than int: %s"
            r0.b(r1, r3)
            fr.d r3 = new fr.d
            r3.<init>()
        L4b:
            boolean r0 = r3.b()
            if (r0 == 0) goto L66
            java.lang.Object r3 = r3.a()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r0 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            fr.d r0 = new fr.d
            r0.<init>(r3)
            goto L6b
        L66:
            fr.d r0 = new fr.d
            r0.<init>()
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vq.a.j(bl.j):fr.d");
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, vq.k] */
    public final long k() {
        k kVar;
        synchronized (k.class) {
            try {
                if (k.f38262b == null) {
                    k.f38262b = new Object();
                }
                kVar = k.f38262b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        RemoteConfigManager remoteConfigManager = this.f38250a;
        kVar.getClass();
        fr.d dVar = remoteConfigManager.getLong("fpr_rl_time_limit_sec");
        if (dVar.b() && ((Long) dVar.a()).longValue() > 0) {
            this.f38252c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.TimeLimitSec");
            return ((Long) dVar.a()).longValue();
        }
        fr.d c10 = c(kVar);
        if (c10.b() && ((Long) c10.a()).longValue() > 0) {
            return ((Long) c10.a()).longValue();
        }
        Long l10 = 600L;
        return l10.longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r0 != false) goto L25;
     */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, vq.m] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, vq.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o() {
        /*
            r5 = this;
            java.lang.Boolean r0 = r5.g()
            r1 = 1
            if (r0 == 0) goto Ld
            boolean r0 = r0.booleanValue()
            if (r0 != r1) goto Lca
        Ld:
            java.lang.Class<vq.m> r0 = vq.m.class
            monitor-enter(r0)
            vq.m r2 = vq.m.f38264b     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L1f
            vq.m r2 = new vq.m     // Catch: java.lang.Throwable -> L1c
            r2.<init>()     // Catch: java.lang.Throwable -> L1c
            vq.m.f38264b = r2     // Catch: java.lang.Throwable -> L1c
            goto L1f
        L1c:
            r1 = move-exception
            goto Lce
        L1f:
            vq.m r2 = vq.m.f38264b     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            r2.getClass()
            java.lang.String r0 = "fpr_enabled"
            com.google.firebase.perf.config.RemoteConfigManager r3 = r5.f38250a
            fr.d r0 = r3.getBoolean(r0)
            boolean r3 = r0.b()
            if (r3 == 0) goto L59
            com.google.firebase.perf.config.RemoteConfigManager r2 = r5.f38250a
            boolean r2 = r2.isLastFetchFailed()
            if (r2 == 0) goto L3d
            goto Lca
        L3d:
            vq.w r2 = r5.f38252c
            java.lang.String r3 = "com.google.firebase.perf.SdkEnabled"
            java.lang.Object r4 = r0.a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.g(r3, r4)
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L6d
        L59:
            fr.d r0 = r5.a(r2)
            boolean r2 = r0.b()
            if (r2 == 0) goto L6f
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L6d:
            if (r0 == 0) goto Lca
        L6f:
            java.lang.Class<vq.l> r0 = vq.l.class
            monitor-enter(r0)
            vq.l r2 = vq.l.f38263b     // Catch: java.lang.Throwable -> L7e
            if (r2 != 0) goto L80
            vq.l r2 = new vq.l     // Catch: java.lang.Throwable -> L7e
            r2.<init>()     // Catch: java.lang.Throwable -> L7e
            vq.l.f38263b = r2     // Catch: java.lang.Throwable -> L7e
            goto L80
        L7e:
            r1 = move-exception
            goto Lcc
        L80:
            vq.l r2 = vq.l.f38263b     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r0)
            com.google.firebase.perf.config.RemoteConfigManager r0 = r5.f38250a
            r2.getClass()
            java.lang.String r3 = "fpr_disabled_android_versions"
            fr.d r0 = r0.getString(r3)
            boolean r3 = r0.b()
            if (r3 == 0) goto Lac
            vq.w r2 = r5.f38252c
            java.lang.String r3 = "com.google.firebase.perf.SdkDisabledVersions"
            java.lang.Object r4 = r0.a()
            java.lang.String r4 = (java.lang.String) r4
            r2.f(r3, r4)
            java.lang.Object r0 = r0.a()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = m(r0)
            goto Lc7
        Lac:
            fr.d r0 = r5.d(r2)
            boolean r2 = r0.b()
            if (r2 == 0) goto Lc1
            java.lang.Object r0 = r0.a()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = m(r0)
            goto Lc7
        Lc1:
            java.lang.String r0 = ""
            boolean r0 = m(r0)
        Lc7:
            if (r0 != 0) goto Lca
            goto Lcb
        Lca:
            r1 = 0
        Lcb:
            return r1
        Lcc:
            monitor-exit(r0)
            throw r1
        Lce:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vq.a.o():boolean");
    }
}
