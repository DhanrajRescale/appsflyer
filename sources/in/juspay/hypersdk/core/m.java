package in.juspay.hypersdk.core;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20292a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20294c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20295d;

    public /* synthetic */ m(AndroidInterface androidInterface, String str, int i10) {
        this.f20295d = androidInterface;
        this.f20294c = str;
        this.f20293b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20292a;
        String str = this.f20294c;
        int i11 = this.f20293b;
        Object obj = this.f20295d;
        switch (i10) {
            case 0:
                ((AndroidInterface) obj).lambda$removeView$6(str, i11);
                return;
            default:
                DuiInterface.l((DuiInterface) obj, i11, str);
                return;
        }
    }

    public /* synthetic */ m(DuiInterface duiInterface, int i10, String str) {
        this.f20295d = duiInterface;
        this.f20293b = i10;
        this.f20294c = str;
    }
}
