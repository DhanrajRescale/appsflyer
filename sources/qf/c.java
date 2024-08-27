package qf;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import ba.mj;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.assetgro.stockgro.ui.maintenance.MaintenanceV2ViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.f;
import ea.n0;
import ea.o;
import el.l;
import gd.i;
import h.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lqf/c;", "Lgd/i;", "Lcom/assetgro/stockgro/ui/maintenance/MaintenanceV2ViewModel;", "Lba/mj;", "<init>", "()V", "de/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends i<MaintenanceV2ViewModel, mj> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f31944h = 0;

    /* renamed from: g, reason: collision with root package name */
    public MainSharedViewModel f31945g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_maintenance_v2;
    }

    @Override // gd.m
    public final void E(View view) {
        Object obj;
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        b section = null;
        if (arguments != null) {
            obj = arguments.getParcelable("DATA");
        } else {
            obj = null;
        }
        if (obj instanceof b) {
            section = (b) obj;
        }
        if (section != null) {
            MaintenanceV2ViewModel maintenanceV2ViewModel = (MaintenanceV2ViewModel) r();
            Intrinsics.checkNotNullParameter(section, "section");
            ((mj) q()).f5480s.f4642s.setText(maintenanceV2ViewModel.f9610n.a(section));
        }
        Bundle arguments2 = getArguments();
        boolean z10 = false;
        if (arguments2 != null) {
            z10 = arguments2.getBoolean("SHOW_TOOLBAR", false);
        }
        ((mj) q()).f5481t.setVisibility(l.u(z10));
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string = arguments3.getString("TOOLBAR_TITLE")) == null) {
            string = getString(R.string.app_name);
        }
        Intrinsics.c(string);
        if (z10) {
            Toolbar toolbar = ((mj) q()).f5481t;
            Intrinsics.c(toolbar);
            p(toolbar);
            toolbar.setTitle(string);
            if (getActivity() instanceof m) {
                j0 activity = getActivity();
                Intrinsics.d(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                ((m) activity).u(toolbar);
                toolbar.setNavigationOnClickListener(new p004if.c(this, 3));
            }
        }
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        a maintenanceConfigManager = bVar.g();
        g.i(maintenanceConfigManager);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(MaintenanceV2ViewModel.class), new o(k10, c10, userRepository, maintenanceConfigManager, 6));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, MaintenanceV2ViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MaintenanceV2ViewModel.class, "<this>", MaintenanceV2ViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MaintenanceV2ViewModel maintenanceV2ViewModel = (MaintenanceV2ViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(maintenanceV2ViewModel);
            this.f17284b = maintenanceV2ViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            g.i(h12);
            this.f17287e = h12;
            this.f31945g = fragmentComponent.f();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
