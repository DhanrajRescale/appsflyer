package og;

import android.view.View;
import androidx.lifecycle.v;
import ba.nb;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.model.UnifiedStockTransaction;
import com.assetgro.stockgro.data.model.UnifiedStockTransactionKt;
import com.assetgro.stockgro.ui.portfolio.holdings.StockHoldingsItemViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends gd.o {
    public final Function1 A;
    public final Function1 B;
    public final Function1 C;

    /* renamed from: x, reason: collision with root package name */
    public final ni.l f30070x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f30071y;

    /* renamed from: z, reason: collision with root package name */
    public final Function1 f30072z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(androidx.recyclerview.widget.RecyclerView r5, ni.l r6, boolean r7, kotlin.jvm.functions.Function1 r8, kotlin.jvm.functions.Function1 r9, kotlin.jvm.functions.Function1 r10, kotlin.jvm.functions.Function1 r11) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onSellClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "onBuyMoreClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "onShortSellMoreClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onSquareOff"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = ba.nb.E
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558617(0x7f0d00d9, float:1.8742555E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.nb r5 = (ba.nb) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f30070x = r6
            r4.f30071y = r7
            r4.f30072z = r8
            r4.A = r9
            r4.B = r10
            r4.C = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: og.r.<init>(androidx.recyclerview.widget.RecyclerView, ni.l, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    public final void A() {
        StockDto stockDto;
        ni.l lVar;
        UnifiedStockTransaction unifiedStockTransaction = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) v()).f9075c.getValue();
        if (unifiedStockTransaction != null) {
            stockDto = UnifiedStockTransactionKt.toStockDto(unifiedStockTransaction);
        } else {
            stockDto = null;
        }
        if (stockDto != null && (lVar = this.f30070x) != null) {
            lVar.c(stockDto);
        }
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new StockHoldingsItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        StockHoldingsItemViewModel stockHoldingsItemViewModel = (StockHoldingsItemViewModel) v();
        stockHoldingsItemViewModel.f9847g.observe(this, new xf.v(14, new q(this, 3)));
        StockHoldingsItemViewModel stockHoldingsItemViewModel2 = (StockHoldingsItemViewModel) v();
        stockHoldingsItemViewModel2.f9848h.observe(this, new xf.v(14, new q(this, 4)));
        StockHoldingsItemViewModel stockHoldingsItemViewModel3 = (StockHoldingsItemViewModel) v();
        stockHoldingsItemViewModel3.f9850j.observe(this, new xf.v(14, new q(this, 5)));
        StockHoldingsItemViewModel stockHoldingsItemViewModel4 = (StockHoldingsItemViewModel) v();
        stockHoldingsItemViewModel4.f9851k.observe(this, new xf.v(14, new q(this, 6)));
        StockHoldingsItemViewModel stockHoldingsItemViewModel5 = (StockHoldingsItemViewModel) v();
        stockHoldingsItemViewModel5.f9852l.observe(this, new xf.v(14, new q(this, 7)));
        StockHoldingsItemViewModel stockHoldingsItemViewModel6 = (StockHoldingsItemViewModel) v();
        stockHoldingsItemViewModel6.f9853m.observe(this, new xf.v(14, new q(this, 8)));
        StockHoldingsItemViewModel stockHoldingsItemViewModel7 = (StockHoldingsItemViewModel) v();
        stockHoldingsItemViewModel7.f9854n.observe(this, new xf.v(14, new q(this, 9)));
        StockHoldingsItemViewModel stockHoldingsItemViewModel8 = (StockHoldingsItemViewModel) v();
        stockHoldingsItemViewModel8.f9855o.observe(this, new xf.v(14, new q(this, 10)));
        StockHoldingsItemViewModel stockHoldingsItemViewModel9 = (StockHoldingsItemViewModel) v();
        stockHoldingsItemViewModel9.f9849i.observe(this, new xf.v(14, new q(this, 11)));
        StockHoldingsItemViewModel stockHoldingsItemViewModel10 = (StockHoldingsItemViewModel) v();
        stockHoldingsItemViewModel10.f9856p.observe(this, new xf.v(14, new q(this, 0)));
        StockHoldingsItemViewModel stockHoldingsItemViewModel11 = (StockHoldingsItemViewModel) v();
        stockHoldingsItemViewModel11.f9857q.observe(this, new xf.v(14, new q(this, 1)));
        StockHoldingsItemViewModel stockHoldingsItemViewModel12 = (StockHoldingsItemViewModel) v();
        stockHoldingsItemViewModel12.f9858r.observe(this, new xf.v(14, new q(this, 2)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m4.m mVar = this.f17291u;
        final int i10 = 0;
        ((nb) mVar).f5551x.setOnClickListener(new View.OnClickListener(this) { // from class: og.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f30067b;

            {
                this.f30067b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String code;
                String code2;
                String code3;
                String code4;
                int i11 = i10;
                r this$0 = this.f30067b;
                switch (i11) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction != null && (code = unifiedStockTransaction.getCode()) != null) {
                            this$0.A.invoke(code);
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction2 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction2 != null && (code2 = unifiedStockTransaction2.getCode()) != null) {
                            this$0.f30072z.invoke(code2);
                            return;
                        }
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction3 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction3 != null && (code3 = unifiedStockTransaction3.getCode()) != null) {
                            this$0.C.invoke(code3);
                            return;
                        }
                        return;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction4 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction4 != null && (code4 = unifiedStockTransaction4.getCode()) != null) {
                            this$0.B.invoke(code4);
                            return;
                        }
                        return;
                    case 4:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A();
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A();
                        return;
                }
            }
        });
        final int i11 = 1;
        ((nb) mVar).f5552y.setOnClickListener(new View.OnClickListener(this) { // from class: og.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f30067b;

            {
                this.f30067b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String code;
                String code2;
                String code3;
                String code4;
                int i112 = i11;
                r this$0 = this.f30067b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction != null && (code = unifiedStockTransaction.getCode()) != null) {
                            this$0.A.invoke(code);
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction2 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction2 != null && (code2 = unifiedStockTransaction2.getCode()) != null) {
                            this$0.f30072z.invoke(code2);
                            return;
                        }
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction3 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction3 != null && (code3 = unifiedStockTransaction3.getCode()) != null) {
                            this$0.C.invoke(code3);
                            return;
                        }
                        return;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction4 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction4 != null && (code4 = unifiedStockTransaction4.getCode()) != null) {
                            this$0.B.invoke(code4);
                            return;
                        }
                        return;
                    case 4:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A();
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A();
                        return;
                }
            }
        });
        final int i12 = 2;
        ((nb) mVar).f5549v.setOnClickListener(new View.OnClickListener(this) { // from class: og.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f30067b;

            {
                this.f30067b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String code;
                String code2;
                String code3;
                String code4;
                int i112 = i12;
                r this$0 = this.f30067b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction != null && (code = unifiedStockTransaction.getCode()) != null) {
                            this$0.A.invoke(code);
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction2 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction2 != null && (code2 = unifiedStockTransaction2.getCode()) != null) {
                            this$0.f30072z.invoke(code2);
                            return;
                        }
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction3 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction3 != null && (code3 = unifiedStockTransaction3.getCode()) != null) {
                            this$0.C.invoke(code3);
                            return;
                        }
                        return;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction4 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction4 != null && (code4 = unifiedStockTransaction4.getCode()) != null) {
                            this$0.B.invoke(code4);
                            return;
                        }
                        return;
                    case 4:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A();
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A();
                        return;
                }
            }
        });
        final int i13 = 3;
        ((nb) mVar).f5550w.setOnClickListener(new View.OnClickListener(this) { // from class: og.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f30067b;

            {
                this.f30067b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String code;
                String code2;
                String code3;
                String code4;
                int i112 = i13;
                r this$0 = this.f30067b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction != null && (code = unifiedStockTransaction.getCode()) != null) {
                            this$0.A.invoke(code);
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction2 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction2 != null && (code2 = unifiedStockTransaction2.getCode()) != null) {
                            this$0.f30072z.invoke(code2);
                            return;
                        }
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction3 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction3 != null && (code3 = unifiedStockTransaction3.getCode()) != null) {
                            this$0.C.invoke(code3);
                            return;
                        }
                        return;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction4 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction4 != null && (code4 = unifiedStockTransaction4.getCode()) != null) {
                            this$0.B.invoke(code4);
                            return;
                        }
                        return;
                    case 4:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A();
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A();
                        return;
                }
            }
        });
        final int i14 = 4;
        ((nb) mVar).C.setOnClickListener(new View.OnClickListener(this) { // from class: og.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f30067b;

            {
                this.f30067b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String code;
                String code2;
                String code3;
                String code4;
                int i112 = i14;
                r this$0 = this.f30067b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction != null && (code = unifiedStockTransaction.getCode()) != null) {
                            this$0.A.invoke(code);
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction2 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction2 != null && (code2 = unifiedStockTransaction2.getCode()) != null) {
                            this$0.f30072z.invoke(code2);
                            return;
                        }
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction3 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction3 != null && (code3 = unifiedStockTransaction3.getCode()) != null) {
                            this$0.C.invoke(code3);
                            return;
                        }
                        return;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction4 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction4 != null && (code4 = unifiedStockTransaction4.getCode()) != null) {
                            this$0.B.invoke(code4);
                            return;
                        }
                        return;
                    case 4:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A();
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A();
                        return;
                }
            }
        });
        final int i15 = 5;
        ((nb) mVar).B.setOnClickListener(new View.OnClickListener(this) { // from class: og.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f30067b;

            {
                this.f30067b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String code;
                String code2;
                String code3;
                String code4;
                int i112 = i15;
                r this$0 = this.f30067b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction != null && (code = unifiedStockTransaction.getCode()) != null) {
                            this$0.A.invoke(code);
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction2 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction2 != null && (code2 = unifiedStockTransaction2.getCode()) != null) {
                            this$0.f30072z.invoke(code2);
                            return;
                        }
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction3 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction3 != null && (code3 = unifiedStockTransaction3.getCode()) != null) {
                            this$0.C.invoke(code3);
                            return;
                        }
                        return;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UnifiedStockTransaction unifiedStockTransaction4 = (UnifiedStockTransaction) ((StockHoldingsItemViewModel) this$0.v()).f9075c.getValue();
                        if (unifiedStockTransaction4 != null && (code4 = unifiedStockTransaction4.getCode()) != null) {
                            this$0.B.invoke(code4);
                            return;
                        }
                        return;
                    case 4:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A();
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A();
                        return;
                }
            }
        });
    }
}
