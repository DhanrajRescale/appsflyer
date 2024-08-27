package in.juspay.hypersmshandler;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements OnSuccessListener, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20409b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f20408a = i10;
        this.f20409b = obj;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        int i10 = this.f20408a;
        Object obj = this.f20409b;
        switch (i10) {
            case 1:
                ((Tracker) obj).trackAndLogException("SmsConsentHandler", LogCategory.API_CALL, LogSubCategory.ApiCall.SDK, "sms_consent", "SmsConsent listener failed to start", exc);
                return;
            default:
                SmsRetriever.a((SmsRetriever) obj, exc);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ((Tracker) this.f20409b).trackAction(LogSubCategory.Action.SYSTEM, LogLevel.DEBUG, "sms_consent", "sms_consent_listener", "SmsConsent listener started successfully");
    }
}
