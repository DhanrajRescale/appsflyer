package com.assetgro.stockgro.ui.social.presentation.video;

import android.os.Bundle;
import androidx.activity.q;
import androidx.activity.w;
import androidx.activity.x;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import ba.c5;
import ca.c;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.webengage.sdk.android.Analytics;
import da.a;
import ea.v;
import gd.b;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import qu.i0;
import s0.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/social/presentation/video/YoutubeVideoFullScreenActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/social/presentation/video/YoutubeVideoFullScreenViewModel;", "Lba/c5;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class YoutubeVideoFullScreenActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public YouTubePlayerView f10153k;

    /* renamed from: l, reason: collision with root package name */
    public q f10154l;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_youtube_video_full_screen;
    }

    @Override // gd.b
    public final void H() {
        super.H();
    }

    @Override // gd.b
    public final void I() {
        int i10;
        String string;
        YouTubePlayerView youtubePlayer = ((c5) w()).f4339s;
        Intrinsics.checkNotNullExpressionValue(youtubePlayer, "youtubePlayer");
        Intrinsics.checkNotNullParameter(youtubePlayer, "<set-?>");
        this.f10153k = youtubePlayer;
        Bundle extras = getIntent().getExtras();
        if (extras != null && (string = extras.getString("YOUTUBE_VIDEO_URL")) != null) {
            o lifecycle = getLifecycle();
            YouTubePlayerView youTubePlayerView = this.f10153k;
            if (youTubePlayerView != null) {
                lifecycle.a(youTubePlayerView);
                Bundle extras2 = getIntent().getExtras();
                float f10 = g.f34069a;
                if (extras2 != null) {
                    f10 = extras2.getFloat("YOUTUBE_VIDEO_ELAPSED_TIME", g.f34069a);
                }
                YouTubePlayerView youTubePlayerView2 = this.f10153k;
                if (youTubePlayerView2 != null) {
                    gi.b youTubePlayerListener = new gi.b(this, string, f10);
                    Intrinsics.checkNotNullParameter(youTubePlayerListener, "youTubePlayerListener");
                    youTubePlayerView2.f12118b.getWebViewYouTubePlayer$core_release().a(youTubePlayerListener);
                } else {
                    Intrinsics.k("youTubePlayerView");
                    throw null;
                }
            } else {
                Intrinsics.k("youTubePlayerView");
                throw null;
            }
        }
        Bundle extras3 = getIntent().getExtras();
        if (extras3 != null) {
            i10 = extras3.getBoolean("YOUTUBE_VIDEO_IS_LANDSCAPE");
        } else {
            i10 = 0;
        }
        setRequestedOrientation(i10 ^ 1);
        getWindow().addFlags(128);
        x xVar = new x(this, 5);
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        this.f10154l = xVar;
        w onBackPressedDispatcher = getOnBackPressedDispatcher();
        q onBackPressedCallback = this.f10154l;
        if (onBackPressedCallback != null) {
            onBackPressedDispatcher.getClass();
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            onBackPressedDispatcher.b(onBackPressedCallback);
            return;
        }
        Intrinsics.k("callback");
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
        c factory = new c(a0.a(YoutubeVideoFullScreenViewModel.class), new ea.c(k10, compositeDisposable, userRepository, 20));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, YoutubeVideoFullScreenViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(YoutubeVideoFullScreenViewModel.class, "<this>", YoutubeVideoFullScreenViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            YoutubeVideoFullScreenViewModel youtubeVideoFullScreenViewModel = (YoutubeVideoFullScreenViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(youtubeVideoFullScreenViewModel);
            this.f17254b = youtubeVideoFullScreenViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            yk.g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            yk.g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            yk.g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
