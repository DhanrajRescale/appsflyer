package in.juspay.hypersdk.core;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersmshandler.JuspayDuiHook;
import java.util.Map;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ConnectivityReceiver extends BroadcastReceiver implements JuspayDuiHook {
    private static final String LOG_TAG = "ConnectivityReceiver";

    @NonNull
    private final Map<Activity, Boolean> attachedMap = new WeakHashMap();

    @NonNull
    private final JuspayServices juspayServices;

    public ConnectivityReceiver(@NonNull JuspayServices juspayServices) {
        this.juspayServices = juspayServices;
    }

    private String getNetworkType() {
        return this.juspayServices.getSessionInfo().getNetworkInfo() != null ? this.juspayServices.getSessionInfo().getNetworkInfo() : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (android.provider.Settings.Global.getInt(r1.getContentResolver(), "mobile_data", 1) == 1) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isMobileDataOn() {
        /*
            r7 = this;
            r0 = 0
            in.juspay.hypersdk.core.JuspayServices r1 = r7.juspayServices     // Catch: java.lang.Exception -> L4a
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = "phone"
            java.lang.Object r2 = r1.getSystemService(r2)     // Catch: java.lang.Exception -> L4a
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch: java.lang.Exception -> L4a
            android.content.ContentResolver r3 = r1.getContentResolver()     // Catch: java.lang.Exception -> L4a
            java.lang.String r4 = "airplane_mode_on"
            int r3 = android.provider.Settings.Global.getInt(r3, r4, r0)     // Catch: java.lang.Exception -> L4a
            r4 = 1
            if (r3 != 0) goto L1e
            r3 = r4
            goto L1f
        L1e:
            r3 = r0
        L1f:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L4a
            r6 = 29
            if (r5 < r6) goto L34
            java.lang.String r5 = "android.permission.READ_PHONE_STATE"
            int r1 = r3.k.checkSelfPermission(r1, r5)     // Catch: java.lang.Exception -> L4a
            if (r1 != 0) goto L4a
            boolean r1 = h1.b.w(r2)     // Catch: java.lang.Exception -> L4a
            if (r1 == 0) goto L4a
            goto L47
        L34:
            int r2 = r2.getSimState()     // Catch: java.lang.Exception -> L4a
            r5 = 5
            if (r2 != r5) goto L4a
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = "mobile_data"
            int r1 = android.provider.Settings.Global.getInt(r1, r2, r4)     // Catch: java.lang.Exception -> L4a
            if (r1 != r4) goto L4a
        L47:
            if (r3 == 0) goto L4a
            r0 = r4
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.ConnectivityReceiver.isMobileDataOn():boolean");
    }

    private boolean isNetworkAvailable() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.juspayServices.getContext().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception e10) {
            this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.IS_NETWORK_AVAILABLE, "network failure", e10);
            return false;
        }
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public void attach(@NonNull Activity activity) {
        Boolean bool = this.attachedMap.get(activity);
        if (bool == null || !bool.booleanValue()) {
            activity.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            JuspayServices juspayServices = this.juspayServices;
            String str = LOG_TAG;
            juspayServices.sdkDebug(str, "Attaching the " + str);
            this.attachedMap.put(activity, Boolean.TRUE);
        }
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public void detach(@NonNull Activity activity) {
        Boolean bool = this.attachedMap.get(activity);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        activity.unregisterReceiver(this);
        JuspayServices juspayServices = this.juspayServices;
        String str = LOG_TAG;
        juspayServices.sdkDebug(str, "Detaching the " + str);
        this.attachedMap.put(activity, Boolean.FALSE);
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public String execute(@NonNull Activity activity, String str, JSONObject jSONObject) {
        return String.valueOf(isNetworkAvailable());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("connected", String.valueOf(isNetworkAvailable()));
            jSONObject.put("networkType", getNetworkType());
            jSONObject.put("isMobileDataOn", String.valueOf(isMobileDataOn()));
        } catch (JSONException unused) {
        }
        this.juspayServices.getJBridge().invokeFnInDUIWebview("onNetworkChange", jSONObject.toString());
    }
}
