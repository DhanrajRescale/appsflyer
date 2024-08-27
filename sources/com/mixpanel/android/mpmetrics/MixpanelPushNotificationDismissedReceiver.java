package com.mixpanel.android.mpmetrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import ls.n0;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MixpanelPushNotificationDismissedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null && action.equals("com.mixpanel.push_notification_dismissed")) {
            HashMap hashMap = n0.f25255o;
            n0.p(context, intent, "$push_notification_dismissed", new JSONObject());
        }
    }
}
