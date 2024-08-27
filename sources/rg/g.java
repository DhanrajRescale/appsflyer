package rg;

import android.view.View;
import androidx.lifecycle.v;
import com.assetgro.stockgro.ui.portfolio.league.option.FrozenPortfolioOptionViewModel;
import gd.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends o {
    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new FrozenPortfolioOptionViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        FrozenPortfolioOptionViewModel frozenPortfolioOptionViewModel = (FrozenPortfolioOptionViewModel) v();
        frozenPortfolioOptionViewModel.f9869g.observe(this, new xf.v(16, new f(this, 0)));
        FrozenPortfolioOptionViewModel frozenPortfolioOptionViewModel2 = (FrozenPortfolioOptionViewModel) v();
        frozenPortfolioOptionViewModel2.f9871i.observe(this, new xf.v(16, new f(this, 1)));
        FrozenPortfolioOptionViewModel frozenPortfolioOptionViewModel3 = (FrozenPortfolioOptionViewModel) v();
        frozenPortfolioOptionViewModel3.f9870h.observe(this, new xf.v(16, new f(this, 2)));
        FrozenPortfolioOptionViewModel frozenPortfolioOptionViewModel4 = (FrozenPortfolioOptionViewModel) v();
        frozenPortfolioOptionViewModel4.f9873k.observe(this, new xf.v(16, new f(this, 3)));
        FrozenPortfolioOptionViewModel frozenPortfolioOptionViewModel5 = (FrozenPortfolioOptionViewModel) v();
        frozenPortfolioOptionViewModel5.f9874l.observe(this, new xf.v(16, new f(this, 4)));
        FrozenPortfolioOptionViewModel frozenPortfolioOptionViewModel6 = (FrozenPortfolioOptionViewModel) v();
        frozenPortfolioOptionViewModel6.f9875m.observe(this, new xf.v(16, new f(this, 5)));
        FrozenPortfolioOptionViewModel frozenPortfolioOptionViewModel7 = (FrozenPortfolioOptionViewModel) v();
        frozenPortfolioOptionViewModel7.f9876n.observe(this, new xf.v(16, new f(this, 6)));
        FrozenPortfolioOptionViewModel frozenPortfolioOptionViewModel8 = (FrozenPortfolioOptionViewModel) v();
        frozenPortfolioOptionViewModel8.f9872j.observe(this, new xf.v(16, new f(this, 7)));
        FrozenPortfolioOptionViewModel frozenPortfolioOptionViewModel9 = (FrozenPortfolioOptionViewModel) v();
        frozenPortfolioOptionViewModel9.f9877o.observe(this, new xf.v(16, new f(this, 8)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
