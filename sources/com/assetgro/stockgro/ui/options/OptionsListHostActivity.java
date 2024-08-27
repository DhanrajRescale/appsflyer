package com.assetgro.stockgro.ui.options;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.fragment.app.a;
import androidx.fragment.app.d1;
import androidx.lifecycle.u0;
import ba.z2;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.list.StockListHostViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import ni.p;
import qu.r0;
import re.d;
import ub.f;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/options/OptionsListHostActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/stock/list/StockListHostViewModel;", "Lba/z2;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OptionsListHostActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9631l = 0;

    /* renamed from: k, reason: collision with root package name */
    public ia.b f9632k;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_options_list_host;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((StockListHostViewModel) x()).f10252o.observe(this, new d(22, new f(this, 22)));
    }

    @Override // gd.b
    public final void I() {
        z2 z2Var = (z2) w();
        ((TextView) z2Var.f6794s.findViewById(R.id.portfolio_collapsed_list_selector)).setText(getString(R.string.add_options));
        u(((z2) w()).f6795t);
        if (!(this.f9632k instanceof ia.b)) {
            d1 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            a aVar = new a(supportFragmentManager);
            Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction(...)");
            ia.b bVar = (ia.b) getSupportFragmentManager().C("MarketOptionHostFragment");
            if (bVar == null) {
                int i10 = ia.b.f19748h;
                Bundle extras = getIntent().getExtras();
                Bundle bundle = new Bundle();
                if (extras != null) {
                    bundle.putAll(extras);
                }
                bVar = new ia.b();
                bVar.setArguments(bundle);
                aVar.e(R.id.container_fragment, bVar, "MarketOptionHostFragment", 1);
            } else {
                aVar.o(bVar);
            }
            aVar.h(false);
            this.f9632k = bVar;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onResume() {
        super.onResume();
        StockListHostViewModel stockListHostViewModel = (StockListHostViewModel) x();
        qf.b section = qf.b.f31940o;
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
