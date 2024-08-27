package com.assetgro.stockgro.ui.redemption.offers.details;

import ab.g;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.e0;
import ba.u2;
import bb.a;
import ch.c;
import com.assetgro.stockgro.data.model.RedemptionOffer;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.redemption.home.RedemptionHostViewModel;
import com.assetgro.stockgro.ui.redemption.offers.details.OfferDetailsActivity;
import com.assetgro.stockgro.ui.redemption.offers.tnc.OfferTNCActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.webengage.sdk.android.Analytics;
import gd.b;
import java.util.ArrayList;
import jf.d;
import kj.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qh.e;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/redemption/offers/details/OfferDetailsActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/redemption/home/RedemptionHostViewModel;", "Lba/u2;", "<init>", "()V", "yk/o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OfferDetailsActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10095k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_offer_details;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((RedemptionHostViewModel) x()).f10086s.observe(this, new c(17, new qh.b(this, 8)));
        ((RedemptionHostViewModel) x()).f10087t.observe(this, new c(17, new qh.b(this, 12)));
        ((RedemptionHostViewModel) x()).f9084g.observe(this, new c(17, new qh.b(this, 13)));
        RedemptionHostViewModel redemptionHostViewModel = (RedemptionHostViewModel) x();
        redemptionHostViewModel.C.observe(this, new c(17, new qh.b(this, 14)));
        RedemptionHostViewModel redemptionHostViewModel2 = (RedemptionHostViewModel) x();
        redemptionHostViewModel2.D.observe(this, new c(17, new qh.b(this, 15)));
        RedemptionHostViewModel redemptionHostViewModel3 = (RedemptionHostViewModel) x();
        redemptionHostViewModel3.E.observe(this, new c(17, new qh.b(this, 16)));
        RedemptionHostViewModel redemptionHostViewModel4 = (RedemptionHostViewModel) x();
        redemptionHostViewModel4.F.observe(this, new c(17, new qh.b(this, 17)));
        RedemptionHostViewModel redemptionHostViewModel5 = (RedemptionHostViewModel) x();
        redemptionHostViewModel5.G.observe(this, new c(17, new qh.b(this, 18)));
        RedemptionHostViewModel redemptionHostViewModel6 = (RedemptionHostViewModel) x();
        redemptionHostViewModel6.I.observe(this, new c(17, new qh.b(this, 19)));
        RedemptionHostViewModel redemptionHostViewModel7 = (RedemptionHostViewModel) x();
        redemptionHostViewModel7.H.observe(this, new c(17, new qh.b(this, 0)));
        RedemptionHostViewModel redemptionHostViewModel8 = (RedemptionHostViewModel) x();
        redemptionHostViewModel8.K.observe(this, new c(17, new qh.b(this, 1)));
        RedemptionHostViewModel redemptionHostViewModel9 = (RedemptionHostViewModel) x();
        redemptionHostViewModel9.L.observe(this, new c(17, new qh.b(this, 2)));
        RedemptionHostViewModel redemptionHostViewModel10 = (RedemptionHostViewModel) x();
        redemptionHostViewModel10.J.observe(this, new c(17, new qh.b(this, 3)));
        ((RedemptionHostViewModel) x()).f10090w.observe(this, new c(17, new qh.b(this, 4)));
        ((RedemptionHostViewModel) x()).f10089v.observe(this, new c(17, qh.c.f31959b));
        ((RedemptionHostViewModel) x()).f10088u.observe(this, new c(17, new qh.b(this, 5)));
        RedemptionHostViewModel redemptionHostViewModel11 = (RedemptionHostViewModel) x();
        redemptionHostViewModel11.M.observe(this, new c(17, qh.c.f31960c));
        ((RedemptionHostViewModel) x()).f10091x.observe(this, new c(17, new qh.b(this, 6)));
        RedemptionHostViewModel redemptionHostViewModel12 = (RedemptionHostViewModel) x();
        redemptionHostViewModel12.N.observe(this, new c(17, new qh.b(this, 7)));
        RedemptionHostViewModel redemptionHostViewModel13 = (RedemptionHostViewModel) x();
        redemptionHostViewModel13.O.observe(this, new c(17, new qh.b(this, 9)));
        RedemptionHostViewModel redemptionHostViewModel14 = (RedemptionHostViewModel) x();
        redemptionHostViewModel14.P.observe(this, new c(17, new qh.b(this, 10)));
        RedemptionHostViewModel redemptionHostViewModel15 = (RedemptionHostViewModel) x();
        redemptionHostViewModel15.Q.observe(this, new c(17, new qh.b(this, 11)));
    }

    @Override // gd.b
    public final void I() {
        String str;
        u2 u2Var = (u2) w();
        u2Var.f6265u.setTitle(getString(R.string.offer_details));
        Toolbar toolbar = ((u2) w()).f6265u;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        u(((u2) w()).f6265u);
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
        ((u2) w()).f6263s.C.setOnClickListener(new a(str, this));
        final int i10 = 0;
        ((u2) w()).f6263s.f5460t.setOnClickListener(new View.OnClickListener(this) { // from class: qh.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfferDetailsActivity f31956b;

            {
                this.f31956b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                OfferDetailsActivity this$0 = this.f31956b;
                switch (i11) {
                    case 0:
                        int i12 = OfferDetailsActivity.f10095k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Float f10 = ((RedemptionHostViewModel) this$0.x()).f10083p;
                        if (f10 != null) {
                            float floatValue = f10.floatValue();
                            e0 e0Var = ((RedemptionHostViewModel) this$0.x()).f10090w;
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("REDIRECT", true);
                            bundle.putFloat("RECHARGE_AMOUNT", floatValue);
                            e0Var.postValue(new j(bundle));
                            return;
                        }
                        return;
                    default:
                        int i13 = OfferDetailsActivity.f10095k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = ((RedemptionHostViewModel) this$0.x()).f10082o;
                        if (str2 != null) {
                            Intent intent = new Intent(this$0, (Class<?>) OfferTNCActivity.class);
                            intent.putExtra("COUPON_ID", str2);
                            this$0.startActivity(intent);
                            return;
                        }
                        return;
                }
            }
        });
        ((u2) w()).f6263s.E.setOnCheckedChangeListener(new g(this, 5));
        final int i11 = 1;
        ((u2) w()).f6263s.F.setOnClickListener(new View.OnClickListener(this) { // from class: qh.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfferDetailsActivity f31956b;

            {
                this.f31956b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                OfferDetailsActivity this$0 = this.f31956b;
                switch (i112) {
                    case 0:
                        int i12 = OfferDetailsActivity.f10095k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Float f10 = ((RedemptionHostViewModel) this$0.x()).f10083p;
                        if (f10 != null) {
                            float floatValue = f10.floatValue();
                            e0 e0Var = ((RedemptionHostViewModel) this$0.x()).f10090w;
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("REDIRECT", true);
                            bundle.putFloat("RECHARGE_AMOUNT", floatValue);
                            e0Var.postValue(new j(bundle));
                            return;
                        }
                        return;
                    default:
                        int i13 = OfferDetailsActivity.f10095k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = ((RedemptionHostViewModel) this$0.x()).f10082o;
                        if (str2 != null) {
                            Intent intent = new Intent(this$0, (Class<?>) OfferTNCActivity.class);
                            intent.putExtra("COUPON_ID", str2);
                            this$0.startActivity(intent);
                            return;
                        }
                        return;
                }
            }
        });
    }

    public final void K(String paymentStatusResponse, String message) {
        Intrinsics.checkNotNullParameter(paymentStatusResponse, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        RedemptionHostViewModel redemptionHostViewModel = (RedemptionHostViewModel) x();
        Intrinsics.checkNotNullParameter(paymentStatusResponse, "paymentStatusResponse");
        Intrinsics.checkNotNullParameter(message, "message");
        redemptionHostViewModel.f10085r = paymentStatusResponse;
        redemptionHostViewModel.f10084q = message;
        try {
            int i10 = e.f31964j;
            Bundle bundle = new Bundle();
            e eVar = new e();
            eVar.setArguments(bundle);
            eVar.show(getSupportFragmentManager(), "RedemptionStatusBottomSheetFragment");
        } catch (Exception e10) {
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        String str;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 10021 && i11 == -1 && (str = ((RedemptionHostViewModel) x()).f10082o) != null) {
            ((RedemptionHostViewModel) x()).k(str);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        Intrinsics.checkNotNullExpressionValue(menuInflater, "getMenuInflater(...)");
        menuInflater.inflate(R.menu.toolbar_menu_share, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        RedemptionOffer redemptionOffer;
        ArrayList<String> creativeUrls;
        String str;
        Intrinsics.checkNotNullParameter(item, "item");
        int i10 = 1;
        if (item.getItemId() == 16908332) {
            setResult(0);
            finish();
            return true;
        }
        if (item.getItemId() == R.id.action_share && (redemptionOffer = (RedemptionOffer) ((RedemptionHostViewModel) x()).f10086s.getValue()) != null && (creativeUrls = redemptionOffer.getCreativeUrls()) != null && (str = creativeUrls.get(0)) != null) {
            com.bumptech.glide.g j10 = com.bumptech.glide.b.c(this).f(this).j();
            j10.F = str;
            j10.J = true;
            j10.A(new d(this, i10));
        }
        return false;
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.j();
        FirebaseAnalytics d10 = activityComponent.f14246a.d();
        yk.g.i(d10);
        this.f17256d = d10;
        Analytics o10 = activityComponent.f14246a.o();
        yk.g.i(o10);
        this.f17257e = o10;
        n0 h10 = activityComponent.f14246a.h();
        yk.g.i(h10);
        this.f17258f = h10;
        yk.g.i(activityComponent.f14246a.d());
    }
}
