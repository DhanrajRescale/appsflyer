package com.assetgro.stockgro.ui.payments.kyc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.oi;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.internal.p002firebaseauthapi.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.b;
import da.f;
import ea.n0;
import ek.u;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p004if.c;
import qu.i0;
import r3.k;
import xf.n;
import yf.e;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/kyc/KycPermissionFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/payments/kyc/KycPermissionViewModel;", "Lba/oi;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class KycPermissionFragment extends m<KycPermissionViewModel, oi> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f9687h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f9688g = new i(a0.a(n.class), new z1(this, 26));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_kyc_permission;
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        oi oiVar = (oi) q();
        oiVar.f5667s.setOnClickListener(new c(this, 13));
    }

    public final void H() {
        Intent intent = new Intent(requireActivity(), (Class<?>) KycWebViewActivity.class);
        intent.putExtra("KycData", ((n) this.f9688g.getValue()).f40226a);
        startActivity(intent);
        requireActivity().finish();
    }

    @Override // androidx.fragment.app.g0
    public final void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        Object[] objArr = new Object[0];
        Intrinsics.checkNotNullParameter("KycStepFragment", "tag");
        a.g("onRequestPermissionsResult " + i10 + " permissions " + permissions, "s", objArr, "params", "KycStepFragment").getClass();
        u.k(objArr);
        Object[] objArr2 = new Object[0];
        Intrinsics.checkNotNullParameter("KycStepFragment", "tag");
        a.g("onRequestPermissionsResult " + i10 + " grantResults " + grantResults, "s", objArr2, "params", "KycStepFragment").getClass();
        u.k(objArr2);
        if (i10 == 112) {
            if (k.checkSelfPermission(requireActivity(), "android.permission.CAMERA") == 0) {
                H();
                return;
            }
            Bundle bundle = new Bundle();
            e eVar = new e();
            eVar.setArguments(bundle);
            eVar.show(getChildFragmentManager(), "KycPermissionBottomSheetDialogFragment");
            return;
        }
        super.onRequestPermissionsResult(i10, permissions, grantResults);
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
        a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(KycPermissionViewModel.class), new ea.c(k10, c10, userRepository, 26));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = a.h(h10, factory, defaultCreationExtras, KycPermissionViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(KycPermissionViewModel.class, "<this>", KycPermissionViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            KycPermissionViewModel kycPermissionViewModel = (KycPermissionViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(kycPermissionViewModel);
            this.f17284b = kycPermissionViewModel;
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
