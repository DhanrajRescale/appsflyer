package com.webengage.sdk.android.actions.render;

import android.content.Context;
import android.webkit.JavascriptInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    InAppNotificationData f12342a;

    /* renamed from: b, reason: collision with root package name */
    n f12343b;

    /* renamed from: c, reason: collision with root package name */
    Context f12344c;

    public h(InAppNotificationData inAppNotificationData, n nVar) {
        this.f12342a = inAppNotificationData;
        this.f12343b = nVar;
        this.f12344c = nVar.getActivity().getApplicationContext();
    }

    @JavascriptInterface
    public String getData() {
        return this.f12342a.getData().toString();
    }

    @JavascriptInterface
    public String getLayoutId() {
        return this.f12342a.getLayoutId();
    }

    @JavascriptInterface
    public void onClick(String str, String str2, boolean z10) {
        this.f12343b.a(str, str2, z10);
    }

    @JavascriptInterface
    public void onClose() {
        this.f12343b.b();
    }

    @JavascriptInterface
    public void onError(String str) {
        this.f12343b.a(str);
    }

    @JavascriptInterface
    public void onOpen() {
        try {
            this.f12343b.c();
        } catch (Exception unused) {
        }
    }
}
