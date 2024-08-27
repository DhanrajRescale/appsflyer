package in.juspay.hyper.core;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* loaded from: classes2.dex */
public interface FragmentHooks {
    void requestPermission(String[] strArr, int i10);

    void startActivityForResult(Intent intent, int i10, Bundle bundle);

    void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle);
}
