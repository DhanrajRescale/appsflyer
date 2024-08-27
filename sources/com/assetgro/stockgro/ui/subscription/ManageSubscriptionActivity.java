package com.assetgro.stockgro.ui.subscription;

import androidx.lifecycle.h1;
import androidx.navigation.c0;
import androidx.navigation.t;
import bj.c;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.o;
import ea.v;
import ek.u;
import gd.b;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import okhttp3.HttpUrl;
import qg.a;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/subscription/ManageSubscriptionActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/subscription/ManageSubscriptionViewModel;", "Lba/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ManageSubscriptionActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10494k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_manage_subscription;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((ManageSubscriptionViewModel) x()).f10502u.observe(this, new c(7, new a(this, 22)));
    }

    @Override // gd.b
    public final void I() {
        ManageSubscriptionViewModel manageSubscriptionViewModel = (ManageSubscriptionViewModel) x();
        String stringExtra = getIntent().getStringExtra("planName");
        if (stringExtra == null) {
            stringExtra = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Intrinsics.checkNotNullParameter(stringExtra, "<set-?>");
        manageSubscriptionViewModel.f10499r = stringExtra;
        ((ManageSubscriptionViewModel) x()).f10500s = getIntent().getBooleanExtra("confirmation", false);
        String f10 = a3.a.f("Plan Name1: ", ((ManageSubscriptionViewModel) x()).f10499r);
        Object[] objArr = new Object[0];
        Intrinsics.checkNotNullParameter("ManageSubscriptionActivity", "tag");
        com.google.android.gms.internal.p002firebaseauthapi.a.g(f10, "s", objArr, "params", "ManageSubscriptionActivity").getClass();
        u.k(objArr);
        if (Intrinsics.a(getIntent().getStringExtra("DEEPLINK"), "PLAN_CONFIRMATION")) {
            ((ManageSubscriptionViewModel) x()).f10496o = true;
        }
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        Integer num;
        t t10 = g.t(this, R.id.subscription_nav_host_fragment);
        c0 f10 = t10.f();
        if (f10 != null) {
            num = Integer.valueOf(f10.f2181h);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.subscriptionPurchaseStatusFragment) {
            if (t10.r(R.id.mySubscriptionFragment, false, false)) {
                t10.b();
            }
        } else {
            if (((ManageSubscriptionViewModel) x()).f10497p) {
                return;
            }
            super.onBackPressed();
        }
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = activityComponent.f14246a.m();
        g.i(userRepository);
        qf.a maintenanceConfigManager = activityComponent.f14246a.g();
        g.i(maintenanceConfigManager);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(a0.a(ManageSubscriptionViewModel.class), new o(schedulerProvider, compositeDisposable, userRepository, maintenanceConfigManager, 2));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, ManageSubscriptionViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ManageSubscriptionViewModel.class, "<this>", ManageSubscriptionViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ManageSubscriptionViewModel manageSubscriptionViewModel = (ManageSubscriptionViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(manageSubscriptionViewModel);
            this.f17254b = manageSubscriptionViewModel;
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
