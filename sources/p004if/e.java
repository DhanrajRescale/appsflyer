package p004if;

import android.view.View;
import androidx.lifecycle.v;
import ba.f7;
import com.assetgro.stockgro.ui.home.portfolio.list.TopPortfolioItemViewModel;
import da.a;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import re.d;
import xs.b;

/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f19957x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.lang.String r1 = "itemCallback"
            android.view.LayoutInflater r0 = da.e.g(r5, r0, r6, r1)
            int r1 = ba.f7.f4678x
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558552(0x7f0d0098, float:1.8742423E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.f7 r5 = (ba.f7) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f19957x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004if.e.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new TopPortfolioItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        TopPortfolioItemViewModel topPortfolioItemViewModel = (TopPortfolioItemViewModel) v();
        topPortfolioItemViewModel.f9558g.observe(this, new d(12, new d(this, 0)));
        TopPortfolioItemViewModel topPortfolioItemViewModel2 = (TopPortfolioItemViewModel) v();
        topPortfolioItemViewModel2.f9559h.observe(this, new d(12, new d(this, 1)));
        TopPortfolioItemViewModel topPortfolioItemViewModel3 = (TopPortfolioItemViewModel) v();
        topPortfolioItemViewModel3.f9560i.observe(this, new d(12, new d(this, 2)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((f7) this.f17291u).f4683w.setOnClickListener(new c(this, 0));
    }
}
