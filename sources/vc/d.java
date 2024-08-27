package vc;

import androidx.lifecycle.h1;
import ba.qg;
import ba.wr;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.completed.CompletedLeaguePortfolioViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import ea.s;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvc/d;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/arena/completed/CompletedLeaguePortfolioViewModel;", "Lba/qg;", "<init>", "()V", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends m<CompletedLeaguePortfolioViewModel, qg> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f37937j = 0;

    /* renamed from: g, reason: collision with root package name */
    public wr f37938g;

    /* renamed from: h, reason: collision with root package name */
    public kg.a f37939h;

    /* renamed from: i, reason: collision with root package name */
    public rg.e f37940i;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_completed_league;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        CompletedLeaguePortfolioViewModel completedLeaguePortfolioViewModel = (CompletedLeaguePortfolioViewModel) r();
        completedLeaguePortfolioViewModel.f8972q.observe(this, new eb.c(14, new c(this, 5)));
        CompletedLeaguePortfolioViewModel completedLeaguePortfolioViewModel2 = (CompletedLeaguePortfolioViewModel) r();
        completedLeaguePortfolioViewModel2.f8973r.observe(this, new eb.c(14, new c(this, 6)));
        CompletedLeaguePortfolioViewModel completedLeaguePortfolioViewModel3 = (CompletedLeaguePortfolioViewModel) r();
        completedLeaguePortfolioViewModel3.f8974s.observe(this, new eb.c(14, new c(this, 7)));
        CompletedLeaguePortfolioViewModel completedLeaguePortfolioViewModel4 = (CompletedLeaguePortfolioViewModel) r();
        completedLeaguePortfolioViewModel4.f8975t.observe(this, new eb.c(14, new c(this, 8)));
        CompletedLeaguePortfolioViewModel completedLeaguePortfolioViewModel5 = (CompletedLeaguePortfolioViewModel) r();
        completedLeaguePortfolioViewModel5.f8976u.observe(this, new eb.c(14, new c(this, 9)));
        CompletedLeaguePortfolioViewModel completedLeaguePortfolioViewModel6 = (CompletedLeaguePortfolioViewModel) r();
        completedLeaguePortfolioViewModel6.f8977v.observe(this, new eb.c(14, new c(this, 10)));
        CompletedLeaguePortfolioViewModel completedLeaguePortfolioViewModel7 = (CompletedLeaguePortfolioViewModel) r();
        completedLeaguePortfolioViewModel7.f8977v.observe(this, new eb.c(14, new c(this, 11)));
        CompletedLeaguePortfolioViewModel completedLeaguePortfolioViewModel8 = (CompletedLeaguePortfolioViewModel) r();
        completedLeaguePortfolioViewModel8.f8978w.observe(this, new eb.c(14, new c(this, 12)));
        CompletedLeaguePortfolioViewModel completedLeaguePortfolioViewModel9 = (CompletedLeaguePortfolioViewModel) r();
        completedLeaguePortfolioViewModel9.f8981z.observe(this, new eb.c(14, new c(this, 13)));
        CompletedLeaguePortfolioViewModel completedLeaguePortfolioViewModel10 = (CompletedLeaguePortfolioViewModel) r();
        completedLeaguePortfolioViewModel10.A.observe(this, new eb.c(14, new c(this, 0)));
        CompletedLeaguePortfolioViewModel completedLeaguePortfolioViewModel11 = (CompletedLeaguePortfolioViewModel) r();
        completedLeaguePortfolioViewModel11.f8979x.observe(this, new eb.c(14, new c(this, 1)));
        CompletedLeaguePortfolioViewModel completedLeaguePortfolioViewModel12 = (CompletedLeaguePortfolioViewModel) r();
        completedLeaguePortfolioViewModel12.f8980y.observe(this, new eb.c(14, new c(this, 2)));
        CompletedLeaguePortfolioViewModel completedLeaguePortfolioViewModel13 = (CompletedLeaguePortfolioViewModel) r();
        completedLeaguePortfolioViewModel13.B.observe(this, new eb.c(14, new c(this, 3)));
        ((CompletedLeaguePortfolioViewModel) r()).f9084g.observe(this, new eb.c(14, new c(this, 4)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0033, code lost:
    
        if ((r0 instanceof com.assetgro.stockgro.data.model.arenaV2.ArenaGame) != false) goto L14;
     */
    @Override // gd.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(android.view.View r6) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.assetgro.stockgro.ui.base.BaseViewModel r6 = r5.r()
            com.assetgro.stockgro.ui.arena.completed.CompletedLeaguePortfolioViewModel r6 = (com.assetgro.stockgro.ui.arena.completed.CompletedLeaguePortfolioViewModel) r6
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 0
            if (r0 < r1) goto L21
            android.os.Bundle r0 = r5.getArguments()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = k2.m.i(r0)
            com.assetgro.stockgro.data.model.arenaV2.ArenaGame r0 = (com.assetgro.stockgro.data.model.arenaV2.ArenaGame) r0
            goto L35
        L1f:
            r0 = r2
            goto L35
        L21:
            android.os.Bundle r0 = r5.getArguments()
            if (r0 == 0) goto L30
            java.lang.String r1 = "LEAGUE"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.assetgro.stockgro.data.model.arenaV2.ArenaGame r0 = (com.assetgro.stockgro.data.model.arenaV2.ArenaGame) r0
            goto L31
        L30:
            r0 = r2
        L31:
            boolean r1 = r0 instanceof com.assetgro.stockgro.data.model.arenaV2.ArenaGame
            if (r1 == 0) goto L1f
        L35:
            if (r0 != 0) goto L38
            return
        L38:
            java.lang.String r1 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r6.f8971p = r0
            m4.m r6 = r5.q()
            ba.qg r6 = (ba.qg) r6
            com.assetgro.stockgro.ui.base.BaseViewModel r0 = r5.r()
            com.assetgro.stockgro.ui.arena.completed.CompletedLeaguePortfolioViewModel r0 = (com.assetgro.stockgro.ui.arena.completed.CompletedLeaguePortfolioViewModel) r0
            ba.rg r6 = (ba.rg) r6
            r6.f5862w = r0
            monitor-enter(r6)
            long r0 = r6.f5969x     // Catch: java.lang.Throwable -> Lb9
            r3 = 4
            long r0 = r0 | r3
            r6.f5969x = r0     // Catch: java.lang.Throwable -> Lb9
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb9
            r0 = 24
            r6.a(r0)
            r6.m()
            m4.m r6 = r5.q()
            ba.qg r6 = (ba.qg) r6
            ba.wr r6 = r6.f5858s
            java.lang.String r0 = "layoutLeaguePortfolioSnapshot"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            r5.f37938g = r6
            m4.m r6 = r5.q()
            ba.qg r6 = (ba.qg) r6
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r6 = r6.f5861v
            vc.b r0 = new vc.b
            r1 = 0
            r0.<init>(r5, r1)
            r6.setOnRefreshListener(r0)
            ba.wr r6 = r5.f37938g
            if (r6 == 0) goto Lb3
            androidx.cardview.widget.CardView r6 = r6.A
            r0 = 8
            r6.setVisibility(r0)
            ba.wr r6 = r5.f37938g
            if (r6 == 0) goto Lad
            android.widget.RelativeLayout r6 = r6.f6574t
            r6.setVisibility(r0)
            ba.wr r6 = r5.f37938g
            if (r6 == 0) goto La7
            android.view.View r6 = r6.f6575u
            r6.setVisibility(r0)
            com.assetgro.stockgro.ui.base.BaseViewModel r6 = r5.r()
            com.assetgro.stockgro.ui.arena.completed.CompletedLeaguePortfolioViewModel r6 = (com.assetgro.stockgro.ui.arena.completed.CompletedLeaguePortfolioViewModel) r6
            r6.i()
            return
        La7:
            java.lang.String r6 = "layoutLeaguePortfolioSnapshot"
            kotlin.jvm.internal.Intrinsics.k(r6)
            throw r2
        Lad:
            java.lang.String r6 = "layoutLeaguePortfolioSnapshot"
            kotlin.jvm.internal.Intrinsics.k(r6)
            throw r2
        Lb3:
            java.lang.String r6 = "layoutLeaguePortfolioSnapshot"
            kotlin.jvm.internal.Intrinsics.k(r6)
            throw r2
        Lb9:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.d.E(android.view.View):void");
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        PortfolioRepository portfolioRepository = bVar.j();
        yk.g.i(portfolioRepository);
        ArenaRepository arenaRepository = bVar.a();
        yk.g.i(arenaRepository);
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(CompletedLeaguePortfolioViewModel.class), new s(k10, c10, portfolioRepository, arenaRepository, userRepository, 1));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, CompletedLeaguePortfolioViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(CompletedLeaguePortfolioViewModel.class, "<this>", CompletedLeaguePortfolioViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            CompletedLeaguePortfolioViewModel completedLeaguePortfolioViewModel = (CompletedLeaguePortfolioViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(completedLeaguePortfolioViewModel);
            this.f17284b = completedLeaguePortfolioViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
