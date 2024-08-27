package qa;

import android.view.View;
import androidx.fragment.app.d1;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import b3.t;
import ba.bk;
import c2.e1;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.presentation.market.asset.MarketSharedViewModel;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.MarketStocksHostViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.f;
import ea.j0;
import ea.n0;
import f7.i;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import yk.g;
import yo.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lqa/b;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_market/presentation/market/asset/stocks/MarketStocksHostViewModel;", "Lba/bk;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends m<MarketStocksHostViewModel, bk> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f31879i = 0;

    /* renamed from: g, reason: collision with root package name */
    public MainSharedViewModel f31880g;

    /* renamed from: h, reason: collision with root package name */
    public MarketSharedViewModel f31881h;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_market_stocks_host;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        MarketSharedViewModel marketSharedViewModel = this.f31881h;
        if (marketSharedViewModel != null) {
            marketSharedViewModel.f8654n.observe(this, new i(15, new e1(this, 23)));
        } else {
            Intrinsics.k("marketSharedViewModel");
            throw null;
        }
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((bk) q()).p(this);
        bk bkVar = (bk) q();
        d1 childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        bkVar.f4300s.setAdapter(new c(childFragmentManager, lifecycle, getArguments()));
        bk bkVar2 = (bk) q();
        bk bkVar3 = (bk) q();
        new n(bkVar2.f4301t, bkVar3.f4300s, new t(this, 23)).a();
        byte[] bArr = kj.a.f23206a;
        if (kj.a.f23207b) {
            ((bk) q()).f4300s.setUserInputEnabled(true);
        } else {
            ((bk) q()).f4300s.setUserInputEnabled(false);
            ((bk) q()).f4301t.setVisibility(8);
        }
        bk bkVar4 = (bk) q();
        bkVar4.f4301t.a(new a(0));
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        MainSharedViewModel mainSharedViewModel = this.f31880g;
        if (mainSharedViewModel != null) {
            Intrinsics.checkNotNullParameter("market-stocks", "<set-?>");
            mainSharedViewModel.G = "market-stocks";
        } else {
            Intrinsics.k("mainSharedViewModel");
            throw null;
        }
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(MarketStocksHostViewModel.class), new j0(k10, c10, userRepository, 3));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, MarketStocksHostViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MarketStocksHostViewModel.class, "<this>", MarketStocksHostViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MarketStocksHostViewModel marketStocksHostViewModel = (MarketStocksHostViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(marketStocksHostViewModel);
            this.f17284b = marketStocksHostViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            g.i(h11);
            this.f17287e = h11;
            this.f31880g = fragmentComponent.f();
            this.f31881h = fragmentComponent.g();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
