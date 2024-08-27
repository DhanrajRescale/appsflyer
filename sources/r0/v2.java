package r0;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class v2 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0.m3 f32782a = new t0.a0(m0.f32579h);

    public static final n1.x0 a(int i10, t0.n nVar) {
        u2 u2Var = (u2) ((t0.r) nVar).m(f32782a);
        if (i10 != 0) {
            switch (i10 - 1) {
                case 0:
                    return u2Var.f32757e;
                case 1:
                    return b(u2Var.f32757e);
                case 2:
                    return u2Var.f32753a;
                case 3:
                    return b(u2Var.f32753a);
                case 4:
                    return h0.h.f17801a;
                case 5:
                    return u2Var.f32756d;
                case 6:
                    h0.a aVar = u2Var.f32756d;
                    float f10 = (float) 0.0d;
                    return h0.a.a(aVar, new h0.e(f10), null, new h0.e(f10), 6);
                case 7:
                    return b(u2Var.f32756d);
                case 8:
                    return u2Var.f32755c;
                case 9:
                    return n1.s0.f28162a;
                case 10:
                    return u2Var.f32754b;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        throw null;
    }

    public static final h0.g b(h0.a aVar) {
        float f10 = (float) 0.0d;
        return h0.a.a(aVar, null, new h0.e(f10), new h0.e(f10), 3);
    }
}
