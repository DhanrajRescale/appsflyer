package com.assetgro.stockgro.ui.redemption.offers.tnc;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import ba.w2;
import ch.c;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.redemption.home.RedemptionHostViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qg.a;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/redemption/offers/tnc/OfferTNCActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/redemption/home/RedemptionHostViewModel;", "Lba/w2;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OfferTNCActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10096k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_offer_terms_and_conditions;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((RedemptionHostViewModel) x()).f10086s.observe(this, new c(18, new a(this, 11)));
    }

    @Override // gd.b
    public final void I() {
        String str;
        w2 w2Var = (w2) w();
        w2Var.f6503u.setTitle(getString(R.string.title_terms_and_conditions));
        Toolbar toolbar = ((w2) w()).f6503u;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        u(((w2) w()).f6503u);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            str = extras.getString("COUPON_ID");
        } else {
            str = null;
        }
        if (str != null) {
            ((RedemptionHostViewModel) x()).f10082o = str;
            ((RedemptionHostViewModel) x()).h(str);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return false;
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
        g.i(activityComponent.f14246a.d());
    }
}
