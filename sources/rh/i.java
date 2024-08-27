package rh;

import android.view.View;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import ba.sm;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.redemption.home.RedemptionHostViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lrh/i;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/redemption/home/RedemptionHostViewModel;", "Lba/sm;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends m<RedemptionHostViewModel, sm> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f33755h = 0;

    /* renamed from: g, reason: collision with root package name */
    public g f33756g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_redeemed_offers;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((RedemptionHostViewModel) r()).A.observe(this, new ch.c(20, new h(this, 0)));
        ((RedemptionHostViewModel) r()).f9084g.observe(this, new ch.c(20, new h(this, 1)));
        ((RedemptionHostViewModel) r()).B.observe(this, new ch.c(20, new h(this, 2)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        setHasOptionsMenu(true);
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f33756g = new g(lifecycle, new h(this, 3));
        RecyclerView recyclerView = ((sm) q()).f6104s.f5658u;
        g gVar = this.f33756g;
        if (gVar != null) {
            recyclerView.setAdapter(gVar);
            ((sm) q()).f6104s.f5659v.setOnRefreshListener(new vc.b(this, 25));
        } else {
            Intrinsics.k("redeemedOffersAdapter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        ((RedemptionHostViewModel) r()).j();
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        this.f17284b = fragmentComponent.i();
        da.b bVar = fragmentComponent.f14279b;
        FirebaseAnalytics d10 = bVar.d();
        yk.g.i(d10);
        this.f17285c = d10;
        Analytics o10 = bVar.o();
        yk.g.i(o10);
        this.f17286d = o10;
        n0 h10 = bVar.h();
        yk.g.i(h10);
        this.f17287e = h10;
        yk.g.i(bVar.d());
    }
}
