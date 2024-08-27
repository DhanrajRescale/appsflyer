package z9;

import android.content.Context;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.callbacks.PushNotificationCallbacks;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements PushNotificationCallbacks {
    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public final boolean onPushNotificationActionClicked(Context context, PushNotificationData pushNotificationData, String str) {
        return false;
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public final boolean onPushNotificationClicked(Context context, PushNotificationData pushNotificationData) {
        return false;
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public final void onPushNotificationDismissed(Context context, PushNotificationData pushNotificationData) {
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public final PushNotificationData onPushNotificationReceived(Context context, PushNotificationData pushNotificationData) {
        Intrinsics.checkNotNullParameter(pushNotificationData, "pushNotificationData");
        return pushNotificationData;
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public final void onPushNotificationShown(Context context, PushNotificationData pushNotificationData) {
    }
}
