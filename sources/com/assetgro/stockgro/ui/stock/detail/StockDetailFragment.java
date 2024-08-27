package com.assetgro.stockgro.ui.stock.detail;

import ag.b;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import ba.yn;
import ch.c;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowActivity;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import ea.r;
import gd.m;
import iu.a0;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import li.a;
import li.e;
import nt.f;
import qu.i0;
import ut.g;
import ut.h;
import ut.i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/stock/detail/StockDetailFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/detail/StockDetailViewModel;", "Lba/yn;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockDetailFragment extends m<StockDetailViewModel, yn> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f10186j = 0;

    /* renamed from: g, reason: collision with root package name */
    public StockSharedViewModel f10187g;

    /* renamed from: h, reason: collision with root package name */
    public FirebaseAnalytics f10188h;

    /* renamed from: i, reason: collision with root package name */
    public final g f10189i;

    public StockDetailFragment() {
        i iVar = i.f37392a;
        this.f10189i = h.b(new b(this, 20));
    }

    public static final void H(StockDetailFragment stockDetailFragment) {
        j0 activity = stockDetailFragment.getActivity();
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) MaintenanceWindowActivity.class);
            intent.putExtra("DATA", qf.b.f31941p);
            intent.putExtra("SHOW_TOOLBAR", true);
            intent.putExtra("TOOLBAR_TITLE", activity.getString(R.string.portfolio));
            activity.startActivity(intent);
            activity.finish();
        }
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_detail;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((StockDetailViewModel) r()).f9084g.observe(this, new c(29, new a(this, 0)));
        ((StockDetailViewModel) r()).f10196p.observe(this, new c(29, new a(this, 1)));
    }

    @Override // gd.m
    public final void E(View view) {
        StockDto stock;
        Intrinsics.checkNotNullParameter(view, "view");
        I(true);
        Parcelable parcelable = requireArguments().getParcelable("STOCK");
        if (parcelable instanceof StockDto) {
            stock = (StockDto) parcelable;
        } else {
            stock = null;
        }
        String string = requireArguments().getString("PORTFOLIO_ID");
        if (stock == null) {
            StockDetailViewModel stockDetailViewModel = (StockDetailViewModel) r();
            String stockId = (String) this.f10189i.getValue();
            Intrinsics.checkNotNullExpressionValue(stockId, "<get-stockId>(...)");
            Intrinsics.checkNotNullParameter(stockId, "stockId");
            at.m<BaseResponseDto<StockDetailDto>> stockDetails = stockDetailViewModel.f10194n.getStockDetails(stockId);
            hi.c cVar = new hi.c(13, e.f24863d);
            stockDetails.getClass();
            nt.b bVar = new nt.b(new nt.b(new nt.b(new f(stockDetails, cVar, 1).c(((kq.e) stockDetailViewModel.f9079b).J()), new hi.c(14, new li.g(stockDetailViewModel, 0)), 1), new hi.c(15, new li.g(stockDetailViewModel, 1)), 2), new hi.c(16, new li.g(stockDetailViewModel, 2)), 0);
            d dVar = new d(new hi.c(17, new li.g(stockDetailViewModel, 3)), new hi.c(18, new li.g(stockDetailViewModel, 4)));
            bVar.a(dVar);
            Intrinsics.checkNotNullExpressionValue(dVar, "subscribe(...)");
            stockDetailViewModel.f9080c.e(dVar);
        } else {
            StockDetailViewModel stockDetailViewModel2 = (StockDetailViewModel) r();
            Intrinsics.checkNotNullParameter(stock, "stock");
            stockDetailViewModel2.f10196p.setValue(stock);
        }
        MaterialButton buy = ((yn) q()).f6754s;
        Intrinsics.checkNotNullExpressionValue(buy, "buy");
        kj.f.e(buy, 50L, new li.b(this, string, 0));
        MaterialButton shortSell = ((yn) q()).f6756u;
        Intrinsics.checkNotNullExpressionValue(shortSell, "shortSell");
        kj.f.e(shortSell, 50L, new li.b(this, string, 1));
        ((yn) q()).f6760y.setNavigationOnClickListener(new ph.a(this, 5));
    }

    public final void I(boolean z10) {
        ((yn) q()).f6757v.setUserInputEnabled(z10);
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        StockRepository stockRepository = bVar.l();
        yk.g.i(stockRepository);
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        qf.a maintenanceConfigManager = bVar.g();
        yk.g.i(maintenanceConfigManager);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(a0.a(StockDetailViewModel.class), new r(k10, c10, stockRepository, userRepository, maintenanceConfigManager, 4));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, StockDetailViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockDetailViewModel.class, "<this>", StockDetailViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockDetailViewModel stockDetailViewModel = (StockDetailViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(stockDetailViewModel);
            this.f17284b = stockDetailViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            this.f10187g = fragmentComponent.l();
            FirebaseAnalytics d11 = bVar.d();
            yk.g.i(d11);
            this.f10188h = d11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
