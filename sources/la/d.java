package la;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import b3.t;
import ba.zj;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.presentation.fno.search.MarketOptionSearchViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import d7.j;
import ea.n0;
import ea.q;
import f7.i;
import gd.m;
import ge.f;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lla/d;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_market/presentation/fno/search/MarketOptionSearchViewModel;", "Lba/zj;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends m<MarketOptionSearchViewModel, zj> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f24382h = 0;

    /* renamed from: g, reason: collision with root package name */
    public ja.c f24383g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_market_search_options_list;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((MarketOptionSearchViewModel) r()).f8652r.observe(this, new i(10, new c(this, 0)));
        ((MarketOptionSearchViewModel) r()).f9084g.observe(this, new i(10, new c(this, 1)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        setHasOptionsMenu(true);
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f24383g = new ja.c(lifecycle, new c(this, 3));
        zj zjVar = (zj) q();
        ja.c cVar = this.f24383g;
        if (cVar != null) {
            zjVar.f6854s.setAdapter(cVar);
            ((zj) q()).f6855t.setRefreshing(true);
            MarketOptionSearchViewModel.h((MarketOptionSearchViewModel) r());
            zj zjVar2 = (zj) q();
            zjVar2.f6855t.setOnRefreshListener(new t(this, 20));
            return;
        }
        Intrinsics.k("marketOptionLisAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        SearchView searchView;
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        MenuItem findItem = menu.findItem(R.id.action_search);
        findItem.setOnActionExpandListener(new a(this, 1));
        View actionView = findItem.getActionView();
        if (actionView instanceof SearchView) {
            searchView = (SearchView) actionView;
        } else {
            searchView = null;
        }
        if (searchView != null) {
            searchView.setOnSearchClickListener(new j(this, 7));
            o lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            searchView.setOnQueryTextListener(new f(lifecycle, new c(this, 2)));
        }
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        FnoRepository fnoRepository = bVar.e();
        g.i(fnoRepository);
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(fnoRepository, "fnoRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(MarketOptionSearchViewModel.class), new q(k10, c10, fnoRepository, userRepository, 4));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, MarketOptionSearchViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MarketOptionSearchViewModel.class, "<this>", MarketOptionSearchViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MarketOptionSearchViewModel marketOptionSearchViewModel = (MarketOptionSearchViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(marketOptionSearchViewModel);
            this.f17284b = marketOptionSearchViewModel;
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
