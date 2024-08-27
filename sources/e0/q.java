package e0;

import y.g1;

/* loaded from: classes.dex */
public final class q extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f14771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f14772b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(j0 j0Var, float f10) {
        super(3);
        this.f14771a = j0Var;
        this.f14772b = f10;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        float e10;
        boolean z10;
        float e11;
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        float floatValue3 = ((Number) obj3).floatValue();
        j0 j0Var = this.f14771a;
        g1 g1Var = ((z) j0Var.i()).f14824e;
        g1 g1Var2 = g1.f40724b;
        if (g1Var == g1Var2) {
            e10 = m1.c.d(j0Var.m());
        } else {
            e10 = m1.c.e(j0Var.m());
        }
        char c10 = 0;
        if (e10 < s0.g.f34069a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((z) j0Var.i()).f14824e == g1Var2) {
            e11 = m1.c.d(j0Var.m());
        } else {
            e11 = m1.c.e(j0Var.m());
        }
        float f10 = e11 / ((z) j0Var.i()).f14821b;
        float f11 = f10 - ((int) f10);
        if (Math.abs(floatValue) >= j0Var.f14731q.c0(z.l.f41888a)) {
            if (floatValue > s0.g.f34069a) {
                c10 = 1;
            } else {
                c10 = 2;
            }
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    floatValue2 = 0.0f;
                }
            }
        } else {
            floatValue2 = Math.abs(f11) > this.f14772b ? floatValue3 : floatValue3;
        }
        return Float.valueOf(floatValue2);
    }
}
