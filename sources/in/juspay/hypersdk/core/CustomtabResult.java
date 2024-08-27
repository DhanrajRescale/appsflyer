package in.juspay.hypersdk.core;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import in.juspay.hyper.core.JuspayLogger;

/* loaded from: classes2.dex */
public class CustomtabResult extends Activity {
    public static final String CUSTOMTAB_RESULT = "customtab-result";
    private static final String LOG_TAG = "CustomtabResult";

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent("customtab-result");
        try {
            intent.putExtra("response", getIntent().getDataString());
        } catch (Exception e10) {
            JuspayLogger.e(LOG_TAG, "Couldn't find data from url", e10);
        }
        intent.putExtra("status", "SUCCESS");
        a5.b.a(this).c(intent);
        startActivity(new Intent(this, (Class<?>) CustomtabActivity.class));
        finish();
    }
}
