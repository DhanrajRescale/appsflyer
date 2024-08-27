package com.assetgro.stockgro.ui.stock.modify.buy;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import ba.vk;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.modify.buy.StockModifyOrderConfirmationFragment;
import com.assetgro.stockgro.ui.stock.modify.buy.StockModifyOrderConfirmationViewModel;
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
import ni.q;
import pi.k;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/buy/StockModifyOrderConfirmationFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/modify/buy/StockModifyOrderConfirmationViewModel;", "Lba/vk;", "<init>", "()V", "ni/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockModifyOrderConfirmationFragment extends m<StockModifyOrderConfirmationViewModel, vk> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f10286g = 0;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_modify_order_confirmation;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        StockModifyOrderConfirmationViewModel stockModifyOrderConfirmationViewModel = (StockModifyOrderConfirmationViewModel) r();
        stockModifyOrderConfirmationViewModel.f10291r.observe(this, new c(12, new k(this, 4)));
        StockModifyOrderConfirmationViewModel stockModifyOrderConfirmationViewModel2 = (StockModifyOrderConfirmationViewModel) r();
        stockModifyOrderConfirmationViewModel2.f10293t.observe(this, new c(12, new k(this, 5)));
        StockModifyOrderConfirmationViewModel stockModifyOrderConfirmationViewModel3 = (StockModifyOrderConfirmationViewModel) r();
        stockModifyOrderConfirmationViewModel3.f10292s.observe(this, new c(12, new k(this, 6)));
        StockModifyOrderConfirmationViewModel stockModifyOrderConfirmationViewModel4 = (StockModifyOrderConfirmationViewModel) r();
        stockModifyOrderConfirmationViewModel4.f10294u.observe(this, new c(12, new k(this, 7)));
        StockModifyOrderConfirmationViewModel stockModifyOrderConfirmationViewModel5 = (StockModifyOrderConfirmationViewModel) r();
        stockModifyOrderConfirmationViewModel5.f10295v.observe(this, new c(12, new k(this, 8)));
        StockModifyOrderConfirmationViewModel stockModifyOrderConfirmationViewModel6 = (StockModifyOrderConfirmationViewModel) r();
        stockModifyOrderConfirmationViewModel6.f10297x.observe(this, new c(12, new k(this, 9)));
        StockModifyOrderConfirmationViewModel stockModifyOrderConfirmationViewModel7 = (StockModifyOrderConfirmationViewModel) r();
        stockModifyOrderConfirmationViewModel7.f10296w.observe(this, new c(12, new k(this, 10)));
        StockModifyOrderConfirmationViewModel stockModifyOrderConfirmationViewModel8 = (StockModifyOrderConfirmationViewModel) r();
        stockModifyOrderConfirmationViewModel8.f10298y.observe(this, new c(12, new k(this, 11)));
        StockModifyOrderConfirmationViewModel stockModifyOrderConfirmationViewModel9 = (StockModifyOrderConfirmationViewModel) r();
        stockModifyOrderConfirmationViewModel9.f10299z.observe(this, new c(12, new k(this, 12)));
        StockModifyOrderConfirmationViewModel stockModifyOrderConfirmationViewModel10 = (StockModifyOrderConfirmationViewModel) r();
        stockModifyOrderConfirmationViewModel10.A.observe(this, new c(12, new k(this, 0)));
        ((StockModifyOrderConfirmationViewModel) r()).f10289p.observe(this, new c(12, new k(this, 1)));
        ((StockModifyOrderConfirmationViewModel) r()).f9084g.observe(this, new c(12, new k(this, 2)));
        ((StockModifyOrderConfirmationViewModel) r()).f10290q.observe(this, new c(12, new k(this, 3)));
    }

    @Override // gd.m
    public final void E(View view) {
        ModifyOrderDto modifyOrderDto;
        Intrinsics.checkNotNullParameter(view, "view");
        ((vk) q()).f6447u.setTitle(getString(R.string.confirm_order));
        Toolbar toolbar = ((vk) q()).f6447u;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        p(toolbar);
        Bundle arguments = getArguments();
        if (arguments != null && (modifyOrderDto = (ModifyOrderDto) arguments.getParcelable("STOCK_MODIFY_BUY_ORDER")) != null) {
            ((StockModifyOrderConfirmationViewModel) r()).f10288o.postValue(modifyOrderDto);
        }
        final int i10 = 0;
        ((vk) q()).f6445s.setOnClickListener(new View.OnClickListener(this) { // from class: pi.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockModifyOrderConfirmationFragment f31143b;

            {
                this.f31143b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                StockModifyOrderConfirmationFragment this$0 = this.f31143b;
                switch (i11) {
                    case 0:
                        int i12 = StockModifyOrderConfirmationFragment.f10286g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockModifyOrderConfirmationViewModel stockModifyOrderConfirmationViewModel = (StockModifyOrderConfirmationViewModel) this$0.r();
                        ModifyOrderDto modifyOrderDto2 = (ModifyOrderDto) stockModifyOrderConfirmationViewModel.f10288o.getValue();
                        if (modifyOrderDto2 != null) {
                            stockModifyOrderConfirmationViewModel.f9084g.postValue(Boolean.TRUE);
                            nt.h c10 = stockModifyOrderConfirmationViewModel.f10287n.modifyOrders(modifyOrderDto2).c(((kq.e) stockModifyOrderConfirmationViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new q(20, new m(stockModifyOrderConfirmationViewModel, 0)), new q(21, new m(stockModifyOrderConfirmationViewModel, 1)));
                            c10.a(dVar);
                            stockModifyOrderConfirmationViewModel.f9080c.c(dVar);
                            return;
                        }
                        return;
                    default:
                        int i13 = StockModifyOrderConfirmationFragment.f10286g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                }
            }
        });
        final int i11 = 1;
        ((vk) q()).f6447u.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: pi.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockModifyOrderConfirmationFragment f31143b;

            {
                this.f31143b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                StockModifyOrderConfirmationFragment this$0 = this.f31143b;
                switch (i112) {
                    case 0:
                        int i12 = StockModifyOrderConfirmationFragment.f10286g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockModifyOrderConfirmationViewModel stockModifyOrderConfirmationViewModel = (StockModifyOrderConfirmationViewModel) this$0.r();
                        ModifyOrderDto modifyOrderDto2 = (ModifyOrderDto) stockModifyOrderConfirmationViewModel.f10288o.getValue();
                        if (modifyOrderDto2 != null) {
                            stockModifyOrderConfirmationViewModel.f9084g.postValue(Boolean.TRUE);
                            nt.h c10 = stockModifyOrderConfirmationViewModel.f10287n.modifyOrders(modifyOrderDto2).c(((kq.e) stockModifyOrderConfirmationViewModel.f9079b).J());
                            jt.d dVar = new jt.d(new q(20, new m(stockModifyOrderConfirmationViewModel, 0)), new q(21, new m(stockModifyOrderConfirmationViewModel, 1)));
                            c10.a(dVar);
                            stockModifyOrderConfirmationViewModel.f9080c.c(dVar);
                            return;
                        }
                        return;
                    default:
                        int i13 = StockModifyOrderConfirmationFragment.f10286g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                }
            }
        });
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
        ca.c factory = new ca.c(a0.a(StockModifyOrderConfirmationViewModel.class), new ea.a(k10, c10, stockRepository, userRepository, 8));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, StockModifyOrderConfirmationViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockModifyOrderConfirmationViewModel.class, "<this>", StockModifyOrderConfirmationViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockModifyOrderConfirmationViewModel stockModifyOrderConfirmationViewModel = (StockModifyOrderConfirmationViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(stockModifyOrderConfirmationViewModel);
            this.f17284b = stockModifyOrderConfirmationViewModel;
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
