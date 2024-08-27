package qg;

import android.view.View;
import androidx.lifecycle.o;
import ba.wf;
import com.assetgro.stockgro.data.model.BottomSheetItem;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.bottomsheet.ReusedBottomSheetViewModel;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioHoldingsViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.h;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import okhttp3.HttpUrl;
import ut.g;
import vt.y;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lqg/c;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/bottomsheet/ReusedBottomSheetViewModel;", "Lba/wf;", "<init>", "()V", "yk/o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends h<ReusedBottomSheetViewModel, wf> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f31952k = 0;

    /* renamed from: i, reason: collision with root package name */
    public hd.b f31953i;

    /* renamed from: j, reason: collision with root package name */
    public final g f31954j = ut.h.a(new ag.b(this, 11));

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        this.f17270b = bottomSheetDialogFragmentComponent.k();
        FirebaseAnalytics d10 = bottomSheetDialogFragmentComponent.f14246a.d();
        yk.g.i(d10);
        this.f17273e = d10;
        Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
        yk.g.i(o10);
        this.f17274f = o10;
        n0 h10 = bottomSheetDialogFragmentComponent.f14246a.h();
        yk.g.i(h10);
        this.f17275g = h10;
    }

    @Override // gd.h
    public final int x() {
        return R.layout.fragment_bottom_sheet;
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        hd.b bVar = new hd.b(lifecycle, new a(this, 1));
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f31953i = bVar;
        PortfolioHoldingsViewModel portfolioHoldingsViewModel = (PortfolioHoldingsViewModel) this.f31954j.getValue();
        portfolioHoldingsViewModel.getClass();
        ArrayList c10 = y.c(new BottomSheetItem("All Holdings", HttpUrl.FRAGMENT_ENCODE_SET), new BottomSheetItem("Amount Invested: Low to High", "amount_invested:asc"), new BottomSheetItem("Amount Invested: High to Low", "amount_invested:desc"), new BottomSheetItem("Performance: Low to High", "performance:asc"), new BottomSheetItem("Performance: High to low", "performance:desc"));
        ((BottomSheetItem) c10.get(c10.indexOf(portfolioHoldingsViewModel.f9841u))).setSelected(true);
        bVar.u(c10);
        wf wfVar = (wf) r();
        hd.b bVar2 = this.f31953i;
        if (bVar2 != null) {
            wfVar.f6530s.setAdapter(bVar2);
        } else {
            Intrinsics.k("customBottomSheetListAdapter");
            throw null;
        }
    }
}
