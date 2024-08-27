package xg;

import android.view.View;
import androidx.lifecycle.v;
import com.assetgro.stockgro.ui.portfolio.sector.PortfolioSectorStocksItemViewModel;
import gd.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends o {
    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new PortfolioSectorStocksItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        PortfolioSectorStocksItemViewModel portfolioSectorStocksItemViewModel = (PortfolioSectorStocksItemViewModel) v();
        portfolioSectorStocksItemViewModel.f9932g.observe(this, new xf.v(23, new d(this, 0)));
        PortfolioSectorStocksItemViewModel portfolioSectorStocksItemViewModel2 = (PortfolioSectorStocksItemViewModel) v();
        portfolioSectorStocksItemViewModel2.f9933h.observe(this, new xf.v(23, new d(this, 1)));
        PortfolioSectorStocksItemViewModel portfolioSectorStocksItemViewModel3 = (PortfolioSectorStocksItemViewModel) v();
        portfolioSectorStocksItemViewModel3.f9935j.observe(this, new xf.v(23, new d(this, 2)));
        PortfolioSectorStocksItemViewModel portfolioSectorStocksItemViewModel4 = (PortfolioSectorStocksItemViewModel) v();
        portfolioSectorStocksItemViewModel4.f9936k.observe(this, new xf.v(23, new d(this, 3)));
        PortfolioSectorStocksItemViewModel portfolioSectorStocksItemViewModel5 = (PortfolioSectorStocksItemViewModel) v();
        portfolioSectorStocksItemViewModel5.f9938m.observe(this, new xf.v(23, new d(this, 4)));
        PortfolioSectorStocksItemViewModel portfolioSectorStocksItemViewModel6 = (PortfolioSectorStocksItemViewModel) v();
        portfolioSectorStocksItemViewModel6.f9939n.observe(this, new xf.v(23, new d(this, 5)));
        PortfolioSectorStocksItemViewModel portfolioSectorStocksItemViewModel7 = (PortfolioSectorStocksItemViewModel) v();
        portfolioSectorStocksItemViewModel7.f9937l.observe(this, new xf.v(23, new d(this, 6)));
        PortfolioSectorStocksItemViewModel portfolioSectorStocksItemViewModel8 = (PortfolioSectorStocksItemViewModel) v();
        portfolioSectorStocksItemViewModel8.f9934i.observe(this, new xf.v(23, new d(this, 7)));
        PortfolioSectorStocksItemViewModel portfolioSectorStocksItemViewModel9 = (PortfolioSectorStocksItemViewModel) v();
        portfolioSectorStocksItemViewModel9.f9940o.observe(this, new xf.v(23, new d(this, 8)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
