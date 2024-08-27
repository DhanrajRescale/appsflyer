package t0;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final long f34956a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f34957b = 0;

    static {
        long j10;
        ut.h.a(b.f34945a);
        try {
            j10 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j10 = -1;
        }
        f34956a = j10;
    }
}
