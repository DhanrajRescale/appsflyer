package in.juspay.hypersdk.core;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.analytics.LogPusher;
import in.juspay.hypersdk.analytics.LogPusherExp;
import in.juspay.hypersdk.analytics.LogSessioniser;
import in.juspay.hypersdk.data.KeyValueStore;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.security.EncryptionHelper;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.services.RemoteAssetService;
import java.util.Arrays;
import java.util.Objects;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class JsInterface {
    private static final String LOG_TAG = "JsInterface";

    @NonNull
    private final Context context;

    @NonNull
    private final FileProviderService fileProviderService;

    @NonNull
    protected final JuspayServices juspayServices;

    @NonNull
    private final RemoteAssetService remoteAssetService;
    private final SdkTracker sdkTracker;

    @NonNull
    private final SessionInfo sessionInfo;

    public JsInterface(@NonNull JuspayServices juspayServices) {
        this.context = juspayServices.getContext();
        this.juspayServices = juspayServices;
        this.sessionInfo = juspayServices.getSessionInfo();
        this.sdkTracker = juspayServices.getSdkTracker();
        this.remoteAssetService = juspayServices.getRemoteAssetService();
        this.fileProviderService = juspayServices.getFileProviderService();
    }

    public /* synthetic */ void lambda$addLogProperties$1(String str) {
        try {
            this.sdkTracker.addLogProperties(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    public /* synthetic */ void lambda$requestPendingLogs$3(String str, String str2) {
        String str3;
        if (Objects.equals(this.juspayServices.getWorkingLogger(), "json-array") || Objects.equals(this.juspayServices.getWorkingLogger(), "both")) {
            str3 = LogSessioniser.getLogsFromSessionId(new JSONObject(str));
            this.juspayServices.getJBridge().invokeCallbackInDUIWebview(str2, str3);
        }
        str3 = "{}";
        this.juspayServices.getJBridge().invokeCallbackInDUIWebview(str2, str3);
    }

    public /* synthetic */ void lambda$setAnalyticsHeader$0(JSONObject jSONObject) {
        if (Objects.equals(this.juspayServices.getWorkingLogger(), "json-array") || Objects.equals(this.juspayServices.getWorkingLogger(), "both")) {
            LogPusher.setHeaders(jSONObject, LogConstants.DEFAULT_CHANNEL);
        }
        if (this.juspayServices.getLogSessioniserExp() != null) {
            LogPusherExp.setHeaders(jSONObject, LogConstants.DEFAULT_CHANNEL);
        }
    }

    public /* synthetic */ void lambda$setAnalyticsHeader$2(JSONObject jSONObject, String str) {
        if (Objects.equals(this.juspayServices.getWorkingLogger(), "json-array") || Objects.equals(this.juspayServices.getWorkingLogger(), "both")) {
            LogPusher.setHeaders(jSONObject, str);
        }
        if (this.juspayServices.getLogSessioniserExp() != null) {
            LogPusherExp.setHeaders(jSONObject, str);
        }
    }

    @JavascriptInterface
    public boolean addChannel(String str, String str2) {
        if (Objects.equals(this.juspayServices.getWorkingLogger(), "json-array") || Objects.equals(this.juspayServices.getWorkingLogger(), "both")) {
            return LogPusher.addChannelFromJS(str, str2);
        }
        return false;
    }

    @JavascriptInterface
    public boolean addChannelExp(String str, String str2) {
        if (this.juspayServices.getLogSessioniserExp() != null) {
            return LogPusherExp.addChannelFromJS(str, str2);
        }
        return false;
    }

    @JavascriptInterface
    public void addLogProperties(String str) {
        ExecutorManager.runOnSdkTrackerPool(new i(5, this, str));
    }

    @JavascriptInterface
    public void addToLogList(String str) {
        if (this.sessionInfo.getSessionId() == null) {
            SdkTracker.addToBootLogs(str);
            return;
        }
        try {
            this.sdkTracker.track(new JSONObject(str));
        } catch (JSONException e10) {
            this.sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Exception while parsing the JSON", e10);
        }
    }

    @JavascriptInterface
    public String getChannelNames() {
        return (Objects.equals(this.juspayServices.getWorkingLogger(), "json-array") || Objects.equals(this.juspayServices.getWorkingLogger(), "both")) ? Arrays.toString(LogPusher.getChannelNames()) : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @JavascriptInterface
    public String getChannelNamesExp() {
        return this.juspayServices.getLogSessioniserExp() != null ? Arrays.toString(LogPusherExp.getChannelNames()) : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @JavascriptInterface
    public String getFileDownloadTimes() {
        return this.remoteAssetService.getFileDownloadTimes().toString();
    }

    @JavascriptInterface
    public String getFilePath(String str) {
        return this.fileProviderService.appendSdkNameAndVersion(str);
    }

    @JavascriptInterface
    public String getFromSharedPrefs(String str) {
        return KeyValueStore.read(this.juspayServices, str, "__failed");
    }

    @JavascriptInterface
    public String getLogList() {
        JuspayLogger.e(LOG_TAG, "No one should call JBridge.getLogList() method. It will be removed in future.");
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @JavascriptInterface
    public String getMd5(String str) {
        return EncryptionHelper.md5(str.getBytes());
    }

    @JavascriptInterface
    public String getResourceById(int i10) {
        return this.context.getResources().getString(i10);
    }

    @JavascriptInterface
    public String getResourceByName(String str) {
        return getResourceById(this.context.getResources().getIdentifier(str, "string", this.context.getPackageName()));
    }

    @JavascriptInterface
    public String getRootFragmentSize() {
        JSONObject jSONObject = new JSONObject();
        FrameLayout container = this.juspayServices.getContainer();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (container != null) {
            try {
                try {
                    jSONObject.put("height", String.valueOf(this.juspayServices.getContainer().getHeight()));
                    jSONObject.put("width", String.valueOf(this.juspayServices.getContainer().getWidth()));
                } catch (JSONException unused) {
                    jSONObject.put("height", this.sessionInfo.getScreenHeight() != null ? this.sessionInfo.getScreenHeight() : HttpUrl.FRAGMENT_ENCODE_SET);
                    if (this.sessionInfo.getScreenWidth() != null) {
                        str = this.sessionInfo.getScreenWidth();
                    }
                    jSONObject.put("width", str);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        } else {
            try {
                jSONObject.put("height", this.sessionInfo.getScreenHeight() != null ? this.sessionInfo.getScreenHeight() : HttpUrl.FRAGMENT_ENCODE_SET);
                if (this.sessionInfo.getScreenWidth() != null) {
                    str = this.sessionInfo.getScreenWidth();
                }
                jSONObject.put("width", str);
            } catch (JSONException unused2) {
            }
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String getSessionAttribute(String str, String str2) {
        return this.sessionInfo.get(str, str2);
    }

    @JavascriptInterface
    public String getSessionId() {
        return this.sessionInfo.getSessionId();
    }

    @JavascriptInterface
    public String getSessionInfo() {
        this.sessionInfo.createSessionDataMap();
        return this.sessionInfo.toString();
    }

    @JavascriptInterface
    public boolean isFilePresent(String str) {
        return this.fileProviderService.isFilePresent(this.context, str);
    }

    @JavascriptInterface
    public boolean isNetworkAvailable() {
        return this.sessionInfo.isNetworkAvailable();
    }

    @JavascriptInterface
    public String loadFileInDUI(String str) {
        return this.fileProviderService.readFromFile(this.context, str);
    }

    @JavascriptInterface
    public void postLogs(String str, String str2) {
        JuspayLogger.e(LOG_TAG, "No one should call JBridge.postLogs() method. It will be removed in future.");
    }

    @JavascriptInterface
    public void removeAttribute(String str) {
        this.sessionInfo.removeAttribute(str);
    }

    @JavascriptInterface
    public void removeDataFromSharedPrefs(String str) {
        KeyValueStore.remove(this.juspayServices, str);
    }

    @JavascriptInterface
    public void removeFromSharedPrefs(String str) {
        KeyValueStore.remove(this.juspayServices.getContext(), this.juspayServices.getSdkInfo().getSdkName(), str);
    }

    @JavascriptInterface
    public void renewFile(String str) {
        renewFile(str, null, null);
    }

    @JavascriptInterface
    public void renewSdkConfig() {
        this.juspayServices.getSdkConfigService().renewConfig(this.context);
    }

    @JavascriptInterface
    public String requestPendingLogs(String str) {
        try {
            return (Objects.equals(this.juspayServices.getWorkingLogger(), "json-array") || Objects.equals(this.juspayServices.getWorkingLogger(), "both")) ? LogSessioniser.getLogsFromSessionId(new JSONObject(str)) : "{}";
        } catch (JSONException unused) {
            return "{}";
        }
    }

    @JavascriptInterface
    public void sessioniseLogs(String str) {
        try {
            if (!Objects.equals(this.juspayServices.getWorkingLogger(), "json-array") && !Objects.equals(this.juspayServices.getWorkingLogger(), "both")) {
                return;
            }
            LogSessioniser.sessioniseLogs(new JSONObject(str));
        } catch (JSONException e10) {
            this.sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, a3.a.f("Logs request has invalid format", str), e10);
        }
    }

    @JavascriptInterface
    public void setAnalyticsEndPoint(String str) {
        JuspayLogger.e(LOG_TAG, "No one should call JBridge.setAnalyticsEndPoint() method. It will be removed in future.");
    }

    @JavascriptInterface
    public boolean setAnalyticsHeader(String str) {
        try {
            ExecutorManager.runOnLogPusherThread(new i(4, this, new JSONObject(str)));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    @JavascriptInterface
    public void setInSharedPrefs(String str, String str2) {
        KeyValueStore.write(this.juspayServices, str, str2);
    }

    @JavascriptInterface
    public void setSessionAttribute(String str, String str2) {
        this.sessionInfo.set(str, str2);
    }

    @JavascriptInterface
    public void setSessionId(String str) {
        JuspayLogger.d(LOG_TAG, "JBridge.setSessionId() is intended for changing the Session ID of the SDK. Not to be called by each micro-app");
        JuspayLogger.d(LOG_TAG, "Attempted Session ID: " + str);
    }

    @JavascriptInterface
    public void startPushingLogs() {
        if (this.juspayServices.getLogSessioniserExp() != null) {
            this.juspayServices.getLogSessioniserExp().startPushing();
        }
    }

    @JavascriptInterface
    public void submitAllLogs() {
    }

    @JavascriptInterface
    public void toast(String str) {
        Toast.makeText(this.context, str, 1).show();
    }

    @JavascriptInterface
    public void updateLogList(String str) {
        JuspayLogger.e(LOG_TAG, "No one should call JBridge.updateLogList() method. It will be removed in future.");
    }

    @JavascriptInterface
    public String loadFileInDUI(String str, int i10) {
        return this.fileProviderService.readFromFile(this.context, str);
    }

    @JavascriptInterface
    public void renewFile(String str, String str2) {
        renewFile(str, str2, null);
    }

    @JavascriptInterface
    public void requestPendingLogs(String str, String str2) {
        ExecutorManager.runOnLogsPool(new p(this, str, str2, 4));
    }

    @JavascriptInterface
    public boolean setAnalyticsHeader(String str, String str2) {
        try {
            ExecutorManager.runOnLogPusherThread(new p(5, this, new JSONObject(str), str2));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    @JavascriptInterface
    public void renewFile(String str, String str2, String str3) {
        this.remoteAssetService.renewFile(this.context, str, str3, str2, System.currentTimeMillis());
    }
}
