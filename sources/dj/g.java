package dj;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import ba.po;
import ba.qo;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.v2.presentation.overview.StockOverviewV2ViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ldj/g;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/v2/presentation/overview/StockOverviewV2ViewModel;", "Lba/po;", "<init>", "()V", "ni/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class g extends m<StockOverviewV2ViewModel, po> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f14397h = 0;

    /* renamed from: g, reason: collision with root package name */
    public a f14398g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_overview_v2;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((StockOverviewV2ViewModel) r()).f10492p.observe(this, new bj.c(6, new f(this, 0)));
    }

    @Override // gd.m
    public final void E(View view) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        qo qoVar = (qo) ((po) q());
        qoVar.f5796w = (StockOverviewV2ViewModel) r();
        synchronized (qoVar) {
            qoVar.f5884x |= 2;
        }
        qoVar.a(24);
        qoVar.m();
        ((po) q()).p(this);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("STOCK_NAME")) != null) {
            ((StockOverviewV2ViewModel) r()).h(string);
        }
        ((po) q()).f5795v.setOnRefreshListener(new e(this, 0));
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f14398g = new a(lifecycle, new f(this, 1), new f(this, 2));
        RecyclerView recyclerView = ((po) q()).f5793t;
        a aVar = this.f14398g;
        if (aVar != null) {
            recyclerView.setAdapter(aVar);
            if (kj.a.f23207b) {
                ((po) q()).f5794u.setVisibility(8);
            } else {
                ((po) q()).f5794u.setVisibility(0);
            }
            ((po) q()).f5794u.setOnClickListener(new ph.a(this, 14));
            return;
        }
        Intrinsics.k("stockOverviewSectionAdapter");
        throw null;
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
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(StockOverviewV2ViewModel.class), new ea.a(k10, c10, stockRepository, userRepository, 12));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, StockOverviewV2ViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockOverviewV2ViewModel.class, "<this>", StockOverviewV2ViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockOverviewV2ViewModel stockOverviewV2ViewModel = (StockOverviewV2ViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(stockOverviewV2ViewModel);
            this.f17284b = stockOverviewV2ViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            fragmentComponent.l();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
