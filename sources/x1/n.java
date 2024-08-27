package x1;

import c2.c2;
import c2.w1;
import d2.s1;
import d2.u0;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class n extends g1.n implements c2, w1, c2.m {

    /* renamed from: n, reason: collision with root package name */
    public p f39892n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f39893o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f39894p;

    public n(p pVar, boolean z10) {
        this.f39892n = pVar;
        this.f39893o = z10;
    }

    @Override // c2.w1
    public final void D() {
    }

    @Override // c2.w1
    public final void J(k kVar, l lVar, long j10) {
        if (lVar == l.f39878b) {
            if (r.a(kVar.f39873d, 4)) {
                this.f39894p = true;
                S0();
            } else if (r.a(kVar.f39873d, 5)) {
                this.f39894p = false;
                R0();
            }
        }
    }

    @Override // g1.n
    public final void J0() {
        this.f39894p = false;
        R0();
    }

    public final void Q0() {
        p pVar;
        iu.z zVar = new iu.z();
        c2.g.A(this, new m(2, zVar));
        n nVar = (n) zVar.f20560a;
        if (nVar == null || (pVar = nVar.f39892n) == null) {
            pVar = this.f39892n;
        }
        q qVar = (q) c2.g.p(this, s1.f13633r);
        if (qVar != null) {
            d2.w wVar = (d2.w) qVar;
            if (pVar == null) {
                p.f39905a.getClass();
                pVar = r.f39906a;
            }
            u0.f13646a.a(wVar.f13655a, pVar);
        }
    }

    public final void R0() {
        Unit unit;
        q qVar;
        iu.z zVar = new iu.z();
        c2.g.A(this, new m(0, zVar));
        n nVar = (n) zVar.f20560a;
        if (nVar != null) {
            nVar.Q0();
            unit = Unit.f23355a;
        } else {
            unit = null;
        }
        if (unit == null && (qVar = (q) c2.g.p(this, s1.f13633r)) != null) {
            p.f39905a.getClass();
            u0.f13646a.a(((d2.w) qVar).f13655a, r.f39906a);
        }
    }

    public final void S0() {
        iu.v vVar = new iu.v();
        vVar.f20556a = true;
        if (!this.f39893o) {
            c2.g.C(this, new l0.g0(vVar));
        }
        if (vVar.f20556a) {
            Q0();
        }
    }

    @Override // c2.c2
    public final /* bridge */ /* synthetic */ Object j() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
