package t0;

import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class s2 extends e1.z implements d1, e1.q {

    /* renamed from: b, reason: collision with root package name */
    public r2 f35200b;

    @Override // e1.y
    public final e1.a0 b() {
        return this.f35200b;
    }

    @Override // e1.q
    public final z2 c() {
        return o3.f35116a;
    }

    @Override // e1.y
    public final void e(e1.a0 a0Var) {
        this.f35200b = (r2) a0Var;
    }

    @Override // e1.y
    public final e1.a0 h(e1.a0 a0Var, e1.a0 a0Var2, e1.a0 a0Var3) {
        if (((r2) a0Var2).f35196c != ((r2) a0Var3).f35196c) {
            return null;
        }
        return a0Var2;
    }

    public final float i() {
        return ((r2) e1.p.r(this.f35200b, this)).f35196c;
    }

    public final void j(float f10) {
        e1.i i10;
        r2 r2Var = (r2) e1.p.h(this.f35200b);
        if (r2Var.f35196c != f10) {
            r2 r2Var2 = this.f35200b;
            synchronized (e1.p.f14905b) {
                i10 = e1.p.i();
                ((r2) e1.p.m(r2Var2, this, i10, r2Var)).f35196c = f10;
                Unit unit = Unit.f23355a;
            }
            e1.p.l(i10, this);
        }
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((r2) e1.p.h(this.f35200b)).f35196c + ")@" + hashCode();
    }
}
