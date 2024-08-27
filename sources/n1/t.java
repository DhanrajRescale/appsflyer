package n1;

import android.os.Build;
import okhttp3.internal.ws.WebSocketProtocol;
import ut.t;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final long f28170b = androidx.compose.ui.graphics.a.d(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f28171c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f28172d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f28173e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f28174f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f28175g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f28176h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f28177i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f28178j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f28179a;

    static {
        androidx.compose.ui.graphics.a.d(4282664004L);
        f28171c = androidx.compose.ui.graphics.a.d(4287137928L);
        f28172d = androidx.compose.ui.graphics.a.d(4291611852L);
        f28173e = androidx.compose.ui.graphics.a.d(4294967295L);
        f28174f = androidx.compose.ui.graphics.a.d(4294901760L);
        androidx.compose.ui.graphics.a.d(4278255360L);
        f28175g = androidx.compose.ui.graphics.a.d(4278190335L);
        androidx.compose.ui.graphics.a.d(4294967040L);
        androidx.compose.ui.graphics.a.d(4278255615L);
        androidx.compose.ui.graphics.a.d(4294902015L);
        f28176h = androidx.compose.ui.graphics.a.c(0);
        f28177i = androidx.compose.ui.graphics.a.b(s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, o1.e.f29396s);
    }

    public /* synthetic */ t(long j10) {
        this.f28179a = j10;
    }

    public static final /* synthetic */ t a(long j10) {
        return new t(j10);
    }

    public static final long b(long j10, o1.d dVar) {
        o1.h hVar;
        o1.d g10 = g(j10);
        int i10 = g10.f29377c;
        int i11 = dVar.f29377c;
        if ((i10 | i11) < 0) {
            hVar = t0.t.J(g10, dVar, 0);
        } else {
            t.t tVar = o1.i.f29406a;
            int i12 = i10 | (i11 << 6);
            Object g11 = tVar.g(i12);
            if (g11 == null) {
                g11 = t0.t.J(g10, dVar, 0);
                tVar.k(i12, g11);
            }
            hVar = (o1.h) g11;
        }
        return hVar.a(j10);
    }

    public static long c(long j10, float f10) {
        return androidx.compose.ui.graphics.a.b(i(j10), h(j10), f(j10), f10, g(j10));
    }

    public static final boolean d(long j10, long j11) {
        t.Companion companion = ut.t.INSTANCE;
        return j10 == j11;
    }

    public static final float e(long j10) {
        float c02;
        float f10;
        long j11 = 63 & j10;
        t.Companion companion = ut.t.INSTANCE;
        if (j11 == 0) {
            c02 = (float) yk.g.c0((j10 >>> 56) & 255);
            f10 = 255.0f;
        } else {
            c02 = (float) yk.g.c0((j10 >>> 6) & 1023);
            f10 = 1023.0f;
        }
        return c02 / f10;
    }

    public static final float f(long j10) {
        int i10;
        int i11;
        int i12;
        long j11 = 63 & j10;
        t.Companion companion = ut.t.INSTANCE;
        if (j11 == 0) {
            return ((float) yk.g.c0((j10 >>> 32) & 255)) / 255.0f;
        }
        short s7 = (short) ((j10 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        if (Build.VERSION.SDK_INT >= 26) {
            return l.b(s7);
        }
        int i13 = 32768 & s7;
        int i14 = ((65535 & s7) >>> 10) & 31;
        int i15 = s7 & 1023;
        if (i14 == 0) {
            if (i15 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - e0.f28129a;
                if (i13 != 0) {
                    return -intBitsToFloat;
                }
                return intBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        } else {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final o1.d g(long j10) {
        float[] fArr = o1.e.f29378a;
        t.Companion companion = ut.t.INSTANCE;
        return o1.e.f29398u[(int) (j10 & 63)];
    }

    public static final float h(long j10) {
        int i10;
        int i11;
        int i12;
        long j11 = 63 & j10;
        t.Companion companion = ut.t.INSTANCE;
        if (j11 == 0) {
            return ((float) yk.g.c0((j10 >>> 40) & 255)) / 255.0f;
        }
        short s7 = (short) ((j10 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        if (Build.VERSION.SDK_INT >= 26) {
            return l.b(s7);
        }
        int i13 = 32768 & s7;
        int i14 = ((65535 & s7) >>> 10) & 31;
        int i15 = s7 & 1023;
        if (i14 == 0) {
            if (i15 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - e0.f28129a;
                if (i13 != 0) {
                    return -intBitsToFloat;
                }
                return intBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        } else {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final float i(long j10) {
        int i10;
        int i11;
        int i12;
        long j11 = 63 & j10;
        t.Companion companion = ut.t.INSTANCE;
        if (j11 == 0) {
            return ((float) yk.g.c0((j10 >>> 48) & 255)) / 255.0f;
        }
        short s7 = (short) ((j10 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        if (Build.VERSION.SDK_INT >= 26) {
            return l.b(s7);
        }
        int i13 = 32768 & s7;
        int i14 = ((65535 & s7) >>> 10) & 31;
        int i15 = s7 & 1023;
        if (i14 == 0) {
            if (i15 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - e0.f28129a;
                if (i13 != 0) {
                    return -intBitsToFloat;
                }
                return intBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        } else {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static String j(long j10) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(i(j10));
        sb2.append(", ");
        sb2.append(h(j10));
        sb2.append(", ");
        sb2.append(f(j10));
        sb2.append(", ");
        sb2.append(e(j10));
        sb2.append(", ");
        return nn.d.n(sb2, g(j10).f29375a, ')');
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        if (this.f28179a != ((t) obj).f28179a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        t.Companion companion = ut.t.INSTANCE;
        return Long.hashCode(this.f28179a);
    }

    public final String toString() {
        return j(this.f28179a);
    }
}
