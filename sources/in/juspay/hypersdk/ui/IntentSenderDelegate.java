package in.juspay.hypersdk.ui;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* loaded from: classes2.dex */
public interface IntentSenderDelegate {
    void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle);
}
