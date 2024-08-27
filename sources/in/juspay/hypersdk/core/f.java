package in.juspay.hypersdk.core;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidInterface f20237b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20238c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f20239d;

    public /* synthetic */ f(int i10, AndroidInterface androidInterface, String str, String str2) {
        this.f20236a = i10;
        this.f20237b = androidInterface;
        this.f20238c = str;
        this.f20239d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20236a;
        AndroidInterface androidInterface = this.f20237b;
        String str = this.f20239d;
        String str2 = this.f20238c;
        switch (i10) {
            case 0:
                androidInterface.lambda$runCmdsInBg$9(str2, str);
                return;
            case 1:
                androidInterface.lambda$runInUI$8(str2, str);
                return;
            case 2:
                androidInterface.lambda$updateProperties$11(str2, str);
                return;
            default:
                androidInterface.lambda$runCmdsInUI$10(str2, str);
                return;
        }
    }
}
