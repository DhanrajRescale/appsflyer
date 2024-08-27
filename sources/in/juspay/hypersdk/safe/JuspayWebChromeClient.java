package in.juspay.hypersdk.safe;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class JuspayWebChromeClient extends WebChromeClient {

    @NonNull
    private final Godel godelManager;

    public JuspayWebChromeClient(@NonNull Godel godel) {
        this.godelManager = godel;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        this.godelManager.getDuiInterface().invokeFnInDUIWebview("onProgressChanged", String.valueOf(i10));
    }
}
