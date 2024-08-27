package rg;

import android.view.View;
import androidx.lifecycle.v;
import ba.a7;
import ba.z6;
import com.assetgro.stockgro.ui.portfolio.league.option.ActivePrepZonePortfolioOptionItemViewModel;
import gd.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends o {
    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new ActivePrepZonePortfolioOptionItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        ActivePrepZonePortfolioOptionItemViewModel activePrepZonePortfolioOptionItemViewModel = (ActivePrepZonePortfolioOptionItemViewModel) v();
        activePrepZonePortfolioOptionItemViewModel.f9859g.observe(this, new xf.v(15, new c(this, 1)));
        ActivePrepZonePortfolioOptionItemViewModel activePrepZonePortfolioOptionItemViewModel2 = (ActivePrepZonePortfolioOptionItemViewModel) v();
        activePrepZonePortfolioOptionItemViewModel2.f9860h.observe(this, new xf.v(15, new c(this, 2)));
        ActivePrepZonePortfolioOptionItemViewModel activePrepZonePortfolioOptionItemViewModel3 = (ActivePrepZonePortfolioOptionItemViewModel) v();
        activePrepZonePortfolioOptionItemViewModel3.f9861i.observe(this, new xf.v(15, new c(this, 3)));
        ActivePrepZonePortfolioOptionItemViewModel activePrepZonePortfolioOptionItemViewModel4 = (ActivePrepZonePortfolioOptionItemViewModel) v();
        activePrepZonePortfolioOptionItemViewModel4.f9865m.observe(this, new xf.v(15, new c(this, 4)));
        ActivePrepZonePortfolioOptionItemViewModel activePrepZonePortfolioOptionItemViewModel5 = (ActivePrepZonePortfolioOptionItemViewModel) v();
        activePrepZonePortfolioOptionItemViewModel5.f9866n.observe(this, new xf.v(15, new c(this, 5)));
        ActivePrepZonePortfolioOptionItemViewModel activePrepZonePortfolioOptionItemViewModel6 = (ActivePrepZonePortfolioOptionItemViewModel) v();
        activePrepZonePortfolioOptionItemViewModel6.f9867o.observe(this, new xf.v(15, new c(this, 6)));
        ActivePrepZonePortfolioOptionItemViewModel activePrepZonePortfolioOptionItemViewModel7 = (ActivePrepZonePortfolioOptionItemViewModel) v();
        activePrepZonePortfolioOptionItemViewModel7.f9868p.observe(this, new xf.v(15, new c(this, 7)));
        ActivePrepZonePortfolioOptionItemViewModel activePrepZonePortfolioOptionItemViewModel8 = (ActivePrepZonePortfolioOptionItemViewModel) v();
        activePrepZonePortfolioOptionItemViewModel8.f9863k.observe(this, new xf.v(15, new c(this, 8)));
        ActivePrepZonePortfolioOptionItemViewModel activePrepZonePortfolioOptionItemViewModel9 = (ActivePrepZonePortfolioOptionItemViewModel) v();
        activePrepZonePortfolioOptionItemViewModel9.f9864l.observe(this, new xf.v(15, new c(this, 9)));
        ActivePrepZonePortfolioOptionItemViewModel activePrepZonePortfolioOptionItemViewModel10 = (ActivePrepZonePortfolioOptionItemViewModel) v();
        activePrepZonePortfolioOptionItemViewModel10.f9862j.observe(this, new xf.v(15, new c(this, 0)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a7 a7Var = (a7) ((z6) this.f17291u);
        a7Var.E = (ActivePrepZonePortfolioOptionItemViewModel) v();
        synchronized (a7Var) {
            a7Var.G |= 2;
        }
        a7Var.a(24);
        a7Var.m();
        ((z6) this.f17291u).p(this);
    }
}
