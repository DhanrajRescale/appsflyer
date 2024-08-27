package com.assetgro.stockgro.feature_social.presentation.feed.streams;

import android.content.Context;
import android.view.View;
import androidx.activity.w;
import androidx.activity.x;
import androidx.compose.foundation.layout.e;
import androidx.fragment.app.j0;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import b1.c;
import b1.d;
import ba.gh;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.b;
import da.f;
import ea.h0;
import ea.i0;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import sb.a;
import sb.o;
import yk.g;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/assetgro/stockgro/feature_social/presentation/feed/streams/FeedStreamComposeFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_social/presentation/feed/streams/FeedStreamViewModel;", "Lba/gh;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FeedStreamComposeFragment extends m<FeedStreamViewModel, gh> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f8829j = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f8830g = new i(a0.a(a.class), new z1(this, 14));

    /* renamed from: h, reason: collision with root package name */
    public CommentsViewModel f8831h;

    /* renamed from: i, reason: collision with root package name */
    public x f8832i;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_feed_stream_compose;
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        FeedStreamViewModel feedStreamViewModel = (FeedStreamViewModel) r();
        String str = H().f34425a;
        String str2 = H().f34426b;
        boolean z10 = H().f34428d;
        feedStreamViewModel.k(new o(str, str2, H().f34427c, H().f34429e, z10, H().f34430f));
        this.f8832i = new x(this, 3);
        w onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        x xVar = this.f8832i;
        if (xVar != null) {
            onBackPressedDispatcher.a(this, xVar);
            gh ghVar = (gh) q();
            e eVar = new e(this, 16);
            Object obj = d.f3079a;
            ghVar.f4814s.setContent(new c(eVar, true, -1955944004));
            return;
        }
        Intrinsics.k("callback");
        throw null;
    }

    public final a H() {
        return (a) this.f8830g.getValue();
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        FeedRepository feedRepository = (FeedRepository) bVar.f14272x.get();
        g.i(feedRepository);
        FollowerRepository followerRepository = bVar.f();
        g.i(followerRepository);
        ChatRepository chatRepository = bVar.b();
        g.i(chatRepository);
        Context context = (Context) bVar.f14250b.get();
        g.i(context);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(feedRepository, "feedRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        m mVar = n0Var.f15238a;
        j0 requireActivity = mVar.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(FeedStreamViewModel.class), new i0(context, chatRepository, feedRepository, followerRepository, userRepository, k10, c10));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, FeedStreamViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(FeedStreamViewModel.class, "<this>", FeedStreamViewModel.class, "modelClass", "modelClass");
        String s7 = qu.i0.s(b10);
        if (s7 != null) {
            FeedStreamViewModel feedStreamViewModel = (FeedStreamViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(feedStreamViewModel);
            this.f17284b = feedStreamViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            g.i(h12);
            this.f17287e = h12;
            kq.e schedulerProvider = bVar.k();
            ct.a compositeDisposable = bVar.c();
            UserRepository userRepository2 = bVar.m();
            g.i(userRepository2);
            FeedRepository feedRepository2 = (FeedRepository) bVar.f14272x.get();
            g.i(feedRepository2);
            Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
            Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
            Intrinsics.checkNotNullParameter(userRepository2, "userRepository");
            Intrinsics.checkNotNullParameter(feedRepository2, "feedRepository");
            j0 requireActivity2 = mVar.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
            ca.c factory2 = new ca.c(a0.a(CommentsViewModel.class), new h0(schedulerProvider, compositeDisposable, userRepository2, feedRepository2, 0));
            h1 h13 = da.e.h(requireActivity2, "owner", factory2, "factory");
            y4.c defaultCreationExtras2 = da.e.u(requireActivity2, "owner", h13, "store");
            Intrinsics.checkNotNullParameter(factory2, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras2, "defaultCreationExtras");
            h.c h14 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h13, factory2, defaultCreationExtras2, CommentsViewModel.class, "modelClass");
            iu.e b11 = a3.a.b(CommentsViewModel.class, "<this>", CommentsViewModel.class, "modelClass", "modelClass");
            String s10 = qu.i0.s(b11);
            if (s10 != null) {
                CommentsViewModel commentsViewModel = (CommentsViewModel) h14.G(b11, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s10));
                g.j(commentsViewModel);
                this.f8831h = commentsViewModel;
                return;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
