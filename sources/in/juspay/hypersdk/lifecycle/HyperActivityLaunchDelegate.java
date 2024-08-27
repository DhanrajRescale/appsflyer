package in.juspay.hypersdk.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.ui.ActivityLaunchDelegate;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public class HyperActivityLaunchDelegate implements ActivityLaunchDelegate {

    @NonNull
    private final JuspayServices juspayServices;

    @NonNull
    private final Queue<IntentQueueData> startActivityQueue = new ConcurrentLinkedQueue();

    /* loaded from: classes2.dex */
    public static class IntentQueueData {
        Bundle bundle;
        Intent intent;
        int requestCode;

        public IntentQueueData(Intent intent, int i10, Bundle bundle) {
            this.intent = intent;
            this.requestCode = i10;
            this.bundle = bundle;
        }
    }

    public HyperActivityLaunchDelegate(@NonNull JuspayServices juspayServices) {
        this.juspayServices = juspayServices;
    }

    public void clearQueue() {
        this.startActivityQueue.clear();
    }

    public void fragmentAttached() {
        for (IntentQueueData intentQueueData : this.startActivityQueue) {
            startActivityForResult(intentQueueData.intent, intentQueueData.requestCode, intentQueueData.bundle);
        }
    }

    @Override // in.juspay.hypersdk.ui.ActivityLaunchDelegate
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        HyperFragment fragment = this.juspayServices.getFragment();
        if (fragment == null || !fragment.isAdded()) {
            this.startActivityQueue.add(new IntentQueueData(intent, i10, bundle));
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }
}
