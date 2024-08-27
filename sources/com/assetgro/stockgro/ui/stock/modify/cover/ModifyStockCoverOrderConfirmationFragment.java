package com.assetgro.stockgro.ui.stock.modify.cover;

import android.view.View;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.bl;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.modify.cover.ModifyStockCoverOrderConfirmationFragment;
import com.assetgro.stockgro.ui.stock.modify.cover.ModifyStockCoverOrderConfirmationViewModel;
import com.assetgro.stockgro.widget.DisplayView;
import com.bumptech.glide.g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import da.f;
import ea.n0;
import gd.m;
import ij.h;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ni.q;
import qu.i0;
import ri.b;
import ri.c;
import xf.x;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/cover/ModifyStockCoverOrderConfirmationFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/modify/cover/ModifyStockCoverOrderConfirmationViewModel;", "Lba/bl;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ModifyStockCoverOrderConfirmationFragment extends m<ModifyStockCoverOrderConfirmationViewModel, bl> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f10312h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f10313g = new i(a0.a(c.class), new x(this, 7));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_modify_stock_cover_order_confirmation;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((ModifyStockCoverOrderConfirmationViewModel) r()).f10315o.observe(this, new li.c(15, new b(this, 0)));
        ((ModifyStockCoverOrderConfirmationViewModel) r()).f9084g.observe(this, new li.c(15, new b(this, 1)));
    }

    @Override // gd.m
    public final void E(View view) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        ((g) com.bumptech.glide.b.e(requireContext()).m(H().f33761a.getStockImageUrl()).b()).z(((bl) q()).f4302s.f4804y);
        ModifyOrderDto modifyOrderDto = H().f33761a;
        ((bl) q()).f4302s.f4805z.setText(modifyOrderDto.getStockName());
        String quantity = modifyOrderDto.getQuantity();
        if (quantity != null) {
            ((bl) q()).f4302s.f4803x.setValue(quantity);
        }
        Double executionPrice = modifyOrderDto.getExecutionPrice();
        if (executionPrice != null) {
            double doubleValue = executionPrice.doubleValue();
            DisplayView displayView = ((bl) q()).f4302s.f4801v;
            h hVar = h.f20067a;
            displayView.setValue(h.m(hVar, doubleValue));
            if (modifyOrderDto.getQuantity() != null) {
                ((bl) q()).f4302s.A.setValue(h.m(hVar, Integer.parseInt(r2) * doubleValue));
            }
        }
        String orderType = modifyOrderDto.getOrderType();
        if (orderType != null) {
            ((bl) q()).f4302s.f4798s.setValue(orderType);
        }
        Portfolio selectedPortfolio = modifyOrderDto.getSelectedPortfolio();
        if (selectedPortfolio != null) {
            str = selectedPortfolio.getPortfolioName();
        } else {
            str = null;
        }
        ((bl) q()).f4302s.f4800u.setText(str);
        Portfolio selectedPortfolio2 = modifyOrderDto.getSelectedPortfolio();
        if (selectedPortfolio2 != null) {
            ((bl) q()).f4302s.f4799t.setText(h.m(h.f20067a, selectedPortfolio2.getCashBalance()));
        }
        final int i10 = 0;
        ((bl) q()).f4303t.setOnClickListener(new View.OnClickListener(this) { // from class: ri.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyStockCoverOrderConfirmationFragment f33758b;

            {
                this.f33758b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                ModifyStockCoverOrderConfirmationFragment this$0 = this.f33758b;
                switch (i11) {
                    case 0:
                        int i12 = ModifyStockCoverOrderConfirmationFragment.f10312h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ModifyStockCoverOrderConfirmationViewModel modifyStockCoverOrderConfirmationViewModel = (ModifyStockCoverOrderConfirmationViewModel) this$0.r();
                        ModifyOrderDto modifyOrderDto2 = this$0.H().f33761a;
                        Intrinsics.checkNotNullParameter(modifyOrderDto2, "modifyOrderDto");
                        modifyStockCoverOrderConfirmationViewModel.f9084g.postValue(Boolean.TRUE);
                        nt.h c10 = modifyStockCoverOrderConfirmationViewModel.f10314n.modifyOrders(modifyOrderDto2).c(((kq.e) modifyStockCoverOrderConfirmationViewModel.f9079b).J());
                        jt.d dVar = new jt.d(new q(22, new f(modifyStockCoverOrderConfirmationViewModel, 0)), new q(23, new f(modifyStockCoverOrderConfirmationViewModel, 1)));
                        c10.a(dVar);
                        modifyStockCoverOrderConfirmationViewModel.f9080c.c(dVar);
                        return;
                    default:
                        int i13 = ModifyStockCoverOrderConfirmationFragment.f10312h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        j0 activity = this$0.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 1;
        ((bl) q()).f4304u.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ri.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyStockCoverOrderConfirmationFragment f33758b;

            {
                this.f33758b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                ModifyStockCoverOrderConfirmationFragment this$0 = this.f33758b;
                switch (i112) {
                    case 0:
                        int i12 = ModifyStockCoverOrderConfirmationFragment.f10312h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ModifyStockCoverOrderConfirmationViewModel modifyStockCoverOrderConfirmationViewModel = (ModifyStockCoverOrderConfirmationViewModel) this$0.r();
                        ModifyOrderDto modifyOrderDto2 = this$0.H().f33761a;
                        Intrinsics.checkNotNullParameter(modifyOrderDto2, "modifyOrderDto");
                        modifyStockCoverOrderConfirmationViewModel.f9084g.postValue(Boolean.TRUE);
                        nt.h c10 = modifyStockCoverOrderConfirmationViewModel.f10314n.modifyOrders(modifyOrderDto2).c(((kq.e) modifyStockCoverOrderConfirmationViewModel.f9079b).J());
                        jt.d dVar = new jt.d(new q(22, new f(modifyStockCoverOrderConfirmationViewModel, 0)), new q(23, new f(modifyStockCoverOrderConfirmationViewModel, 1)));
                        c10.a(dVar);
                        modifyStockCoverOrderConfirmationViewModel.f9080c.c(dVar);
                        return;
                    default:
                        int i13 = ModifyStockCoverOrderConfirmationFragment.f10312h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        j0 activity = this$0.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                }
            }
        });
        requireActivity().getOnBackPressedDispatcher().a(this, new androidx.activity.x(this, 8));
    }

    public final c H() {
        return (c) this.f10313g.getValue();
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        a c10 = bVar.c();
        StockRepository stockRepository = bVar.l();
        yk.g.i(stockRepository);
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(ModifyStockCoverOrderConfirmationViewModel.class), new ea.a(k10, c10, stockRepository, userRepository, 4));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, ModifyStockCoverOrderConfirmationViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ModifyStockCoverOrderConfirmationViewModel.class, "<this>", ModifyStockCoverOrderConfirmationViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ModifyStockCoverOrderConfirmationViewModel modifyStockCoverOrderConfirmationViewModel = (ModifyStockCoverOrderConfirmationViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(modifyStockCoverOrderConfirmationViewModel);
            this.f17284b = modifyStockCoverOrderConfirmationViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
