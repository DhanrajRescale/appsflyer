package j5;

import b5.a1;
import b5.g1;
import b5.i1;
import i5.g0;
import lp.j1;
import lp.l0;
import lp.o0;
import lp.o1;
import lp.q0;
import lp.s0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f21005a;

    /* renamed from: b, reason: collision with root package name */
    public o0 f21006b;

    /* renamed from: c, reason: collision with root package name */
    public o1 f21007c;

    /* renamed from: d, reason: collision with root package name */
    public r5.w f21008d;

    /* renamed from: e, reason: collision with root package name */
    public r5.w f21009e;

    /* renamed from: f, reason: collision with root package name */
    public r5.w f21010f;

    public v(g1 g1Var) {
        this.f21005a = g1Var;
        l0 l0Var = o0.f25025b;
        this.f21006b = j1.f24998e;
        this.f21007c = o1.f25026g;
    }

    public static r5.w b(a1 a1Var, o0 o0Var, r5.w wVar, g1 g1Var) {
        Object m10;
        int i10;
        g0 g0Var = (g0) a1Var;
        i1 w10 = g0Var.w();
        int t10 = g0Var.t();
        if (w10.q()) {
            m10 = null;
        } else {
            m10 = w10.m(t10);
        }
        if (!g0Var.E() && !w10.q()) {
            i10 = w10.f(t10, g1Var).b(e5.x.F(g0Var.u()) - g1Var.g());
        } else {
            i10 = -1;
        }
        for (int i11 = 0; i11 < o0Var.size(); i11++) {
            r5.w wVar2 = (r5.w) o0Var.get(i11);
            if (c(wVar2, m10, g0Var.E(), g0Var.q(), g0Var.r(), i10)) {
                return wVar2;
            }
        }
        if (o0Var.isEmpty() && wVar != null) {
            if (c(wVar, m10, g0Var.E(), g0Var.q(), g0Var.r(), i10)) {
                return wVar;
            }
        }
        return null;
    }

    public static boolean c(r5.w wVar, Object obj, boolean z10, int i10, int i11, int i12) {
        if (!wVar.f3556a.equals(obj)) {
            return false;
        }
        int i13 = wVar.f3557b;
        if ((!z10 || i13 != i10 || wVar.f3558c != i11) && (z10 || i13 != -1 || wVar.f3560e != i12)) {
            return false;
        }
        return true;
    }

    public final void a(q0 q0Var, r5.w wVar, i1 i1Var) {
        if (wVar == null) {
            return;
        }
        if (i1Var.b(wVar.f3556a) != -1) {
            q0Var.b(wVar, i1Var);
            return;
        }
        i1 i1Var2 = (i1) this.f21007c.get(wVar);
        if (i1Var2 != null) {
            q0Var.b(wVar, i1Var2);
        }
    }

    public final void d(i1 i1Var) {
        q0 a10 = s0.a();
        if (this.f21006b.isEmpty()) {
            a(a10, this.f21009e, i1Var);
            if (!pn.e.g(this.f21010f, this.f21009e)) {
                a(a10, this.f21010f, i1Var);
            }
            if (!pn.e.g(this.f21008d, this.f21009e) && !pn.e.g(this.f21008d, this.f21010f)) {
                a(a10, this.f21008d, i1Var);
            }
        } else {
            for (int i10 = 0; i10 < this.f21006b.size(); i10++) {
                a(a10, (r5.w) this.f21006b.get(i10), i1Var);
            }
            if (!this.f21006b.contains(this.f21008d)) {
                a(a10, this.f21008d, i1Var);
            }
        }
        this.f21007c = a10.a();
    }
}
