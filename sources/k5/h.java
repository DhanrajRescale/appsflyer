package k5;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tr.e f22108b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Exception f22109c;

    public /* synthetic */ h(tr.e eVar, Exception exc, int i10) {
        this.f22107a = i10;
        this.f22108b = eVar;
        this.f22109c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f22107a;
        Exception exc = this.f22109c;
        tr.e eVar = this.f22108b;
        switch (i10) {
            case 0:
                i5.d0 d0Var = (i5.d0) eVar.f36362c;
                int i11 = e5.x.f15050a;
                j5.w wVar = (j5.w) d0Var.f19384a.f19472r;
                j5.b U = wVar.U();
                wVar.V(U, 1029, new j5.q(U, exc, 3));
                return;
            default:
                i5.d0 d0Var2 = (i5.d0) eVar.f36362c;
                int i12 = e5.x.f15050a;
                j5.w wVar2 = (j5.w) d0Var2.f19384a.f19472r;
                j5.b U2 = wVar2.U();
                wVar2.V(U2, 1014, new j5.q(U2, exc, 2));
                return;
        }
    }
}
