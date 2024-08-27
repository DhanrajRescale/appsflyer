package in.juspay.services;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HyperServices f20420b;

    public /* synthetic */ b(HyperServices hyperServices, int i10) {
        this.f20419a = i10;
        this.f20420b = hyperServices;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20419a;
        HyperServices hyperServices = this.f20420b;
        switch (i10) {
            case 0:
                hyperServices.lambda$initiate$2();
                return;
            default:
                hyperServices.lambda$runProcessWaitQueue$4();
                return;
        }
    }
}
