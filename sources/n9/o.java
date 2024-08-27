package n9;

import qu.x1;
import t0.j0;
import t0.l3;
import t0.n1;
import t0.o3;

/* loaded from: classes.dex */
public final class o implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public final qu.q f28521a;

    /* renamed from: b, reason: collision with root package name */
    public final n1 f28522b;

    /* renamed from: c, reason: collision with root package name */
    public final n1 f28523c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f28524d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f28525e;

    /* JADX WARN: Type inference failed for: r0v0, types: [qu.q, qu.x1] */
    public o() {
        ?? x1Var = new x1(true);
        x1Var.V(null);
        this.f28521a = x1Var;
        o3 o3Var = o3.f35116a;
        this.f28522b = t0.t.n0(null, o3Var);
        this.f28523c = t0.t.n0(null, o3Var);
        t0.t.N(new n(this, 2));
        this.f28524d = t0.t.N(new n(this, 0));
        t0.t.N(new n(this, 1));
        this.f28525e = t0.t.N(new n(this, 3));
    }

    @Override // t0.l3
    public final Object getValue() {
        return (j9.i) this.f28522b.getValue();
    }
}
