package lg;

import android.view.View;
import androidx.lifecycle.v;
import ba.lb;
import com.assetgro.stockgro.data.model.portfolio.HistoryOrderDto;
import com.assetgro.stockgro.ui.portfolio.history.HistoryItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends o {

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f24845x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.lang.String r1 = "onHeaderClick"
            android.view.LayoutInflater r0 = da.e.g(r5, r0, r6, r1)
            int r1 = ba.lb.A
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558616(0x7f0d00d8, float:1.8742553E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.lb r5 = (ba.lb) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f24845x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.n.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new HistoryItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        HistoryItemViewModel historyItemViewModel = (HistoryItemViewModel) v();
        historyItemViewModel.f9803g.observe(this, new xf.v(11, new m(this, 0)));
        HistoryItemViewModel historyItemViewModel2 = (HistoryItemViewModel) v();
        historyItemViewModel2.f9805i.observe(this, new xf.v(11, new m(this, 1)));
        HistoryItemViewModel historyItemViewModel3 = (HistoryItemViewModel) v();
        historyItemViewModel3.f9807k.observe(this, new xf.v(11, new m(this, 2)));
        HistoryItemViewModel historyItemViewModel4 = (HistoryItemViewModel) v();
        historyItemViewModel4.f9809m.observe(this, new xf.v(11, new m(this, 3)));
        HistoryItemViewModel historyItemViewModel5 = (HistoryItemViewModel) v();
        historyItemViewModel5.f9808l.observe(this, new xf.v(11, new m(this, 4)));
        HistoryItemViewModel historyItemViewModel6 = (HistoryItemViewModel) v();
        historyItemViewModel6.f9804h.observe(this, new xf.v(11, new m(this, 5)));
        HistoryItemViewModel historyItemViewModel7 = (HistoryItemViewModel) v();
        historyItemViewModel7.f9806j.observe(this, new xf.v(11, new m(this, 6)));
        HistoryItemViewModel historyItemViewModel8 = (HistoryItemViewModel) v();
        historyItemViewModel8.f9810n.observe(this, new xf.v(11, new m(this, 7)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m4.m mVar = this.f17291u;
        final int i10 = 0;
        ((lb) mVar).f5347x.setOnClickListener(new View.OnClickListener(this) { // from class: lg.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f24842b;

            {
                this.f24842b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String stockIdentifier;
                String stockIdentifier2;
                int i11 = i10;
                n this$0 = this.f24842b;
                switch (i11) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        HistoryOrderDto historyOrderDto = (HistoryOrderDto) ((HistoryItemViewModel) this$0.v()).f9075c.getValue();
                        if (historyOrderDto != null && (stockIdentifier = historyOrderDto.getStockIdentifier()) != null) {
                            this$0.f24845x.invoke(stockIdentifier);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        HistoryOrderDto historyOrderDto2 = (HistoryOrderDto) ((HistoryItemViewModel) this$0.v()).f9075c.getValue();
                        if (historyOrderDto2 != null && (stockIdentifier2 = historyOrderDto2.getStockIdentifier()) != null) {
                            this$0.f24845x.invoke(stockIdentifier2);
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 1;
        ((lb) mVar).f5348y.setOnClickListener(new View.OnClickListener(this) { // from class: lg.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f24842b;

            {
                this.f24842b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String stockIdentifier;
                String stockIdentifier2;
                int i112 = i11;
                n this$0 = this.f24842b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        HistoryOrderDto historyOrderDto = (HistoryOrderDto) ((HistoryItemViewModel) this$0.v()).f9075c.getValue();
                        if (historyOrderDto != null && (stockIdentifier = historyOrderDto.getStockIdentifier()) != null) {
                            this$0.f24845x.invoke(stockIdentifier);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        HistoryOrderDto historyOrderDto2 = (HistoryOrderDto) ((HistoryItemViewModel) this$0.v()).f9075c.getValue();
                        if (historyOrderDto2 != null && (stockIdentifier2 = historyOrderDto2.getStockIdentifier()) != null) {
                            this$0.f24845x.invoke(stockIdentifier2);
                            return;
                        }
                        return;
                }
            }
        });
    }
}
