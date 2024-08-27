package m1;

import s0.g;
import t0.t;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f27227a = t.a(g.f34069a, g.f34069a);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f27228b = 0;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static String d(long j10) {
        if (b(j10) == c(j10)) {
            return "CornerRadius.circular(" + t.G0(b(j10)) + ')';
        }
        return "CornerRadius.elliptical(" + t.G0(b(j10)) + ", " + t.G0(c(j10)) + ')';
    }
}
