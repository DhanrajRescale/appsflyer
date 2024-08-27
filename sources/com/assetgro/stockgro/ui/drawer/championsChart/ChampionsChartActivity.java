package com.assetgro.stockgro.ui.drawer.championsChart;

import android.content.Intent;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import ba.k;
import ca.c;
import com.assetgro.stockgro.data.repository.TopChartsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.v;
import gd.b;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import qu.i0;
import re.d;
import xe.a;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/drawer/championsChart/ChampionsChartActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/drawer/championsChart/ChampionsChartViewModel;", "Lba/k;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ChampionsChartActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9473l = 0;

    /* renamed from: k, reason: collision with root package name */
    public a f9474k;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_champions_chart;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((ChampionsChartViewModel) x()).f9084g.observe(this, new d(1, new we.a(this, 0)));
        ((ChampionsChartViewModel) x()).f9476o.observe(this, new d(1, new we.a(this, 1)));
    }

    @Override // gd.b
    public final void I() {
        ChampionsChartViewModel championsChartViewModel = (ChampionsChartViewModel) x();
        championsChartViewModel.f9084g.postValue(Boolean.TRUE);
        g.H(u0.f(championsChartViewModel), null, null, new we.b(championsChartViewModel, null), 3);
        this.f17260h = "champion-charts";
        k kVar = (k) w();
        String string = getString(R.string.champions_chart);
        Toolbar toolbar = kVar.f5190v;
        toolbar.setTitle(string);
        v(toolbar);
        u(toolbar);
        toolbar.setNavigationOnClickListener(new jd.a(this, 21));
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        a aVar = new a(lifecycle, new we.a(this, 2));
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f9474k = aVar;
        k kVar2 = (k) w();
        a aVar2 = this.f9474k;
        if (aVar2 != null) {
            kVar2.f5187s.setAdapter(aVar2);
            k kVar3 = (k) w();
            kVar3.f5189u.setOnRefreshListener(new vc.b(this, 11));
            return;
        }
        Intrinsics.k("championsAdapter");
        throw null;
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        if (isTaskRoot()) {
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        TopChartsRepository topChartsRepository = (TopChartsRepository) activityComponent.f14246a.f14269u.get();
        g.i(topChartsRepository);
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(topChartsRepository, "topChartsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        c factory = new c(a0.a(ChampionsChartViewModel.class), new ea.e(k10, compositeDisposable, topChartsRepository, userRepository, 0));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, ChampionsChartViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ChampionsChartViewModel.class, "<this>", ChampionsChartViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ChampionsChartViewModel championsChartViewModel = (ChampionsChartViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(championsChartViewModel);
            this.f17254b = championsChartViewModel;
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
