package xf;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.payments.kyc.KycWebViewActivity;
import com.facebook.FacebookDialogException;
import com.flipkart.youtubeview.activity.YouTubeActivity;
import com.flipkart.youtubeview.webview.YouTubePlayerWebView;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;
import nl.v0;
import nl.w0;

/* loaded from: classes.dex */
public final class d0 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f40208b;

    public /* synthetic */ d0(KeyEvent.Callback callback, int i10) {
        this.f40207a = i10;
        this.f40208b = callback;
    }

    public final void a(Uri uri) {
        if ("ytplayer".equals(uri.getScheme())) {
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("data");
            String queryParameter2 = uri.getQueryParameter("currentTime");
            String queryParameter3 = uri.getQueryParameter("callback");
            boolean isEmpty = TextUtils.isEmpty(queryParameter3);
            KeyEvent.Callback callback = this.f40208b;
            if (!isEmpty) {
                YouTubePlayerWebView youTubePlayerWebView = (YouTubePlayerWebView) callback;
                int i10 = YouTubePlayerWebView.f10969f;
                youTubePlayerWebView.getClass();
                youTubePlayerWebView.loadUrl("javascript:" + queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                YouTubePlayerWebView youTubePlayerWebView2 = (YouTubePlayerWebView) callback;
                int i11 = YouTubePlayerWebView.f10969f;
                youTubePlayerWebView2.getClass();
                if (!TextUtils.isEmpty(queryParameter2)) {
                    youTubePlayerWebView2.f10972c = queryParameter2;
                }
            }
            if (!TextUtils.isEmpty(host)) {
                YouTubePlayerWebView youTubePlayerWebView3 = (YouTubePlayerWebView) callback;
                int i12 = YouTubePlayerWebView.f10969f;
                youTubePlayerWebView3.getClass();
                host.getClass();
                char c10 = 65535;
                switch (host.hashCode()) {
                    case -1992012396:
                        if (host.equals("duration")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1338265852:
                        if (host.equals("onReady")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 601235430:
                        if (host.equals("currentTime")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1201265730:
                        if (host.equals("onStateChange")) {
                            c10 = 3;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        if (!TextUtils.isEmpty(queryParameter) && !"UNDEFINED".equalsIgnoreCase(queryParameter)) {
                            youTubePlayerWebView3.f10971b = queryParameter;
                            return;
                        }
                        return;
                    case 1:
                        youTubePlayerWebView3.f10974e = true;
                        om.a aVar = youTubePlayerWebView3.f10970a;
                        if (aVar != null) {
                            com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) aVar;
                            YouTubePlayerWebView youTubePlayerWebView4 = (YouTubePlayerWebView) tVar.f11783c;
                            String str = (String) tVar.f11782b;
                            youTubePlayerWebView4.getClass();
                            youTubePlayerWebView4.loadUrl("javascript:loadVideo('" + str + "')");
                            YouTubeActivity youTubeActivity = (YouTubeActivity) tVar.f11785e;
                            ProgressBar progressBar = (ProgressBar) tVar.f11784d;
                            int i13 = YouTubeActivity.f10966g;
                            youTubeActivity.getClass();
                            progressBar.setVisibility(8);
                            return;
                        }
                        return;
                    case 2:
                        if (!TextUtils.isEmpty(queryParameter)) {
                            youTubePlayerWebView3.f10972c = queryParameter;
                            return;
                        }
                        return;
                    case 3:
                        youTubePlayerWebView3.f10973d = queryParameter;
                        if (youTubePlayerWebView3.f10970a != null && !"NOT_STARTED".equalsIgnoreCase(queryParameter)) {
                            if ("ENDED".equalsIgnoreCase(queryParameter)) {
                                om.a aVar2 = youTubePlayerWebView3.f10970a;
                                YouTubePlayerWebView.a(youTubePlayerWebView3.f10972c);
                                YouTubePlayerWebView.a(youTubePlayerWebView3.f10971b);
                                aVar2.getClass();
                                return;
                            }
                            if ("PLAYING".equalsIgnoreCase(queryParameter)) {
                                if (TextUtils.isEmpty(youTubePlayerWebView3.f10971b)) {
                                    youTubePlayerWebView3.loadUrl("javascript:sendDuration()");
                                }
                                om.a aVar3 = youTubePlayerWebView3.f10970a;
                                YouTubePlayerWebView.a(youTubePlayerWebView3.f10972c);
                                com.google.firebase.messaging.t tVar2 = (com.google.firebase.messaging.t) aVar3;
                                YouTubeActivity youTubeActivity2 = (YouTubeActivity) tVar2.f11785e;
                                ProgressBar progressBar2 = (ProgressBar) tVar2.f11784d;
                                int i14 = YouTubeActivity.f10966g;
                                youTubeActivity2.getClass();
                                progressBar2.setVisibility(8);
                                return;
                            }
                            if ("PAUSED".equalsIgnoreCase(queryParameter)) {
                                om.a aVar4 = youTubePlayerWebView3.f10970a;
                                YouTubePlayerWebView.a(youTubePlayerWebView3.f10972c);
                                aVar4.getClass();
                                return;
                            } else if ("BUFFERING".equalsIgnoreCase(queryParameter)) {
                                om.a aVar5 = youTubePlayerWebView3.f10970a;
                                YouTubePlayerWebView.a(youTubePlayerWebView3.f10972c);
                                aVar5.getClass();
                                return;
                            } else {
                                if ("CUED".equalsIgnoreCase(queryParameter)) {
                                    youTubePlayerWebView3.f10970a.getClass();
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView a_webview, String a_url) {
        ProgressDialog progressDialog;
        switch (this.f40207a) {
            case 0:
                Intrinsics.checkNotNullParameter(a_webview, "a_webview");
                Intrinsics.checkNotNullParameter(a_url, "a_url");
                super.onPageFinished(a_webview, a_url);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(a_webview, "view");
                Intrinsics.checkNotNullParameter(a_url, "url");
                super.onPageFinished(a_webview, a_url);
                w0 w0Var = (w0) this.f40208b;
                if (!w0Var.f28961j && (progressDialog = w0Var.f28956e) != null) {
                    progressDialog.dismiss();
                }
                FrameLayout frameLayout = w0Var.f28958g;
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(0);
                }
                v0 v0Var = w0Var.f28955d;
                if (v0Var != null) {
                    v0Var.setVisibility(0);
                }
                ImageView imageView = w0Var.f28957f;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                w0Var.f28962k = true;
                return;
            default:
                super.onPageFinished(a_webview, a_url);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView a_webview, String a_url, Bitmap bitmap) {
        String tag;
        ProgressDialog progressDialog;
        int i10 = this.f40207a;
        KeyEvent.Callback callback = this.f40208b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(a_webview, "a_webview");
                Intrinsics.checkNotNullParameter(a_url, "a_url");
                switch (KycWebViewActivity.f9704k.f14317a) {
                    case 14:
                        de.d dVar = MainActivity.f9574r;
                        tag = "MainActivity";
                        break;
                    default:
                        tag = "KycActivity";
                        break;
                }
                String f10 = a3.a.f("onPageStarted:", a_url);
                Object[] objArr = new Object[0];
                Intrinsics.checkNotNullParameter(tag, "tag");
                com.google.android.gms.internal.p002firebaseauthapi.a.g(f10, "s", objArr, "params", tag).getClass();
                ek.u.k(objArr);
                super.onPageStarted(a_webview, a_url, bitmap);
                if (!kotlin.text.w.s(a_url, "https://capture.kyc.idfystaging.com/", false) && !kotlin.text.w.s(a_url, "https://capture.kyc.idfy.com/", false)) {
                    ((KycWebViewActivity) callback).finish();
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(a_webview, "view");
                Intrinsics.checkNotNullParameter(a_url, "url");
                n0.F("FacebookSDK.WebDialog", Intrinsics.i(a_url, "Webview loading URL: "));
                super.onPageStarted(a_webview, a_url, bitmap);
                w0 w0Var = (w0) callback;
                if (!w0Var.f28961j && (progressDialog = w0Var.f28956e) != null) {
                    progressDialog.show();
                    return;
                }
                return;
            default:
                super.onPageStarted(a_webview, a_url, bitmap);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i10, String description, String failingUrl) {
        switch (this.f40207a) {
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
                super.onReceivedError(view, i10, description, failingUrl);
                ((w0) this.f40208b).e(new FacebookDialogException(description, i10, failingUrl));
                return;
            default:
                super.onReceivedError(view, i10, description, failingUrl);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        switch (this.f40207a) {
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(handler, "handler");
                Intrinsics.checkNotNullParameter(error, "error");
                super.onReceivedSslError(view, handler, error);
                handler.cancel();
                ((w0) this.f40208b).e(new FacebookDialogException(null, -11, null));
                return;
            default:
                super.onReceivedSslError(view, handler, error);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f40207a) {
            case 2:
                a(webResourceRequest.getUrl());
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public d0(w0 this$0) {
        this.f40207a = 1;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f40208b = this$0;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xf.d0.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
