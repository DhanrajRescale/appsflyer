package j5;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements e5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f21001b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r5.s f21002c;

    public /* synthetic */ s(b bVar, r5.s sVar, int i10) {
        this.f21000a = i10;
        this.f21001b = bVar;
        this.f21002c = sVar;
    }

    @Override // e5.j
    public final void invoke(Object obj) {
        switch (this.f21000a) {
            case 0:
                ((c) obj).getClass();
                return;
            default:
                a0 a0Var = (a0) ((c) obj);
                a0Var.getClass();
                b bVar = this.f21001b;
                if (bVar.f20966d != null) {
                    r5.s sVar = this.f21002c;
                    b5.v vVar = sVar.f33294c;
                    vVar.getClass();
                    r5.w wVar = bVar.f20966d;
                    wVar.getClass();
                    l0.j jVar = new l0.j(vVar, sVar.f33295d, a0Var.f20938b.c(bVar.f20964b, wVar));
                    int i10 = sVar.f33293b;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    a0Var.f20953q = jVar;
                                    return;
                                }
                                return;
                            }
                        } else {
                            a0Var.f20952p = jVar;
                            return;
                        }
                    }
                    a0Var.f20951o = jVar;
                    return;
                }
                return;
        }
    }
}
