package in.juspay.hypersmshandler;

import android.app.Activity;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import org.json.JSONObject;

@Keep
/* loaded from: classes2.dex */
public interface JuspayDuiHook {
    void attach(@NonNull Activity activity);

    void detach(@NonNull Activity activity);

    String execute(@NonNull Activity activity, String str, JSONObject jSONObject);
}
