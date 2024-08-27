package in.juspay.hypersdk.core;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JuspayServices f20298b;

    public /* synthetic */ n(JuspayServices juspayServices, int i10) {
        this.f20297a = i10;
        this.f20298b = juspayServices;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20297a;
        JuspayServices juspayServices = this.f20298b;
        switch (i10) {
            case 0:
                juspayServices.terminate();
                return;
            case 1:
                juspayServices.lambda$reset$5();
                return;
            case 2:
                juspayServices.lambda$removeFragment$8();
                return;
            default:
                PrefetchServices.b(juspayServices);
                return;
        }
    }
}
