package j9;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f21213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21214c;

    public /* synthetic */ t(y yVar, String str, int i10) {
        this.f21212a = i10;
        this.f21213b = yVar;
        this.f21214c = str;
    }

    @Override // j9.x
    public final void run() {
        int i10 = this.f21212a;
        String str = this.f21214c;
        y yVar = this.f21213b;
        switch (i10) {
            case 0:
                yVar.p(str);
                return;
            case 1:
                yVar.v(str);
                return;
            default:
                yVar.s(str);
                return;
        }
    }
}
