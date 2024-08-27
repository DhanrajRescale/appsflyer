package tg;

import android.view.View;
import androidx.lifecycle.v;
import ba.pb;
import com.assetgro.stockgro.data.model.portfolio.orders.Bought;
import com.assetgro.stockgro.ui.portfolio.orders.OrderItemViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends gd.o {

    /* renamed from: x, reason: collision with root package name */
    public final Function2 f36074x;

    /* renamed from: y, reason: collision with root package name */
    public final Function2 f36075y;

    /* renamed from: z, reason: collision with root package name */
    public final Function1 f36076z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function2 r6, kotlin.jvm.functions.Function2 r7, kotlin.jvm.functions.Function1 r8) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onCancelOrderClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "onModifyOrderClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "onHeaderClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = ba.pb.K
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558618(0x7f0d00da, float:1.8742557E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.pb r5 = (ba.pb) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f36074x = r6
            r4.f36075y = r7
            r4.f36076z = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.r.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new OrderItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        OrderItemViewModel orderItemViewModel = (OrderItemViewModel) v();
        orderItemViewModel.f9892j.observe(this, new xf.v(20, new q(this, 8)));
        OrderItemViewModel orderItemViewModel2 = (OrderItemViewModel) v();
        orderItemViewModel2.f9893k.observe(this, new xf.v(20, new q(this, 9)));
        OrderItemViewModel orderItemViewModel3 = (OrderItemViewModel) v();
        orderItemViewModel3.f9894l.observe(this, new xf.v(20, new q(this, 10)));
        OrderItemViewModel orderItemViewModel4 = (OrderItemViewModel) v();
        orderItemViewModel4.f9901s.observe(this, new xf.v(20, new q(this, 11)));
        OrderItemViewModel orderItemViewModel5 = (OrderItemViewModel) v();
        orderItemViewModel5.f9899q.observe(this, new xf.v(20, new q(this, 12)));
        OrderItemViewModel orderItemViewModel6 = (OrderItemViewModel) v();
        orderItemViewModel6.f9900r.observe(this, new xf.v(20, new q(this, 13)));
        OrderItemViewModel orderItemViewModel7 = (OrderItemViewModel) v();
        orderItemViewModel7.f9898p.observe(this, new xf.v(20, new q(this, 14)));
        OrderItemViewModel orderItemViewModel8 = (OrderItemViewModel) v();
        orderItemViewModel8.f9895m.observe(this, new xf.v(20, new q(this, 15)));
        OrderItemViewModel orderItemViewModel9 = (OrderItemViewModel) v();
        orderItemViewModel9.f9896n.observe(this, new xf.v(20, new q(this, 16)));
        OrderItemViewModel orderItemViewModel10 = (OrderItemViewModel) v();
        orderItemViewModel10.f9897o.observe(this, new xf.v(20, new q(this, 0)));
        OrderItemViewModel orderItemViewModel11 = (OrderItemViewModel) v();
        orderItemViewModel11.f9903u.observe(this, new xf.v(20, new q(this, 1)));
        OrderItemViewModel orderItemViewModel12 = (OrderItemViewModel) v();
        orderItemViewModel12.f9904v.observe(this, new xf.v(20, new q(this, 2)));
        OrderItemViewModel orderItemViewModel13 = (OrderItemViewModel) v();
        orderItemViewModel13.f9905w.observe(this, new xf.v(20, new q(this, 3)));
        OrderItemViewModel orderItemViewModel14 = (OrderItemViewModel) v();
        orderItemViewModel14.f9902t.observe(this, new xf.v(20, new q(this, 4)));
        OrderItemViewModel orderItemViewModel15 = (OrderItemViewModel) v();
        orderItemViewModel15.f9906x.observe(this, new xf.v(20, new q(this, 5)));
        OrderItemViewModel orderItemViewModel16 = (OrderItemViewModel) v();
        orderItemViewModel16.f9907y.observe(this, new xf.v(20, new q(this, 6)));
        ((OrderItemViewModel) v()).f9891i.observe(this, new xf.v(20, new q(this, 7)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m4.m mVar = this.f17291u;
        final int i10 = 0;
        ((pb) mVar).f5755y.setOnClickListener(new View.OnClickListener(this) { // from class: tg.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f36071b;

            {
                this.f36071b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String stockIdentifier;
                String stockIdentifier2;
                int i11 = i10;
                r this$0 = this.f36071b;
                switch (i11) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bought bought = (Bought) ((OrderItemViewModel) this$0.v()).f9075c.getValue();
                        if (bought != null) {
                            this$0.f36074x.invoke(bought, Integer.valueOf(this$0.d()));
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bought bought2 = (Bought) ((OrderItemViewModel) this$0.v()).f9075c.getValue();
                        if (bought2 != null) {
                            this$0.f36075y.invoke(bought2, Integer.valueOf(this$0.d()));
                            return;
                        }
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bought bought3 = (Bought) ((OrderItemViewModel) this$0.v()).f9075c.getValue();
                        if (bought3 != null && (stockIdentifier = bought3.getStockIdentifier()) != null) {
                            this$0.f36076z.invoke(stockIdentifier);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bought bought4 = (Bought) ((OrderItemViewModel) this$0.v()).f9075c.getValue();
                        if (bought4 != null && (stockIdentifier2 = bought4.getStockIdentifier()) != null) {
                            this$0.f36076z.invoke(stockIdentifier2);
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 1;
        ((pb) mVar).D.setOnClickListener(new View.OnClickListener(this) { // from class: tg.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f36071b;

            {
                this.f36071b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String stockIdentifier;
                String stockIdentifier2;
                int i112 = i11;
                r this$0 = this.f36071b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bought bought = (Bought) ((OrderItemViewModel) this$0.v()).f9075c.getValue();
                        if (bought != null) {
                            this$0.f36074x.invoke(bought, Integer.valueOf(this$0.d()));
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bought bought2 = (Bought) ((OrderItemViewModel) this$0.v()).f9075c.getValue();
                        if (bought2 != null) {
                            this$0.f36075y.invoke(bought2, Integer.valueOf(this$0.d()));
                            return;
                        }
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bought bought3 = (Bought) ((OrderItemViewModel) this$0.v()).f9075c.getValue();
                        if (bought3 != null && (stockIdentifier = bought3.getStockIdentifier()) != null) {
                            this$0.f36076z.invoke(stockIdentifier);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bought bought4 = (Bought) ((OrderItemViewModel) this$0.v()).f9075c.getValue();
                        if (bought4 != null && (stockIdentifier2 = bought4.getStockIdentifier()) != null) {
                            this$0.f36076z.invoke(stockIdentifier2);
                            return;
                        }
                        return;
                }
            }
        });
        final int i12 = 2;
        ((pb) mVar).f5752v.setOnClickListener(new View.OnClickListener(this) { // from class: tg.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f36071b;

            {
                this.f36071b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String stockIdentifier;
                String stockIdentifier2;
                int i112 = i12;
                r this$0 = this.f36071b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bought bought = (Bought) ((OrderItemViewModel) this$0.v()).f9075c.getValue();
                        if (bought != null) {
                            this$0.f36074x.invoke(bought, Integer.valueOf(this$0.d()));
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bought bought2 = (Bought) ((OrderItemViewModel) this$0.v()).f9075c.getValue();
                        if (bought2 != null) {
                            this$0.f36075y.invoke(bought2, Integer.valueOf(this$0.d()));
                            return;
                        }
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bought bought3 = (Bought) ((OrderItemViewModel) this$0.v()).f9075c.getValue();
                        if (bought3 != null && (stockIdentifier = bought3.getStockIdentifier()) != null) {
                            this$0.f36076z.invoke(stockIdentifier);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bought bought4 = (Bought) ((OrderItemViewModel) this$0.v()).f9075c.getValue();
                        if (bought4 != null && (stockIdentifier2 = bought4.getStockIdentifier()) != null) {
                            this$0.f36076z.invoke(stockIdentifier2);
                            return;
                        }
                        return;
                }
            }
        });
        final int i13 = 3;
        ((pb) mVar).H.setOnClickListener(new View.OnClickListener(this) { // from class: tg.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f36071b;

            {
                this.f36071b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String stockIdentifier;
                String stockIdentifier2;
                int i112 = i13;
                r this$0 = this.f36071b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bought bought = (Bought) ((OrderItemViewModel) this$0.v()).f9075c.getValue();
                        if (bought != null) {
                            this$0.f36074x.invoke(bought, Integer.valueOf(this$0.d()));
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bought bought2 = (Bought) ((OrderItemViewModel) this$0.v()).f9075c.getValue();
                        if (bought2 != null) {
                            this$0.f36075y.invoke(bought2, Integer.valueOf(this$0.d()));
                            return;
                        }
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bought bought3 = (Bought) ((OrderItemViewModel) this$0.v()).f9075c.getValue();
                        if (bought3 != null && (stockIdentifier = bought3.getStockIdentifier()) != null) {
                            this$0.f36076z.invoke(stockIdentifier);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bought bought4 = (Bought) ((OrderItemViewModel) this$0.v()).f9075c.getValue();
                        if (bought4 != null && (stockIdentifier2 = bought4.getStockIdentifier()) != null) {
                            this$0.f36076z.invoke(stockIdentifier2);
                            return;
                        }
                        return;
                }
            }
        });
    }
}
