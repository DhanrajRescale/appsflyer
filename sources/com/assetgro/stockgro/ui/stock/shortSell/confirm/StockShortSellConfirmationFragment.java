package com.assetgro.stockgro.ui.stock.shortSell.confirm;

import android.os.Bundle;
import android.view.View;
import androidx.activity.x;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import ba.xo;
import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.shortSell.confirm.StockShortSellConfirmationFragment;
import com.assetgro.stockgro.ui.stock.shortSell.confirm.StockSortSellConfirmationViewModel;
import com.assetgro.stockgro.widget.ChipView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import da.f;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import li.c;
import nt.h;
import qj.j;
import qu.i0;
import wi.b;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/shortSell/confirm/StockShortSellConfirmationFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/shortSell/confirm/StockSortSellConfirmationViewModel;", "Lba/xo;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockShortSellConfirmationFragment extends m<StockSortSellConfirmationViewModel, xo> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f10408g = 0;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_short_sell_confirmation;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        StockSortSellConfirmationViewModel stockSortSellConfirmationViewModel = (StockSortSellConfirmationViewModel) r();
        stockSortSellConfirmationViewModel.f10414s.observe(this, new c(26, new b(this, 5)));
        StockSortSellConfirmationViewModel stockSortSellConfirmationViewModel2 = (StockSortSellConfirmationViewModel) r();
        stockSortSellConfirmationViewModel2.f10416u.observe(this, new c(26, new b(this, 6)));
        StockSortSellConfirmationViewModel stockSortSellConfirmationViewModel3 = (StockSortSellConfirmationViewModel) r();
        stockSortSellConfirmationViewModel3.f10415t.observe(this, new c(26, new b(this, 7)));
        StockSortSellConfirmationViewModel stockSortSellConfirmationViewModel4 = (StockSortSellConfirmationViewModel) r();
        stockSortSellConfirmationViewModel4.f10417v.observe(this, new c(26, new b(this, 8)));
        StockSortSellConfirmationViewModel stockSortSellConfirmationViewModel5 = (StockSortSellConfirmationViewModel) r();
        stockSortSellConfirmationViewModel5.f10418w.observe(this, new c(26, new b(this, 9)));
        StockSortSellConfirmationViewModel stockSortSellConfirmationViewModel6 = (StockSortSellConfirmationViewModel) r();
        stockSortSellConfirmationViewModel6.f10420y.observe(this, new c(26, new b(this, 10)));
        StockSortSellConfirmationViewModel stockSortSellConfirmationViewModel7 = (StockSortSellConfirmationViewModel) r();
        stockSortSellConfirmationViewModel7.f10419x.observe(this, new c(26, new b(this, 11)));
        StockSortSellConfirmationViewModel stockSortSellConfirmationViewModel8 = (StockSortSellConfirmationViewModel) r();
        stockSortSellConfirmationViewModel8.f10421z.observe(this, new c(26, new b(this, 12)));
        StockSortSellConfirmationViewModel stockSortSellConfirmationViewModel9 = (StockSortSellConfirmationViewModel) r();
        stockSortSellConfirmationViewModel9.A.observe(this, new c(26, new b(this, 13)));
        StockSortSellConfirmationViewModel stockSortSellConfirmationViewModel10 = (StockSortSellConfirmationViewModel) r();
        stockSortSellConfirmationViewModel10.B.observe(this, new c(26, new b(this, 0)));
        ((StockSortSellConfirmationViewModel) r()).f10411p.observe(this, new c(26, new b(this, 1)));
        ((StockSortSellConfirmationViewModel) r()).f9084g.observe(this, new c(26, new b(this, 2)));
        ((StockSortSellConfirmationViewModel) r()).f10412q.observe(this, new c(26, new b(this, 3)));
        ((StockSortSellConfirmationViewModel) r()).f10413r.observe(this, new c(26, new b(this, 4)));
    }

    @Override // gd.m
    public final void E(View view) {
        StockOrderDto stockOrderDto;
        Intrinsics.checkNotNullParameter(view, "view");
        ((xo) q()).f6673u.setTitle(getString(R.string.confirm_order));
        Toolbar toolbar = ((xo) q()).f6673u;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        p(toolbar);
        Bundle arguments = getArguments();
        if (arguments != null && (stockOrderDto = (StockOrderDto) arguments.getParcelable("STOCK_BUY_ORDER")) != null) {
            ((StockSortSellConfirmationViewModel) r()).f10410o.postValue(stockOrderDto);
        }
        final int i10 = 0;
        ((xo) q()).f6672t.setOnClickListener(new View.OnClickListener(this) { // from class: wi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockShortSellConfirmationFragment f39080b;

            {
                this.f39080b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                StockShortSellConfirmationFragment this$0 = this.f39080b;
                switch (i11) {
                    case 0:
                        int i12 = StockShortSellConfirmationFragment.f10408g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((xo) this$0.q()).f6672t.setClickable(false);
                        StockSortSellConfirmationViewModel stockSortSellConfirmationViewModel = (StockSortSellConfirmationViewModel) this$0.r();
                        StockOrderDto stockOrderDto2 = (StockOrderDto) stockSortSellConfirmationViewModel.f10410o.getValue();
                        if (stockOrderDto2 != null) {
                            stockSortSellConfirmationViewModel.f9084g.postValue(Boolean.TRUE);
                            h c10 = stockSortSellConfirmationViewModel.f10409n.shortSellOrder(stockOrderDto2).c(((kq.e) stockSortSellConfirmationViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new ui.a(15, new e(stockSortSellConfirmationViewModel, 0)), new ui.a(16, new e(stockSortSellConfirmationViewModel, 1)));
                            c10.a(dVar);
                            stockSortSellConfirmationViewModel.f9080c.c(dVar);
                            return;
                        }
                        return;
                    default:
                        int i13 = StockShortSellConfirmationFragment.f10408g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        final int i11 = 1;
        ((xo) q()).f6673u.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: wi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockShortSellConfirmationFragment f39080b;

            {
                this.f39080b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                StockShortSellConfirmationFragment this$0 = this.f39080b;
                switch (i112) {
                    case 0:
                        int i12 = StockShortSellConfirmationFragment.f10408g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((xo) this$0.q()).f6672t.setClickable(false);
                        StockSortSellConfirmationViewModel stockSortSellConfirmationViewModel = (StockSortSellConfirmationViewModel) this$0.r();
                        StockOrderDto stockOrderDto2 = (StockOrderDto) stockSortSellConfirmationViewModel.f10410o.getValue();
                        if (stockOrderDto2 != null) {
                            stockSortSellConfirmationViewModel.f9084g.postValue(Boolean.TRUE);
                            h c10 = stockSortSellConfirmationViewModel.f10409n.shortSellOrder(stockOrderDto2).c(((kq.e) stockSortSellConfirmationViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new ui.a(15, new e(stockSortSellConfirmationViewModel, 0)), new ui.a(16, new e(stockSortSellConfirmationViewModel, 1)));
                            c10.a(dVar);
                            stockSortSellConfirmationViewModel.f9080c.c(dVar);
                            return;
                        }
                        return;
                    default:
                        int i13 = StockShortSellConfirmationFragment.f10408g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        requireActivity().getOnBackPressedDispatcher().a(this, new x(this, 13));
        ChipView chipView = ((xo) q()).f6671s.f4610y;
        String string = getString(R.string.short_sell);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        chipView.setChipText(string);
        chipView.setChipType(j.f32017a);
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
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
        ca.c factory = new ca.c(a0.a(StockSortSellConfirmationViewModel.class), new ea.a(k10, c10, stockRepository, userRepository, 14));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, StockSortSellConfirmationViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockSortSellConfirmationViewModel.class, "<this>", StockSortSellConfirmationViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockSortSellConfirmationViewModel stockSortSellConfirmationViewModel = (StockSortSellConfirmationViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(stockSortSellConfirmationViewModel);
            this.f17284b = stockSortSellConfirmationViewModel;
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
