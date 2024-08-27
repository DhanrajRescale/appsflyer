package ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import ba.bv;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.detail.StockDetailHostActivity;
import com.assetgro.stockgro.ui.stock.search.MarketAssetSearchViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni.l;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lui/f;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/search/MarketAssetSearchViewModel;", "Lba/bv;", "Lni/l;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class f extends m<MarketAssetSearchViewModel, bv> implements l {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f37219h = 0;

    /* renamed from: g, reason: collision with root package name */
    public ni.a f37220g;

    @Override // gd.m
    public final int C() {
        return R.layout.layout_search_stocks;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((MarketAssetSearchViewModel) r()).f10387o.observe(this, new li.c(23, new e(this, 0)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        setHasOptionsMenu(true);
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f37220g = new ni.a(lifecycle, this);
        bv bvVar = (bv) q();
        ni.a aVar = this.f37220g;
        if (aVar != null) {
            bvVar.f4323s.setAdapter(aVar);
            ((MarketAssetSearchViewModel) r()).h();
        } else {
            Intrinsics.k("stockAdapter");
            throw null;
        }
    }

    @Override // ni.l
    public final void c(StockDto stockDto) {
        String str;
        Intrinsics.checkNotNullParameter(stockDto, "stockDto");
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("PORTFOLIO_ID");
        } else {
            str = null;
        }
        j0 activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) StockDetailHostActivity.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean("ADD_TO_PORTFOLIO", activity.getIntent().getBooleanExtra("ADD_TO_PORTFOLIO", false));
            bundle.putParcelable("PORTFOLIO", activity.getIntent().getParcelableExtra("PORTFOLIO"));
            bundle.putBoolean("CALL_FROM_PORTFOLIO", activity.getIntent().getBooleanExtra("CALL_FROM_PORTFOLIO", false));
            bundle.putString("STOCK_NAME", stockDto.getCode());
            bundle.putParcelable("STOCK", stockDto);
            bundle.putString("PORTFOLIO_ID", str);
            intent.putExtras(bundle);
            requireActivity().startActivityForResult(intent, 10016);
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        SearchView searchView;
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        MenuItem findItem = menu.findItem(R.id.action_search);
        findItem.setOnActionExpandListener(new la.a(this, 7));
        View actionView = findItem.getActionView();
        if (actionView instanceof SearchView) {
            searchView = (SearchView) actionView;
        } else {
            searchView = null;
        }
        if (searchView != null) {
            searchView.setOnSearchClickListener(new ph.a(this, 10));
            o lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            searchView.setOnQueryTextListener(new ge.f(lifecycle, new e(this, 1)));
        }
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        StockRepository stockRepository = bVar.l();
        g.i(stockRepository);
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(MarketAssetSearchViewModel.class), new ea.a(k10, c10, stockRepository, userRepository, 3));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, MarketAssetSearchViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MarketAssetSearchViewModel.class, "<this>", MarketAssetSearchViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MarketAssetSearchViewModel marketAssetSearchViewModel = (MarketAssetSearchViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(marketAssetSearchViewModel);
            this.f17284b = marketAssetSearchViewModel;
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
