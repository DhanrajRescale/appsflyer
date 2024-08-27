package com.assetgro.stockgro.ui.drawer.stockgyan;

import af.c;
import android.content.Intent;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba.e4;
import com.assetgro.stockgro.data.model.StockGyanGroup;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.b;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import re.d;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/drawer/stockgyan/StockGyanIndexActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/drawer/stockgyan/StockGyanGroupsViewModel;", "Lba/e4;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockGyanIndexActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9509l = 0;

    /* renamed from: k, reason: collision with root package name */
    public a f9510k;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_stock_gyan_index;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((StockGyanGroupsViewModel) x()).f9084g.observe(this, new d(7, new af.d(this, 0)));
        ((StockGyanGroupsViewModel) x()).f9504q.observe(this, new d(7, new af.d(this, 1)));
        ((StockGyanGroupsViewModel) x()).f9503p.observe(this, new d(7, new af.d(this, 2)));
        ((StockGyanGroupsViewModel) x()).f9507t.observe(this, new d(7, new af.d(this, 3)));
    }

    @Override // gd.b
    public final void I() {
        this.f17260h = "gyan-level-one";
        StockGyanGroup stockGyanGroup = (StockGyanGroup) getIntent().getParcelableExtra("STOCK_GYAN_GROUP");
        if (stockGyanGroup != null) {
            ((StockGyanGroupsViewModel) x()).f9506s.postValue(stockGyanGroup);
            ((StockGyanGroupsViewModel) x()).f9504q.postValue(stockGyanGroup.getStockGyanIndices());
            ((StockGyanGroupsViewModel) x()).h();
        }
        e4 e4Var = (e4) w();
        e4Var.f4571w.setTitle(getString(R.string.text_learn_with_stockgyan));
        Toolbar toolbar = ((e4) w()).f4571w;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        u(((e4) w()).f4571w);
        e4 e4Var2 = (e4) w();
        e4Var2.f4571w.setNavigationOnClickListener(new jd.a(this, 27));
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f9510k = new a(lifecycle, new af.d(this, 4));
        e4 e4Var3 = (e4) w();
        a aVar = this.f9510k;
        if (aVar != null) {
            RecyclerView recyclerView = e4Var3.f4568t;
            recyclerView.setAdapter(aVar);
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            e4 e4Var4 = (e4) w();
            e4Var4.f4570v.setOnRefreshListener(new c(this));
            return;
        }
        Intrinsics.k("stockGyanIndexAdapter");
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

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onResume() {
        super.onResume();
        StockGyanGroupsViewModel stockGyanGroupsViewModel = (StockGyanGroupsViewModel) x();
        if (stockGyanGroupsViewModel.f9502o.b(qf.b.f31936k)) {
            K();
        }
        ((StockGyanGroupsViewModel) x()).h();
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
