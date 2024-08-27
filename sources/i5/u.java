package i5;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements e5.j, qn.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19646a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19647b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19648c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19649d;

    public /* synthetic */ u(int i10, b5.z0 z0Var, b5.z0 z0Var2) {
        this.f19647b = i10;
        this.f19648c = z0Var;
        this.f19649d = z0Var2;
    }

    @Override // qn.a
    public final Object execute() {
        on.h hVar = (on.h) this.f19648c;
        ((on.c) hVar.f30141d).a((jn.i) this.f19649d, this.f19647b + 1, false);
        return null;
    }

    @Override // e5.j
    public final void invoke(Object obj) {
        switch (this.f19646a) {
            case 0:
                b5.z0 z0Var = (b5.z0) this.f19648c;
                b5.z0 z0Var2 = (b5.z0) this.f19649d;
                b5.y0 y0Var = (b5.y0) obj;
                y0Var.F();
                y0Var.p(this.f19647b, z0Var, z0Var2);
                return;
            default:
                ((j5.c) obj).getClass();
                return;
        }
    }

    public /* synthetic */ u(j5.b bVar, Object obj, int i10) {
        this.f19648c = bVar;
        this.f19649d = obj;
        this.f19647b = i10;
    }
}
