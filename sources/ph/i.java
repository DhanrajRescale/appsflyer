package ph;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.j0;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import ba.um;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.redemption.home.RedemptionHostViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import r3.k;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lph/i;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/redemption/home/RedemptionHostViewModel;", "Lba/um;", "Lph/d;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends m<RedemptionHostViewModel, um> implements d {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f31105h = 0;

    /* renamed from: g, reason: collision with root package name */
    public g f31106g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_redemption_offers_list;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((RedemptionHostViewModel) r()).f10093z.observe(this, new ch.c(16, new h(this, 0)));
        ((RedemptionHostViewModel) r()).f9084g.observe(this, new ch.c(16, new h(this, 1)));
        ((RedemptionHostViewModel) r()).B.observe(this, new ch.c(16, new h(this, 2)));
    }

    @Override // gd.m
    public final void E(View view) {
        h.m mVar;
        Intrinsics.checkNotNullParameter(view, "view");
        setHasOptionsMenu(true);
        ((um) q()).f6330t.setTitle(getString(R.string.text_stockgro_club));
        Toolbar toolbar = ((um) q()).f6330t;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        p(toolbar);
        ((um) q()).f6330t.setTitleTextColor(k.getColor(requireContext(), R.color.black_1A1A1A));
        j0 activity = getActivity();
        if (activity instanceof h.m) {
            mVar = (h.m) activity;
        } else {
            mVar = null;
        }
        if (mVar != null) {
            mVar.u(((um) q()).f6330t);
        }
        Toolbar toolbar2 = ((um) q()).f6330t;
        toolbar2.setNavigationIcon(R.drawable.ic_back);
        toolbar2.setNavigationOnClickListener(new a(this, 2));
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f31106g = new g(lifecycle, this);
        RecyclerView recyclerView = ((um) q()).f6329s.f5853t;
        g gVar = this.f31106g;
        if (gVar != null) {
            recyclerView.setAdapter(gVar);
            ((um) q()).f6329s.f5854u.setOnRefreshListener(new vc.b(this, 24));
            ((RedemptionHostViewModel) r()).i();
            return;
        }
        Intrinsics.k("redemptionOffersAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 10078 && i11 == -1) {
            ((RedemptionHostViewModel) r()).f10092y.postValue(1);
        }
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
