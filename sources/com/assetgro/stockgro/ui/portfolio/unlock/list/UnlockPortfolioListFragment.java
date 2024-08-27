package com.assetgro.stockgro.ui.portfolio.unlock.list;

import ah.a;
import ah.e;
import ah.f;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import ba.qp;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.b;
import ea.n0;
import gd.m;
import iu.a0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p004if.c;
import qu.i0;
import xf.v;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/portfolio/unlock/list/UnlockPortfolioListFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/portfolio/unlock/list/UnlockPortfolioListViewModel;", "Lba/qp;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UnlockPortfolioListFragment extends m<UnlockPortfolioListViewModel, qp> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f9968h = 0;

    /* renamed from: g, reason: collision with root package name */
    public a f9969g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_unlock_portfolio_list;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((UnlockPortfolioListViewModel) r()).f9971o.observe(this, new v(27, new f(this, 0)));
        ((UnlockPortfolioListViewModel) r()).f9972p.observe(this, new v(27, e.f430e));
        ((UnlockPortfolioListViewModel) r()).f9973q.observe(this, new v(27, new f(this, 1)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f9969g = new a(lifecycle, true, new f(this, 2));
        qp qpVar = (qp) q();
        a aVar = this.f9969g;
        if (aVar != null) {
            qpVar.f5887u.setAdapter(aVar);
            qp qpVar2 = (qp) q();
            String string = getString(R.string.text_unlock_portfolio);
            Toolbar toolbar = qpVar2.f5888v;
            toolbar.setTitle(string);
            p(toolbar);
            toolbar.setNavigationOnClickListener(new c(this, 21));
            return;
        }
        Intrinsics.k("unlockPortfolioAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        List list = (List) ((UnlockPortfolioListViewModel) r()).f9971o.getValue();
        if (list != null) {
            a aVar = this.f9969g;
            if (aVar != null) {
                aVar.u(list);
            } else {
                Intrinsics.k("unlockPortfolioAdapter");
                throw null;
            }
        }
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        PortfolioRepository portfolioRepository = bVar.j();
        g.i(portfolioRepository);
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(UnlockPortfolioListViewModel.class), new ea.m(k10, c10, portfolioRepository, userRepository, 9));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, UnlockPortfolioListViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(UnlockPortfolioListViewModel.class, "<this>", UnlockPortfolioListViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            UnlockPortfolioListViewModel unlockPortfolioListViewModel = (UnlockPortfolioListViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(unlockPortfolioListViewModel);
            this.f17284b = unlockPortfolioListViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            g.i(h11);
            this.f17287e = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
