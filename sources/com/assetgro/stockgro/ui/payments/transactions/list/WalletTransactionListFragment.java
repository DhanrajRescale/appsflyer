package com.assetgro.stockgro.ui.payments.transactions.list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import ba.cq;
import be.b;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.transactions.list.WalletTransactionListFragment;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import dg.d;
import dg.i;
import dg.k;
import dg.p;
import ea.n0;
import gd.m;
import hl.f;
import iu.a0;
import k7.i1;
import k7.y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import nc.c;
import qu.i0;
import xf.v;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/transactions/list/WalletTransactionListFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/payments/transactions/list/WalletTransactionListViewModel;", "Lba/cq;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class WalletTransactionListFragment extends m<WalletTransactionListViewModel, cq> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f9726h = 0;

    /* renamed from: g, reason: collision with root package name */
    public p f9727g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_wallet_transaction_list;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((WalletTransactionListViewModel) r()).f9734t.observe(this, new v(2, new i(this, 0)));
        ((WalletTransactionListViewModel) r()).f9730p.observe(this, new v(2, new i(this, 1)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((cq) q()).p(this);
        Toolbar toolbar = ((cq) q()).f4408w;
        Intrinsics.c(toolbar);
        p(toolbar);
        j0 activity = getActivity();
        Intrinsics.d(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ((h.m) activity).u(toolbar);
        final int i10 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: dg.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletTransactionListFragment f14350b;

            {
                this.f14350b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                WalletTransactionListFragment this$0 = this.f14350b;
                switch (i11) {
                    case 0:
                        int i12 = WalletTransactionListFragment.f9726h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                    default:
                        int i13 = WalletTransactionListFragment.f9726h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        i1 layoutManager = ((cq) this$0.q()).f4411z.getLayoutManager();
                        if (layoutManager != null) {
                            layoutManager.t0(0);
                            return;
                        }
                        return;
                }
            }
        });
        this.f9727g = new p(new b(this, 7));
        cq cqVar = (cq) q();
        p pVar = this.f9727g;
        if (pVar != null) {
            cqVar.f4411z.setAdapter(pVar);
            cq cqVar2 = (cq) q();
            final int i11 = 1;
            cqVar2.f4404s.setOnClickListener(new View.OnClickListener(this) { // from class: dg.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WalletTransactionListFragment f14350b;

                {
                    this.f14350b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i112 = i11;
                    WalletTransactionListFragment this$0 = this.f14350b;
                    switch (i112) {
                        case 0:
                            int i12 = WalletTransactionListFragment.f9726h;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.requireActivity().finish();
                            return;
                        default:
                            int i13 = WalletTransactionListFragment.f9726h;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            i1 layoutManager = ((cq) this$0.q()).f4411z.getLayoutManager();
                            if (layoutManager != null) {
                                layoutManager.t0(0);
                                return;
                            }
                            return;
                    }
                }
            });
            cq cqVar3 = (cq) q();
            cqVar3.f4407v.a(new c(this, 6));
            ((WalletTransactionListViewModel) r()).h();
            cq cqVar4 = (cq) q();
            cqVar4.f4411z.j(new y(this, 3));
            p pVar2 = this.f9727g;
            if (pVar2 != null) {
                pVar2.p(new k(this));
                return;
            } else {
                Intrinsics.k("transactionsAdapter");
                throw null;
            }
        }
        Intrinsics.k("transactionsAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        inflater.inflate(R.menu.menu_toolbar_with_filter, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // gd.m, androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        setHasOptionsMenu(true);
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.g0
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == R.id.action_filter) {
            x(new AnalyticEvent("app_txn_adv_filters", null, 2, null));
            d paymentFilterOptions = ((WalletTransactionListViewModel) r()).f9732r;
            Intrinsics.checkNotNullParameter(paymentFilterOptions, "paymentFilterOptions");
            dg.c cVar = new dg.c();
            cVar.setArguments(f.y(new Pair("DATA", paymentFilterOptions)));
            cVar.show(getChildFragmentManager(), "AdvanceTransactionFilterBottomSheet");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        PaymentRepository paymentRepository = bVar.i();
        g.i(paymentRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(WalletTransactionListViewModel.class), new ea.k(k10, c10, paymentRepository, userRepository, 12));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, WalletTransactionListViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(WalletTransactionListViewModel.class, "<this>", WalletTransactionListViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            WalletTransactionListViewModel walletTransactionListViewModel = (WalletTransactionListViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(walletTransactionListViewModel);
            this.f17284b = walletTransactionListViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            g.i(h12);
            this.f17287e = h12;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
