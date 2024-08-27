package androidx.compose.foundation.layout;

import a2.p;
import a2.q;
import b0.b1;
import b0.h1;
import b0.i0;
import b0.i1;
import b0.n0;
import b0.n1;
import b0.s1;
import b0.v0;
import c2.i;
import c2.j;
import c2.k;
import c2.l;
import com.google.android.gms.common.api.Api;
import d2.s;
import g1.o;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.g;
import t.g0;
import t0.f;
import t0.n;
import t0.r;
import t0.r1;
import t0.t;
import v.c0;
import x.f1;

/* loaded from: classes.dex */
public abstract class a {
    public static final v0 A(u3.c cVar) {
        return new v0(cVar.f36704a, cVar.f36705b, cVar.f36706c, cVar.f36707d);
    }

    public static final o B(o oVar) {
        return oVar.g(new IntrinsicWidthElement());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(g1.o r14, g1.d r15, boolean r16, hu.c r17, t0.n r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.a.a(g1.o, g1.d, boolean, hu.c, t0.n, int, int):void");
    }

    public static i1 b(float f10, float f11, float f12, float f13, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return new i1(f10, f11, f12, f13);
    }

    public static final void c(o oVar, n nVar) {
        r rVar = (r) nVar;
        rVar.b0(-72882467);
        s1 s1Var = s1.f2998a;
        rVar.b0(544976794);
        int i10 = rVar.P;
        o h02 = t.h0(rVar, oVar);
        r1 o10 = rVar.o();
        l.M.getClass();
        j jVar = k.f7746b;
        rVar.b0(1405779621);
        if (rVar.f35166a instanceof f) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(new f1(jVar, 2));
            } else {
                rVar.n0();
            }
            t.v0(rVar, s1Var, k.f7749e);
            t.v0(rVar, o10, k.f7748d);
            t.v0(rVar, h02, k.f7747c);
            i iVar = k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i10))) {
                nn.d.s(i10, rVar, i10, iVar);
            }
            v.e.y(rVar, true, false, false, false);
            return;
        }
        al.d.v0();
        throw null;
    }

    public static i0 d(float f10) {
        return new i0(f10, 0, 0, 0);
    }

    public static final int e(List list, b0.k kVar, b0.k kVar2, int i10, int i11, int i12, int i13) {
        int round;
        int i14;
        int i15;
        int i16 = 0;
        if (i12 == i13) {
            if (list.isEmpty()) {
                return 0;
            }
            int size = list.size();
            float f10 = 0.0f;
            int i17 = 0;
            int i18 = 0;
            while (i16 < size) {
                q qVar = (q) list.get(i16);
                float l10 = l(k(qVar));
                int intValue = ((Number) kVar.invoke(qVar, Integer.valueOf(i10))).intValue();
                if (l10 == g.f34069a) {
                    i18 += intValue;
                } else if (l10 > g.f34069a) {
                    f10 += l10;
                    i17 = Math.max(i17, Math.round(intValue / l10));
                }
                i16++;
            }
            return ((list.size() - 1) * i11) + Math.round(i17 * f10) + i18;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i11, i10);
        int size2 = list.size();
        float f11 = 0.0f;
        int i19 = 0;
        for (int i20 = 0; i20 < size2; i20++) {
            q qVar2 = (q) list.get(i20);
            float l11 = l(k(qVar2));
            if (l11 == g.f34069a) {
                if (i10 == Integer.MAX_VALUE) {
                    i15 = Integer.MAX_VALUE;
                } else {
                    i15 = i10 - min;
                }
                int min2 = Math.min(((Number) kVar2.invoke(qVar2, Integer.valueOf(Api.BaseClientBuilder.API_PRIORITY_OTHER))).intValue(), i15);
                min += min2;
                i19 = Math.max(i19, ((Number) kVar.invoke(qVar2, Integer.valueOf(min2))).intValue());
            } else if (l11 > g.f34069a) {
                f11 += l11;
            }
        }
        if (f11 == g.f34069a) {
            round = 0;
        } else if (i10 == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i10 - min, 0) / f11);
        }
        int size3 = list.size();
        while (i16 < size3) {
            q qVar3 = (q) list.get(i16);
            float l12 = l(k(qVar3));
            if (l12 > g.f34069a) {
                if (round != Integer.MAX_VALUE) {
                    i14 = Math.round(round * l12);
                } else {
                    i14 = Integer.MAX_VALUE;
                }
                i19 = Math.max(i19, ((Number) kVar.invoke(qVar3, Integer.valueOf(i14))).intValue());
            }
            i16++;
        }
        return i19;
    }

    public static o f(o oVar, float f10) {
        return oVar.g(new AspectRatioElement(f10, false));
    }

    public static final float g(h1 h1Var, w2.k kVar) {
        if (kVar == w2.k.f38799a) {
            return h1Var.b(kVar);
        }
        return h1Var.d(kVar);
    }

    public static final float h(h1 h1Var, w2.k kVar) {
        if (kVar == w2.k.f38799a) {
            return h1Var.d(kVar);
        }
        return h1Var.b(kVar);
    }

    public static long i(long j10, int i10) {
        int i11;
        int g10;
        int j11;
        int h10;
        if (i10 == 1) {
            i11 = w2.a.j(j10);
        } else {
            i11 = w2.a.i(j10);
        }
        if (i10 == 1) {
            g10 = w2.a.h(j10);
        } else {
            g10 = w2.a.g(j10);
        }
        if (i10 == 1) {
            j11 = w2.a.i(j10);
        } else {
            j11 = w2.a.j(j10);
        }
        if (i10 == 1) {
            h10 = w2.a.g(j10);
        } else {
            h10 = w2.a.h(j10);
        }
        return hl.f.b(i11, g10, j11, h10);
    }

    public static long j(long j10, int i10, int i11, int i12) {
        int i13;
        if ((i12 & 1) != 0) {
            i10 = w2.a.j(j10);
        }
        int i14 = 0;
        if ((i12 & 2) != 0) {
            i13 = w2.a.h(j10);
        } else {
            i13 = 0;
        }
        if ((i12 & 4) != 0) {
            i14 = w2.a.i(j10);
        }
        if ((i12 & 8) != 0) {
            i11 = w2.a.g(j10);
        }
        return hl.f.b(i10, i13, i14, i11);
    }

    public static final n1 k(q qVar) {
        Object a10 = qVar.a();
        if (a10 instanceof n1) {
            return (n1) a10;
        }
        return null;
    }

    public static final float l(n1 n1Var) {
        if (n1Var != null) {
            return n1Var.f2954a;
        }
        return g.f34069a;
    }

    public static final o m(o oVar) {
        return oVar.g(new IntrinsicHeightElement());
    }

    public static final o n(o oVar) {
        return t.H(oVar, s.f13613k, new n0(16));
    }

    public static final o o(o oVar) {
        return t.H(oVar, s.f13613k, new n0(17));
    }

    public static final o p(o oVar, Function1 function1) {
        return oVar.g(new OffsetPxElement(function1, new c0(8, function1)));
    }

    public static final o q(o oVar, float f10, float f11) {
        return oVar.g(new OffsetElement(f10, f11, new b1(f10, f11, 0)));
    }

    public static o r(o oVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return q(oVar, f10, f11);
    }

    public static final o s(o oVar, h1 h1Var) {
        return oVar.g(new PaddingValuesElement(h1Var, new g0(h1Var, 9)));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [iu.k, kotlin.jvm.functions.Function1] */
    public static final o t(o oVar, float f10) {
        return oVar.g(new PaddingElement(f10, f10, f10, f10, new iu.k(1)));
    }

    public static final o u(o oVar, float f10, float f11) {
        return oVar.g(new PaddingElement(f10, f11, f10, f11, new b1(f10, f11, 1)));
    }

    public static o v(o oVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return u(oVar, f10, f11);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [iu.k, kotlin.jvm.functions.Function1] */
    public static final o w(o oVar, float f10, float f11, float f12, float f13) {
        return oVar.g(new PaddingElement(f10, f11, f12, f13, new iu.k(1)));
    }

    public static o x(o oVar, float f10, float f11, float f12, float f13, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return w(oVar, f10, f11, f12, f13);
    }

    public static o y(p pVar, float f10, float f11, int i10) {
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 4) != 0) {
            f11 = Float.NaN;
        }
        return new AlignmentLineOffsetDpElement(pVar, f10, f11);
    }

    public static final long z(long j10, int i10) {
        if (i10 == 1) {
            return hl.f.b(w2.a.j(j10), w2.a.h(j10), w2.a.i(j10), w2.a.g(j10));
        }
        return hl.f.b(w2.a.i(j10), w2.a.g(j10), w2.a.j(j10), w2.a.h(j10));
    }
}
