package ij;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import qu.r0;

/* loaded from: classes.dex */
public final class k extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20073a;

    public k(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20073a = context;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri uri;
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        } else {
            uri = null;
        }
        String valueOf = String.valueOf(uri);
        if (!s.r(valueOf, "app.stockgro://", false)) {
            return false;
        }
        yk.g.H(hl.f.d(r0.f32256b), null, null, new j(valueOf, this, null), 3);
        return true;
    }
}
