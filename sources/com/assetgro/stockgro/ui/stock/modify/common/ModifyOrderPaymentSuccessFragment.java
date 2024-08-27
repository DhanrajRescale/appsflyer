package com.assetgro.stockgro.ui.stock.modify.common;

import a3.a;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.lifecycle.d1;
import androidx.lifecycle.h1;
import ba.ro;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity;
import com.assetgro.stockgro.ui.stock.common.SharedViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockSharedViewModel;
import com.assetgro.stockgro.ui.stock.modify.common.ModifyOrderPaymentSuccessFragment;
import com.assetgro.stockgro.ui.stock.modify.common.ModifyOrderPaymentSuccessfulViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.e;
import da.f;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import li.c;
import ni.j;
import qi.b;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/modify/common/ModifyOrderPaymentSuccessFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/modify/common/ModifyOrderPaymentSuccessfulViewModel;", "Lba/ro;", "<init>", "()V", "ni/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ModifyOrderPaymentSuccessFragment extends m<ModifyOrderPaymentSuccessfulViewModel, ro> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f10300h = 0;

    /* renamed from: g, reason: collision with root package name */
    public StockSharedViewModel f10301g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_payment_success;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ModifyOrderPaymentSuccessfulViewModel modifyOrderPaymentSuccessfulViewModel = (ModifyOrderPaymentSuccessfulViewModel) r();
        modifyOrderPaymentSuccessfulViewModel.f10307s.observe(this, new c(13, new b(this, 0)));
        ModifyOrderPaymentSuccessfulViewModel modifyOrderPaymentSuccessfulViewModel2 = (ModifyOrderPaymentSuccessfulViewModel) r();
        modifyOrderPaymentSuccessfulViewModel2.f10306r.observe(this, new c(13, new b(this, 1)));
        ModifyOrderPaymentSuccessfulViewModel modifyOrderPaymentSuccessfulViewModel3 = (ModifyOrderPaymentSuccessfulViewModel) r();
        modifyOrderPaymentSuccessfulViewModel3.f10304p.observe(this, new c(13, new b(this, 2)));
        ModifyOrderPaymentSuccessfulViewModel modifyOrderPaymentSuccessfulViewModel4 = (ModifyOrderPaymentSuccessfulViewModel) r();
        modifyOrderPaymentSuccessfulViewModel4.f10305q.observe(this, new c(13, new b(this, 3)));
        j0 owner = getActivity();
        if (owner != null) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            h1 viewModelStore = owner.getViewModelStore();
            Intrinsics.checkNotNullParameter(owner, "owner");
            d1 factory = owner.getDefaultViewModelProviderFactory();
            y4.c defaultCreationExtras = e.u(owner, "owner", viewModelStore, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
            h.c cVar = new h.c(viewModelStore, factory, defaultCreationExtras);
            Intrinsics.checkNotNullParameter(SharedViewModel.class, "modelClass");
            iu.e b10 = a.b(SharedViewModel.class, "<this>", SharedViewModel.class, "modelClass", "modelClass");
            String s7 = i0.s(b10);
            if (s7 != null) {
                SharedViewModel sharedViewModel = (SharedViewModel) cVar.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
                if (sharedViewModel != null) {
                    sharedViewModel.f10165b.observe(this, new c1.a(this, 6));
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
        Unit unit;
        ModifyOrderDto modifyOrderDto;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null && (modifyOrderDto = (ModifyOrderDto) arguments.getParcelable("STOCK_MODIFY_BUY_ORDER")) != null) {
            ((ModifyOrderPaymentSuccessfulViewModel) r()).f10302n.postValue(modifyOrderDto);
            unit = Unit.f23355a;
        } else {
            unit = null;
        }
        if (unit == null) {
            Bundle requireArguments = requireArguments();
            Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments(...)");
            ((ModifyOrderPaymentSuccessfulViewModel) r()).f10302n.postValue(j.m(requireArguments).f31970a);
        }
        final int i10 = 0;
        ((ro) q()).f5995z.setOnClickListener(new View.OnClickListener(this) { // from class: qi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyOrderPaymentSuccessFragment f31967b;

            {
                this.f31967b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                ModifyOrderPaymentSuccessFragment this$0 = this.f31967b;
                switch (i11) {
                    case 0:
                        int i12 = ModifyOrderPaymentSuccessFragment.f10300h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockSharedViewModel stockSharedViewModel = this$0.f10301g;
                        String str = null;
                        if (stockSharedViewModel != null) {
                            if (!stockSharedViewModel.f10198o) {
                                j0 activity = this$0.getActivity();
                                if (activity != null) {
                                    Intent intent = new Intent(activity, (Class<?>) PortfolioDetailActivity.class);
                                    Bundle bundle = new Bundle();
                                    Portfolio portfolio = (Portfolio) ((ModifyOrderPaymentSuccessfulViewModel) this$0.r()).f10303o.getValue();
                                    if (portfolio != null) {
                                        str = portfolio.getPortfolioId();
                                    }
                                    bundle.putString("PORTFOLIO_ID", str);
                                    bundle.putParcelable("PORTFOLIO", (Parcelable) ((ModifyOrderPaymentSuccessfulViewModel) this$0.r()).f10303o.getValue());
                                    intent.putExtras(bundle);
                                    activity.startActivity(intent);
                                }
                                j0 activity2 = this$0.getActivity();
                                if (activity2 != null) {
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
                        int i13 = ModifyOrderPaymentSuccessFragment.f10300h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        j0 activity3 = this$0.getActivity();
                        if (activity3 != null) {
                            activity3.finish();
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 1;
        ((ro) q()).f5988s.setOnClickListener(new View.OnClickListener(this) { // from class: qi.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModifyOrderPaymentSuccessFragment f31967b;

            {
                this.f31967b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                ModifyOrderPaymentSuccessFragment this$0 = this.f31967b;
                switch (i112) {
                    case 0:
                        int i12 = ModifyOrderPaymentSuccessFragment.f10300h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockSharedViewModel stockSharedViewModel = this$0.f10301g;
                        String str = null;
                        if (stockSharedViewModel != null) {
                            if (!stockSharedViewModel.f10198o) {
                                j0 activity = this$0.getActivity();
                                if (activity != null) {
                                    Intent intent = new Intent(activity, (Class<?>) PortfolioDetailActivity.class);
                                    Bundle bundle = new Bundle();
                                    Portfolio portfolio = (Portfolio) ((ModifyOrderPaymentSuccessfulViewModel) this$0.r()).f10303o.getValue();
                                    if (portfolio != null) {
                                        str = portfolio.getPortfolioId();
                                    }
                                    bundle.putString("PORTFOLIO_ID", str);
                                    bundle.putParcelable("PORTFOLIO", (Parcelable) ((ModifyOrderPaymentSuccessfulViewModel) this$0.r()).f10303o.getValue());
                                    intent.putExtras(bundle);
                                    activity.startActivity(intent);
                                }
                                j0 activity2 = this$0.getActivity();
                                if (activity2 != null) {
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
                        int i13 = ModifyOrderPaymentSuccessFragment.f10300h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        j0 activity3 = this$0.getActivity();
                        if (activity3 != null) {
                            activity3.finish();
                            return;
                        }
                        return;
                }
            }
        });
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(ModifyOrderPaymentSuccessfulViewModel.class), new ea.j0(k10, c10, userRepository, 6));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, ModifyOrderPaymentSuccessfulViewModel.class, "modelClass");
        iu.e b10 = a.b(ModifyOrderPaymentSuccessfulViewModel.class, "<this>", ModifyOrderPaymentSuccessfulViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ModifyOrderPaymentSuccessfulViewModel modifyOrderPaymentSuccessfulViewModel = (ModifyOrderPaymentSuccessfulViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(modifyOrderPaymentSuccessfulViewModel);
            this.f17284b = modifyOrderPaymentSuccessfulViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            g.i(h11);
            this.f17287e = h11;
            this.f10301g = fragmentComponent.l();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
