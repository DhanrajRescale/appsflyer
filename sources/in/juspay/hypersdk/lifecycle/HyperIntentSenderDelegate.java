package in.juspay.hypersdk.lifecycle;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.annotation.NonNull;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.ui.IntentSenderDelegate;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public class HyperIntentSenderDelegate implements IntentSenderDelegate {

    @NonNull
    private final Queue<IntentQueueData> intentSenderQueue = new ConcurrentLinkedQueue();

    @NonNull
    private final JuspayServices juspayServices;

    /* loaded from: classes2.dex */
    public static class IntentQueueData {
        int extraFlags;
        Intent fillInIntent;
        int flagMask;
        int flagValues;
        IntentSender intentSender;
        Bundle options;
        int requestCode;

        public IntentQueueData(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
            this.intentSender = intentSender;
            this.requestCode = i10;
            this.fillInIntent = intent;
            this.flagMask = i11;
            this.flagValues = i12;
            this.extraFlags = i13;
            this.options = bundle;
        }
    }

    public HyperIntentSenderDelegate(@NonNull JuspayServices juspayServices) {
        this.juspayServices = juspayServices;
    }

    public void clearQueue() {
        this.intentSenderQueue.clear();
    }

    public void fragmentAttached() {
        for (IntentQueueData intentQueueData : this.intentSenderQueue) {
            startIntentSenderForResult(intentQueueData.intentSender, intentQueueData.requestCode, intentQueueData.fillInIntent, intentQueueData.flagMask, intentQueueData.flagValues, intentQueueData.extraFlags, intentQueueData.options);
        }
    }

    @Override // in.juspay.hypersdk.ui.IntentSenderDelegate
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        try {
            HyperFragment fragment = this.juspayServices.getFragment();
            if (fragment == null || !fragment.isAdded()) {
                this.intentSenderQueue.add(new IntentQueueData(intentSender, i10, intent, i11, i12, i13, bundle));
            } else {
                fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
