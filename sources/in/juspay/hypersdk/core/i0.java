package in.juspay.hypersdk.core;

/* loaded from: classes2.dex */
public final /* synthetic */ class i0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JBridge f20268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20269c;

    public /* synthetic */ i0(JBridge jBridge, String str, int i10) {
        this.f20267a = i10;
        this.f20268b = jBridge;
        this.f20269c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20267a;
        String str = this.f20269c;
        JBridge jBridge = this.f20268b;
        switch (i10) {
            case 0:
                JBridge.p(jBridge, str);
                return;
            default:
                JBridge.s(jBridge, str);
                return;
        }
    }
}
