package ja;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.h1;
import b3.t;
import ba.xj;
import c2.e1;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.presentation.fno.option.MarketOptionsListViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lja/i;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_market/presentation/fno/option/MarketOptionsListViewModel;", "Lba/xj;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends gd.m<MarketOptionsListViewModel, xj> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f21269i = 0;

    /* renamed from: g, reason: collision with root package name */
    public MainSharedViewModel f21270g;

    /* renamed from: h, reason: collision with root package name */
    public c f21271h;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_market_options_list;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        MainSharedViewModel mainSharedViewModel = this.f21270g;
        if (mainSharedViewModel != null) {
            mainSharedViewModel.f9593x.observe(this, new f7.i(7, new e1(this, 20)));
        } else {
            Intrinsics.k("mainSharedViewModel");
            throw null;
        }
    }

    @Override // gd.m
    public final void E(View view) {
        String str;
        boolean z10;
        Intrinsics.checkNotNullParameter(view, "view");
        ((xj) q()).p(this);
        MarketOptionsListViewModel marketOptionsListViewModel = (MarketOptionsListViewModel) r();
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("EQUITY_OPTION_TYPE");
        } else {
            str = null;
        }
        if (str == null) {
            str = "stocks";
        }
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        marketOptionsListViewModel.f8630q = str;
        Bundle arguments2 = getArguments();
        int i10 = 0;
        if (arguments2 != null) {
            z10 = arguments2.getBoolean("CALL_FROM_PORTFOLIO");
        } else {
            z10 = false;
        }
        androidx.lifecycle.o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f21271h = new c(lifecycle, new g(this, z10, i10));
        xj xjVar = (xj) q();
        c cVar = this.f21271h;
        if (cVar != null) {
            xjVar.f6663v.setAdapter(cVar);
            ((xj) q()).f6664w.setOnRefreshListener(new t(this, 19));
            ((MarketOptionsListViewModel) r()).i(l.f21277a);
            androidx.lifecycle.t viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            yk.g.H(yk.j.X0(viewLifecycleOwner), null, null, new h(this, null), 3);
            return;
        }
        Intrinsics.k("marketOptionLisAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onPause() {
        super.onPause();
        fd.c cVar = ((MarketOptionsListViewModel) r()).f8631r;
        if (cVar != null) {
            cVar.a();
        } else {
            Intrinsics.k("timer");
            throw null;
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        ((MarketOptionsListViewModel) r()).j();
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        FnoRepository fnoRepository = bVar.e();
        yk.g.i(fnoRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(fnoRepository, "fnoRepository");
        ca.c factory = new ca.c(a0.a(MarketOptionsListViewModel.class), new ea.q(k10, c10, fnoRepository, userRepository, 5));
        gd.m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, MarketOptionsListViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MarketOptionsListViewModel.class, "<this>", MarketOptionsListViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MarketOptionsListViewModel marketOptionsListViewModel = (MarketOptionsListViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(marketOptionsListViewModel);
            this.f17284b = marketOptionsListViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            this.f21270g = fragmentComponent.f();
            yk.g.i(bVar.d());
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
