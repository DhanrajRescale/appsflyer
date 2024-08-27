package com.flipkart.youtubeview.webview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebView;
import om.a;

/* loaded from: classes.dex */
public class YouTubePlayerWebView extends WebView {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f10969f = 0;

    /* renamed from: a, reason: collision with root package name */
    public a f10970a;

    /* renamed from: b, reason: collision with root package name */
    public String f10971b;

    /* renamed from: c, reason: collision with root package name */
    public String f10972c;

    /* renamed from: d, reason: collision with root package name */
    public String f10973d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10974e;

    public YouTubePlayerWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10971b = null;
        this.f10972c = null;
        this.f10973d = "NONE";
        this.f10974e = false;
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Double.parseDouble(str);
            } catch (NumberFormatException e10) {
                Log.e("YoutubePlayerWebView", e10.getMessage());
            }
        }
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, (int) (measuredWidth * 0.5625d));
    }

    @Override // android.view.View
    public final void onScreenStateChanged(int i10) {
        if (i10 == 0 && this.f10974e) {
            if ("PLAYING".equals(this.f10973d) || "BUFFERING".equals(this.f10973d) || "PAUSED".equals(this.f10973d) || "CUED".equals(this.f10973d)) {
                if (this.f10970a != null) {
                    a(this.f10972c);
                    a(this.f10971b);
                }
                loadUrl("javascript:onVideoStop()");
            }
        }
    }

    public void setYouTubeListener(a aVar) {
        this.f10970a = aVar;
    }
}
