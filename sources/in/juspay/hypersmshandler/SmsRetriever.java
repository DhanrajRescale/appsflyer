package in.juspay.hypersmshandler;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import in.juspay.hypersmshandler.SmsEventInterface;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SmsRetriever extends BroadcastReceiver implements JuspayDuiHook {

    /* renamed from: a */
    @NonNull
    public final SmsComponents f20400a;

    /* renamed from: b */
    public JSONArray f20401b = new JSONArray();

    /* renamed from: c */
    public boolean f20402c = false;

    public SmsRetriever(@NonNull SmsComponents smsComponents) {
        this.f20400a = smsComponents;
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final void attach(@NonNull final Activity activity) {
        Task<Void> startSmsRetriever = com.google.android.gms.auth.api.phone.SmsRetriever.getClient(this.f20400a.getContext()).startSmsRetriever();
        startSmsRetriever.addOnSuccessListener(new OnSuccessListener() { // from class: in.juspay.hypersmshandler.d
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                SmsRetriever.this.a(activity, (Void) obj);
            }
        });
        startSmsRetriever.addOnFailureListener(new a(this, 2));
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final void detach(@NonNull Activity activity) {
        activity.unregisterReceiver(this);
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final String execute(@NonNull Activity activity, String str, JSONObject jSONObject) {
        if (str == null) {
            return "FAILURE";
        }
        if (!str.equals("cancel")) {
            if (!str.equals("getOtp")) {
                return "FAILURE";
            }
            JSONArray jSONArray = this.f20401b;
            if (jSONArray != null) {
                if (jSONArray.length() != 0) {
                    this.f20400a.getSmsEventInterface().onSmsRetrieverEvent(SmsEventInterface.RetrieverEvents.ON_EXECUTE, this.f20401b.toString());
                    this.f20401b = new JSONArray();
                    return "SUCCESS";
                }
                if (this.f20402c) {
                    this.f20400a.getSmsEventInterface().onSmsRetrieverEvent(SmsEventInterface.RetrieverEvents.ON_EXECUTE, "TIMEOUT");
                }
            }
        }
        return "SUCCESS";
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (!com.google.android.gms.auth.api.phone.SmsRetriever.SMS_RETRIEVED_ACTION.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return;
        }
        Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
        int statusCode = status != null ? status.getStatusCode() : 16;
        if (statusCode != 0) {
            if (statusCode != 15) {
                return;
            }
            this.f20402c = true;
            this.f20400a.getSmsEventInterface().onSmsRetrieverEvent(SmsEventInterface.RetrieverEvents.ON_RECEIVE, "TIMEOUT");
            return;
        }
        String str = (String) extras.get(com.google.android.gms.auth.api.phone.SmsRetriever.EXTRA_SMS_MESSAGE);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", "UNKNOWN_BANK");
            jSONObject.put("body", str);
            jSONObject.put("time", String.valueOf(System.currentTimeMillis()));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        JSONArray jSONArray = this.f20401b;
        if (jSONArray != null) {
            jSONArray.put(jSONObject);
        }
        this.f20400a.getSmsEventInterface().onSmsRetrieverEvent(SmsEventInterface.RetrieverEvents.ON_RECEIVE, this.f20401b.toString());
        this.f20401b = new JSONArray();
    }

    public /* synthetic */ void a(Activity activity, Void r42) {
        IntentFilter intentFilter = new IntentFilter(com.google.android.gms.auth.api.phone.SmsRetriever.SMS_RETRIEVED_ACTION);
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (Build.VERSION.SDK_INT >= 33) {
            activity.registerReceiver(this, intentFilter, 2);
        } else {
            activity.registerReceiver(this, intentFilter);
        }
        this.f20400a.getSmsEventInterface().onSmsRetrieverEvent(SmsEventInterface.RetrieverEvents.ON_ATTACH, "SUCCESS");
    }

    public /* synthetic */ void a(Exception exc) {
        this.f20400a.getSmsEventInterface().onSmsRetrieverEvent(SmsEventInterface.RetrieverEvents.ON_ATTACH, "FAILURE");
    }
}
