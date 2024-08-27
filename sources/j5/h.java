package j5;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements e5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i5.g f20981b;

    public /* synthetic */ h(b bVar, i5.g gVar, int i10) {
        this.f20980a = i10;
        this.f20981b = gVar;
    }

    @Override // e5.j
    public final void invoke(Object obj) {
        switch (this.f20980a) {
            case 0:
                ((c) obj).getClass();
                return;
            case 1:
                ((c) obj).getClass();
                return;
            case 2:
                ((c) obj).getClass();
                return;
            default:
                a0 a0Var = (a0) ((c) obj);
                int i10 = a0Var.f20960x;
                i5.g gVar = this.f20981b;
                a0Var.f20960x = i10 + gVar.f19440g;
                a0Var.f20961y += gVar.f19438e;
                return;
        }
    }
}
