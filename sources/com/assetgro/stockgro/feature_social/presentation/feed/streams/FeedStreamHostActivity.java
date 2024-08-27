package com.assetgro.stockgro.feature_social.presentation.feed.streams;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.lifecycle.h1;
import ba.y;
import ca.c;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.v;
import gd.b;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import okhttp3.HttpUrl;
import qu.i0;
import sb.a;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/feature_social/presentation/feed/streams/FeedStreamHostActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/feature_social/presentation/feed/streams/FeedStreamHostViewModel;", "Lba/y;", "<init>", "()V", "sb/b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FeedStreamHostActivity extends b {
    @Override // gd.b
    public final int F() {
        return R.layout.activity_feed_category_host;
    }

    @Override // gd.b
    public final void I() {
        String str;
        String str2;
        String str3;
        String string;
        String string2;
        String string3;
        ((y) w()).p(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null && (string3 = extras.getString("FEED_STREAM_TYPE")) != null) {
            str = string3;
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null && (string2 = extras2.getString("FEED_STREAM_ENTITY_ID")) != null) {
            str2 = string2;
        } else {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Bundle extras3 = getIntent().getExtras();
        if (extras3 != null && (string = extras3.getString("TOOLBAR_TITLE")) != null) {
            str3 = string;
        } else {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        g.t(this, R.id.feed_stream_host_fragment).w(R.navigation.feed_stream_navigation, new a(str, str2, str3, null, false, true).a());
    }

    @Override // h.m, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            configuration = resources.getConfiguration();
        } else {
            configuration = null;
        }
        if (configuration != null) {
            configuration.fontScale = 1.0f;
        }
        super.attachBaseContext(context);
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
        c factory = new c(a0.a(FeedStreamHostViewModel.class), new ea.c(k10, compositeDisposable, userRepository, 5));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, FeedStreamHostViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(FeedStreamHostViewModel.class, "<this>", FeedStreamHostViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            FeedStreamHostViewModel feedStreamHostViewModel = (FeedStreamHostViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(feedStreamHostViewModel);
            this.f17254b = feedStreamHostViewModel;
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
