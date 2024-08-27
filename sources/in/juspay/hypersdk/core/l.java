package in.juspay.hypersdk.core;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidInterface f20286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20287c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f20289e;

    public /* synthetic */ l(AndroidInterface androidInterface, String str, int i10, String str2, int i11) {
        this.f20285a = i11;
        this.f20286b = androidInterface;
        this.f20287c = str;
        this.f20288d = i10;
        this.f20289e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20285a;
        String str = this.f20287c;
        AndroidInterface androidInterface = this.f20286b;
        String str2 = this.f20289e;
        int i11 = this.f20288d;
        switch (i10) {
            case 0:
                androidInterface.lambda$toggleKeyboard$13(str, i11, str2);
                return;
            default:
                androidInterface.lambda$setImage$12(str, i11, str2);
                return;
        }
    }
}
