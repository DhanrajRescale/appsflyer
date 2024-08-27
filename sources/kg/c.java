package kg;

import android.view.View;
import androidx.lifecycle.v;
import com.assetgro.stockgro.ui.portfolio.frozen.FrozenPortfolioStocksViewModel;
import gd.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends o {
    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new FrozenPortfolioStocksViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        FrozenPortfolioStocksViewModel frozenPortfolioStocksViewModel = (FrozenPortfolioStocksViewModel) v();
        frozenPortfolioStocksViewModel.f9794g.observe(this, new xf.v(8, new b(this, 0)));
        FrozenPortfolioStocksViewModel frozenPortfolioStocksViewModel2 = (FrozenPortfolioStocksViewModel) v();
        frozenPortfolioStocksViewModel2.f9795h.observe(this, new xf.v(8, new b(this, 1)));
        FrozenPortfolioStocksViewModel frozenPortfolioStocksViewModel3 = (FrozenPortfolioStocksViewModel) v();
        frozenPortfolioStocksViewModel3.f9797j.observe(this, new xf.v(8, new b(this, 2)));
        FrozenPortfolioStocksViewModel frozenPortfolioStocksViewModel4 = (FrozenPortfolioStocksViewModel) v();
        frozenPortfolioStocksViewModel4.f9798k.observe(this, new xf.v(8, new b(this, 3)));
        FrozenPortfolioStocksViewModel frozenPortfolioStocksViewModel5 = (FrozenPortfolioStocksViewModel) v();
        frozenPortfolioStocksViewModel5.f9799l.observe(this, new xf.v(8, new b(this, 4)));
        FrozenPortfolioStocksViewModel frozenPortfolioStocksViewModel6 = (FrozenPortfolioStocksViewModel) v();
        frozenPortfolioStocksViewModel6.f9800m.observe(this, new xf.v(8, new b(this, 5)));
        FrozenPortfolioStocksViewModel frozenPortfolioStocksViewModel7 = (FrozenPortfolioStocksViewModel) v();
        frozenPortfolioStocksViewModel7.f9796i.observe(this, new xf.v(8, new b(this, 6)));
        FrozenPortfolioStocksViewModel frozenPortfolioStocksViewModel8 = (FrozenPortfolioStocksViewModel) v();
        frozenPortfolioStocksViewModel8.f9801n.observe(this, new xf.v(8, new b(this, 7)));
        FrozenPortfolioStocksViewModel frozenPortfolioStocksViewModel9 = (FrozenPortfolioStocksViewModel) v();
        frozenPortfolioStocksViewModel9.f9802o.observe(this, new xf.v(8, new b(this, 8)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
