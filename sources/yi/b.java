package yi;

import android.view.View;
import androidx.lifecycle.o;
import ba.on;
import com.assetgro.stockgro.data.repository.SortDirection;
import com.assetgro.stockgro.data.repository.SortOption;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.list.StockListViewModel;
import com.assetgro.stockgro.ui.stock.sort.StockSortViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.h;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import ni.s;
import ut.g;
import vt.y;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lyi/b;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/stock/sort/StockSortViewModel;", "Lba/on;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends h<StockSortViewModel, on> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f41644k = 0;

    /* renamed from: i, reason: collision with root package name */
    public a f41645i;

    /* renamed from: j, reason: collision with root package name */
    public final g f41646j = ut.h.a(new ag.b(this, 21));

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        this.f17270b = bottomSheetDialogFragmentComponent.q();
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
        return R.layout.fragment_sort_stock;
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        a aVar = new a(lifecycle, new qg.a(this, 19));
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f41645i = aVar;
        SortOption sortOption = SortOption.Alphabets;
        SortDirection sortDirection = SortDirection.Ascending;
        s sVar = new s(sortOption, sortDirection, R.string.name_ascending);
        SortDirection sortDirection2 = SortDirection.Descending;
        s sVar2 = new s(sortOption, sortDirection2, R.string.name_descending);
        SortOption sortOption2 = SortOption.Price;
        s sVar3 = new s(sortOption2, sortDirection, R.string.price_ascending);
        s sVar4 = new s(sortOption2, sortDirection2, R.string.price_descending);
        SortOption sortOption3 = SortOption.Percentage;
        ArrayList c10 = y.c(sVar, sVar2, sVar3, sVar4, new s(sortOption3, sortDirection, R.string.percentage_ascending), new s(sortOption3, sortDirection2, R.string.percentage_descending));
        ((s) c10.get(c10.indexOf(((StockListViewModel) this.f41646j.getValue()).B))).f28765d = true;
        aVar.u(c10);
        on onVar = (on) r();
        a aVar2 = this.f41645i;
        if (aVar2 != null) {
            onVar.f5674s.setAdapter(aVar2);
        } else {
            Intrinsics.k("stockSortAdapter");
            throw null;
        }
    }
}
