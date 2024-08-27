package q0;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;
import t0.l3;
import x.j1;
import x.k1;

/* loaded from: classes.dex */
public abstract class h implements j1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31496a;

    /* renamed from: b, reason: collision with root package name */
    public final float f31497b;

    /* renamed from: c, reason: collision with root package name */
    public final l3 f31498c;

    public h(boolean z10, float f10, g1 g1Var) {
        this.f31496a = z10;
        this.f31497b = f10;
        this.f31498c = g1Var;
    }

    @Override // x.j1
    public final k1 b(a0.k kVar, t0.n nVar) {
        long j10;
        i iVar;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(988743187);
        a0 a0Var = (a0) rVar.m(c0.f31474a);
        rVar.b0(-1524337568);
        l3 l3Var = this.f31498c;
        if (((n1.t) l3Var.getValue()).f28179a != n1.t.f28177i) {
            j10 = ((n1.t) l3Var.getValue()).f28179a;
        } else {
            ((e) a0Var).getClass();
            rVar.b0(2042140174);
            j10 = n1.t.f28170b;
            androidx.compose.ui.graphics.a.t(j10);
            rVar.s(false);
        }
        rVar.s(false);
        g1 r02 = t0.t.r0(new n1.t(j10), rVar);
        ((e) a0Var).getClass();
        rVar.b0(-1629816343);
        if (androidx.compose.ui.graphics.a.t(n1.t.f28170b) > 0.5d) {
            iVar = c0.f31475b;
        } else {
            iVar = c0.f31476c;
        }
        rVar.s(false);
        g1 r03 = t0.t.r0(iVar, rVar);
        boolean z10 = this.f31496a;
        float f10 = this.f31497b;
        rVar.b0(331259447);
        ViewGroup b10 = d0.b((View) rVar.m(AndroidCompositionLocals_androidKt.f1433g));
        rVar.b0(1643268343);
        boolean h10 = rVar.h((f) this) | rVar.h(kVar) | rVar.h(b10);
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        if (h10 || Q == eVar) {
            Q = new a(z10, f10, r02, r03, b10);
            rVar.k0(Q);
        }
        a aVar = (a) Q;
        rVar.s(false);
        rVar.s(false);
        rVar.b0(-1524337040);
        boolean h11 = rVar.h(kVar) | rVar.j(aVar);
        Object Q2 = rVar.Q();
        if (h11 || Q2 == eVar) {
            Q2 = new g(kVar, aVar, null);
            rVar.k0(Q2);
        }
        rVar.s(false);
        t0.t.d(aVar, kVar, (Function2) Q2, rVar);
        rVar.s(false);
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f31496a == hVar.f31496a && w2.e.a(this.f31497b, hVar.f31497b) && Intrinsics.a(this.f31498c, hVar.f31498c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31498c.hashCode() + v.e.a(this.f31497b, Boolean.hashCode(this.f31496a) * 31, 31);
    }
}
