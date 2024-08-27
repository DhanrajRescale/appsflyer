package in.juspay.hypersdk.services;

import android.content.Context;
import androidx.annotation.NonNull;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.KeyValueStore;
import in.juspay.hypersdk.utils.IntegrationUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SdkConfigService {
    private static final String sdkConfigLocation = "sdk_config.json";

    @NonNull
    private final JuspayServices juspayServices;

    @NonNull
    private JSONObject sdkConfig;

    public SdkConfigService(@NonNull JuspayServices juspayServices) {
        this.juspayServices = juspayServices;
        try {
            this.sdkConfig = new JSONObject(KeyValueStore.read(juspayServices, sdkConfigLocation, "{}"));
        } catch (JSONException e10) {
            this.sdkConfig = new JSONObject();
            juspayServices.getSdkTracker().trackException(LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, PaymentConstants.SDK_CONFIG, "Exception while parsing sdk config", e10);
        }
    }

    public static JSONObject getCachedSdkConfig() {
        try {
            if (JuspayCoreLib.getApplicationContext() != null) {
                return new JSONObject(KeyValueStore.read(JuspayCoreLib.getApplicationContext(), IntegrationUtils.getSdkInfo(JuspayCoreLib.getApplicationContext()).getSdkName(), sdkConfigLocation, "{}"));
            }
            return null;
        } catch (JSONException e10) {
            SdkTracker.trackBootException(LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, PaymentConstants.SDK_CONFIG, "Exception while parsing cached sdk config", e10);
            return null;
        }
    }

    @NonNull
    public JSONObject getSdkConfig() {
        return this.sdkConfig;
    }

    public void renewConfig(@NonNull Context context) {
        try {
            String readFromFile = this.juspayServices.getFileProviderService().readFromFile(context, sdkConfigLocation);
            this.sdkConfig = new JSONObject(readFromFile);
            KeyValueStore.write(this.juspayServices, sdkConfigLocation, readFromFile);
        } catch (JSONException e10) {
            this.juspayServices.getSdkTracker().trackException(LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, PaymentConstants.SDK_CONFIG, "Exception while parsing renewed sdk config", e10);
        }
    }
}
