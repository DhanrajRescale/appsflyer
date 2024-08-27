package bj;

import android.view.View;
import androidx.lifecycle.v;
import ba.tc;
import ba.uc;
import com.assetgro.stockgro.ui.stock.v2.presentation.analysis.StockAnalysisItemViewModel;
import com.assetgro.stockgro.widget.MarketSlider;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends gd.o {

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f7014x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.lang.String r1 = "showNarration"
            android.view.LayoutInflater r0 = da.e.g(r5, r0, r6, r1)
            int r1 = ba.tc.G
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558635(0x7f0d00eb, float:1.8742591E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.tc r5 = (ba.tc) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f7014x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bj.j.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new StockAnalysisItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        StockAnalysisItemViewModel stockAnalysisItemViewModel = (StockAnalysisItemViewModel) v();
        stockAnalysisItemViewModel.f10441h.observe(this, new c(1, new h(this, 0)));
        StockAnalysisItemViewModel stockAnalysisItemViewModel2 = (StockAnalysisItemViewModel) v();
        stockAnalysisItemViewModel2.f10446m.observe(this, new c(1, new h(this, 1)));
        ((StockAnalysisItemViewModel) v()).f10443j.observe(this, new c(1, new h(this, 2)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        uc ucVar = (uc) ((tc) this.f17291u);
        ucVar.F = (StockAnalysisItemViewModel) v();
        synchronized (ucVar) {
            ucVar.J |= 32;
        }
        ucVar.a(24);
        ucVar.m();
        ((tc) this.f17291u).p(this);
        MarketSlider marketSlider = ((tc) this.f17291u).f6188x;
        final int i10 = 0;
        marketSlider.setOnValueChangeListener(new i(this, 0));
        marketSlider.setOnInfoTapListener(new i(this, 0));
        MarketSlider marketSlider2 = ((tc) this.f17291u).f6189y;
        final int i11 = 1;
        marketSlider2.setOnValueChangeListener(new i(this, 1));
        marketSlider2.setOnInfoTapListener(new i(this, 1));
        MarketSlider marketSlider3 = ((tc) this.f17291u).f6190z;
        final int i12 = 2;
        marketSlider3.setOnValueChangeListener(new i(this, 2));
        marketSlider3.setOnInfoTapListener(new i(this, 2));
        ((tc) this.f17291u).f6183s.setOnClickListener(new View.OnClickListener(this) { // from class: bj.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f7009b;

            {
                this.f7009b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zi.k kVar;
                int i13 = i10;
                j this$0 = this.f7009b;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        zi.l lVar = (zi.l) ((StockAnalysisItemViewModel) this$0.v()).f9075c.getValue();
                        if (lVar != null && (kVar = lVar.f42494a) != null) {
                            this$0.f7014x.invoke(kVar);
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockAnalysisItemViewModel) this$0.v()).f();
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockAnalysisItemViewModel) this$0.v()).f();
                        return;
                }
            }
        });
        ((tc) this.f17291u).E.setOnClickListener(new View.OnClickListener(this) { // from class: bj.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f7009b;

            {
                this.f7009b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zi.k kVar;
                int i13 = i11;
                j this$0 = this.f7009b;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        zi.l lVar = (zi.l) ((StockAnalysisItemViewModel) this$0.v()).f9075c.getValue();
                        if (lVar != null && (kVar = lVar.f42494a) != null) {
                            this$0.f7014x.invoke(kVar);
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockAnalysisItemViewModel) this$0.v()).f();
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockAnalysisItemViewModel) this$0.v()).f();
                        return;
                }
            }
        });
        ((tc) this.f17291u).D.setOnClickListener(new View.OnClickListener(this) { // from class: bj.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f7009b;

            {
                this.f7009b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zi.k kVar;
                int i13 = i12;
                j this$0 = this.f7009b;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        zi.l lVar = (zi.l) ((StockAnalysisItemViewModel) this$0.v()).f9075c.getValue();
                        if (lVar != null && (kVar = lVar.f42494a) != null) {
                            this$0.f7014x.invoke(kVar);
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockAnalysisItemViewModel) this$0.v()).f();
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((StockAnalysisItemViewModel) this$0.v()).f();
                        return;
                }
            }
        });
    }
}
