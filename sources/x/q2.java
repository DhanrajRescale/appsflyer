package x;

import com.google.android.gms.common.api.Api;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class q2 extends g1.n implements c2.c0 {

    /* renamed from: n, reason: collision with root package name */
    public o2 f39697n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f39698o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f39699p;

    @Override // c2.c0
    public final int F(a2.r rVar, a2.q qVar, int i10) {
        if (this.f39699p) {
            return qVar.e(i10);
        }
        return qVar.e(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Override // c2.c0
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        y.g1 g1Var;
        int g10;
        Function1 function1;
        int i10;
        a2.n0 n0;
        if (this.f39699p) {
            g1Var = y.g1.f40723a;
        } else {
            g1Var = y.g1.f40724b;
        }
        androidx.compose.foundation.a.i(j10, g1Var);
        boolean z10 = this.f39699p;
        int i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (z10) {
            g10 = Integer.MAX_VALUE;
        } else {
            g10 = w2.a.g(j10);
        }
        if (this.f39699p) {
            i11 = w2.a.h(j10);
        }
        a2.a1 E = l0Var.E(w2.a.a(j10, 0, i11, 0, g10, 5));
        int i12 = E.f29a;
        int h10 = w2.a.h(j10);
        if (i12 > h10) {
            i12 = h10;
        }
        int i13 = E.f30b;
        int g11 = w2.a.g(j10);
        if (i13 > g11) {
            i13 = g11;
        }
        int i14 = E.f30b - i13;
        int i15 = E.f29a - i12;
        if (!this.f39699p) {
            i14 = i15;
        }
        o2 o2Var = this.f39697n;
        t0.l1 l1Var = o2Var.f39656d;
        t0.l1 l1Var2 = o2Var.f39653a;
        l1Var.j(i14);
        e1.i h11 = yq.b.h();
        if (h11 != null) {
            function1 = h11.f();
        } else {
            function1 = null;
        }
        e1.i i16 = yq.b.i(h11);
        try {
            if (l1Var2.i() > i14) {
                l1Var2.j(i14);
            }
            Unit unit = Unit.f23355a;
            yq.b.l(h11, i16, function1);
            o2 o2Var2 = this.f39697n;
            if (this.f39699p) {
                i10 = i13;
            } else {
                i10 = i12;
            }
            o2Var2.f39654b.j(i10);
            n0 = o0Var.n0(i12, i13, vt.p0.d(), new p2(this, i14, E, 0));
            return n0;
        } catch (Throwable th2) {
            yq.b.l(h11, i16, function1);
            throw th2;
        }
    }

    @Override // c2.c0
    public final int d0(a2.r rVar, a2.q qVar, int i10) {
        if (this.f39699p) {
            return qVar.D(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        return qVar.D(i10);
    }

    @Override // c2.c0
    public final int l(a2.r rVar, a2.q qVar, int i10) {
        if (this.f39699p) {
            return qVar.W(i10);
        }
        return qVar.W(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Override // c2.c0
    public final int u0(a2.r rVar, a2.q qVar, int i10) {
        if (this.f39699p) {
            return qVar.z(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        return qVar.z(i10);
    }
}
