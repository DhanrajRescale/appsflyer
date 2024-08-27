package j9;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f21208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21209c;

    public /* synthetic */ r(y yVar, int i10, int i11) {
        this.f21207a = i11;
        this.f21208b = yVar;
        this.f21209c = i10;
    }

    @Override // j9.x
    public final void run() {
        int i10 = this.f21207a;
        int i11 = this.f21209c;
        y yVar = this.f21208b;
        switch (i10) {
            case 0:
                yVar.u(i11);
                return;
            case 1:
                yVar.o(i11);
                return;
            default:
                yVar.n(i11);
                return;
        }
    }
}
