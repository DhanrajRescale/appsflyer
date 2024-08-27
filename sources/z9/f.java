package z9;

import android.content.Context;
import com.webengage.sdk.android.actions.render.InAppNotificationData;
import com.webengage.sdk.android.callbacks.InAppNotificationCallbacks;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f implements InAppNotificationCallbacks {
    @Override // com.webengage.sdk.android.callbacks.InAppNotificationCallbacks
    public final boolean onInAppNotificationClicked(Context context, InAppNotificationData inAppNotificationData, String str) {
        return false;
    }

    @Override // com.webengage.sdk.android.callbacks.InAppNotificationCallbacks
    public final void onInAppNotificationDismissed(Context context, InAppNotificationData inAppNotificationData) {
    }

    @Override // com.webengage.sdk.android.callbacks.InAppNotificationCallbacks
    public final InAppNotificationData onInAppNotificationPrepared(Context context, InAppNotificationData inAppNotificationData) {
        Intrinsics.checkNotNullParameter(inAppNotificationData, "inAppNotificationData");
        return inAppNotificationData;
    }

    @Override // com.webengage.sdk.android.callbacks.InAppNotificationCallbacks
    public final void onInAppNotificationShown(Context context, InAppNotificationData inAppNotificationData) {
    }
}
