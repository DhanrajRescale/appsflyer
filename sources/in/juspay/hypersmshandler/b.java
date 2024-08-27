package in.juspay.hypersmshandler;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SmsConsentHandler f20411b;

    public /* synthetic */ b(SmsConsentHandler smsConsentHandler, int i10) {
        this.f20410a = i10;
        this.f20411b = smsConsentHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20410a;
        SmsConsentHandler smsConsentHandler = this.f20411b;
        switch (i10) {
            case 0:
                SmsConsentHandler.a(smsConsentHandler);
                return;
            default:
                SmsConsentHandler.b(smsConsentHandler);
                return;
        }
    }
}
