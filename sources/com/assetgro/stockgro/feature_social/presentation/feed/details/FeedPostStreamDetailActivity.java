package com.assetgro.stockgro.feature_social.presentation.feed.details;

import android.os.Bundle;
import androidx.lifecycle.h1;
import androidx.navigation.t;
import ba.a0;
import ca.c;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.v;
import gd.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import okhttp3.HttpUrl;
import qu.i0;
import sb.a;
import yk.g;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/assetgro/stockgro/feature_social/presentation/feed/details/FeedPostStreamDetailActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/feature_social/presentation/feed/details/FeedPostDetailsViewModel;", "Lba/a0;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FeedPostStreamDetailActivity extends b {
    @Override // gd.b
    public final int F() {
        return R.layout.activity_feed_post_stream_detail;
    }

    @Override // gd.b
    public final void I() {
        String str;
        ((a0) w()).p(this);
        t t10 = g.t(this, R.id.feed_stream_host_fragment);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            str = extras.getString("POST_ID");
        } else {
            str = null;
        }
        t10.w(R.navigation.feed_stream_navigation, new a("FEED_STREAM_POST_DETAILS", null, HttpUrl.FRAGMENT_ENCODE_SET, str, false, true).a());
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        c factory = new c(iu.a0.a(FeedPostDetailsViewModel.class), new ea.c(k10, compositeDisposable, userRepository, 6));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, FeedPostDetailsViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(FeedPostDetailsViewModel.class, "<this>", FeedPostDetailsViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            FeedPostDetailsViewModel feedPostDetailsViewModel = (FeedPostDetailsViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(feedPostDetailsViewModel);
            this.f17254b = feedPostDetailsViewModel;
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
