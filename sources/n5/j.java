package n5;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f28310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f28311c;

    public /* synthetic */ j(l lVar, m mVar, int i10) {
        this.f28309a = i10;
        this.f28310b = lVar;
        this.f28311c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f28309a;
        m mVar = this.f28311c;
        l lVar = this.f28310b;
        switch (i10) {
            case 0:
                mVar.d(lVar.f28314a, lVar.f28315b);
                return;
            case 1:
                mVar.s(lVar.f28314a, lVar.f28315b);
                return;
            case 2:
                mVar.k(lVar.f28314a, lVar.f28315b);
                return;
            default:
                mVar.g(lVar.f28314a, lVar.f28315b);
                return;
        }
    }
}
