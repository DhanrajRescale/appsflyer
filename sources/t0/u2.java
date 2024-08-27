package t0;

import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class u2 extends e1.z implements e1, e1.q {

    /* renamed from: b, reason: collision with root package name */
    public t2 f35217b;

    @Override // e1.y
    public final e1.a0 b() {
        return this.f35217b;
    }

    @Override // e1.q
    public final z2 c() {
        return o3.f35116a;
    }

    @Override // e1.y
    public final void e(e1.a0 a0Var) {
        this.f35217b = (t2) a0Var;
    }

    @Override // e1.y
    public final e1.a0 h(e1.a0 a0Var, e1.a0 a0Var2, e1.a0 a0Var3) {
        if (((t2) a0Var2).f35213c != ((t2) a0Var3).f35213c) {
            return null;
        }
        return a0Var2;
    }

    public final int i() {
        return ((t2) e1.p.r(this.f35217b, this)).f35213c;
    }

    public final void j(int i10) {
        e1.i i11;
        t2 t2Var = (t2) e1.p.h(this.f35217b);
        if (t2Var.f35213c != i10) {
            t2 t2Var2 = this.f35217b;
            synchronized (e1.p.f14905b) {
                i11 = e1.p.i();
                ((t2) e1.p.m(t2Var2, this, i11, t2Var)).f35213c = i10;
                Unit unit = Unit.f23355a;
            }
            e1.p.l(i11, this);
        }
    }

    public final String toString() {
        return "MutableIntState(value=" + ((t2) e1.p.h(this.f35217b)).f35213c + ")@" + hashCode();
    }
}
