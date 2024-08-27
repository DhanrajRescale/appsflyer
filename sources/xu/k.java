package xu;

import java.util.concurrent.TimeUnit;
import vu.b0;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f40592a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f40593b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f40594c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f40595d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f40596e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f40597f;

    /* renamed from: g, reason: collision with root package name */
    public static final de.d f40598g;

    /* renamed from: h, reason: collision with root package name */
    public static final de.d f40599h;

    static {
        String str;
        int i10 = b0.f38357a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f40592a = str;
        f40593b = el.l.O0("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = b0.f38357a;
        if (i11 < 2) {
            i11 = 2;
        }
        f40594c = el.l.P0("kotlinx.coroutines.scheduler.core.pool.size", i11, 1, 0, 8);
        f40595d = el.l.P0("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f40596e = TimeUnit.SECONDS.toNanos(el.l.O0("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f40597f = g.f40587a;
        f40598g = new de.d(0);
        f40599h = new de.d(1);
    }
}
