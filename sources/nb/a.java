package nb;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import ba.in;
import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_social.presentation.feed.home.SocialHomeFeedV2ViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.h0;
import ea.n0;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnb/a;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_social/presentation/feed/home/SocialHomeFeedV2ViewModel;", "Lba/in;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a extends gd.m<SocialHomeFeedV2ViewModel, in> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f28563g = 0;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_social_home_feed_compose;
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        in inVar = (in) q();
        androidx.compose.foundation.layout.e eVar = new androidx.compose.foundation.layout.e(this, 15);
        Object obj = b1.d.f3079a;
        inVar.f5065s.setContent(new b1.c(eVar, true, 1177729024));
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        FeedRepository feedRepository = (FeedRepository) bVar.f14272x.get();
        yk.g.i(feedRepository);
        Context context = (Context) bVar.f14250b.get();
        yk.g.i(context);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(feedRepository, "feedRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(SocialHomeFeedV2ViewModel.class), new h0(k10, c10, userRepository, feedRepository, 1));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, SocialHomeFeedV2ViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SocialHomeFeedV2ViewModel.class, "<this>", SocialHomeFeedV2ViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            SocialHomeFeedV2ViewModel socialHomeFeedV2ViewModel = (SocialHomeFeedV2ViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(socialHomeFeedV2ViewModel);
            this.f17284b = socialHomeFeedV2ViewModel;
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
