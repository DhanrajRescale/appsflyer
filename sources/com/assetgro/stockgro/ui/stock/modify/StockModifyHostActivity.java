package com.assetgro.stockgro.ui.stock.modify;

import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.t;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.detail.StockSharedViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import li.c;
import ls.n0;
import oi.a;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/StockModifyHostActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/stock/detail/StockDetailHostViewModel;", "Lba/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockModifyHostActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public StockSharedViewModel f10266k;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_modify_host;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        K().f10199p.observe(this, new c(9, new a(this, 0)));
        K().f10200q.observe(this, new c(9, new a(this, 1)));
    }

    @Override // gd.b
    public final void I() {
        String string;
        String string2;
        String string3;
        String string4;
        Portfolio portfolio;
        String string5;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            K().f10198o = extras.getBoolean("CALL_FROM_PORTFOLIO", false);
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null && (string5 = extras2.getString("PORTFOLIO_ID")) != null) {
            K();
            Intrinsics.checkNotNullParameter(string5, "<set-?>");
        }
        Bundle extras3 = getIntent().getExtras();
        if (extras3 != null && (portfolio = (Portfolio) extras3.getParcelable("PORTFOLIO")) != null) {
            K().f10201r = portfolio;
        }
        Bundle extras4 = getIntent().getExtras();
        if (extras4 != null && (string4 = extras4.getString("STOCK_NAME")) != null) {
            K().f10202s = string4;
        }
        Bundle extras5 = getIntent().getExtras();
        if (extras5 != null && (string3 = extras5.getString("ORDERID")) != null) {
            K().f10203t = string3;
        }
        Bundle extras6 = getIntent().getExtras();
        if (extras6 != null && (string2 = extras6.getString("ORDER_TYPE")) != null) {
            K().f10204u = string2;
        }
        g.t(this, R.id.stock_modify_host_fragment).w(R.navigation.stock_modify_navigation, getIntent().getExtras());
        Unit unit = Unit.f23355a;
        Bundle extras7 = getIntent().getExtras();
        if (extras7 != null && (string = extras7.getString("DEEPLINK")) != null) {
            Uri parse = Uri.parse(string);
            t t10 = g.t(this, R.id.stock_modify_host_fragment);
            Intrinsics.c(parse);
            t10.m(parse, g.I(oi.b.f30096a));
        }
    }

    public final StockSharedViewModel K() {
        StockSharedViewModel stockSharedViewModel = this.f10266k;
        if (stockSharedViewModel != null) {
            return stockSharedViewModel;
        }
        Intrinsics.k("stockSharedViewModel");
        throw null;
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.m();
        FirebaseAnalytics d10 = activityComponent.f14246a.d();
        g.i(d10);
        this.f17256d = d10;
        Analytics o10 = activityComponent.f14246a.o();
        g.i(o10);
        this.f17257e = o10;
        n0 h10 = activityComponent.f14246a.h();
        g.i(h10);
        this.f17258f = h10;
        this.f10266k = activityComponent.p();
    }
}
