package com.assetgro.stockgro.ui.profile.followers;

import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import b3.t;
import ba.c0;
import ch.f;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.a;
import e.c;
import ea.v;
import gd.b;
import iu.a0;
import k7.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import qu.i0;
import yk.g;
import yo.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/profile/followers/FollowerFollowingActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/profile/followers/FollowerFollowingViewModel;", "Lba/c0;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FollowerFollowingActivity extends b {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f9977n = 0;

    /* renamed from: k, reason: collision with root package name */
    public final c f9978k;

    /* renamed from: l, reason: collision with root package name */
    public f f9979l;

    /* renamed from: m, reason: collision with root package name */
    public int f9980m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f.a, java.lang.Object] */
    public FollowerFollowingActivity() {
        c registerForActivityResult = registerForActivityResult(new Object(), new t(this, 8));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f9978k = registerForActivityResult;
    }

    @Override // gd.b
    public final int F() {
        return R.layout.activity_followers_following;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((FollowerFollowingViewModel) x()).f9982o.observe(this, new ch.c(1, new eh.c(this, 0)));
        ((FollowerFollowingViewModel) x()).f9084g.observe(this, new ch.c(1, new eh.c(this, 1)));
    }

    @Override // gd.b
    public final void I() {
        if (getIntent().getBooleanExtra("HIDE_FOLLOWING", false)) {
            ((c0) w()).f4330u.setVisibility(8);
            c0 c0Var = (c0) w();
            c0Var.f4331v.setText(getString(R.string.cta_followers));
        }
        c0 c0Var2 = (c0) w();
        p004if.c cVar = new p004if.c(this, 23);
        Toolbar toolbar = c0Var2.f4332w;
        toolbar.setNavigationOnClickListener(cVar);
        v(toolbar);
        setResult(-1);
        FollowerFollowingViewModel followerFollowingViewModel = (FollowerFollowingViewModel) x();
        String valueOf = String.valueOf(getIntent().getStringExtra("USER_IDENTIFIER"));
        Intrinsics.checkNotNullParameter(valueOf, "<set-?>");
        followerFollowingViewModel.f9981n = valueOf;
        this.f9980m = getIntent().getIntExtra("FOLLOWER_FOLLOWING", 0);
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        f fVar = new f(lifecycle, new eh.c(this, 2));
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f9979l = fVar;
        fVar.f22653c = y0.f22625b;
        fVar.f22651a.g();
        c0 c0Var3 = (c0) w();
        f fVar2 = this.f9979l;
        if (fVar2 != null) {
            c0Var3.f4328s.setAdapter(fVar2);
            FollowerFollowingViewModel followerFollowingViewModel2 = (FollowerFollowingViewModel) x();
            g.H(u0.f(followerFollowingViewModel2), null, null, new eh.g(followerFollowingViewModel2, null), 3);
            c0 c0Var4 = (c0) w();
            c0 c0Var5 = (c0) w();
            new n(c0Var4.f4330u, c0Var5.f4328s, new vc.b(this, 21)).a();
            return;
        }
        Intrinsics.k("followerFollowingViewPagerAdapter");
        throw null;
    }

    @Override // gd.b
    public final void z(a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(FollowerFollowingViewModel.class), new ea.c(k10, compositeDisposable, userRepository, 9));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, FollowerFollowingViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(FollowerFollowingViewModel.class, "<this>", FollowerFollowingViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            FollowerFollowingViewModel followerFollowingViewModel = (FollowerFollowingViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(followerFollowingViewModel);
            this.f17254b = followerFollowingViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
