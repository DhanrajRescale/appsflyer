package in.juspay.hyper.core;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface BridgeComponents {
    Activity getActivity();

    @NonNull
    CallbackInvoker getCallbackInvoker();

    String getClientId();

    @NonNull
    Context getContext();

    @NonNull
    FileProviderInterface getFileProviderInterface();

    @NonNull
    FragmentHooks getFragmentHooks();

    JsCallback getJsCallback();

    @NonNull
    ReceiverInterface getReceiverInterface();

    @NonNull
    JSONObject getSdkConfig();

    @NonNull
    String getSdkName();

    @NonNull
    TrackerInterface getTrackerInterface();
}
