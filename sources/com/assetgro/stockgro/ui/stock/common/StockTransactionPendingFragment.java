package com.assetgro.stockgro.ui.stock.common;

import a3.a;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.lifecycle.d1;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.no;
import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity;
import com.assetgro.stockgro.ui.stock.common.StockTransactionPendingFragment;
import com.assetgro.stockgro.ui.stock.common.StockTransactionPendingViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockSharedViewModel;
import com.bumptech.glide.g;
import com.bumptech.glide.h;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.e;
import da.f;
import ea.n0;
import gd.m;
import ii.b;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import xf.x;
import y4.c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/common/StockTransactionPendingFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/common/StockTransactionPendingViewModel;", "Lba/no;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockTransactionPendingFragment extends m<StockTransactionPendingViewModel, no> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f10166i = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f10167g = new i(a0.a(b.class), new x(this, 3));

    /* renamed from: h, reason: collision with root package name */
    public StockSharedViewModel f10168h;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_order_pending;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        j0 owner = getActivity();
        if (owner != null) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            h1 viewModelStore = owner.getViewModelStore();
            Intrinsics.checkNotNullParameter(owner, "owner");
            d1 factory = owner.getDefaultViewModelProviderFactory();
            c defaultCreationExtras = e.u(owner, "owner", viewModelStore, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
            h.c cVar = new h.c(viewModelStore, factory, defaultCreationExtras);
            Intrinsics.checkNotNullParameter(SharedViewModel.class, "modelClass");
            iu.e b10 = a.b(SharedViewModel.class, "<this>", SharedViewModel.class, "modelClass", "modelClass");
            String s7 = i0.s(b10);
            if (s7 != null) {
                SharedViewModel sharedViewModel = (SharedViewModel) cVar.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
                if (sharedViewModel != null) {
                    sharedViewModel.f10165b.observe(this, new c1.a(this, 4));
                    return;
                }
            } else {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
            }
        }
        throw new Exception("Invalid Activity");
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        b bVar = (b) this.f10167g.getValue();
        h e10 = com.bumptech.glide.b.e(requireContext());
        StockOrderDto stockOrderDto = bVar.f20035a;
        ((g) e10.m(stockOrderDto.getStockImageUrl()).b()).z(((no) q()).f5593v);
        ((no) q()).f5594w.setText(stockOrderDto.getStockName());
        no noVar = (no) q();
        String quantity = stockOrderDto.getQuantity();
        Intrinsics.c(quantity);
        noVar.f5592u.setValue(quantity);
        no noVar2 = (no) q();
        ij.h hVar = ij.h.f20067a;
        Double executionPrice = stockOrderDto.getExecutionPrice();
        Intrinsics.c(executionPrice);
        noVar2.f5591t.setValue(ij.h.m(hVar, executionPrice.doubleValue()));
        no noVar3 = (no) q();
        final int i10 = 0;
        noVar3.f5596y.setOnClickListener(new View.OnClickListener(this) { // from class: ii.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockTransactionPendingFragment f20034b;

            {
                this.f20034b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                StockTransactionPendingFragment this$0 = this.f20034b;
                switch (i11) {
                    case 0:
                        int i12 = StockTransactionPendingFragment.f10166i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockSharedViewModel stockSharedViewModel = this$0.f10168h;
                        String str = null;
                        if (stockSharedViewModel != null) {
                            if (!stockSharedViewModel.f10198o) {
                                j0 activity = this$0.getActivity();
                                if (activity != null) {
                                    Intent intent = new Intent(activity, (Class<?>) PortfolioDetailActivity.class);
                                    Bundle bundle = new Bundle();
                                    Portfolio portfolio = (Portfolio) ((StockTransactionPendingViewModel) this$0.r()).f10169n.getValue();
                                    if (portfolio != null) {
                                        str = portfolio.getPortfolioId();
                                    }
                                    bundle.putString("PORTFOLIO_ID", str);
                                    bundle.putParcelable("PORTFOLIO", (Parcelable) ((StockTransactionPendingViewModel) this$0.r()).f10169n.getValue());
                                    intent.putExtras(bundle);
                                    activity.startActivity(intent);
                                }
                                j0 activity2 = this$0.getActivity();
                                if (activity2 != null) {
                                    activity2.setResult(-1);
                                    activity2.finish();
                                    return;
                                }
                                return;
                            }
                            if (stockSharedViewModel != null) {
                                stockSharedViewModel.f10200q.postValue(Boolean.TRUE);
                                return;
                            } else {
                                Intrinsics.k("stockSharedViewModel");
                                throw null;
                            }
                        }
                        Intrinsics.k("stockSharedViewModel");
                        throw null;
                    default:
                        int i13 = StockTransactionPendingFragment.f10166i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        no noVar4 = (no) q();
        final int i11 = 1;
        noVar4.f5590s.setOnClickListener(new View.OnClickListener(this) { // from class: ii.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockTransactionPendingFragment f20034b;

            {
                this.f20034b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                StockTransactionPendingFragment this$0 = this.f20034b;
                switch (i112) {
                    case 0:
                        int i12 = StockTransactionPendingFragment.f10166i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockSharedViewModel stockSharedViewModel = this$0.f10168h;
                        String str = null;
                        if (stockSharedViewModel != null) {
                            if (!stockSharedViewModel.f10198o) {
                                j0 activity = this$0.getActivity();
                                if (activity != null) {
                                    Intent intent = new Intent(activity, (Class<?>) PortfolioDetailActivity.class);
                                    Bundle bundle = new Bundle();
                                    Portfolio portfolio = (Portfolio) ((StockTransactionPendingViewModel) this$0.r()).f10169n.getValue();
                                    if (portfolio != null) {
                                        str = portfolio.getPortfolioId();
                                    }
                                    bundle.putString("PORTFOLIO_ID", str);
                                    bundle.putParcelable("PORTFOLIO", (Parcelable) ((StockTransactionPendingViewModel) this$0.r()).f10169n.getValue());
                                    intent.putExtras(bundle);
                                    activity.startActivity(intent);
                                }
                                j0 activity2 = this$0.getActivity();
                                if (activity2 != null) {
                                    activity2.setResult(-1);
                                    activity2.finish();
                                    return;
                                }
                                return;
                            }
                            if (stockSharedViewModel != null) {
                                stockSharedViewModel.f10200q.postValue(Boolean.TRUE);
                                return;
                            } else {
                                Intrinsics.k("stockSharedViewModel");
                                throw null;
                            }
                        }
                        Intrinsics.k("stockSharedViewModel");
                        throw null;
                    default:
                        int i13 = StockTransactionPendingFragment.f10166i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        no noVar5 = (no) q();
        noVar5.f5595x.setText(getResources().getString(R.string.transaction_pending));
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(StockTransactionPendingViewModel.class), new ea.j0(k10, c10, userRepository, 13));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, StockTransactionPendingViewModel.class, "modelClass");
        iu.e b10 = a.b(StockTransactionPendingViewModel.class, "<this>", StockTransactionPendingViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockTransactionPendingViewModel stockTransactionPendingViewModel = (StockTransactionPendingViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(stockTransactionPendingViewModel);
            this.f17284b = stockTransactionPendingViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            this.f10168h = fragmentComponent.l();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
