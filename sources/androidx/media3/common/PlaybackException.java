package androidx.media3.common;

import b5.k;
import e5.x;

/* loaded from: classes.dex */
public class PlaybackException extends Exception implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final String f2048c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f2049d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f2050e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f2051f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f2052g;

    /* renamed from: a, reason: collision with root package name */
    public final int f2053a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2054b;

    static {
        int i10 = x.f15050a;
        f2048c = Integer.toString(0, 36);
        f2049d = Integer.toString(1, 36);
        f2050e = Integer.toString(2, 36);
        f2051f = Integer.toString(3, 36);
        f2052g = Integer.toString(4, 36);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PlaybackException(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = androidx.media3.common.PlaybackException.f2050e
            java.lang.String r2 = r8.getString(r0)
            java.lang.String r0 = androidx.media3.common.PlaybackException.f2051f
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r1 = androidx.media3.common.PlaybackException.f2052g
            java.lang.String r1 = r8.getString(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r3 != 0) goto L4b
            java.lang.Class<androidx.media3.common.PlaybackException> r3 = androidx.media3.common.PlaybackException.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L4d
            r5 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0, r5, r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            boolean r3 = r3.isAssignableFrom(r0)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L42
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L4d
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L4d
            java.lang.reflect.Constructor r0 = r0.getConstructor(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object[] r3 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.newInstance(r3)     // Catch: java.lang.Throwable -> L4d
            r4 = r0
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> L4d
        L42:
            if (r4 != 0) goto L4b
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>(r1)
        L49:
            r3 = r0
            goto L53
        L4b:
            r3 = r4
            goto L53
        L4d:
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>(r1)
            goto L49
        L53:
            java.lang.String r0 = androidx.media3.common.PlaybackException.f2048c
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r8.getInt(r0, r1)
            java.lang.String r0 = androidx.media3.common.PlaybackException.f2049d
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r8.getLong(r0, r5)
            r1 = r7
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.PlaybackException.<init>(android.os.Bundle):void");
    }

    public PlaybackException(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        this.f2053a = i10;
        this.f2054b = j10;
    }
}
