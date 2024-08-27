package in.juspay.hypersdk.lifecycle;

import androidx.annotation.NonNull;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.ui.RequestPermissionDelegate;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public class HyperRequestPermissionDelegate implements RequestPermissionDelegate {

    @NonNull
    private final JuspayServices juspayServices;

    @NonNull
    private final Queue<RequestQueueData> requestQueue = new ConcurrentLinkedQueue();

    /* loaded from: classes2.dex */
    public static class RequestQueueData {
        int requestCode;
        String[] requests;

        public RequestQueueData(String[] strArr, int i10) {
            this.requests = strArr;
            this.requestCode = i10;
        }
    }

    public HyperRequestPermissionDelegate(@NonNull JuspayServices juspayServices) {
        this.juspayServices = juspayServices;
    }

    public void clearQueue() {
        this.requestQueue.clear();
    }

    public void fragmentAttached() {
        for (RequestQueueData requestQueueData : this.requestQueue) {
            requestPermission(requestQueueData.requests, requestQueueData.requestCode);
        }
    }

    @Override // in.juspay.hypersdk.ui.RequestPermissionDelegate
    public void requestPermission(String[] strArr, int i10) {
        HyperFragment fragment = this.juspayServices.getFragment();
        if (fragment == null || !fragment.isAdded()) {
            this.requestQueue.add(new RequestQueueData(strArr, i10));
        } else {
            fragment.requestPermissions(strArr, i10);
        }
    }
}
