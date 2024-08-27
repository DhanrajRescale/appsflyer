package r0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class w2 implements w1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z2 f32795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f32796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y.g1 f32797c;

    public w2(z2 z2Var, Function1 function1) {
        y.g1 g1Var = y.g1.f40723a;
        this.f32795a = z2Var;
        this.f32796b = function1;
        this.f32797c = g1Var;
    }

    @Override // w1.a
    public final long I(int i10, long j10) {
        float e10;
        float i11;
        float f10;
        y.g1 g1Var = y.g1.f40724b;
        y.g1 g1Var2 = this.f32797c;
        if (g1Var2 == g1Var) {
            e10 = m1.c.d(j10);
        } else {
            e10 = m1.c.e(j10);
        }
        float f11 = s0.g.f34069a;
        if (e10 < s0.g.f34069a && dp.b.h1(i10, 1)) {
            t tVar = this.f32795a.f32833c;
            float f12 = tVar.f(e10);
            t0.k1 k1Var = tVar.f32724i;
            if (Float.isNaN(k1Var.i())) {
                i11 = 0.0f;
            } else {
                i11 = k1Var.i();
            }
            k1Var.j(f12);
            float f13 = f12 - i11;
            if (g1Var2 == g1Var) {
                f10 = f13;
            } else {
                f10 = 0.0f;
            }
            if (g1Var2 == y.g1.f40723a) {
                f11 = f13;
            }
            return t0.t.g(f10, f11);
        }
        return m1.c.f27233b;
    }

    @Override // w1.a
    public final Object O(long j10, yt.a aVar) {
        float c10;
        float f10;
        if (this.f32797c == y.g1.f40724b) {
            c10 = w2.o.b(j10);
        } else {
            c10 = w2.o.c(j10);
        }
        z2 z2Var = this.f32795a;
        float g10 = z2Var.f32833c.g();
        Float G = vt.g0.G(z2Var.f32833c.d().f32396a.values());
        if (G != null) {
            f10 = G.floatValue();
        } else {
            f10 = Float.NaN;
        }
        if (c10 < s0.g.f34069a && g10 > f10) {
            this.f32796b.invoke(new Float(c10));
        } else {
            j10 = w2.o.f38808b;
        }
        return new w2.o(j10);
    }

    @Override // w1.a
    public final Object f(long j10, long j11, yt.a aVar) {
        float c10;
        if (this.f32797c == y.g1.f40724b) {
            c10 = w2.o.b(j11);
        } else {
            c10 = w2.o.c(j11);
        }
        this.f32796b.invoke(new Float(c10));
        return new w2.o(j11);
    }

    @Override // w1.a
    public final long l0(int i10, long j10, long j11) {
        float e10;
        float i11;
        float f10;
        if (dp.b.h1(i10, 1)) {
            t tVar = this.f32795a.f32833c;
            y.g1 g1Var = y.g1.f40724b;
            y.g1 g1Var2 = this.f32797c;
            if (g1Var2 == g1Var) {
                e10 = m1.c.d(j11);
            } else {
                e10 = m1.c.e(j11);
            }
            float f11 = tVar.f(e10);
            t0.k1 k1Var = tVar.f32724i;
            boolean isNaN = Float.isNaN(k1Var.i());
            float f12 = s0.g.f34069a;
            if (isNaN) {
                i11 = 0.0f;
            } else {
                i11 = k1Var.i();
            }
            k1Var.j(f11);
            float f13 = f11 - i11;
            if (g1Var2 == g1Var) {
                f10 = f13;
            } else {
                f10 = 0.0f;
            }
            if (g1Var2 == y.g1.f40723a) {
                f12 = f13;
            }
            return t0.t.g(f10, f12);
        }
        return m1.c.f27233b;
    }
}
