package r0;

/* loaded from: classes.dex */
public abstract class h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f32431a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f32432b;

    /* renamed from: c, reason: collision with root package name */
    public static final w.z f32433c;

    static {
        float f10 = 10;
        f32431a = f10;
        boolean z10 = true;
        androidx.compose.foundation.layout.a.v(h2.l.a(androidx.compose.ui.layout.a.h(g1.l.f16404b, g2.f32417a), true, d0.f32364g), s0.g.f34069a, f10, 1);
        f32432b = s0.a.f34021b - (s0.a.f34020a * 2);
        if (Float.isNaN(0.2f) || Float.isNaN(s0.g.f34069a) || Float.isNaN(0.8f) || Float.isNaN(1.0f)) {
            z10 = false;
        }
        if (z10) {
            if (!Float.isNaN(0.4f) && !Float.isNaN(s0.g.f34069a) && !Float.isNaN(1.0f) && !Float.isNaN(1.0f)) {
                if (!Float.isNaN(s0.g.f34069a) && !Float.isNaN(s0.g.f34069a) && !Float.isNaN(0.65f) && !Float.isNaN(1.0f)) {
                    if (!Float.isNaN(0.1f) && !Float.isNaN(s0.g.f34069a) && !Float.isNaN(0.45f) && !Float.isNaN(1.0f)) {
                        f32433c = new w.z(0.4f, 0.2f);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(g1.o r34, long r35, float r37, long r38, int r40, t0.n r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.h2.a(g1.o, long, float, long, int, t0.n, int, int):void");
    }

    public static final void b(p1.h hVar, float f10, float f11, long j10, p1.m mVar) {
        float f12 = 2;
        float f13 = mVar.f30511a / f12;
        float e10 = m1.f.e(hVar.d()) - (f12 * f13);
        p1.h.y0(hVar, j10, f10, f11, t0.t.g(f13, f13), t0.t.j(e10, e10), s0.g.f34069a, mVar, 832);
    }
}
