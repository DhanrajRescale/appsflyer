package m0;

/* loaded from: classes.dex */
public abstract class l5 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f26451a;

    /* renamed from: b, reason: collision with root package name */
    public static final w.z f26452b;

    static {
        boolean z10;
        float f10 = i5.f26286a;
        f26451a = 40;
        if (!Float.isNaN(0.2f) && !Float.isNaN(s0.g.f34069a) && !Float.isNaN(0.8f) && !Float.isNaN(1.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!Float.isNaN(0.4f) && !Float.isNaN(s0.g.f34069a) && !Float.isNaN(1.0f) && !Float.isNaN(1.0f)) {
                if (!Float.isNaN(s0.g.f34069a) && !Float.isNaN(s0.g.f34069a) && !Float.isNaN(0.65f) && !Float.isNaN(1.0f)) {
                    if (!Float.isNaN(0.1f) && !Float.isNaN(s0.g.f34069a) && !Float.isNaN(0.45f) && !Float.isNaN(1.0f)) {
                        f26452b = new w.z(0.4f, 0.2f);
                        return;
                    } else {
                        w.e.w("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.1, 0.0, 0.45, 1.0.");
                        throw null;
                    }
                }
                w.e.w("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.0, 0.0, 0.65, 1.0.");
                throw null;
            }
            w.e.w("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.4, 0.0, 1.0, 1.0.");
            throw null;
        }
        w.e.w("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.2, 0.0, 0.8, 1.0.");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(g1.o r32, long r33, float r35, long r36, int r38, t0.n r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.l5.a(g1.o, long, float, long, int, t0.n, int, int):void");
    }

    public static final void b(p1.h hVar, float f10, float f11, long j10, p1.m mVar) {
        float f12 = 2;
        float f13 = mVar.f30511a / f12;
        float e10 = m1.f.e(hVar.d()) - (f12 * f13);
        p1.h.y0(hVar, j10, f10, f11, t0.t.g(f13, f13), t0.t.j(e10, e10), s0.g.f34069a, mVar, 832);
    }
}
