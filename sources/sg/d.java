package sg;

import android.view.View;
import androidx.lifecycle.v;
import com.assetgro.stockgro.ui.portfolio.league.stocks.ActiveLeaguePortfolioSectorStocksItemViewModel;
import gd.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends o {
    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new ActiveLeaguePortfolioSectorStocksItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        ActiveLeaguePortfolioSectorStocksItemViewModel activeLeaguePortfolioSectorStocksItemViewModel = (ActiveLeaguePortfolioSectorStocksItemViewModel) v();
        activeLeaguePortfolioSectorStocksItemViewModel.f9878g.observe(this, new xf.v(17, new c(this, 2)));
        ActiveLeaguePortfolioSectorStocksItemViewModel activeLeaguePortfolioSectorStocksItemViewModel2 = (ActiveLeaguePortfolioSectorStocksItemViewModel) v();
        activeLeaguePortfolioSectorStocksItemViewModel2.f9879h.observe(this, new xf.v(17, new c(this, 3)));
        ActiveLeaguePortfolioSectorStocksItemViewModel activeLeaguePortfolioSectorStocksItemViewModel3 = (ActiveLeaguePortfolioSectorStocksItemViewModel) v();
        activeLeaguePortfolioSectorStocksItemViewModel3.f9880i.observe(this, new xf.v(17, new c(this, 4)));
        ActiveLeaguePortfolioSectorStocksItemViewModel activeLeaguePortfolioSectorStocksItemViewModel4 = (ActiveLeaguePortfolioSectorStocksItemViewModel) v();
        activeLeaguePortfolioSectorStocksItemViewModel4.f9884m.observe(this, new xf.v(17, new c(this, 5)));
        ActiveLeaguePortfolioSectorStocksItemViewModel activeLeaguePortfolioSectorStocksItemViewModel5 = (ActiveLeaguePortfolioSectorStocksItemViewModel) v();
        activeLeaguePortfolioSectorStocksItemViewModel5.f9885n.observe(this, new xf.v(17, new c(this, 6)));
        ActiveLeaguePortfolioSectorStocksItemViewModel activeLeaguePortfolioSectorStocksItemViewModel6 = (ActiveLeaguePortfolioSectorStocksItemViewModel) v();
        activeLeaguePortfolioSectorStocksItemViewModel6.f9886o.observe(this, new xf.v(17, new c(this, 7)));
        ActiveLeaguePortfolioSectorStocksItemViewModel activeLeaguePortfolioSectorStocksItemViewModel7 = (ActiveLeaguePortfolioSectorStocksItemViewModel) v();
        activeLeaguePortfolioSectorStocksItemViewModel7.f9887p.observe(this, new xf.v(17, new c(this, 8)));
        ActiveLeaguePortfolioSectorStocksItemViewModel activeLeaguePortfolioSectorStocksItemViewModel8 = (ActiveLeaguePortfolioSectorStocksItemViewModel) v();
        activeLeaguePortfolioSectorStocksItemViewModel8.f9882k.observe(this, new xf.v(17, new c(this, 9)));
        ActiveLeaguePortfolioSectorStocksItemViewModel activeLeaguePortfolioSectorStocksItemViewModel9 = (ActiveLeaguePortfolioSectorStocksItemViewModel) v();
        activeLeaguePortfolioSectorStocksItemViewModel9.f9883l.observe(this, new xf.v(17, new c(this, 10)));
        ActiveLeaguePortfolioSectorStocksItemViewModel activeLeaguePortfolioSectorStocksItemViewModel10 = (ActiveLeaguePortfolioSectorStocksItemViewModel) v();
        activeLeaguePortfolioSectorStocksItemViewModel10.f9881j.observe(this, new xf.v(17, new c(this, 0)));
        ActiveLeaguePortfolioSectorStocksItemViewModel activeLeaguePortfolioSectorStocksItemViewModel11 = (ActiveLeaguePortfolioSectorStocksItemViewModel) v();
        activeLeaguePortfolioSectorStocksItemViewModel11.f9888q.observe(this, new xf.v(17, new c(this, 1)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
