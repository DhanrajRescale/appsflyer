package com.assetgro.stockgro.ui.drawer.stockgyan;

import android.content.Intent;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.o;
import ba.c4;
import bf.a;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import re.d;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/drawer/stockgyan/StockGyanGroupsActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/drawer/stockgyan/StockGyanGroupsViewModel;", "Lba/c4;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockGyanGroupsActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9499l = 0;

    /* renamed from: k, reason: collision with root package name */
    public a f9500k;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_stock_gyan_groups;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((StockGyanGroupsViewModel) x()).f9084g.observe(this, new d(6, new af.a(this, 0)));
        ((StockGyanGroupsViewModel) x()).f9503p.observe(this, new d(6, new af.a(this, 1)));
        ((StockGyanGroupsViewModel) x()).f9507t.observe(this, new d(6, new af.a(this, 2)));
    }

    @Override // gd.b
    public final void I() {
        ((StockGyanGroupsViewModel) x()).h();
        this.f17260h = "gyan";
        c4 c4Var = (c4) w();
        c4Var.f4338u.setTitle(getString(R.string.text_learn_with_stockgyan));
        Toolbar toolbar = ((c4) w()).f4338u;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        u(((c4) w()).f4338u);
        c4 c4Var2 = (c4) w();
        c4Var2.f4338u.setNavigationOnClickListener(new jd.a(this, 26));
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f9500k = new a(lifecycle, new af.a(this, 3));
        c4 c4Var3 = (c4) w();
        a aVar = this.f9500k;
        if (aVar != null) {
            c4Var3.f4336s.setAdapter(aVar);
            c4 c4Var4 = (c4) w();
            c4Var4.f4337t.setOnRefreshListener(new vc.b(this, 12));
            return;
        }
        Intrinsics.k("stockGyanGroupsAdapter");
        throw null;
    }

    public final void K() {
        Intent intent = new Intent(this, (Class<?>) MaintenanceWindowActivity.class);
        intent.putExtra("DATA", qf.b.f31936k);
        intent.putExtra("SHOW_TOOLBAR", true);
        intent.putExtra("TOOLBAR_TITLE", getString(R.string.text_learn_with_stockgyan));
        startActivity(intent);
        finish();
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        if (isTaskRoot()) {
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onResume() {
        super.onResume();
        StockGyanGroupsViewModel stockGyanGroupsViewModel = (StockGyanGroupsViewModel) x();
        if (stockGyanGroupsViewModel.f9502o.b(qf.b.f31936k)) {
            K();
        }
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.n();
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
