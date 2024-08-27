package wm;

import cn.g;

/* loaded from: classes2.dex */
public final class a extends b {
    @Override // wm.b
    public final um.d a() {
        return ((xm.a) this.f39305a).getBarData();
    }

    @Override // wm.b
    public final float b(float f10, float f11, float f12, float f13) {
        return Math.abs(f10 - f12);
    }

    @Override // wm.b, wm.d
    public final c f(float f10, float f11) {
        c f12 = super.f(f10, f11);
        if (f12 == null) {
            return null;
        }
        g m10 = ((sm.a) this.f39305a).m(1);
        m10.getClass();
        cn.c cVar = (cn.c) cn.c.f8243d.b();
        cVar.f8244b = 0.0d;
        cVar.f8245c = 0.0d;
        m10.b(f10, f11, cVar);
        um.b bVar = (um.b) ((xm.a) this.f39305a).getBarData().b(f12.f39311e);
        if (bVar.f37240v > 1) {
            if (((um.c) bVar.h((float) cVar.f8244b, (float) cVar.f8245c, 3)) == null) {
                return null;
            }
            return f12;
        }
        cn.c.b(cVar);
        return f12;
    }
}
