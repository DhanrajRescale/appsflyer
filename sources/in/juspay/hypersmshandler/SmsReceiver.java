package in.juspay.hypersmshandler;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsMessage;
import androidx.annotation.NonNull;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersmshandler.SmsServices;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class SmsReceiver extends BroadcastReceiver implements JuspayDuiHook, OnResultHook {

    /* renamed from: a, reason: collision with root package name */
    public IntentFilter f20397a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final SmsServices f20398b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Tracker f20399c;

    public SmsReceiver(@NonNull SmsServices smsServices) {
        this.f20398b = smsServices;
        this.f20399c = smsServices.a().getTracker();
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final void attach(@NonNull Activity activity) {
        if (this.f20397a == null) {
            SmsServices smsServices = this.f20398b;
            final SmsConsentHandler smsConsentHandler = smsServices.f20403a;
            if (smsConsentHandler == null) {
                this.f20399c.trackAction(LogSubCategory.Action.SYSTEM, "error", "sms_receiver", "missing", "SmsConsentHandler");
                return;
            }
            Intent intent = smsConsentHandler.f20393a;
            if (intent != null) {
                smsServices.f20404b.getSmsEventInterface().onSmsConsentEvent(intent, 11, null);
            }
            smsConsentHandler.f20396d = new Runnable() { // from class: in.juspay.hypersmshandler.c
                @Override // java.lang.Runnable
                public final void run() {
                    SmsReceiver.this.a(smsConsentHandler);
                }
            };
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            this.f20398b.f20404b.getContext().registerReceiver(this, this.f20397a, 2);
        } else {
            this.f20398b.f20404b.getContext().registerReceiver(this, this.f20397a);
        }
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final void detach(@NonNull Activity activity) {
        try {
            if (this.f20397a == null) {
                SmsConsentHandler smsConsentHandler = this.f20398b.f20403a;
                if (smsConsentHandler != null) {
                    smsConsentHandler.f20396d = null;
                }
            } else {
                this.f20398b.f20404b.getContext().unregisterReceiver(this);
            }
        } catch (Exception unused) {
        }
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final String execute(@NonNull Activity activity, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("smsReadStartTime")) {
                    return this.f20398b.a(null, jSONObject.getString("smsReadStartTime"), null);
                }
            } catch (JSONException e10) {
                this.f20399c.trackAndLogException("SmsReceiver", LogCategory.ACTION, LogSubCategory.Action.SYSTEM, "broadcast_receiver", "Exception while trying to read sms from Inbox: ", e10);
                return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
        }
        return this.f20398b.a(null, String.valueOf(System.currentTimeMillis() - 60000), null);
    }

    @Override // in.juspay.hypersmshandler.OnResultHook
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 11) {
            SmsServices smsServices = this.f20398b;
            SmsConsentHandler smsConsentHandler = smsServices.f20403a;
            if (smsConsentHandler != null) {
                smsConsentHandler.e();
            }
            SmsServices.AnonymousClass2 anonymousClass2 = new SmsServices.AnonymousClass2(smsServices.f20404b);
            smsServices.f20403a = anonymousClass2;
            anonymousClass2.f20396d = null;
            if (intent == null) {
                this.f20398b.f20404b.getSmsEventInterface().onActivityResultEvent("DENIED");
                return true;
            }
            if (i11 != -1) {
                if (i11 == 0) {
                    this.f20399c.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.DEBUG, "broadcast_receiver", Labels.Android.ON_ACTIVITY_RESULT, "User denied SMS consent");
                    this.f20398b.f20404b.getSmsEventInterface().onActivityResultEvent("DENIED");
                }
            } else {
                String stringExtra = intent.getStringExtra(com.google.android.gms.auth.api.phone.SmsRetriever.EXTRA_SMS_MESSAGE);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("from", "UNKNOWN_BANK");
                    jSONObject.put("body", stringExtra);
                    jSONObject.put("time", String.valueOf(System.currentTimeMillis()));
                    this.f20398b.f20404b.getSmsEventInterface().onActivityResultEvent(jSONObject.toString());
                    this.f20399c.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.DEBUG, "broadcast_receiver", Labels.Android.ON_ACTIVITY_RESULT, "Response sent back to microapp");
                } catch (JSONException e10) {
                    this.f20398b.f20404b.getSmsEventInterface().onActivityResultEvent("DENIED");
                    this.f20399c.trackAndLogException("SmsReceiver", LogCategory.API_CALL, LogSubCategory.ApiCall.SDK, "sms_consent", "JSON Exception", e10);
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            if ("android.provider.Telephony.SMS_RECEIVED".equals(intent.getAction())) {
                a(intent);
            }
        } catch (Exception e10) {
            this.f20399c.trackAndLogException("SmsReceiver", LogCategory.ACTION, LogSubCategory.Action.SYSTEM, "broadcast_receiver", "Failed to receive sms", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SmsConsentHandler smsConsentHandler) {
        Intent intent = smsConsentHandler.f20393a;
        if (intent != null) {
            this.f20398b.f20404b.getSmsEventInterface().onSmsConsentEvent(intent, 11, null);
        }
    }

    public final void a(@NonNull Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Object[] objArr = (Object[]) extras.get("pdus");
            int length = objArr != null ? objArr.length : 0;
            SmsMessage[] smsMessageArr = new SmsMessage[length];
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < length; i10++) {
                SmsMessage createFromPdu = SmsMessage.createFromPdu((byte[]) objArr[i10]);
                smsMessageArr[i10] = createFromPdu;
                String originatingAddress = createFromPdu.getOriginatingAddress();
                String upperCase = originatingAddress != null ? originatingAddress.toUpperCase() : HttpUrl.FRAGMENT_ENCODE_SET;
                String upperCase2 = smsMessageArr[i10].getMessageBody().toUpperCase();
                String valueOf = String.valueOf(smsMessageArr[i10].getTimestampMillis());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", upperCase);
                jSONObject.put("body", upperCase2);
                jSONObject.put("time", valueOf);
                jSONArray.put(jSONObject);
            }
            if (jSONArray.length() > 0) {
                this.f20398b.f20404b.getSmsEventInterface().onSmsReceiverEvent(jSONArray.toString());
            }
        }
    }
}
