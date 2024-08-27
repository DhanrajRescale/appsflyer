package com.assetgro.stockgro.ui.maintenance;

import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import ba.x1;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.a;
import ea.o;
import ea.v;
import gd.b;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import ls.n0;
import p004if.c;
import qu.i0;
import qu.r0;
import re.d;
import ub.f;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/maintenance/MaintenanceWindowActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/maintenance/MaintenanceWindowViewModel;", "Lba/x1;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MaintenanceWindowActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9611k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_maintenance_window;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((MaintenanceWindowViewModel) x()).f9614p.observe(this, new d(17, new f(this, 20)));
    }

    @Override // gd.b
    public final void I() {
        qf.b section;
        Object parcelableExtra = getIntent().getParcelableExtra("DATA");
        if (parcelableExtra instanceof qf.b) {
            section = (qf.b) parcelableExtra;
        } else {
            section = null;
        }
        if (section != null) {
            MaintenanceWindowViewModel maintenanceWindowViewModel = (MaintenanceWindowViewModel) x();
            Intrinsics.checkNotNullParameter(section, "<set-?>");
            maintenanceWindowViewModel.f9613o = section;
            MaintenanceWindowViewModel maintenanceWindowViewModel2 = (MaintenanceWindowViewModel) x();
            Intrinsics.checkNotNullParameter(section, "section");
            ((x1) w()).f6595s.f4642s.setText(maintenanceWindowViewModel2.f9612n.a(section));
        }
        if (getIntent().getBooleanExtra("SHOW_TOOLBAR", false)) {
            ((x1) w()).f6596t.setVisibility(0);
            x1 x1Var = (x1) w();
            String stringExtra = getIntent().getStringExtra("TOOLBAR_TITLE");
            if (stringExtra == null) {
                stringExtra = getString(R.string.app_name);
            }
            x1Var.f6596t.setTitle(stringExtra);
            Toolbar toolbar = ((x1) w()).f6596t;
            Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
            v(toolbar);
            x1 x1Var2 = (x1) w();
            x1Var2.f6596t.setNavigationOnClickListener(new c(this, 4));
            return;
        }
        ((x1) w()).f6596t.setVisibility(8);
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onResume() {
        super.onResume();
        MaintenanceWindowViewModel maintenanceWindowViewModel = (MaintenanceWindowViewModel) x();
        g.H(u0.f(maintenanceWindowViewModel), r0.f32256b, null, new qf.d(maintenanceWindowViewModel, null), 2);
    }

    @Override // gd.b
    public final void z(a activityComponent) {
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
        ca.c factory = new ca.c(a0.a(MaintenanceWindowViewModel.class), new o(schedulerProvider, compositeDisposable, userRepository, maintenanceConfigManager, 1));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, MaintenanceWindowViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MaintenanceWindowViewModel.class, "<this>", MaintenanceWindowViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MaintenanceWindowViewModel maintenanceWindowViewModel = (MaintenanceWindowViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(maintenanceWindowViewModel);
            this.f17254b = maintenanceWindowViewModel;
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
