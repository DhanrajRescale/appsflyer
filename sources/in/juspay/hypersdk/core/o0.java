package in.juspay.hypersdk.core;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SdkTracker f20303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20304c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f20305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f20306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f20307f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f20308g;

    public /* synthetic */ o0(SdkTracker sdkTracker, String str, String str2, String str3, String str4, Object obj, int i10) {
        this.f20302a = i10;
        this.f20303b = sdkTracker;
        this.f20304c = str;
        this.f20305d = str2;
        this.f20306e = str3;
        this.f20307f = str4;
        this.f20308g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20302a) {
            case 0:
                this.f20303b.lambda$trackLifecycle$6(this.f20304c, this.f20305d, this.f20306e, this.f20307f, this.f20308g);
                return;
            case 1:
                this.f20303b.lambda$trackContext$11(this.f20304c, this.f20305d, this.f20306e, this.f20307f, this.f20308g);
                return;
            default:
                this.f20303b.lambda$trackAction$8(this.f20304c, this.f20305d, this.f20306e, this.f20307f, this.f20308g);
                return;
        }
    }
}
