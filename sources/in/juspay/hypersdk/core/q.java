package in.juspay.hypersdk.core;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DynamicUI f20321b;

    public /* synthetic */ q(DynamicUI dynamicUI, int i10) {
        this.f20320a = i10;
        this.f20321b = dynamicUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20320a;
        DynamicUI dynamicUI = this.f20321b;
        switch (i10) {
            case 0:
                DynamicUI.a(dynamicUI);
                return;
            case 1:
                DynamicUI.a(dynamicUI);
                return;
            default:
                DynamicUI.c(dynamicUI);
                return;
        }
    }
}
