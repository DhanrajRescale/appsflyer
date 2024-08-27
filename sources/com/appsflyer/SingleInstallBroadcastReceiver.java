package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.internal.AFb1vSDK;

/* loaded from: classes.dex */
public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent == null) {
            return;
        }
        try {
            str = intent.getStringExtra("referrer");
        } catch (Throwable th2) {
            AFLogger.afErrorLog("error in BroadcastReceiver ", th2);
            str = null;
        }
        if (str != null && AFb1vSDK.AFKeystoreWrapper(context).getString("referrer", null) != null) {
            AFb1vSDK.AFKeystoreWrapper().valueOf(context, str);
            return;
        }
        String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
        long currentTimeMillis = System.currentTimeMillis();
        if (string != null && currentTimeMillis - Long.parseLong(string) < 2000) {
            return;
        }
        AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
        AFb1vSDK.AFKeystoreWrapper().AFKeystoreWrapper(context, intent);
        AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
    }
}
