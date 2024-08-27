package com.assetgro.stockgro.ui.payments.kyc;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.j0;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.j9;
import ba.yi;
import ca.c;
import com.assetgro.stockgro.data.model.KycMessage;
import com.assetgro.stockgro.data.model.KycResponseDto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.kyc.KycVerificationRejectedFragment;
import com.assetgro.stockgro.ui.payments.kyc.KycVerificationRejectedViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.b;
import da.f;
import ea.n0;
import gd.m;
import iu.a0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import m4.d;
import qu.i0;
import r3.k;
import xf.a;
import xf.v;
import xf.w;
import xf.x;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/kyc/KycVerificationRejectedFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/payments/kyc/KycVerificationRejectedViewModel;", "Lba/yi;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class KycVerificationRejectedFragment extends m<KycVerificationRejectedViewModel, yi> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f9697h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f9698g = new i(a0.a(a.class), new x(this, 0));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_kyc_verification_rejected;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((KycVerificationRejectedViewModel) r()).f9084g.observe(this, new v(0, new w(this, 0)));
        ((KycVerificationRejectedViewModel) r()).f9700o.observe(this, new v(0, new w(this, 1)));
        ((KycVerificationRejectedViewModel) r()).f9701p.observe(this, new v(0, new w(this, 2)));
        ((KycVerificationRejectedViewModel) r()).f9702q.observe(this, new v(0, new w(this, 3)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        List<KycMessage> messages = H().f40199a.getMessages();
        final int i10 = 0;
        if (messages != null) {
            ((yi) q()).f6738t.setVisibility(0);
            ((yi) q()).f6738t.removeAllViews();
            for (KycMessage kycMessage : messages) {
                LayoutInflater from = LayoutInflater.from(getContext());
                yi yiVar = (yi) q();
                int i11 = j9.f5120u;
                DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
                j9 j9Var = (j9) m4.m.g(from, R.layout.cell_kyc_message, yiVar.f6738t, false, null);
                Intrinsics.checkNotNullExpressionValue(j9Var, "inflate(...)");
                if (Intrinsics.a(kycMessage.isSuccess(), Boolean.TRUE)) {
                    j9Var.f5122t.setImageDrawable(k.getDrawable(requireContext(), R.drawable.ic_kyc_message_success));
                } else {
                    j9Var.f5122t.setImageDrawable(k.getDrawable(requireContext(), R.drawable.ic_kyc_message_failure));
                }
                j9Var.f5121s.setText(kycMessage.getMessage());
                ((yi) q()).f6738t.addView(j9Var.f27491e);
            }
        }
        KycVerificationRejectedViewModel kycVerificationRejectedViewModel = (KycVerificationRejectedViewModel) r();
        KycResponseDto kycData = H().f40199a;
        Intrinsics.checkNotNullParameter(kycData, "kycData");
        kycVerificationRejectedViewModel.f9703r = kycData;
        ((yi) q()).f6741w.setOnClickListener(new View.OnClickListener(this) { // from class: xf.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycVerificationRejectedFragment f40237b;

            {
                this.f40237b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i10;
                KycVerificationRejectedFragment this$0 = this.f40237b;
                switch (i12) {
                    case 0:
                        int i13 = KycVerificationRejectedFragment.f9697h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bundle bundle = new Bundle();
                        yf.g gVar = new yf.g();
                        gVar.setArguments(bundle);
                        gVar.show(this$0.getChildFragmentManager(), "KycRetryConfirmationBottomSheetDialogFragment");
                        return;
                    case 1:
                        int i14 = KycVerificationRejectedFragment.f9697h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        KycVerificationRejectedViewModel kycVerificationRejectedViewModel2 = (KycVerificationRejectedViewModel) this$0.r();
                        e0 e0Var = kycVerificationRejectedViewModel2.f9702q;
                        UserRepository userRepository = kycVerificationRejectedViewModel2.f9081d;
                        e0Var.setValue(new Pair(userRepository.getUserDisplayName(), userRepository.getUserPhoneNumber().toString()));
                        return;
                    default:
                        int i15 = KycVerificationRejectedFragment.f9697h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).l(R.id.moveToHelpCenter, this$0.H().a(), null);
                        return;
                }
            }
        });
        final int i12 = 1;
        ((yi) q()).f6737s.setOnClickListener(new View.OnClickListener(this) { // from class: xf.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycVerificationRejectedFragment f40237b;

            {
                this.f40237b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i122 = i12;
                KycVerificationRejectedFragment this$0 = this.f40237b;
                switch (i122) {
                    case 0:
                        int i13 = KycVerificationRejectedFragment.f9697h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bundle bundle = new Bundle();
                        yf.g gVar = new yf.g();
                        gVar.setArguments(bundle);
                        gVar.show(this$0.getChildFragmentManager(), "KycRetryConfirmationBottomSheetDialogFragment");
                        return;
                    case 1:
                        int i14 = KycVerificationRejectedFragment.f9697h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        KycVerificationRejectedViewModel kycVerificationRejectedViewModel2 = (KycVerificationRejectedViewModel) this$0.r();
                        e0 e0Var = kycVerificationRejectedViewModel2.f9702q;
                        UserRepository userRepository = kycVerificationRejectedViewModel2.f9081d;
                        e0Var.setValue(new Pair(userRepository.getUserDisplayName(), userRepository.getUserPhoneNumber().toString()));
                        return;
                    default:
                        int i15 = KycVerificationRejectedFragment.f9697h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).l(R.id.moveToHelpCenter, this$0.H().a(), null);
                        return;
                }
            }
        });
        String kycUsageMessage = H().f40199a.getKycUsageMessage();
        if (kycUsageMessage != null && kycUsageMessage.length() > 0) {
            ((yi) q()).f6739u.setVisibility(0);
            ((yi) q()).f6739u.setText(Html.fromHtml(H().f40199a.getKycUsageMessage()));
        } else {
            ((yi) q()).f6739u.setVisibility(8);
        }
        if (Intrinsics.a(H().f40199a.isKycAllowed(), Boolean.TRUE)) {
            ((yi) q()).f6741w.setVisibility(0);
            String string = getString(R.string.contact_support);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new UnderlineSpan(), string.length() - 20, string.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(-16776961), string.length() - 20, string.length(), 33);
            ((yi) q()).f6737s.setText(spannableString);
        } else {
            ((yi) q()).f6741w.setVisibility(8);
            String string2 = getString(R.string.contact_support_kyc_limit_exceeded);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            SpannableString spannableString2 = new SpannableString(string2);
            spannableString2.setSpan(new UnderlineSpan(), 15, 35, 33);
            spannableString2.setSpan(new ForegroundColorSpan(-16776961), 15, 35, 33);
            ((yi) q()).f6737s.setText(spannableString2);
        }
        final int i13 = 2;
        ((yi) q()).f6740v.setOnClickListener(new View.OnClickListener(this) { // from class: xf.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycVerificationRejectedFragment f40237b;

            {
                this.f40237b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i122 = i13;
                KycVerificationRejectedFragment this$0 = this.f40237b;
                switch (i122) {
                    case 0:
                        int i132 = KycVerificationRejectedFragment.f9697h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Bundle bundle = new Bundle();
                        yf.g gVar = new yf.g();
                        gVar.setArguments(bundle);
                        gVar.show(this$0.getChildFragmentManager(), "KycRetryConfirmationBottomSheetDialogFragment");
                        return;
                    case 1:
                        int i14 = KycVerificationRejectedFragment.f9697h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        KycVerificationRejectedViewModel kycVerificationRejectedViewModel2 = (KycVerificationRejectedViewModel) this$0.r();
                        e0 e0Var = kycVerificationRejectedViewModel2.f9702q;
                        UserRepository userRepository = kycVerificationRejectedViewModel2.f9081d;
                        e0Var.setValue(new Pair(userRepository.getUserDisplayName(), userRepository.getUserPhoneNumber().toString()));
                        return;
                    default:
                        int i15 = KycVerificationRejectedFragment.f9697h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).l(R.id.moveToHelpCenter, this$0.H().a(), null);
                        return;
                }
            }
        });
    }

    public final a H() {
        return (a) this.f9698g.getValue();
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        PaymentRepository paymentRepository = bVar.i();
        g.i(paymentRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        c factory = new c(a0.a(KycVerificationRejectedViewModel.class), new ea.k(k10, c10, userRepository, paymentRepository, 6));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, KycVerificationRejectedViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(KycVerificationRejectedViewModel.class, "<this>", KycVerificationRejectedViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            KycVerificationRejectedViewModel kycVerificationRejectedViewModel = (KycVerificationRejectedViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(kycVerificationRejectedViewModel);
            this.f17284b = kycVerificationRejectedViewModel;
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
