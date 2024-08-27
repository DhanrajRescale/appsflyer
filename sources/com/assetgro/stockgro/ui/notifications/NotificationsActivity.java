package com.assetgro.stockgro.ui.notifications;

import android.content.Intent;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import ba.s2;
import com.assetgro.stockgro.data.repository.NotificationsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import dp.e;
import ea.v;
import gd.b;
import ia.a;
import iu.a0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import p004if.c;
import qu.i0;
import re.d;
import rf.g;
import w.r0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/notifications/NotificationsActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/notifications/NotificationsViewModel;", "Lba/s2;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class NotificationsActivity extends b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f9619m = 0;

    /* renamed from: k, reason: collision with root package name */
    public g f9620k;

    /* renamed from: l, reason: collision with root package name */
    public e f9621l;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_notifications;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((NotificationsViewModel) x()).f9084g.observe(this, new d(19, new rf.e(this, 0)));
        ((NotificationsViewModel) x()).f9625o.observe(this, new d(19, new rf.e(this, 1)));
        ((NotificationsViewModel) x()).f9626p.observe(this, new d(19, new rf.e(this, 2)));
        ((NotificationsViewModel) x()).f9629s.observe(this, new d(19, new rf.e(this, 3)));
        ((NotificationsViewModel) x()).f9630t.observe(this, new d(19, new rf.e(this, 4)));
        ((NotificationsViewModel) x()).f9627q.observe(this, new d(19, new rf.e(this, 5)));
    }

    @Override // gd.b
    public final void I() {
        ((NotificationsViewModel) x()).h();
        s2 s2Var = (s2) w();
        s2Var.f6037v.setTitle(getString(R.string.notification));
        Toolbar toolbar = ((s2) w()).f6037v;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        s2 s2Var2 = (s2) w();
        int i10 = 6;
        s2Var2.f6037v.setNavigationOnClickListener(new c(this, i10));
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        g gVar = new g(lifecycle, new rf.e(this, i10));
        this.f9620k = gVar;
        gVar.u(new ArrayList());
        s2 s2Var3 = (s2) w();
        g gVar2 = this.f9620k;
        if (gVar2 != null) {
            s2Var3.f6035t.setAdapter(gVar2);
            ((s2) w()).f6037v.getMenu().findItem(R.id.action_filter).setOnMenuItemClickListener(new a(this, 1));
            s2 s2Var4 = (s2) w();
            s2Var4.f6036u.setOnRefreshListener(new vc.b(this, 14));
            e Y0 = dp.b.Y0(this);
            Intrinsics.checkNotNullExpressionValue(Y0, "create(...)");
            this.f9621l = Y0;
            return;
        }
        Intrinsics.k("notificationsCategoryAdapter");
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
        kq.e k10 = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        NotificationsRepository notificationsRepository = (NotificationsRepository) activityComponent.f14246a.f14270v.get();
        yk.g.i(notificationsRepository);
        UserRepository userRepository = com.google.android.gms.internal.p002firebaseauthapi.a.f(activityComponent.f14246a, vVar, k10, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(notificationsRepository, "notificationsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(NotificationsViewModel.class), new r0(k10, compositeDisposable, notificationsRepository, userRepository, 5));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, NotificationsViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(NotificationsViewModel.class, "<this>", NotificationsViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            NotificationsViewModel notificationsViewModel = (NotificationsViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(notificationsViewModel);
            this.f17254b = notificationsViewModel;
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
