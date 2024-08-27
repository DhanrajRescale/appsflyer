package k5;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tr.e f22119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i5.g f22120c;

    public /* synthetic */ i(tr.e eVar, i5.g gVar, int i10) {
        this.f22118a = i10;
        this.f22119b = eVar;
        this.f22120c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22118a) {
            case 0:
                tr.e eVar = this.f22119b;
                i5.g gVar = this.f22120c;
                eVar.getClass();
                synchronized (gVar) {
                }
                i5.d0 d0Var = (i5.d0) eVar.f36362c;
                int i10 = e5.x.f15050a;
                j5.w wVar = (j5.w) d0Var.f19384a.f19472r;
                j5.b S = wVar.S(wVar.f21014d.f21009e);
                wVar.V(S, 1013, new j5.h(S, gVar, 2));
                return;
            default:
                i5.d0 d0Var2 = (i5.d0) this.f22119b.f36362c;
                int i11 = e5.x.f15050a;
                i5.g0 g0Var = d0Var2.f19384a;
                g0Var.getClass();
                j5.w wVar2 = (j5.w) g0Var.f19472r;
                j5.b U = wVar2.U();
                wVar2.V(U, 1007, new j5.h(U, this.f22120c, 1));
                return;
        }
    }
}
