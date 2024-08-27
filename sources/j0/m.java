package j0;

import d2.d3;
import d2.s1;
import d2.u1;
import p2.x;

/* loaded from: classes.dex */
public abstract class m implements x {

    /* renamed from: a, reason: collision with root package name */
    public l f20598a;

    @Override // p2.x
    public final void d() {
        d3 d3Var;
        l lVar = this.f20598a;
        if (lVar != null && (d3Var = (d3) c2.g.p((k) lVar, s1.f13628m)) != null) {
            ((u1) d3Var).b();
        }
    }

    @Override // p2.x
    public final void g() {
        d3 d3Var;
        l lVar = this.f20598a;
        if (lVar != null && (d3Var = (d3) c2.g.p((k) lVar, s1.f13628m)) != null) {
            ((u1) d3Var).a();
        }
    }

    public final void i(l lVar) {
        if (this.f20598a == lVar) {
            this.f20598a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + lVar + " but was " + this.f20598a).toString());
    }
}
