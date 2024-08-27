package com.assetgro.stockgro.ui.stock.list;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.d1;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import li.c;
import ls.n0;
import ni.o;
import ni.p;
import okhttp3.HttpUrl;
import qg.a;
import qu.r0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/list/StockListHostActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/stock/list/StockListHostViewModel;", "Lba/s1;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockListHostActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10250k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_stock_list_host;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((StockListHostViewModel) x()).f10252o.observe(this, new c(8, new a(this, 16)));
    }

    @Override // gd.b
    public final void I() {
        String str;
        Bundle extras = getIntent().getExtras();
        String str2 = null;
        if (extras != null) {
            str = extras.getString("PORTFOLIO_ID");
        } else {
            str = null;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            str2 = extras2.getString("SORT_ORDER", null);
        }
        d1 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction(...)");
        int i10 = o.f28751j;
        Bundle bundle = new Bundle();
        bundle.putBoolean("ADD_TO_PORTFOLIO", getIntent().getBooleanExtra("ADD_TO_PORTFOLIO", false));
        bundle.putBoolean("CALL_FROM_PORTFOLIO", getIntent().getBooleanExtra("CALL_FROM_PORTFOLIO", false));
        bundle.putBoolean("SHOW_TOOLBAR", false);
        bundle.putString("PORTFOLIO_ID", str);
        String stringExtra = getIntent().getStringExtra("TITLE");
        if (stringExtra == null) {
            stringExtra = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        bundle.putString("TITLE", stringExtra);
        bundle.putBoolean("CALLED_FROM_HOME_SCREEN", getIntent().getBooleanExtra("CALLED_FROM_HOME_SCREEN", false));
        String stringExtra2 = getIntent().getStringExtra("SELECTED_INDEX");
        if (stringExtra2 == null) {
            stringExtra2 = "nifty_500+";
        }
        bundle.putString("SELECTED_INDEX", stringExtra2);
        bundle.putBoolean("SHOW_INDEX_MENU", getIntent().getBooleanExtra("SHOW_INDEX_MENU", true));
        bundle.putParcelable("PORTFOLIO", getIntent().getParcelableExtra("PORTFOLIO"));
        bundle.putBoolean("DATA", true);
        bundle.putParcelable("LIST_DATA", getIntent().getParcelableExtra("LIST_DATA"));
        if (str2 != null) {
            bundle.putString("SORT_ORDER", str2);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        o oVar = new o();
        oVar.setArguments(bundle2);
        aVar.e(R.id.container_fragment, oVar, "StockListFragment", 1);
        aVar.h(false);
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 10016 && i11 == -1) {
            setResult(-1, intent);
            finish();
        } else if (i10 == 10056 && i11 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onResume() {
        super.onResume();
        StockListHostViewModel stockListHostViewModel = (StockListHostViewModel) x();
        qf.b section = qf.b.f31939n;
        Intrinsics.checkNotNullParameter(section, "section");
        g.H(u0.f(stockListHostViewModel), r0.f32256b, null, new p(stockListHostViewModel, section, null), 2);
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.o();
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
