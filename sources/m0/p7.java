package m0;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* loaded from: classes.dex */
public final class p7 {

    /* renamed from: a, reason: collision with root package name */
    public static final p7 f26651a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final float f26652b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final float f26653c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final float f26654d = 52;

    public final void a(g1.o oVar, float f10, long j10, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        float f11;
        long j11;
        int i14;
        g1.o oVar3;
        float f12;
        long c10;
        float f13;
        int i15;
        int i16;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(910934799);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 6) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                f11 = f10;
                if (rVar.e(f11)) {
                    i16 = 32;
                    i12 |= i16;
                }
            } else {
                f11 = f10;
            }
            i16 = 16;
            i12 |= i16;
        } else {
            f11 = f10;
        }
        if ((i10 & 384) == 0) {
            j11 = j10;
            if ((i11 & 4) == 0 && rVar.g(j11)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        } else {
            j11 = j10;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (rVar.h(this)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i14;
        }
        if ((i12 & 1171) == 1170 && rVar.G()) {
            rVar.V();
            f13 = f11;
            c10 = j11;
        } else {
            rVar.X();
            if ((i10 & 1) != 0 && !rVar.E()) {
                rVar.V();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                oVar3 = oVar2;
                f12 = f11;
            } else {
                if (i17 != 0) {
                    oVar3 = g1.l.f16404b;
                } else {
                    oVar3 = oVar2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    f12 = f26652b;
                } else {
                    f12 = f11;
                }
                if ((i11 & 4) != 0) {
                    c10 = n1.t.c(((n1.t) rVar.m(e1.f26084a)).f28179a, 0.12f);
                    i12 &= -897;
                    rVar.t();
                    pp.b.c(oVar3, c10, f12, s0.g.f34069a, rVar, (i12 & 14) | ((i12 >> 3) & 112) | ((i12 << 3) & 896), 8);
                    f13 = f12;
                    oVar2 = oVar3;
                }
            }
            c10 = j11;
            rVar.t();
            pp.b.c(oVar3, c10, f12, s0.g.f34069a, rVar, (i12 & 14) | ((i12 >> 3) & 112) | ((i12 << 3) & 896), 8);
            f13 = f12;
            oVar2 = oVar3;
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new o7(this, oVar2, f13, c10, i10, i11, 0);
        }
    }

    public final void b(g1.o oVar, float f10, long j10, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        float f11;
        long j11;
        int i14;
        g1.o oVar3;
        float f12;
        float f13;
        long j12;
        int i15;
        int i16;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(1499002201);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 6) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                f11 = f10;
                if (rVar.e(f10)) {
                    i16 = 32;
                    i12 |= i16;
                }
            } else {
                f11 = f10;
            }
            i16 = 16;
            i12 |= i16;
        } else {
            f11 = f10;
        }
        if ((i10 & 384) == 0) {
            j11 = j10;
            if ((i11 & 4) == 0 && rVar.g(j11)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        } else {
            j11 = j10;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (rVar.h(this)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i14;
        }
        if ((i12 & 1171) == 1170 && rVar.G()) {
            rVar.V();
            f13 = f11;
            j12 = j11;
        } else {
            rVar.X();
            if ((i10 & 1) != 0 && !rVar.E()) {
                rVar.V();
                oVar3 = oVar2;
                f12 = f11;
            } else {
                if (i17 != 0) {
                    oVar3 = g1.l.f16404b;
                } else {
                    oVar3 = oVar2;
                }
                if ((i11 & 2) != 0) {
                    f12 = f26653c;
                } else {
                    f12 = f11;
                }
                if ((i11 & 4) != 0) {
                    j11 = ((n1.t) rVar.m(e1.f26084a)).f28179a;
                }
            }
            rVar.t();
            b0.s.a(androidx.compose.foundation.a.e(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(oVar3, 1.0f), f12), j11, n1.s0.f28162a), rVar, 0);
            f13 = f12;
            j12 = j11;
            oVar2 = oVar3;
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new o7(this, oVar2, f13, j12, i10, i11, 1);
        }
    }
}
