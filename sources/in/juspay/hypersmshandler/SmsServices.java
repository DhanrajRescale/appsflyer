package in.juspay.hypersmshandler;

import android.content.IntentFilter;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import hl.f;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;

/* loaded from: classes2.dex */
public class SmsServices {

    /* renamed from: a, reason: collision with root package name */
    public SmsConsentHandler f20403a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final SmsComponents f20404b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20405c = "SmsServices";

    /* renamed from: in.juspay.hypersmshandler.SmsServices$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass2 extends SmsConsentHandler {
        public AnonymousClass2(SmsComponents smsComponents) {
            super(smsComponents);
        }

        @Override // in.juspay.hypersmshandler.SmsConsentHandler
        public final void c() {
            SmsServices smsServices = SmsServices.this;
            SmsConsentHandler smsConsentHandler = smsServices.f20403a;
            if (smsConsentHandler != null) {
                smsConsentHandler.e();
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(smsServices.f20404b);
            smsServices.f20403a = anonymousClass2;
            anonymousClass2.f20396d = null;
        }
    }

    @Keep
    public SmsServices(@NonNull SmsComponents smsComponents) {
        this.f20404b = smsComponents;
    }

    @NonNull
    public final SmsComponents a() {
        return this.f20404b;
    }

    @Keep
    public JuspayDuiHook createDeliveredSMSReceiver() {
        return new DeliverReceiver();
    }

    @Keep
    public void createSMSConsent() {
        try {
            if (this.f20403a == null && this.f20404b.getContext().getPackageManager().checkPermission("android.permission.READ_SMS", "com.google.android.gms") == 0) {
                SmsConsentHandler smsConsentHandler = new SmsConsentHandler(this.f20404b) { // from class: in.juspay.hypersmshandler.SmsServices.1
                    @Override // in.juspay.hypersmshandler.SmsConsentHandler
                    public final void c() {
                        SmsServices smsServices = SmsServices.this;
                        SmsConsentHandler smsConsentHandler2 = smsServices.f20403a;
                        if (smsConsentHandler2 != null) {
                            smsConsentHandler2.e();
                        }
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(smsServices.f20404b);
                        smsServices.f20403a = anonymousClass2;
                        anonymousClass2.f20396d = null;
                    }
                };
                this.f20403a = smsConsentHandler;
                smsConsentHandler.f20396d = null;
            }
        } catch (Exception e10) {
            this.f20404b.getTracker().trackAndLogException(this.f20405c, LogCategory.LIFECYCLE, "hyper_sdk", "sms_consent", "Exception happened while initializing", e10);
        }
    }

    @Keep
    public JuspayDuiHook createSMSReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
        intentFilter.setPriority(999);
        try {
            if (a("android.permission.RECEIVE_SMS")) {
                SmsReceiver smsReceiver = new SmsReceiver(this);
                smsReceiver.f20397a = intentFilter;
                return smsReceiver;
            }
            return null;
        } catch (Throwable th2) {
            this.f20404b.getTracker().trackAndLogException(this.f20405c, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, "sms_receiver", "Failed to register SMS broadcast receiver (Ignoring)", th2);
            return null;
        }
    }

    @Keep
    public JuspayDuiHook createSendSMSReceiver() {
        return new SentReceiver(this.f20404b);
    }

    @Keep
    public JuspayDuiHook createSmsReceiverForConsent() {
        try {
            SmsReceiver smsReceiver = new SmsReceiver(this);
            smsReceiver.f20397a = null;
            return smsReceiver;
        } catch (Exception e10) {
            this.f20404b.getTracker().trackAndLogException(this.f20405c, LogCategory.API_CALL, LogSubCategory.ApiCall.SDK, "sms_consent", "Failed to register SMS Consent", e10);
            return null;
        }
    }

    @Keep
    public JuspayDuiHook createSmsRetriever() {
        return new SmsRetriever(this.f20404b);
    }

    @NonNull
    @Keep
    public String fetchSms(String str, String str2, String str3) {
        return a(str2, str, str3);
    }

    @Keep
    public void unregisterSmsConsent() {
        SmsConsentHandler smsConsentHandler = this.f20403a;
        if (smsConsentHandler != null) {
            smsConsentHandler.e();
            this.f20403a = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f A[Catch: JSONException -> 0x00fc, TRY_LEAVE, TryCatch #3 {JSONException -> 0x00fc, blocks: (B:85:0x004a, B:88:0x0051, B:11:0x0079, B:13:0x007f, B:16:0x00b3, B:17:0x00c8, B:19:0x00e2, B:9:0x0057), top: B:84:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0189 A[Catch: Exception -> 0x0183, TRY_LEAVE, TryCatch #5 {Exception -> 0x0183, blocks: (B:46:0x0189, B:59:0x0186, B:66:0x017f, B:61:0x0179), top: B:29:0x0118, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0186 A[Catch: Exception -> 0x0183, TryCatch #5 {Exception -> 0x0183, blocks: (B:46:0x0189, B:59:0x0186, B:66:0x017f, B:61:0x0179), top: B:29:0x0118, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersmshandler.SmsServices.a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public final boolean a(@NonNull String str) {
        return f.D(this.f20404b.getContext(), str) == 0;
    }
}
