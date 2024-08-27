package com.assetgro.stockgro.ui.payments.kyc;

import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.j0;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.ii;
import ba.j9;
import com.assetgro.stockgro.data.model.KycMessage;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.b;
import da.f;
import ea.n0;
import gd.m;
import iu.a0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import m4.d;
import p004if.c;
import qu.i0;
import r3.k;
import xf.a;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/kyc/KycCompletedFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/payments/kyc/KycCompletedViewModel;", "Lba/ii;", "<init>", "()V", "de/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class KycCompletedFragment extends m<KycCompletedViewModel, ii> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f9661h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f9662g = new i(a0.a(a.class), new z1(this, 24));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_kyc_completed;
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ii iiVar = (ii) q();
        iiVar.f5047s.setOnClickListener(new c(this, 9));
        List<KycMessage> messages = ((a) this.f9662g.getValue()).f40199a.getMessages();
        if (messages != null) {
            ((ii) q()).f5048t.setVisibility(0);
            ((ii) q()).f5048t.removeAllViews();
            for (KycMessage kycMessage : messages) {
                LayoutInflater from = LayoutInflater.from(getContext());
                ii iiVar2 = (ii) q();
                int i10 = j9.f5120u;
                DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
                j9 j9Var = (j9) m4.m.g(from, R.layout.cell_kyc_message, iiVar2.f5048t, false, null);
                Intrinsics.checkNotNullExpressionValue(j9Var, "inflate(...)");
                if (Intrinsics.a(kycMessage.isSuccess(), Boolean.TRUE)) {
                    j9Var.f5122t.setImageDrawable(k.getDrawable(j9Var.f27491e.getContext(), R.drawable.ic_kyc_message_success));
                } else {
                    j9Var.f5122t.setImageDrawable(k.getDrawable(j9Var.f27491e.getContext(), R.drawable.ic_kyc_message_failure));
                }
                j9Var.f5121s.setText(kycMessage.getMessage());
                ((ii) q()).f5048t.addView(j9Var.f27491e);
            }
        }
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(KycCompletedViewModel.class), new ea.c(k10, c10, userRepository, 24));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, KycCompletedViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(KycCompletedViewModel.class, "<this>", KycCompletedViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            KycCompletedViewModel kycCompletedViewModel = (KycCompletedViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(kycCompletedViewModel);
            this.f17284b = kycCompletedViewModel;
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
