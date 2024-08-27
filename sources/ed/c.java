package ed;

import android.view.View;
import androidx.lifecycle.v;
import com.assetgro.stockgro.ui.arena.detail.pre.prize.PrizeDistributionItemViewModel;
import gd.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends o {
    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new PrizeDistributionItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        PrizeDistributionItemViewModel prizeDistributionItemViewModel = (PrizeDistributionItemViewModel) v();
        prizeDistributionItemViewModel.f9061h.observe(this, new eb.c(23, new b(this, 0)));
        PrizeDistributionItemViewModel prizeDistributionItemViewModel2 = (PrizeDistributionItemViewModel) v();
        prizeDistributionItemViewModel2.f9062i.observe(this, new eb.c(23, new b(this, 1)));
        PrizeDistributionItemViewModel prizeDistributionItemViewModel3 = (PrizeDistributionItemViewModel) v();
        prizeDistributionItemViewModel3.f9060g.observe(this, new eb.c(23, new b(this, 2)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
