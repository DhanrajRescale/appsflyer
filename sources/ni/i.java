package ni;

import android.view.View;
import androidx.lifecycle.v;
import com.assetgro.stockgro.ui.stock.list.StockItemViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends gd.o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f28736y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final l f28737x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(androidx.recyclerview.widget.RecyclerView r5, ni.l r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = ba.vc.f6423x
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558634(0x7f0d00ea, float:1.874259E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.vc r5 = (ba.vc) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f28737x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.i.<init>(androidx.recyclerview.widget.RecyclerView, ni.l):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new StockItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        StockItemViewModel stockItemViewModel = (StockItemViewModel) v();
        stockItemViewModel.f10245g.observe(this, new li.c(6, new h(this, 0)));
        StockItemViewModel stockItemViewModel2 = (StockItemViewModel) v();
        stockItemViewModel2.f10246h.observe(this, new li.c(6, new h(this, 1)));
        StockItemViewModel stockItemViewModel3 = (StockItemViewModel) v();
        stockItemViewModel3.f10247i.observe(this, new li.c(6, new h(this, 2)));
        StockItemViewModel stockItemViewModel4 = (StockItemViewModel) v();
        stockItemViewModel4.f10248j.observe(this, new li.c(6, new h(this, 3)));
        StockItemViewModel stockItemViewModel5 = (StockItemViewModel) v();
        stockItemViewModel5.f10249k.observe(this, new li.c(6, new h(this, 4)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new ph.a(this, 7));
    }
}
