package bj;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import androidx.viewpager2.widget.ViewPager2;
import ba.qn;
import ba.rn;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.v2.presentation.analysis.StockAnalysisViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbj/f;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/stock/v2/presentation/analysis/StockAnalysisViewModel;", "Lba/qn;", "<init>", "()V", "ni/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class f extends gd.m<StockAnalysisViewModel, qn> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f7006h = 0;

    /* renamed from: g, reason: collision with root package name */
    public a f7007g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_analysis;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((StockAnalysisViewModel) r()).f10457p.observe(this, new c(0, new d(this, 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, a8.i] */
    @Override // gd.m
    public final void E(View view) {
        String stockName;
        Intrinsics.checkNotNullParameter(view, "view");
        rn rnVar = (rn) ((qn) q());
        rnVar.f5882u = (StockAnalysisViewModel) r();
        synchronized (rnVar) {
            rnVar.f5987x |= 2;
        }
        rnVar.a(24);
        rnVar.m();
        ((qn) q()).p(this);
        Bundle arguments = getArguments();
        if (arguments != null && (stockName = arguments.getString("STOCK_NAME")) != null) {
            StockAnalysisViewModel stockAnalysisViewModel = (StockAnalysisViewModel) r();
            Intrinsics.checkNotNullParameter(stockName, "stockName");
            if (WifiService.INSTANCE.getInstance().isOnline()) {
                e0 e0Var = stockAnalysisViewModel.f9084g;
                e0Var.postValue(Boolean.TRUE);
                try {
                    yk.g.H(u0.f(stockAnalysisViewModel), null, null, new o(stockAnalysisViewModel, stockName, null), 3);
                } catch (Exception e10) {
                    e0Var.postValue(Boolean.FALSE);
                    e10.printStackTrace();
                }
            }
        }
        androidx.lifecycle.o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        a aVar = new a(lifecycle, new d(this, 1));
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f7007g = aVar;
        ViewPager2 viewPager2 = ((qn) q()).f5881t;
        a aVar2 = this.f7007g;
        if (aVar2 != null) {
            viewPager2.setAdapter(aVar2);
            ((qn) q()).f5881t.a(new Object());
        } else {
            Intrinsics.k("stockAnalysisAdapter");
            throw null;
        }
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
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(StockAnalysisViewModel.class), new ea.a(k10, c10, stockRepository, userRepository, 5));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, StockAnalysisViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockAnalysisViewModel.class, "<this>", StockAnalysisViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockAnalysisViewModel stockAnalysisViewModel = (StockAnalysisViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(stockAnalysisViewModel);
            this.f17284b = stockAnalysisViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            yk.g.i(h12);
            this.f17287e = h12;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
