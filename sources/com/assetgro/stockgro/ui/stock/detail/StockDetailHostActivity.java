package com.assetgro.stockgro.ui.stock.detail;

import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.c0;
import androidx.navigation.n;
import androidx.navigation.t;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.a;
import gd.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import li.c;
import li.d;
import li.e;
import ls.n0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/detail/StockDetailHostActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/stock/detail/StockDetailHostViewModel;", "Lba/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockDetailHostActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f10190l = 0;

    /* renamed from: k, reason: collision with root package name */
    public StockSharedViewModel f10191k;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_stock_detail_host;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        K().f10199p.observe(this, new c(0, new d(this, 0)));
        K().f10200q.observe(this, new c(0, new d(this, 1)));
        ((StockDetailHostViewModel) x()).f10192n.observe(this, new c(0, new d(this, 2)));
        ((StockDetailHostViewModel) x()).f10193o.observe(this, new c(0, new d(this, 3)));
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
            K().f10197n = extras.getBoolean("ADD_TO_PORTFOLIO", false);
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            K().f10198o = extras2.getBoolean("CALL_FROM_PORTFOLIO", false);
        }
        Bundle extras3 = getIntent().getExtras();
        if (extras3 != null && (string5 = extras3.getString("PORTFOLIO_ID")) != null) {
            K();
            Intrinsics.checkNotNullParameter(string5, "<set-?>");
        }
        Bundle extras4 = getIntent().getExtras();
        if (extras4 != null && (portfolio = (Portfolio) extras4.getParcelable("PORTFOLIO")) != null) {
            K().f10201r = portfolio;
        }
        Bundle extras5 = getIntent().getExtras();
        if (extras5 != null && (string4 = extras5.getString("STOCK_NAME")) != null) {
            K().f10202s = string4;
        }
        Bundle extras6 = getIntent().getExtras();
        if (extras6 != null && (string3 = extras6.getString("ORDERID")) != null) {
            K().f10203t = string3;
        }
        Bundle extras7 = getIntent().getExtras();
        if (extras7 != null && (string2 = extras7.getString("ORDER_TYPE")) != null) {
            K().f10204u = string2;
        }
        g.t(this, R.id.stock_nav_host_fragment).w(R.navigation.stock_navigation, getIntent().getExtras());
        Unit unit = Unit.f23355a;
        Bundle extras8 = getIntent().getExtras();
        if (extras8 != null && (string = extras8.getString("DEEPLINK")) != null) {
            Uri parse = Uri.parse(string);
            t t10 = g.t(this, R.id.stock_nav_host_fragment);
            Intrinsics.c(parse);
            t10.m(parse, g.I(e.f24862c));
        }
    }

    public final StockSharedViewModel K() {
        StockSharedViewModel stockSharedViewModel = this.f10191k;
        if (stockSharedViewModel != null) {
            return stockSharedViewModel;
        }
        Intrinsics.k("stockSharedViewModel");
        throw null;
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        Integer num;
        c0 c0Var;
        t t10 = g.t(this, R.id.stock_nav_host_fragment);
        n j10 = t10.j();
        if (j10 != null && (c0Var = j10.f2258b) != null) {
            num = Integer.valueOf(c0Var.f2181h);
        } else {
            num = null;
        }
        if (num == null || num.intValue() != R.id.stock_detail_fragment) {
            finish();
        } else {
            t10.p();
        }
    }

    @Override // gd.b
    public final void z(a activityComponent) {
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
        this.f10191k = activityComponent.p();
    }
}
