package j9;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21210a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f21211b;

    public /* synthetic */ s(y yVar, int i10) {
        this.f21210a = i10;
        this.f21211b = yVar;
    }

    @Override // j9.x
    public final void run() {
        int i10 = this.f21210a;
        y yVar = this.f21211b;
        switch (i10) {
            case 0:
                yVar.l();
                return;
            default:
                yVar.j();
                return;
        }
    }
}
