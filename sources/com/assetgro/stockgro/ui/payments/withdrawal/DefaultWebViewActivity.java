package com.assetgro.stockgro.ui.payments.withdrawal;

import android.webkit.WebView;
import androidx.activity.x;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import ba.q;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.a;
import ea.v;
import gd.b;
import ij.k;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import p004if.c;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/withdrawal/DefaultWebViewActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/payments/withdrawal/DefaultWebViewViewModel;", "Lba/q;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class DefaultWebViewActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9735l = 0;

    /* renamed from: k, reason: collision with root package name */
    public final x f9736k = new x(this, 4);

    @Override // gd.b
    public final int F() {
        return R.layout.activity_default_web_view;
    }

    @Override // gd.b
    public final void I() {
        String stringExtra = getIntent().getStringExtra("TOOLBAR_TITLE");
        String stringExtra2 = getIntent().getStringExtra("WEB_URL");
        q qVar = (q) w();
        if (stringExtra == null) {
            stringExtra = "StockGro";
        }
        Toolbar toolbar = qVar.f5811s;
        toolbar.setTitle(stringExtra);
        v(toolbar);
        u(toolbar);
        toolbar.setNavigationOnClickListener(new c(this, 17));
        WebView webView = ((q) w()).f5812t;
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new k(this));
        if (stringExtra2 != null) {
            webView.loadUrl(stringExtra2);
        }
    }

    @Override // gd.b
    public final void z(a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(DefaultWebViewViewModel.class), new ea.c(k10, compositeDisposable, userRepository, 2));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, DefaultWebViewViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(DefaultWebViewViewModel.class, "<this>", DefaultWebViewViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            DefaultWebViewViewModel defaultWebViewViewModel = (DefaultWebViewViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(defaultWebViewViewModel);
            this.f17254b = defaultWebViewViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
