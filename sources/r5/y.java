package r5;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.j f33328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f33329c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f33330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f33331e;

    public /* synthetic */ y(l0.j jVar, b0 b0Var, n nVar, s sVar, int i10) {
        this.f33327a = i10;
        this.f33328b = jVar;
        this.f33329c = b0Var;
        this.f33330d = nVar;
        this.f33331e = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f33327a;
        s sVar = this.f33331e;
        n nVar = this.f33330d;
        b0 b0Var = this.f33329c;
        l0.j jVar = this.f33328b;
        switch (i10) {
            case 0:
                b0Var.G(jVar.f23773a, (w) jVar.f23774b, nVar, sVar);
                return;
            case 1:
                b0Var.v(jVar.f23773a, (w) jVar.f23774b, nVar, sVar);
                return;
            default:
                b0Var.J(jVar.f23773a, (w) jVar.f23774b, nVar, sVar);
                return;
        }
    }
}
