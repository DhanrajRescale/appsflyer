package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.URLUtil;
import com.google.firebase.messaging.FirebaseMessagingService;
import el.l;
import ls.n0;
import ls.u0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MixpanelNotificationRouteActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        u0 a10;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            String stringExtra = intent.getStringExtra("mp_tap_target");
            String stringExtra2 = intent.getStringExtra("mp_tap_action_type");
            String stringExtra3 = intent.getStringExtra("mp_tap_action_uri");
            Boolean valueOf = Boolean.valueOf(intent.getBooleanExtra("mp_is_sticky", false));
            if (stringExtra != null && stringExtra.equals("button")) {
                str = intent.getStringExtra("mp_button_id");
                str2 = intent.getStringExtra("mp_button_label");
            } else {
                str = null;
                str2 = null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("$tap_target", stringExtra);
                jSONObject.putOpt("$tap_action_type", stringExtra2);
                jSONObject.putOpt("$tap_action_uri", stringExtra3);
                jSONObject.putOpt("$is_sticky", valueOf);
                jSONObject.putOpt("$button_id", str);
                jSONObject.putOpt("$button_label", str2);
            } catch (JSONException e10) {
                l.N("MixpanelAPI.MixpanelNotificationRouteActivity", "Error adding tracking JSON properties.", e10);
            }
            n0.p(getApplicationContext(), intent, "$push_notification_tap", jSONObject);
            CharSequence charSequence = intent.getExtras().getCharSequence("mp_tap_action_type");
            if (charSequence == null) {
                l.F("MixpanelAPI.MixpanelNotificationRouteActivity", "Notification action click logged with no action type");
                a10 = u0.HOMESCREEN;
            } else {
                a10 = u0.a(charSequence.toString());
            }
            CharSequence charSequence2 = intent.getExtras().getCharSequence("mp_tap_action_uri");
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            int ordinal = a10.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(charSequence2.toString()));
                }
            } else if (URLUtil.isValidUrl(charSequence2.toString())) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(charSequence2.toString())).addCategory("android.intent.category.BROWSABLE");
            } else {
                l.F("MixpanelAPI.MixpanelNotificationRouteActivity", "Wanted to open url in browser but url is invalid: " + charSequence2.toString() + ". Starting default intent");
            }
            if (!extras.getBoolean("mp_is_sticky")) {
                new FirebaseMessagingService();
                Context applicationContext = getApplicationContext();
                getApplicationContext();
                NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
                int i10 = extras.getInt("mp_notification_id");
                String string = extras.getString("mp_tag");
                if (string != null) {
                    notificationManager.cancel(string, 1);
                } else {
                    notificationManager.cancel(i10);
                }
            }
            finish();
            startActivity(launchIntentForPackage);
            return;
        }
        l.F("MixpanelAPI.MixpanelNotificationRouteActivity", "Notification route activity given null intent or null extras.");
    }
}
