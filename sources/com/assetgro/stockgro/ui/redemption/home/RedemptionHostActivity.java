package com.assetgro.stockgro.ui.redemption.home;

import android.content.Intent;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.d1;
import androidx.lifecycle.o;
import ba.h3;
import ch.c;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qg.a;
import yk.g;
import yo.n;
import z7.e;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/redemption/home/RedemptionHostActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/redemption/home/RedemptionHostViewModel;", "Lba/h3;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RedemptionHostActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10080k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_redemption_host;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((RedemptionHostViewModel) x()).f10092y.observe(this, new c(14, new a(this, 9)));
    }

    @Override // gd.b
    public final void I() {
        h3 h3Var = (h3) w();
        String string = getString(R.string.text_stockgro_exchange);
        Toolbar toolbar = h3Var.f4888t;
        toolbar.setTitle(string);
        v(toolbar);
        u(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back);
        toolbar.setNavigationOnClickListener(new p004if.c(this, 29));
        h3 h3Var2 = (h3) w();
        d1 fragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(fragmentManager, "getSupportFragmentManager(...)");
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        h3Var2.f4889u.setAdapter(new e(fragmentManager, lifecycle));
        ((h3) w()).f4889u.setUserInputEnabled(true);
        h3 h3Var3 = (h3) w();
        h3 h3Var4 = (h3) w();
        new n(h3Var3.f4887s, h3Var4.f4889u, new vc.b(this, 23)).a();
        Toolbar toolbar2 = ((h3) w()).f4888t;
        Intrinsics.checkNotNullExpressionValue(toolbar2, "toolbar");
        v(toolbar2);
        h3 h3Var5 = (h3) w();
        h3Var5.f4887s.a(new nc.c(this, 9));
        if (getIntent().getBooleanExtra("REDEEMED", false)) {
            ((h3) w()).f4889u.c(1, false);
        }
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

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.j();
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
