package in.juspay.hypersdk.core;

/* loaded from: classes2.dex */
public final /* synthetic */ class p0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20313a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20315c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Throwable f20316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f20317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f20318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f20319g;

    public /* synthetic */ p0(SdkTracker sdkTracker, String str, String str2, String str3, String str4, Throwable th2) {
        this.f20319g = sdkTracker;
        this.f20314b = str;
        this.f20315c = str2;
        this.f20317e = str3;
        this.f20318f = str4;
        this.f20316d = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20313a;
        Object obj = this.f20319g;
        switch (i10) {
            case 0:
                ((SdkTracker) obj).lambda$trackException$13(this.f20314b, this.f20315c, this.f20317e, this.f20318f, this.f20316d);
                return;
            default:
                SdkTracker.lambda$trackAndLogBootException$5(this.f20314b, this.f20315c, this.f20316d, this.f20317e, this.f20318f, (String) obj);
                return;
        }
    }

    public /* synthetic */ p0(String str, String str2, Throwable th2, String str3, String str4, String str5) {
        this.f20314b = str;
        this.f20315c = str2;
        this.f20316d = th2;
        this.f20317e = str3;
        this.f20318f = str4;
        this.f20319g = str5;
    }
}
