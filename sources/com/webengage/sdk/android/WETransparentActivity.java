package com.webengage.sdk.android;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import in.juspay.hyper.constants.LogCategory;

/* loaded from: classes2.dex */
public class WETransparentActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        try {
            try {
                WebEngage.get();
                Intent intent = getIntent();
                String action = intent.getAction();
                Logger.d("WebEngage", "WETransparentActivity received intent with action : " + action);
                if ("com.webengage.sdk.android.intent.ACTION".equals(action) && (extras = intent.getExtras()) != null) {
                    String string = extras.getString(LogCategory.ACTION);
                    Logger.d("WebEngage", "WETransparentActivity received intent with task : " + string);
                    if ("WebEngageDeeplink".equals(string)) {
                        WebEngage.get().a(intent, (BroadcastReceiver) null);
                    } else if ("push_rerender".equals(string)) {
                        WebEngage.get().c(intent);
                    }
                }
            } catch (Exception e10) {
                Logger.e("WebEngage", "Exception while executing push click", e10);
            }
            finish();
        } catch (Throwable th2) {
            finish();
            throw th2;
        }
    }
}
