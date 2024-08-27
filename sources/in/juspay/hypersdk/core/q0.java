package in.juspay.hypersdk.core;

/* loaded from: classes2.dex */
public final /* synthetic */ class q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20324c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f20325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f20326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20327f;

    public /* synthetic */ q0(String str, String str2, String str3, String str4, Object obj, int i10) {
        this.f20322a = i10;
        this.f20323b = str;
        this.f20324c = str2;
        this.f20325d = str3;
        this.f20326e = str4;
        this.f20327f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20322a;
        String str = this.f20325d;
        String str2 = this.f20324c;
        String str3 = this.f20323b;
        Object obj = this.f20327f;
        String str4 = this.f20326e;
        switch (i10) {
            case 0:
                SdkTracker.lambda$trackBootLifecycle$2(str3, str2, str, str4, obj);
                return;
            default:
                SdkTracker.lambda$trackBootAction$3(str3, str2, str, str4, obj);
                return;
        }
    }
}
