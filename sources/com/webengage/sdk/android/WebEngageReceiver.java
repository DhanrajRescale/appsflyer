package com.webengage.sdk.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.webengage.sdk.android.u;
import in.juspay.hyper.constants.LogCategory;
import java.util.List;

/* loaded from: classes2.dex */
public class WebEngageReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        try {
            String action = intent.getAction();
            if ("com.google.android.c2dm.intent.RECEIVE".equals(action)) {
                Logger.w("WebEngage", "GCM/FCM message received in WebEngageReceiver, Please fix your integration");
                return;
            }
            if (!"com.webengage.sdk.android.intent.ACTION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            if (WebEngage.get().getWebEngageConfig().isLocationTrackingEnabled()) {
                Location b10 = t.a(context).b(intent);
                if (b10 != null) {
                    WebEngage.get().a(b10, this);
                    Logger.d("WebEngage", "UserUpdateGeoInfo: " + b10);
                }
                List<u.a> a10 = t.a(context).a(intent);
                if (a10 != null) {
                    for (u.a aVar : a10) {
                        WebEngage.get().a(aVar, this);
                        Logger.d("WebEngage", aVar.toString());
                    }
                }
            }
            String string = extras.getString(LogCategory.ACTION);
            if ("session_destroy".equals(string)) {
                WebEngage.get().e(this);
                return;
            }
            if ("sync".equals(string)) {
                WebEngage.get().c(this);
                return;
            }
            if ("config_refresh".equals(string)) {
                WebEngage.get().b(this);
                return;
            }
            if ("session_delay_event".equals(string)) {
                WebEngage.get().c(intent, this);
                return;
            }
            if ("page_delay_event".equals(string)) {
                WebEngage.get().b(intent, this);
                return;
            }
            if ("leave_intent_event".equals(string)) {
                WebEngage.get().b(intent);
                return;
            }
            if ("user_profile".equals(string)) {
                WebEngage.get().f(this);
            } else if ("journey_context".equals(string)) {
                WebEngage.get().d(this);
            } else if ("amplify".equals(string)) {
                WebEngage.get().a(this);
            }
        } catch (Exception e10) {
            Logger.e("WebEngage", e10.toString());
        }
    }
}
