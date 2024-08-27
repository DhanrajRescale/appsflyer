package ia;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.d1;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import b3.t;
import ba.vj;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.presentation.fno.host.MarketOptionHostViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.assetgro.stockgro.ui.options.OptionsListHostActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.f;
import ea.j0;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import yk.g;
import yo.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lia/b;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_market/presentation/fno/host/MarketOptionHostViewModel;", "Lba/vj;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends m<MarketOptionHostViewModel, vj> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f19748h = 0;

    /* renamed from: g, reason: collision with root package name */
    public MainSharedViewModel f19749g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_market_option_host;
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((vj) q()).p(this);
        setHasOptionsMenu(true);
        vj vjVar = (vj) q();
        d1 childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle(0);
        }
        vjVar.f6443s.setAdapter(new c(childFragmentManager, lifecycle, arguments));
        vj vjVar2 = (vj) q();
        vj vjVar3 = (vj) q();
        new n(vjVar2.f6444t, vjVar3.f6443s, new t(this, 18)).a();
        ((vj) q()).f6443s.setUserInputEnabled(true);
    }

    @Override // androidx.fragment.app.g0
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (getActivity() instanceof OptionsListHostActivity) {
            inflater.inflate(R.menu.toolbar_menu_stocks, menu);
            MenuItem findItem = menu.findItem(R.id.action_search_placeholder);
            findItem.setVisible(true);
            findItem.setOnMenuItemClickListener(new a(this, 0));
            return;
        }
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        MainSharedViewModel mainSharedViewModel = this.f19749g;
        if (mainSharedViewModel != null) {
            Intrinsics.checkNotNullParameter("market-fno", "<set-?>");
            mainSharedViewModel.G = "market-fno";
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
        ca.c factory = new ca.c(a0.a(MarketOptionHostViewModel.class), new j0(k10, c10, userRepository, 1));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, MarketOptionHostViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MarketOptionHostViewModel.class, "<this>", MarketOptionHostViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MarketOptionHostViewModel marketOptionHostViewModel = (MarketOptionHostViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(marketOptionHostViewModel);
            this.f17284b = marketOptionHostViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            g.i(h11);
            this.f17287e = h11;
            this.f19749g = fragmentComponent.f();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
