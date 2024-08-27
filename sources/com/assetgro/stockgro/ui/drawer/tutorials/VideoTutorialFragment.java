package com.assetgro.stockgro.ui.drawer.tutorials;

import android.view.View;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import ba.yp;
import ca.c;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.b;
import df.a;
import ea.j0;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import re.d;
import ub.f;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/drawer/tutorials/VideoTutorialFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/drawer/tutorials/VideoTutorialViewModel;", "Lba/yp;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class VideoTutorialFragment extends m<VideoTutorialViewModel, yp> {

    /* renamed from: g, reason: collision with root package name */
    public a f9516g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_video_tutorial;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((VideoTutorialViewModel) r()).f9518o.observe(this, new d(9, new f(this, 17)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f9516g = new a(lifecycle, this);
        yp ypVar = (yp) q();
        a aVar = this.f9516g;
        if (aVar != null) {
            ypVar.f6764s.setAdapter(aVar);
        } else {
            Intrinsics.k("tutorialAdapter");
            throw null;
        }
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        c factory = new c(a0.a(VideoTutorialViewModel.class), new j0(k10, c10, userRepository, 17));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, VideoTutorialViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(VideoTutorialViewModel.class, "<this>", VideoTutorialViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            VideoTutorialViewModel videoTutorialViewModel = (VideoTutorialViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(videoTutorialViewModel);
            this.f17284b = videoTutorialViewModel;
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
