package j9;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f21202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f21203c;

    public /* synthetic */ p(y yVar, float f10, int i10) {
        this.f21201a = i10;
        this.f21202b = yVar;
        this.f21203c = f10;
    }

    @Override // j9.x
    public final void run() {
        int i10 = this.f21201a;
        float f10 = this.f21203c;
        y yVar = this.f21202b;
        switch (i10) {
            case 0:
                yVar.x(f10);
                return;
            case 1:
                yVar.w(f10);
                return;
            default:
                yVar.q(f10);
                return;
        }
    }
}
