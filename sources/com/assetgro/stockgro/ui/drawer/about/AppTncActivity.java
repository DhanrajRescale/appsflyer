package com.assetgro.stockgro.ui.drawer.about;

import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import ba.w;
import com.airbnb.deeplinkdispatch.DeepLink;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.b;
import ij.k;
import java.io.File;
import jd.a;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import yk.g;

@DeepLink({"app.stockgro://stockgro.com/tnc"})
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/drawer/about/AppTncActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/drawer/about/AppAboutViewModel;", "Lba/w;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AppTncActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9472k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_faq;
    }

    @Override // gd.b
    public final void I() {
        w wVar = (w) w();
        String string = getString(R.string.title_terms_and_conditions);
        Toolbar toolbar = wVar.f6494s;
        toolbar.setTitle(string);
        v(toolbar);
        u(toolbar);
        toolbar.setNavigationOnClickListener(new a(this, 20));
        String filePath = h.r(getFilesDir().getAbsolutePath(), "/terms_and_condition.html");
        w wVar2 = (w) w();
        k kVar = new k(this);
        WebView webView = wVar2.f6495t;
        webView.setWebViewClient(kVar);
        webView.getSettings().setAllowFileAccess(true);
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        if (!new File(filePath).exists()) {
            webView.loadUrl("file:///android_asset/TermsAndConditions.html");
            return;
        }
        webView.loadUrl("file://" + ((Object) filePath));
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.a();
        FirebaseAnalytics d10 = activityComponent.f14246a.d();
        g.i(d10);
        this.f17256d = d10;
        Analytics o10 = activityComponent.f14246a.o();
        g.i(o10);
        this.f17257e = o10;
        n0 h10 = activityComponent.f14246a.h();
        g.i(h10);
        this.f17258f = h10;
    }
}
