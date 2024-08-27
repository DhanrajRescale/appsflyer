package in.juspay.hypersmshandler;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes2.dex */
public interface SmsEventInterface {

    @Keep
    /* loaded from: classes2.dex */
    public enum RetrieverEvents {
        ON_ATTACH,
        ON_RECEIVE,
        ON_EXECUTE
    }

    void onActivityResultEvent(@NonNull String str);

    void onSentReceiverEvent(int i10);

    void onSmsConsentEvent(@NonNull Intent intent, int i10, Bundle bundle);

    void onSmsReceiverEvent(@NonNull String str);

    void onSmsRetrieverEvent(@NonNull RetrieverEvents retrieverEvents, @NonNull String str);
}
