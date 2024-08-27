package in.juspay.hypersdk.core;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MPINUtil {
    private static final String TAG = "MPINUtil";
    private static HashMap<String, MPINUtil> orchestrator;

    @NonNull
    private final ComponentName component;
    private GodelServiceConnection connection;

    private MPINUtil(JuspayServices juspayServices, String str, String str2) {
        this.connection = new GodelServiceConnection(juspayServices);
        this.component = new ComponentName(str, str2);
    }

    private boolean bind(Context context) {
        Intent intent = new Intent();
        intent.setComponent(this.component);
        return context.bindService(intent, this.connection, 1);
    }

    public static void closeAllConnections(Context context) {
        HashMap<String, MPINUtil> hashMap = orchestrator;
        if (hashMap != null) {
            Iterator<String> it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                closeConnection(it.next(), context);
            }
        }
        orchestrator = null;
    }

    public static void closeConnection(String str, Context context) {
        HashMap<String, MPINUtil> hashMap = orchestrator;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return;
        }
        MPINUtil mPINUtil = orchestrator.get(str);
        if (mPINUtil != null) {
            mPINUtil.unbind(context);
        }
        orchestrator.remove(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ad, code lost:
    
        r9 = "mpinUtil";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void communicate(java.lang.String r9, java.lang.String r10, int r11, android.os.Bundle r12, @androidx.annotation.NonNull in.juspay.hypersdk.core.JuspayServices r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.MPINUtil.communicate(java.lang.String, java.lang.String, int, android.os.Bundle, in.juspay.hypersdk.core.JuspayServices, java.lang.String):void");
    }

    public static void reportBindFailure(int i10, @NonNull JuspayServices juspayServices, String str) {
        if (str != null) {
            SdkTracker sdkTracker = juspayServices.getSdkTracker();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", i10);
                jSONObject.put("error", true);
                jSONObject.put("message", "BIND_FAILURE");
            } catch (Exception e10) {
                sdkTracker.trackAndLogException(TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.MPIN_UTIL, "Exception while creating bind failure response", e10);
            }
            juspayServices.getJBridge().invokeCallbackInDUIWebview(str, jSONObject.toString());
        }
    }

    private void unbind(Context context) {
        GodelServiceConnection godelServiceConnection = this.connection;
        if (godelServiceConnection == null || !godelServiceConnection.isBound) {
            return;
        }
        try {
            context.unbindService(godelServiceConnection);
        } catch (Exception unused) {
        }
        this.connection = null;
    }
}
