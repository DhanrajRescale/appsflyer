package com.assetgro.stockgro.ui.stock.detail.order;

import android.os.Bundle;
import android.view.View;
import androidx.activity.x;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import ba.lo;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderConfirmationFragment;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderConfirmationViewModel;
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
import mi.b;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/detail/order/StockOrderConfirmationFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/detail/order/StockOrderConfirmationViewModel;", "Lba/lo;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockOrderConfirmationFragment extends m<StockOrderConfirmationViewModel, lo> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f10205g = 0;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_order_confirmation;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        StockOrderConfirmationViewModel stockOrderConfirmationViewModel = (StockOrderConfirmationViewModel) r();
        stockOrderConfirmationViewModel.f10211s.observe(this, new c(1, new b(this, 5)));
        StockOrderConfirmationViewModel stockOrderConfirmationViewModel2 = (StockOrderConfirmationViewModel) r();
        stockOrderConfirmationViewModel2.f10213u.observe(this, new c(1, new b(this, 6)));
        StockOrderConfirmationViewModel stockOrderConfirmationViewModel3 = (StockOrderConfirmationViewModel) r();
        stockOrderConfirmationViewModel3.f10212t.observe(this, new c(1, new b(this, 7)));
        StockOrderConfirmationViewModel stockOrderConfirmationViewModel4 = (StockOrderConfirmationViewModel) r();
        stockOrderConfirmationViewModel4.f10214v.observe(this, new c(1, new b(this, 8)));
        StockOrderConfirmationViewModel stockOrderConfirmationViewModel5 = (StockOrderConfirmationViewModel) r();
        stockOrderConfirmationViewModel5.f10215w.observe(this, new c(1, new b(this, 9)));
        StockOrderConfirmationViewModel stockOrderConfirmationViewModel6 = (StockOrderConfirmationViewModel) r();
        stockOrderConfirmationViewModel6.f10217y.observe(this, new c(1, new b(this, 10)));
        StockOrderConfirmationViewModel stockOrderConfirmationViewModel7 = (StockOrderConfirmationViewModel) r();
        stockOrderConfirmationViewModel7.f10216x.observe(this, new c(1, new b(this, 11)));
        StockOrderConfirmationViewModel stockOrderConfirmationViewModel8 = (StockOrderConfirmationViewModel) r();
        stockOrderConfirmationViewModel8.f10218z.observe(this, new c(1, new b(this, 12)));
        StockOrderConfirmationViewModel stockOrderConfirmationViewModel9 = (StockOrderConfirmationViewModel) r();
        stockOrderConfirmationViewModel9.A.observe(this, new c(1, new b(this, 13)));
        StockOrderConfirmationViewModel stockOrderConfirmationViewModel10 = (StockOrderConfirmationViewModel) r();
        stockOrderConfirmationViewModel10.B.observe(this, new c(1, new b(this, 0)));
        ((StockOrderConfirmationViewModel) r()).f10208p.observe(this, new c(1, new b(this, 1)));
        ((StockOrderConfirmationViewModel) r()).f9084g.observe(this, new c(1, new b(this, 2)));
        ((StockOrderConfirmationViewModel) r()).f10209q.observe(this, new c(1, new b(this, 3)));
        ((StockOrderConfirmationViewModel) r()).f10210r.observe(this, new c(1, new b(this, 4)));
    }

    @Override // gd.m
    public final void E(View view) {
        StockOrderDto stockOrderDto;
        Intrinsics.checkNotNullParameter(view, "view");
        lo loVar = (lo) q();
        String string = getString(R.string.confirm_order);
        Toolbar toolbar = loVar.f5380u;
        toolbar.setTitle(string);
        p(toolbar);
        final int i10 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: mi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockOrderConfirmationFragment f27760b;

            {
                this.f27760b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                StockOrderConfirmationFragment this$0 = this.f27760b;
                switch (i11) {
                    case 0:
                        int i12 = StockOrderConfirmationFragment.f10205g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                    default:
                        int i13 = StockOrderConfirmationFragment.f10205g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((lo) this$0.q()).f5378s.setClickable(false);
                        StockOrderConfirmationViewModel stockOrderConfirmationViewModel = (StockOrderConfirmationViewModel) this$0.r();
                        if (!WifiService.INSTANCE.getInstance().isOnline()) {
                            stockOrderConfirmationViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                            return;
                        }
                        StockOrderDto stockOrderDto2 = (StockOrderDto) stockOrderConfirmationViewModel.f10207o.getValue();
                        if (stockOrderDto2 != null) {
                            stockOrderConfirmationViewModel.f9084g.postValue(Boolean.TRUE);
                            nt.h c10 = stockOrderConfirmationViewModel.f10206n.buyOrder(stockOrderDto2).c(((kq.e) stockOrderConfirmationViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new hi.c(19, new e(stockOrderConfirmationViewModel, 0)), new hi.c(20, new e(stockOrderConfirmationViewModel, 1)));
                            c10.a(dVar);
                            stockOrderConfirmationViewModel.f9080c.c(dVar);
                            return;
                        }
                        return;
                }
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null && (stockOrderDto = (StockOrderDto) arguments.getParcelable("STOCK_BUY_ORDER")) != null) {
            ((StockOrderConfirmationViewModel) r()).f10207o.postValue(stockOrderDto);
        }
        final int i11 = 1;
        ((lo) q()).f5378s.setOnClickListener(new View.OnClickListener(this) { // from class: mi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockOrderConfirmationFragment f27760b;

            {
                this.f27760b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                StockOrderConfirmationFragment this$0 = this.f27760b;
                switch (i112) {
                    case 0:
                        int i12 = StockOrderConfirmationFragment.f10205g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                    default:
                        int i13 = StockOrderConfirmationFragment.f10205g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((lo) this$0.q()).f5378s.setClickable(false);
                        StockOrderConfirmationViewModel stockOrderConfirmationViewModel = (StockOrderConfirmationViewModel) this$0.r();
                        if (!WifiService.INSTANCE.getInstance().isOnline()) {
                            stockOrderConfirmationViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                            return;
                        }
                        StockOrderDto stockOrderDto2 = (StockOrderDto) stockOrderConfirmationViewModel.f10207o.getValue();
                        if (stockOrderDto2 != null) {
                            stockOrderConfirmationViewModel.f9084g.postValue(Boolean.TRUE);
                            nt.h c10 = stockOrderConfirmationViewModel.f10206n.buyOrder(stockOrderDto2).c(((kq.e) stockOrderConfirmationViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new hi.c(19, new e(stockOrderConfirmationViewModel, 0)), new hi.c(20, new e(stockOrderConfirmationViewModel, 1)));
                            c10.a(dVar);
                            stockOrderConfirmationViewModel.f9080c.c(dVar);
                            return;
                        }
                        return;
                }
            }
        });
        requireActivity().getOnBackPressedDispatcher().a(this, new x(this, 6));
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
        ca.c factory = new ca.c(a0.a(StockOrderConfirmationViewModel.class), new ea.a(k10, c10, stockRepository, userRepository, 11));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, StockOrderConfirmationViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockOrderConfirmationViewModel.class, "<this>", StockOrderConfirmationViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockOrderConfirmationViewModel stockOrderConfirmationViewModel = (StockOrderConfirmationViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(stockOrderConfirmationViewModel);
            this.f17284b = stockOrderConfirmationViewModel;
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
