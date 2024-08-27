package in.juspay.hypersdk.core;

import android.content.Context;
import androidx.annotation.NonNull;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hypersdk.R;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PrefetchServices {
    private static final String LOG_TAG = "PrefetchServices";

    public static /* synthetic */ void lambda$preFetch$0() {
    }

    public static /* synthetic */ void lambda$preFetch$1(JuspayServices juspayServices) {
        juspayServices.initiate(new com.appsflyer.internal.l(18));
    }

    public static void preFetch(@NonNull Context context, @NonNull JSONObject jSONObject) {
        JuspayCoreLib.setApplicationContext(context.getApplicationContext());
        try {
            jSONObject.put("pre_fetch", "true");
            jSONObject.put("use_local_assets", context.getResources().getBoolean(R.bool.use_local_assets));
            JuspayServices juspayServices = new JuspayServices(context, null);
            juspayServices.setPrefetch(true);
            juspayServices.setBundleParameter(jSONObject);
            ExecutorManager.runOnMainThread(new n(juspayServices, 3));
        } catch (Exception e10) {
            SdkTracker.trackAndLogBootException(LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.PREFETCH, "Exception happened in PREFETCH", e10);
        }
    }
}
