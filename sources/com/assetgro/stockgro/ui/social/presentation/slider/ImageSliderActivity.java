package com.assetgro.stockgro.ui.social.presentation.slider;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.viewpager2.widget.ViewPager2;
import ba.y0;
import ca.c;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.ChatSharedViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import d4.g0;
import ea.v;
import ei.e;
import gd.b;
import gd.d;
import iu.a0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import m.j;
import okhttp3.HttpUrl;
import ph.a;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/social/presentation/slider/ImageSliderActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/social/presentation/slider/ImagesSliderViewModel;", "Lba/y0;", "<init>", "()V", "yk/o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ImageSliderActivity extends b {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f10130n = 0;

    /* renamed from: k, reason: collision with root package name */
    public Integer f10131k = 0;

    /* renamed from: l, reason: collision with root package name */
    public ChatSharedViewModel f10132l;

    /* renamed from: m, reason: collision with root package name */
    public e f10133m;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_images_slider;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [gd.d, ei.e] */
    /* JADX WARN: Type inference failed for: r4v2, types: [k7.w, java.lang.Object] */
    @Override // gd.b
    public final void I() {
        Integer num;
        ArrayList parcelableArrayList;
        Toolbar toolbar = ((y0) w()).f6703u;
        toolbar.setTitle(HttpUrl.FRAGMENT_ENCODE_SET);
        v(toolbar);
        u(toolbar);
        toolbar.setNavigationOnClickListener(new a(this, 4));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            num = Integer.valueOf(extras.getInt("POST_IMAGES_INDEX", 0));
        } else {
            num = null;
        }
        this.f10131k = num;
        o parentLifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(parentLifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        this.f10133m = new d(parentLifecycle, new Object());
        y0 y0Var = (y0) w();
        e eVar = this.f10133m;
        if (eVar != null) {
            y0Var.f6701s.setAdapter(eVar);
            ViewPager2 imagesViewPager = ((y0) w()).f6701s;
            Intrinsics.checkNotNullExpressionValue(imagesViewPager, "imagesViewPager");
            g0.a(imagesViewPager, new j(imagesViewPager, this, 15));
            Bundle extras2 = getIntent().getExtras();
            if (extras2 != null && (parcelableArrayList = extras2.getParcelableArrayList("POST_IMAGES")) != null) {
                if (parcelableArrayList.size() == 1) {
                    ((y0) w()).f6702t.setVisibility(8);
                } else {
                    ((y0) w()).f6701s.a(new ei.b(this, parcelableArrayList.size()));
                }
                e eVar2 = this.f10133m;
                if (eVar2 != null) {
                    eVar2.u(parcelableArrayList);
                } else {
                    Intrinsics.k("imagesViewPagerAdapter");
                    throw null;
                }
            }
            ChatSharedViewModel chatSharedViewModel = this.f10132l;
            if (chatSharedViewModel != null) {
                chatSharedViewModel.f9135p.postValue(HttpUrl.FRAGMENT_ENCODE_SET);
                return;
            } else {
                Intrinsics.k("chatSharedViewModel");
                throw null;
            }
        }
        Intrinsics.k("imagesViewPagerAdapter");
        throw null;
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        kq.e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        c factory = new c(a0.a(ImagesSliderViewModel.class), new ea.c(k10, compositeDisposable, userRepository, 11));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, ImagesSliderViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ImagesSliderViewModel.class, "<this>", ImagesSliderViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ImagesSliderViewModel imagesSliderViewModel = (ImagesSliderViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(imagesSliderViewModel);
            this.f17254b = imagesSliderViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            g.i(h11);
            this.f17258f = h11;
            this.f10132l = activityComponent.b();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
