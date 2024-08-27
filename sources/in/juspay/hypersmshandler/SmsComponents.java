package in.juspay.hypersmshandler;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes2.dex */
public interface SmsComponents {
    @NonNull
    Context getContext();

    @NonNull
    SmsEventInterface getSmsEventInterface();

    @NonNull
    Tracker getTracker();
}
