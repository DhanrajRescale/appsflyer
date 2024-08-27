package t0;

import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class w2 extends e1.z implements f1, e1.q {

    /* renamed from: b, reason: collision with root package name */
    public v2 f35229b;

    @Override // e1.y
    public final e1.a0 b() {
        return this.f35229b;
    }

    @Override // e1.q
    public final z2 c() {
        return o3.f35116a;
    }

    @Override // e1.y
    public final void e(e1.a0 a0Var) {
        this.f35229b = (v2) a0Var;
    }

    @Override // e1.y
    public final e1.a0 h(e1.a0 a0Var, e1.a0 a0Var2, e1.a0 a0Var3) {
        if (((v2) a0Var2).f35223c != ((v2) a0Var3).f35223c) {
            return null;
        }
        return a0Var2;
    }

    public final void i(long j10) {
        e1.i i10;
        v2 v2Var = (v2) e1.p.h(this.f35229b);
        if (v2Var.f35223c != j10) {
            v2 v2Var2 = this.f35229b;
            synchronized (e1.p.f14905b) {
                i10 = e1.p.i();
                ((v2) e1.p.m(v2Var2, this, i10, v2Var)).f35223c = j10;
                Unit unit = Unit.f23355a;
            }
            e1.p.l(i10, this);
        }
    }

    public final String toString() {
        return "MutableLongState(value=" + ((v2) e1.p.h(this.f35229b)).f35223c + ")@" + hashCode();
    }
}
