package in.juspay.hypersmshandler;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes2.dex */
public interface Tracker {
    void trackAction(@NonNull String str, @NonNull String str2, @NonNull String str3, String str4, @NonNull Object obj);

    void trackAndLogException(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull Throwable th2);
}
