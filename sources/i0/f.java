package i0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final float f18852a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f18853b;

    static {
        float f10 = 25;
        f18852a = f10;
        f18853b = (f10 * 2.0f) / 2.4142137f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if ((r18 & 4) != 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(long r11, g1.o r13, long r14, t0.n r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a(long, g1.o, long, t0.n, int, int):void");
    }

    public static final void b(g1.o oVar, t0.n nVar, int i10, int i11) {
        int i12;
        int i13;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(694251107);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) == 2 && rVar.G()) {
            rVar.V();
        } else {
            if (i14 != 0) {
                oVar = g1.l.f16404b;
            }
            androidx.compose.foundation.layout.a.c(t0.t.H(androidx.compose.foundation.layout.d.n(oVar, f18853b, f18852a), d2.s.f13613k, e.f18834b), rVar);
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new c(oVar, i10, i11, 0);
        }
    }
}
