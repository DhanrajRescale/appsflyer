package in.juspay.hypersdk.core;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20355b;

    public /* synthetic */ t(Object obj, int i10) {
        this.f20354a = i10;
        this.f20355b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20354a;
        Object obj = this.f20355b;
        switch (i10) {
            case 0:
                ((InflateView) obj).lambda$dismissPopUp$11();
                return;
            default:
                SdkTracker.lambda$addToBootLogs$1((String) obj);
                return;
        }
    }
}
