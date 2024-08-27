package com.assetgro.stockgro.ui.payments.kyc;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import ba.mi;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.b;
import da.f;
import ea.n0;
import gd.m;
import iu.a0;
import iu.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p004if.c;
import qu.i0;
import xf.a;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/kyc/KycMaintenanceFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/payments/kyc/KycMaintenanceViewModel;", "Lba/mi;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class KycMaintenanceFragment extends m<KycMaintenanceViewModel, mi> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f9686g = 0;

    public KycMaintenanceFragment() {
        e navArgsClass = a0.a(a.class);
        z1 argumentProducer = new z1(this, 25);
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_kyc_maintenance;
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        String string = getString(R.string.text_kyc_maintenance_simple_explaination);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#F66D00")), 33, 54, 33);
        spannableString.setSpan(new StyleSpan(1), 33, 54, 33);
        ((mi) q()).f5479t.setText(spannableString);
        mi miVar = (mi) q();
        miVar.f5478s.setOnClickListener(new c(this, 12));
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(KycMaintenanceViewModel.class), new ea.c(k10, c10, userRepository, 25));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, KycMaintenanceViewModel.class, "modelClass");
        e b10 = a3.a.b(KycMaintenanceViewModel.class, "<this>", KycMaintenanceViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            KycMaintenanceViewModel kycMaintenanceViewModel = (KycMaintenanceViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(kycMaintenanceViewModel);
            this.f17284b = kycMaintenanceViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            g.i(h12);
            this.f17287e = h12;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
