package in.juspay.hypersdk.ui;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import in.juspay.hypersdk.core.MerchantViewType;

/* loaded from: classes2.dex */
public abstract class HyperPaymentsCallbackAdapter implements HyperPaymentsCallback {
    @Override // in.juspay.hypersdk.ui.HyperPaymentsCallback
    public WebViewClient createJuspaySafeWebViewClient() {
        return null;
    }

    @Override // in.juspay.hypersdk.ui.HyperPaymentsCallback
    public View getMerchantView(ViewGroup viewGroup, MerchantViewType merchantViewType) {
        return null;
    }

    @Override // in.juspay.hypersdk.ui.HyperPaymentsCallback
    public void onStartWaitingDialogCreated(View view) {
    }
}
