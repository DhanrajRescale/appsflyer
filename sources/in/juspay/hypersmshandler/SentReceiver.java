package in.juspay.hypersmshandler;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class SentReceiver extends BroadcastReceiver implements JuspayDuiHook {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final SmsComponents f20391a;

    public SentReceiver(@NonNull SmsComponents smsComponents) {
        this.f20391a = smsComponents;
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final void attach(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 33) {
            activity.registerReceiver(this, new IntentFilter("SMS_SENT"), 2);
        } else {
            activity.registerReceiver(this, new IntentFilter("SMS_SENT"));
        }
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final void detach(@NonNull Activity activity) {
        activity.unregisterReceiver(this);
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final String execute(@NonNull Activity activity, String str, JSONObject jSONObject) {
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f20391a.getSmsEventInterface().onSentReceiverEvent(getResultCode());
    }
}
