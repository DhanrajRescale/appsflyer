package com.assetgro.stockgro.ui.stock.detail.order;

import a3.a;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.lifecycle.d1;
import androidx.lifecycle.h1;
import ba.ro;
import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity;
import com.assetgro.stockgro.ui.stock.common.SharedViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockSharedViewModel;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderPaymentSuccessFragment;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderPaymentSuccessfulViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.b;
import da.e;
import da.f;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import li.c;
import mi.l;
import qu.i0;
import yk.g;
import yk.o;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/detail/order/StockOrderPaymentSuccessFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/detail/order/StockOrderPaymentSuccessfulViewModel;", "Lba/ro;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockOrderPaymentSuccessFragment extends m<StockOrderPaymentSuccessfulViewModel, ro> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f10223h = 0;

    /* renamed from: g, reason: collision with root package name */
    public StockSharedViewModel f10224g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_payment_success;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        StockOrderPaymentSuccessfulViewModel stockOrderPaymentSuccessfulViewModel = (StockOrderPaymentSuccessfulViewModel) r();
        stockOrderPaymentSuccessfulViewModel.f10230s.observe(this, new c(3, new l(this, 0)));
        StockOrderPaymentSuccessfulViewModel stockOrderPaymentSuccessfulViewModel2 = (StockOrderPaymentSuccessfulViewModel) r();
        stockOrderPaymentSuccessfulViewModel2.f10229r.observe(this, new c(3, new l(this, 1)));
        StockOrderPaymentSuccessfulViewModel stockOrderPaymentSuccessfulViewModel3 = (StockOrderPaymentSuccessfulViewModel) r();
        stockOrderPaymentSuccessfulViewModel3.f10227p.observe(this, new c(3, new l(this, 2)));
        ((StockOrderPaymentSuccessfulViewModel) r()).f10231t.observe(this, new c(3, new l(this, 3)));
        ((StockOrderPaymentSuccessfulViewModel) r()).f9084g.observe(this, new c(3, new l(this, 4)));
        StockOrderPaymentSuccessfulViewModel stockOrderPaymentSuccessfulViewModel4 = (StockOrderPaymentSuccessfulViewModel) r();
        stockOrderPaymentSuccessfulViewModel4.f10228q.observe(this, new c(3, new l(this, 5)));
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
                    sharedViewModel.f10165b.observe(this, new c1.a(this, 5));
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
        StockOrderDto stockOrderDto;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null && (stockOrderDto = (StockOrderDto) arguments.getParcelable("STOCK_BUY_ORDER")) != null) {
            ((StockOrderPaymentSuccessfulViewModel) r()).f10225n.postValue(stockOrderDto);
            unit = Unit.f23355a;
        } else {
            unit = null;
        }
        if (unit == null) {
            Bundle requireArguments = requireArguments();
            Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments(...)");
            ((StockOrderPaymentSuccessfulViewModel) r()).f10225n.postValue(o.O(requireArguments).f27801a);
        }
        final int i10 = 0;
        ((ro) q()).f5995z.setOnClickListener(new View.OnClickListener(this) { // from class: mi.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockOrderPaymentSuccessFragment f27798b;

            {
                this.f27798b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                StockOrderPaymentSuccessFragment this$0 = this.f27798b;
                switch (i11) {
                    case 0:
                        int i12 = StockOrderPaymentSuccessFragment.f10223h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockSharedViewModel stockSharedViewModel = this$0.f10224g;
                        String str = null;
                        if (stockSharedViewModel != null) {
                            if (!stockSharedViewModel.f10198o) {
                                j0 activity = this$0.getActivity();
                                if (activity != null) {
                                    Intent intent = new Intent(activity, (Class<?>) PortfolioDetailActivity.class);
                                    Bundle bundle = new Bundle();
                                    Portfolio portfolio = (Portfolio) ((StockOrderPaymentSuccessfulViewModel) this$0.r()).f10226o.getValue();
                                    if (portfolio != null) {
                                        str = portfolio.getPortfolioId();
                                    }
                                    bundle.putString("PORTFOLIO_ID", str);
                                    bundle.putParcelable("PORTFOLIO", (Parcelable) ((StockOrderPaymentSuccessfulViewModel) this$0.r()).f10226o.getValue());
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
                        int i13 = StockOrderPaymentSuccessFragment.f10223h;
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
        ((ro) q()).f5988s.setOnClickListener(new View.OnClickListener(this) { // from class: mi.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockOrderPaymentSuccessFragment f27798b;

            {
                this.f27798b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                StockOrderPaymentSuccessFragment this$0 = this.f27798b;
                switch (i112) {
                    case 0:
                        int i12 = StockOrderPaymentSuccessFragment.f10223h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        StockSharedViewModel stockSharedViewModel = this$0.f10224g;
                        String str = null;
                        if (stockSharedViewModel != null) {
                            if (!stockSharedViewModel.f10198o) {
                                j0 activity = this$0.getActivity();
                                if (activity != null) {
                                    Intent intent = new Intent(activity, (Class<?>) PortfolioDetailActivity.class);
                                    Bundle bundle = new Bundle();
                                    Portfolio portfolio = (Portfolio) ((StockOrderPaymentSuccessfulViewModel) this$0.r()).f10226o.getValue();
                                    if (portfolio != null) {
                                        str = portfolio.getPortfolioId();
                                    }
                                    bundle.putString("PORTFOLIO_ID", str);
                                    bundle.putParcelable("PORTFOLIO", (Parcelable) ((StockOrderPaymentSuccessfulViewModel) this$0.r()).f10226o.getValue());
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
                        int i13 = StockOrderPaymentSuccessFragment.f10223h;
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
        ((ro) q()).f5991v.setOnClickListener(new zc.c(2));
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(StockOrderPaymentSuccessfulViewModel.class), new ea.j0(k10, c10, userRepository, 11));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, StockOrderPaymentSuccessfulViewModel.class, "modelClass");
        iu.e b10 = a.b(StockOrderPaymentSuccessfulViewModel.class, "<this>", StockOrderPaymentSuccessfulViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockOrderPaymentSuccessfulViewModel stockOrderPaymentSuccessfulViewModel = (StockOrderPaymentSuccessfulViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(stockOrderPaymentSuccessfulViewModel);
            this.f17284b = stockOrderPaymentSuccessfulViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            g.i(h11);
            this.f17287e = h11;
            this.f10224g = fragmentComponent.l();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
