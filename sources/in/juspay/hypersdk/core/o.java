package in.juspay.hypersdk.core;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DuiInterface f20301b;

    public /* synthetic */ o(DuiInterface duiInterface, int i10) {
        this.f20300a = i10;
        this.f20301b = duiInterface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20300a;
        DuiInterface duiInterface = this.f20301b;
        switch (i10) {
            case 0:
                duiInterface.lambda$requestKeyboardHide$9();
                return;
            case 1:
                duiInterface.lambda$onDuiReady$2();
                return;
            default:
                duiInterface.lambda$suppressKeyboard$8();
                return;
        }
    }
}
