package xf;

import android.content.ActivityNotFoundException;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.Toast;
import ba.e1;
import com.assetgro.stockgro.ui.payments.kyc.KycWebViewActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c0 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f40205b;

    public /* synthetic */ c0(KeyEvent.Callback callback, int i10) {
        this.f40204a = i10;
        this.f40205b = callback;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        switch (this.f40204a) {
            case 0:
                return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            default:
                Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
                if (defaultVideoPoster == null) {
                    return Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
                }
                return defaultVideoPoster;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        switch (this.f40204a) {
            case 0:
                KycWebViewActivity kycWebViewActivity = (KycWebViewActivity) this.f40205b;
                WebView webView2 = new WebView(kycWebViewActivity);
                webView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                WebSettings settings = webView2.getSettings();
                Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
                settings.setJavaScriptEnabled(true);
                settings.setMediaPlaybackRequiresUserGesture(false);
                settings.setJavaScriptCanOpenWindowsAutomatically(true);
                settings.setPluginState(WebSettings.PluginState.ON);
                settings.setDomStorageEnabled(true);
                settings.setAllowContentAccess(true);
                settings.setAllowFileAccess(true);
                settings.setAllowFileAccessFromFileURLs(true);
                settings.setAllowUniversalAccessFromFileURLs(true);
                settings.setDatabaseEnabled(true);
                settings.setLoadWithOverviewMode(true);
                settings.setSupportMultipleWindows(true);
                settings.setJavaScriptCanOpenWindowsAutomatically(true);
                settings.setAllowFileAccess(true);
                settings.setMediaPlaybackRequiresUserGesture(false);
                Intrinsics.c(webView);
                webView.addView(webView2);
                Intrinsics.c(message);
                Object obj = message.obj;
                Intrinsics.d(obj, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
                ((WebView.WebViewTransport) obj).setWebView(webView2);
                message.sendToTarget();
                webView2.setWebViewClient(new WebViewClient());
                webView2.setWebChromeClient(new b0(kycWebViewActivity, webView2));
                return true;
            default:
                return super.onCreateWindow(webView, z10, z11, message);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        switch (this.f40204a) {
            case 1:
                super.onHideCustomView();
                ((us.f) this.f40205b).f37374a.b();
                return;
            default:
                super.onHideCustomView();
                return;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest request) {
        switch (this.f40204a) {
            case 0:
                Intrinsics.checkNotNullParameter(request, "request");
                request.grant(request.getResources());
                return;
            default:
                super.onPermissionRequest(request);
                return;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
        switch (this.f40204a) {
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(callback, "callback");
                super.onShowCustomView(view, callback);
                ((us.f) this.f40205b).f37374a.a(view, new hj.b(callback, 2));
                return;
            default:
                super.onShowCustomView(view, callback);
                return;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        switch (this.f40204a) {
            case 0:
                KeyEvent.Callback callback = this.f40205b;
                Intrinsics.checkNotNullParameter(fileChooserParams, "fileChooserParams");
                try {
                    ((KycWebViewActivity) callback).startActivity(fileChooserParams.createIntent());
                    return super.onShowFileChooser(((e1) ((KycWebViewActivity) callback).w()).f4557s, valueCallback, fileChooserParams);
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(((KycWebViewActivity) callback).getApplicationContext(), "Cannot Open File Chooser", 1).show();
                    return false;
                }
            default:
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
    }
}
