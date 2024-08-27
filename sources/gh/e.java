package gh;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.h1;
import ba.up;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.UserProfileSharedViewModel;
import com.assetgro.stockgro.ui.profile.portfolio.UserPortfolioDetailsViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nt.h;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgh/e;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/profile/portfolio/UserPortfolioDetailsViewModel;", "Lba/up;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends m<UserPortfolioDetailsViewModel, up> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f17430j = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17431g;

    /* renamed from: h, reason: collision with root package name */
    public UserProfileSharedViewModel f17432h;

    /* renamed from: i, reason: collision with root package name */
    public xg.b f17433i;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_user_portfolio_details;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((UserPortfolioDetailsViewModel) r()).f10005o.observe(this, new ch.c(5, new d(this, 0)));
        UserProfileSharedViewModel userProfileSharedViewModel = this.f17432h;
        if (userProfileSharedViewModel != null) {
            userProfileSharedViewModel.f9976n.observe(this, new ch.c(5, new d(this, 1)));
        } else {
            Intrinsics.k("userProfileSharedViewModel");
            throw null;
        }
    }

    @Override // gd.m
    public final void E(View view) {
        String userId;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        boolean z10 = false;
        if (arguments != null && (userId = arguments.getString("USER_IDENTIFIER")) != null) {
            UserPortfolioDetailsViewModel userPortfolioDetailsViewModel = (UserPortfolioDetailsViewModel) r();
            Intrinsics.checkNotNullParameter(userId, "userId");
            userPortfolioDetailsViewModel.f9084g.postValue(Boolean.TRUE);
            h c10 = userPortfolioDetailsViewModel.f10004n.getUserDefaultPortfolio(userId).c(((kq.e) userPortfolioDetailsViewModel.f9079b).J());
            jt.d dVar = new jt.d(new vg.d(13, new f(userPortfolioDetailsViewModel, 0)), new vg.d(14, new f(userPortfolioDetailsViewModel, 1)));
            c10.a(dVar);
            userPortfolioDetailsViewModel.f9080c.e(dVar);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.getBoolean("IS_FROM_PROFILE")) {
            z10 = true;
        }
        this.f17431g = z10;
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
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
        ca.c factory = new ca.c(a0.a(UserPortfolioDetailsViewModel.class), new ea.m(k10, c10, portfolioRepository, userRepository, 10));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, UserPortfolioDetailsViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(UserPortfolioDetailsViewModel.class, "<this>", UserPortfolioDetailsViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            UserPortfolioDetailsViewModel userPortfolioDetailsViewModel = (UserPortfolioDetailsViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(userPortfolioDetailsViewModel);
            this.f17284b = userPortfolioDetailsViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            g.i(h11);
            this.f17287e = h11;
            this.f17432h = fragmentComponent.m();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
