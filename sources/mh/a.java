package mh;

import android.view.View;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import ba.t9;
import ca.c;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.timeline.ProfileTimelineViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.b;
import da.f;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmh/a;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/profile/timeline/ProfileTimelineViewModel;", "Lba/t9;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a extends m<ProfileTimelineViewModel, t9> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f27758g = 0;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_profile_timeline;
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        c factory = new c(a0.a(ProfileTimelineViewModel.class), new ea.j0(k10, c10, userRepository, 8));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, ProfileTimelineViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ProfileTimelineViewModel.class, "<this>", ProfileTimelineViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ProfileTimelineViewModel profileTimelineViewModel = (ProfileTimelineViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(profileTimelineViewModel);
            this.f17284b = profileTimelineViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            g.i(h12);
            this.f17287e = h12;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
