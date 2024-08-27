package com.flipkart.youtubeview.activity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.assetgro.stockgro.prod.R;
import com.flipkart.youtubeview.webview.YouTubePlayerWebView;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ip.a;
import ip.c;
import ip.d;
import ip.e;
import ip.f;
import ip.g;
import jp.k;
import jp.l;
import jp.t;
import jp.x;
import l7.m;
import xf.d0;

/* loaded from: classes.dex */
public final class YouTubeActivity extends c implements e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f10966g = 0;

    /* renamed from: e, reason: collision with root package name */
    public String f10967e = "NONE";

    /* renamed from: f, reason: collision with root package name */
    public t f10968f;

    public static void a(YouTubeActivity youTubeActivity) {
        if ((youTubeActivity.f10968f != null && "PLAYING".equals(youTubeActivity.f10967e)) || "BUFFERING".equals(youTubeActivity.f10967e)) {
            youTubeActivity.f10967e = "PAUSED";
        }
    }

    public final void b() {
        if ((this.f10968f != null && "PLAYING".equals(this.f10967e)) || "BUFFERING".equals(this.f10967e) || "PAUSED".equals(this.f10967e)) {
            this.f10967e = "STOPPED";
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.KeyEvent$Callback, com.flipkart.youtubeview.webview.YouTubePlayerWebView, android.view.View, android.webkit.WebView] */
    @Override // ip.c, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        String str;
        Bundle bundle3;
        String str2;
        Bundle bundle4;
        String str3;
        Message obtainMessage;
        String str4;
        d dVar = d.f20468a;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(UserMetadata.MAX_ATTRIBUTE_SIZE, UserMetadata.MAX_ATTRIBUTE_SIZE);
        setContentView(R.layout.youtube_player_view);
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        if (getIntent() != null) {
            bundle2 = getIntent().getExtras();
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            str = bundle2.getString("videoId");
        } else {
            str = null;
        }
        if (getIntent() != null) {
            bundle3 = getIntent().getExtras();
        } else {
            bundle3 = null;
        }
        if (bundle3 != null) {
            str2 = bundle3.getString("apiKey");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    PackageManager packageManager = getPackageManager();
                    PackageManager packageManager2 = getPackageManager();
                    String[] strArr = x.f21569a;
                    if (packageManager2.hasSystemFeature("android.software.leanback")) {
                        str4 = "com.google.android.youtube.tv";
                    } else if (packageManager2.hasSystemFeature("com.google.android.tv")) {
                        str4 = "com.google.android.youtube.googletv";
                    } else {
                        str4 = "com.google.android.youtube";
                    }
                    packageManager.getApplicationInfo(str4, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    if (a.b(this) != dVar) {
                        if (getIntent() != null) {
                            bundle4 = getIntent().getExtras();
                        } else {
                            bundle4 = null;
                        }
                        if (bundle4 != null) {
                            str3 = bundle4.getString("webUrl");
                        } else {
                            str3 = null;
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            youTubePlayerView.setVisibility(8);
                            ?? webView = new WebView(this);
                            webView.f10971b = null;
                            webView.f10972c = null;
                            webView.f10973d = "NONE";
                            webView.f10974e = false;
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                            webView.setLayoutParams(layoutParams);
                            ProgressBar progressBar = new ProgressBar(this);
                            progressBar.setVisibility(0);
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                            layoutParams2.gravity = 17;
                            webView.setBackgroundColor(getResources().getColor(R.color.black));
                            if (!TextUtils.isEmpty(str3)) {
                                if (!webView.f10974e) {
                                    WebSettings settings = webView.getSettings();
                                    settings.setJavaScriptEnabled(true);
                                    settings.setUseWideViewPort(true);
                                    settings.setLoadWithOverviewMode(true);
                                    settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
                                    settings.setCacheMode(-1);
                                    settings.setPluginState(WebSettings.PluginState.ON_DEMAND);
                                    settings.setAllowContentAccess(true);
                                    settings.setAllowFileAccess(false);
                                    settings.setMediaPlaybackRequiresUserGesture(false);
                                    webView.setLayerType(0, null);
                                    webView.measure(0, 0);
                                    webView.loadUrl(str3);
                                    webView.setWebViewClient(new d0(webView, 2));
                                }
                                webView.setYouTubeListener(new com.google.firebase.messaging.t(this, (YouTubePlayerWebView) webView, str, progressBar));
                                addContentView(webView, layoutParams);
                                addContentView(progressBar, layoutParams2);
                                return;
                            }
                            throw new IllegalArgumentException("WebView url cannot be empty");
                        }
                        Log.d("YoutubeActivity", "Web Url is Null");
                        finish();
                        return;
                    }
                }
                youTubePlayerView.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    c cVar = youTubePlayerView.f11617c.f20463a;
                    Bundle bundle5 = cVar.f20467d;
                    if (youTubePlayerView.f11619e == null && youTubePlayerView.f11623i == null) {
                        youTubePlayerView.f11623i = this;
                        youTubePlayerView.f11622h = bundle5;
                        k kVar = youTubePlayerView.f11621g;
                        kVar.f21539a.setVisibility(0);
                        kVar.f21540b.setVisibility(8);
                        jp.a aVar = jp.a.f21532a;
                        Context context = youTubePlayerView.getContext();
                        f fVar = new f(youTubePlayerView, cVar);
                        g gVar = new g(youTubePlayerView);
                        aVar.getClass();
                        String packageName = context.getPackageName();
                        String[] strArr2 = x.f21569a;
                        try {
                            l lVar = new l(context, str2, packageName, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName, fVar, gVar);
                            youTubePlayerView.f11618d = lVar;
                            lVar.f21560j = true;
                            Context context2 = lVar.f21551a;
                            d b10 = a.b(context2);
                            h.f fVar2 = lVar.f21552b;
                            int i10 = 3;
                            if (b10 != dVar) {
                                obtainMessage = fVar2.obtainMessage(3, b10);
                            } else {
                                Intent intent = new Intent("com.google.android.youtube.api.service.START").setPackage(x.a(context2));
                                if (lVar.f21559i != null) {
                                    Log.e("YouTubeClient", "Calling connect() while still connected, missing disconnect().");
                                    lVar.c();
                                }
                                m mVar = new m(lVar, i10);
                                lVar.f21559i = mVar;
                                if (!context2.bindService(intent, mVar, 129)) {
                                    obtainMessage = fVar2.obtainMessage(3, d.f20474g);
                                }
                            }
                            fVar2.sendMessage(obtainMessage);
                        } catch (PackageManager.NameNotFoundException e10) {
                            throw new IllegalStateException("Cannot retrieve calling Context's PackageInfo", e10);
                        }
                    }
                    cVar.f20467d = null;
                    return;
                }
                throw new IllegalArgumentException("Developer key cannot be null or empty");
            }
            throw new IllegalArgumentException(" apiKey cannot be null");
        }
        throw new IllegalArgumentException(" videoId cannot be null");
    }

    @Override // ip.c, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        t tVar = this.f10968f;
        if (tVar != null) {
            tVar.a(true);
        }
    }

    @Override // ip.c, android.app.Activity
    public final void onStop() {
        super.onStop();
        b();
    }
}
