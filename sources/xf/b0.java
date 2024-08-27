package xf;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import ba.e1;
import com.assetgro.stockgro.ui.payments.kyc.KycWebViewActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KycWebViewActivity f40200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f40201b;

    public b0(KycWebViewActivity kycWebViewActivity, WebView webView) {
        this.f40200a = kycWebViewActivity;
        this.f40201b = webView;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onCloseWindow(view);
        ((e1) this.f40200a.w()).f4557s.removeView(this.f40201b);
    }
}
