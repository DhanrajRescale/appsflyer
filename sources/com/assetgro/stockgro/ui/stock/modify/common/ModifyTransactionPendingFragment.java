package com.assetgro.stockgro.ui.stock.modify.common;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.lifecycle.d1;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.no;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity;
import com.assetgro.stockgro.ui.stock.common.SharedViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockSharedViewModel;
import com.assetgro.stockgro.ui.stock.modify.common.ModifyTransactionPendingFragment;
import com.assetgro.stockgro.ui.stock.modify.common.ModifyTransactionPendingViewModel;
import com.bumptech.glide.b;
import com.bumptech.glide.h;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import gd.m;
import iu.a0;
import iu.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qg.a;
import qi.f;
import qu.i0;
import xf.x;
import y4.c;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/common/ModifyTransactionPendingFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/modify/common/ModifyTransactionPendingViewModel;", "Lba/no;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ModifyTransactionPendingFragment extends m<ModifyTransactionPendingViewModel, no> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f10308i = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f10309g = new i(a0.a(f.class), new x(this, 6));

    /* renamed from: h, reason: collision with root package name */
    public StockSharedViewModel f10310h;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_order_pending;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        try {
            j0 owner = getActivity();
            if (owner != null) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                h1 store = owner.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner, "owner");
                d1 factory = owner.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(owner, "owner");
                c defaultCreationExtras = owner.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store, "store");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
                h.c cVar = new h.c(store, factory, defaultCreationExtras);
                Intrinsics.checkNotNullParameter(SharedViewModel.class, "modelClass");
                Intrinsics.checkNotNullParameter(SharedViewModel.class, "<this>");
                e modelClass = a0.a(SharedViewModel.class);
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                String s7 = i0.s(modelClass);
                if (s7 != null) {
                    SharedViewModel sharedViewModel = (SharedViewModel) cVar.G(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
                    if (sharedViewModel != null) {
                        sharedViewModel.f10165b.observe(this, new li.c(14, new a(this, 17)));
                        return;
                    }
                } else {
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
                }
            }
            throw new Exception("Invalid Activity");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        f fVar = (f) this.f10309g.getValue();
        h e10 = b.e(requireContext());
        ModifyOrderDto modifyOrderDto = fVar.f31978a;
        e10.m(modifyOrderDto.getStockImageUrl()).z(((no) q()).f5593v);
        ((no) q()).f5594w.setText(modifyOrderDto.getStockName());
        no noVar = (no) q();
        String quantity = modifyOrderDto.getQuantity();
        Intrinsics.c(quantity);
        noVar.f5592u.setValue(quantity);
        no noVar2 = (no) q();
        ij.h hVar = ij.h.f20067a;
        Double executionPrice = modifyOrderDto.getExecutionPrice();
        Intrinsics.c(executionPrice);
        noVar2.f5591t.setValue(ij.h.m(hVar, executionPrice.doubleValue()));
        no noVar3 = (no) q();
        final int i10 = 0;
        noVar3.f5596y.setOnClickListener(new View.OnClickListener(this) { // from class: qi.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyTransactionPendingFragment f31977b;

            {
                this.f31977b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                ModifyTransactionPendingFragment this$0 = this.f31977b;
                switch (i11) {
                    case 0:
                        int i12 = ModifyTransactionPendingFragment.f10308i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockSharedViewModel stockSharedViewModel = this$0.f10310h;
                        String str = null;
                        if (stockSharedViewModel != null) {
                            if (!stockSharedViewModel.f10198o) {
                                j0 activity = this$0.getActivity();
                                if (activity != null) {
                                    Intent intent = new Intent(activity, (Class<?>) PortfolioDetailActivity.class);
                                    Bundle bundle = new Bundle();
                                    Portfolio portfolio = (Portfolio) ((ModifyTransactionPendingViewModel) this$0.r()).f10311n.getValue();
                                    if (portfolio != null) {
                                        str = portfolio.getPortfolioId();
                                    }
                                    bundle.putString("PORTFOLIO_ID", str);
                                    bundle.putParcelable("PORTFOLIO", (Parcelable) ((ModifyTransactionPendingViewModel) this$0.r()).f10311n.getValue());
                                    intent.putExtras(bundle);
                                    activity.startActivity(intent);
                                    j0 activity2 = this$0.getActivity();
                                    if (activity2 != null) {
                                        activity2.finish();
                                        return;
                                    }
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
                        int i13 = ModifyTransactionPendingFragment.f10308i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        no noVar4 = (no) q();
        final int i11 = 1;
        noVar4.f5590s.setOnClickListener(new View.OnClickListener(this) { // from class: qi.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyTransactionPendingFragment f31977b;

            {
                this.f31977b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                ModifyTransactionPendingFragment this$0 = this.f31977b;
                switch (i112) {
                    case 0:
                        int i12 = ModifyTransactionPendingFragment.f10308i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockSharedViewModel stockSharedViewModel = this$0.f10310h;
                        String str = null;
                        if (stockSharedViewModel != null) {
                            if (!stockSharedViewModel.f10198o) {
                                j0 activity = this$0.getActivity();
                                if (activity != null) {
                                    Intent intent = new Intent(activity, (Class<?>) PortfolioDetailActivity.class);
                                    Bundle bundle = new Bundle();
                                    Portfolio portfolio = (Portfolio) ((ModifyTransactionPendingViewModel) this$0.r()).f10311n.getValue();
                                    if (portfolio != null) {
                                        str = portfolio.getPortfolioId();
                                    }
                                    bundle.putString("PORTFOLIO_ID", str);
                                    bundle.putParcelable("PORTFOLIO", (Parcelable) ((ModifyTransactionPendingViewModel) this$0.r()).f10311n.getValue());
                                    intent.putExtras(bundle);
                                    activity.startActivity(intent);
                                    j0 activity2 = this$0.getActivity();
                                    if (activity2 != null) {
                                        activity2.finish();
                                        return;
                                    }
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
                        int i13 = ModifyTransactionPendingFragment.f10308i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                }
            }
        });
        no noVar5 = (no) q();
        noVar5.f5595x.setText(getResources().getString(R.string.modification_pending));
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(ModifyTransactionPendingViewModel.class), new ea.j0(k10, c10, userRepository, 7));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, ModifyTransactionPendingViewModel.class, "modelClass");
        e b10 = a3.a.b(ModifyTransactionPendingViewModel.class, "<this>", ModifyTransactionPendingViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ModifyTransactionPendingViewModel modifyTransactionPendingViewModel = (ModifyTransactionPendingViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(modifyTransactionPendingViewModel);
            this.f17284b = modifyTransactionPendingViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            g.i(h11);
            this.f17287e = h11;
            this.f10310h = fragmentComponent.l();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
