package com.assetgro.stockgro.ui.stock.modify.short_sell;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import ba.xk;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.modify.short_sell.StockModifyShortSellOrderConfirmationFragment;
import com.assetgro.stockgro.ui.stock.modify.short_sell.StockModifyShortSellOrderConfirmationViewModel;
import com.assetgro.stockgro.widget.ChipView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import da.b;
import da.f;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import li.c;
import qu.i0;
import ti.j;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/short_sell/StockModifyShortSellOrderConfirmationFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/modify/short_sell/StockModifyShortSellOrderConfirmationViewModel;", "Lba/xk;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockModifyShortSellOrderConfirmationFragment extends m<StockModifyShortSellOrderConfirmationViewModel, xk> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f10371g = 0;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_modify_short_sell_order_confirmation;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        StockModifyShortSellOrderConfirmationViewModel stockModifyShortSellOrderConfirmationViewModel = (StockModifyShortSellOrderConfirmationViewModel) r();
        stockModifyShortSellOrderConfirmationViewModel.f10376r.observe(this, new c(21, new j(this, 4)));
        StockModifyShortSellOrderConfirmationViewModel stockModifyShortSellOrderConfirmationViewModel2 = (StockModifyShortSellOrderConfirmationViewModel) r();
        stockModifyShortSellOrderConfirmationViewModel2.f10378t.observe(this, new c(21, new j(this, 5)));
        StockModifyShortSellOrderConfirmationViewModel stockModifyShortSellOrderConfirmationViewModel3 = (StockModifyShortSellOrderConfirmationViewModel) r();
        stockModifyShortSellOrderConfirmationViewModel3.f10377s.observe(this, new c(21, new j(this, 6)));
        StockModifyShortSellOrderConfirmationViewModel stockModifyShortSellOrderConfirmationViewModel4 = (StockModifyShortSellOrderConfirmationViewModel) r();
        stockModifyShortSellOrderConfirmationViewModel4.f10379u.observe(this, new c(21, new j(this, 7)));
        StockModifyShortSellOrderConfirmationViewModel stockModifyShortSellOrderConfirmationViewModel5 = (StockModifyShortSellOrderConfirmationViewModel) r();
        stockModifyShortSellOrderConfirmationViewModel5.f10380v.observe(this, new c(21, new j(this, 8)));
        StockModifyShortSellOrderConfirmationViewModel stockModifyShortSellOrderConfirmationViewModel6 = (StockModifyShortSellOrderConfirmationViewModel) r();
        stockModifyShortSellOrderConfirmationViewModel6.f10382x.observe(this, new c(21, new j(this, 9)));
        StockModifyShortSellOrderConfirmationViewModel stockModifyShortSellOrderConfirmationViewModel7 = (StockModifyShortSellOrderConfirmationViewModel) r();
        stockModifyShortSellOrderConfirmationViewModel7.f10381w.observe(this, new c(21, new j(this, 10)));
        StockModifyShortSellOrderConfirmationViewModel stockModifyShortSellOrderConfirmationViewModel8 = (StockModifyShortSellOrderConfirmationViewModel) r();
        stockModifyShortSellOrderConfirmationViewModel8.f10383y.observe(this, new c(21, new j(this, 11)));
        StockModifyShortSellOrderConfirmationViewModel stockModifyShortSellOrderConfirmationViewModel9 = (StockModifyShortSellOrderConfirmationViewModel) r();
        stockModifyShortSellOrderConfirmationViewModel9.f10384z.observe(this, new c(21, new j(this, 12)));
        StockModifyShortSellOrderConfirmationViewModel stockModifyShortSellOrderConfirmationViewModel10 = (StockModifyShortSellOrderConfirmationViewModel) r();
        stockModifyShortSellOrderConfirmationViewModel10.A.observe(this, new c(21, new j(this, 0)));
        ((StockModifyShortSellOrderConfirmationViewModel) r()).f10374p.observe(this, new c(21, new j(this, 1)));
        ((StockModifyShortSellOrderConfirmationViewModel) r()).f9084g.observe(this, new c(21, new j(this, 2)));
        ((StockModifyShortSellOrderConfirmationViewModel) r()).f10375q.observe(this, new c(21, new j(this, 3)));
    }

    @Override // gd.m
    public final void E(View view) {
        ModifyOrderDto modifyOrderDto;
        Intrinsics.checkNotNullParameter(view, "view");
        ((xk) q()).f6667u.setTitle(getString(R.string.confirm_order));
        Toolbar toolbar = ((xk) q()).f6667u;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        p(toolbar);
        Bundle arguments = getArguments();
        if (arguments != null && (modifyOrderDto = (ModifyOrderDto) arguments.getParcelable("STOCK_MODIFY_BUY_ORDER")) != null) {
            ((StockModifyShortSellOrderConfirmationViewModel) r()).f10373o.postValue(modifyOrderDto);
        }
        final int i10 = 0;
        ((xk) q()).f6666t.setOnClickListener(new View.OnClickListener(this) { // from class: ti.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockModifyShortSellOrderConfirmationFragment f36123b;

            {
                this.f36123b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                StockModifyShortSellOrderConfirmationFragment this$0 = this.f36123b;
                switch (i11) {
                    case 0:
                        int i12 = StockModifyShortSellOrderConfirmationFragment.f10371g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockModifyShortSellOrderConfirmationViewModel stockModifyShortSellOrderConfirmationViewModel = (StockModifyShortSellOrderConfirmationViewModel) this$0.r();
                        ModifyOrderDto modifyOrderDto2 = (ModifyOrderDto) stockModifyShortSellOrderConfirmationViewModel.f10373o.getValue();
                        if (modifyOrderDto2 != null) {
                            stockModifyShortSellOrderConfirmationViewModel.f9084g.postValue(Boolean.TRUE);
                            nt.h c10 = stockModifyShortSellOrderConfirmationViewModel.f10372n.modifyOrders(modifyOrderDto2).c(((kq.e) stockModifyShortSellOrderConfirmationViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new si.f(28, new m(stockModifyShortSellOrderConfirmationViewModel, 0)), new si.f(29, new m(stockModifyShortSellOrderConfirmationViewModel, 1)));
                            c10.a(dVar);
                            stockModifyShortSellOrderConfirmationViewModel.f9080c.c(dVar);
                            return;
                        }
                        return;
                    default:
                        int i13 = StockModifyShortSellOrderConfirmationFragment.f10371g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                }
            }
        });
        final int i11 = 1;
        ((xk) q()).f6667u.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ti.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockModifyShortSellOrderConfirmationFragment f36123b;

            {
                this.f36123b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                StockModifyShortSellOrderConfirmationFragment this$0 = this.f36123b;
                switch (i112) {
                    case 0:
                        int i12 = StockModifyShortSellOrderConfirmationFragment.f10371g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockModifyShortSellOrderConfirmationViewModel stockModifyShortSellOrderConfirmationViewModel = (StockModifyShortSellOrderConfirmationViewModel) this$0.r();
                        ModifyOrderDto modifyOrderDto2 = (ModifyOrderDto) stockModifyShortSellOrderConfirmationViewModel.f10373o.getValue();
                        if (modifyOrderDto2 != null) {
                            stockModifyShortSellOrderConfirmationViewModel.f9084g.postValue(Boolean.TRUE);
                            nt.h c10 = stockModifyShortSellOrderConfirmationViewModel.f10372n.modifyOrders(modifyOrderDto2).c(((kq.e) stockModifyShortSellOrderConfirmationViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new si.f(28, new m(stockModifyShortSellOrderConfirmationViewModel, 0)), new si.f(29, new m(stockModifyShortSellOrderConfirmationViewModel, 1)));
                            c10.a(dVar);
                            stockModifyShortSellOrderConfirmationViewModel.f9080c.c(dVar);
                            return;
                        }
                        return;
                    default:
                        int i13 = StockModifyShortSellOrderConfirmationFragment.f10371g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                }
            }
        });
        ChipView chipView = ((xk) q()).f6665s.f4602y;
        String string = getString(R.string.short_sell);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        chipView.setChipText(string);
        chipView.setChipType(qj.j.f32017a);
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        a c10 = bVar.c();
        StockRepository stockRepository = bVar.l();
        g.i(stockRepository);
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(StockModifyShortSellOrderConfirmationViewModel.class), new ea.a(k10, c10, stockRepository, userRepository, 10));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, StockModifyShortSellOrderConfirmationViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockModifyShortSellOrderConfirmationViewModel.class, "<this>", StockModifyShortSellOrderConfirmationViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockModifyShortSellOrderConfirmationViewModel stockModifyShortSellOrderConfirmationViewModel = (StockModifyShortSellOrderConfirmationViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(stockModifyShortSellOrderConfirmationViewModel);
            this.f17284b = stockModifyShortSellOrderConfirmationViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            g.i(h11);
            this.f17287e = h11;
            fragmentComponent.l();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
