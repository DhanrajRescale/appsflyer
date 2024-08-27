package i0;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class z implements tu.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1 f19283a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p2.d0 f19284b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.v0 f19285c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2.o f19286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p2.v f19287e;

    public z(q1 q1Var, p2.d0 d0Var, l0.v0 v0Var, p2.o oVar, p2.v vVar) {
        this.f19283a = q1Var;
        this.f19284b = d0Var;
        this.f19285c = v0Var;
        this.f19286d = oVar;
        this.f19287e = vVar;
    }

    @Override // tu.g
    public final Object a(Object obj, yt.a aVar) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        q1 q1Var = this.f19283a;
        if (booleanValue && q1Var.b()) {
            l1.o(this.f19284b, q1Var, this.f19285c.k(), this.f19286d, this.f19287e);
        } else {
            l1.k(q1Var);
        }
        return Unit.f23355a;
    }
}
