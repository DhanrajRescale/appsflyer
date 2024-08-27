package t0;

import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class y2 extends e1.z implements e1.q {

    /* renamed from: b, reason: collision with root package name */
    public final z2 f35274b;

    /* renamed from: c, reason: collision with root package name */
    public x2 f35275c;

    public y2(Object obj, z2 z2Var) {
        this.f35274b = z2Var;
        this.f35275c = new x2(obj);
    }

    @Override // e1.y
    public final e1.a0 b() {
        return this.f35275c;
    }

    @Override // e1.q
    public final z2 c() {
        return this.f35274b;
    }

    @Override // e1.y
    public final void e(e1.a0 a0Var) {
        this.f35275c = (x2) a0Var;
    }

    @Override // t0.l3
    public final Object getValue() {
        return ((x2) e1.p.r(this.f35275c, this)).f35249c;
    }

    @Override // e1.y
    public final e1.a0 h(e1.a0 a0Var, e1.a0 a0Var2, e1.a0 a0Var3) {
        if (!this.f35274b.a(((x2) a0Var2).f35249c, ((x2) a0Var3).f35249c)) {
            return null;
        }
        return a0Var2;
    }

    @Override // t0.g1
    public final void setValue(Object obj) {
        e1.i i10;
        x2 x2Var = (x2) e1.p.h(this.f35275c);
        if (!this.f35274b.a(x2Var.f35249c, obj)) {
            x2 x2Var2 = this.f35275c;
            synchronized (e1.p.f14905b) {
                i10 = e1.p.i();
                ((x2) e1.p.m(x2Var2, this, i10, x2Var)).f35249c = obj;
                Unit unit = Unit.f23355a;
            }
            e1.p.l(i10, this);
        }
    }

    public final String toString() {
        return "MutableState(value=" + ((x2) e1.p.h(this.f35275c)).f35249c + ")@" + hashCode();
    }
}
