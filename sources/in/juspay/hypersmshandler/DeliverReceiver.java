package in.juspay.hypersmshandler;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.widget.Toast;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class DeliverReceiver extends BroadcastReceiver implements JuspayDuiHook {
    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final void attach(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 33) {
            activity.registerReceiver(this, new IntentFilter("SMS_DELIVERED"), 2);
        } else {
            activity.registerReceiver(this, new IntentFilter("SMS_DELIVERED"));
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
        String str;
        int resultCode = getResultCode();
        if (resultCode == -1) {
            str = "SMS DELIVERED";
        } else if (resultCode != 0) {
            return;
        } else {
            str = "SMS NOT DELIVERED";
        }
        Toast.makeText(context, str, 0).show();
    }
}
