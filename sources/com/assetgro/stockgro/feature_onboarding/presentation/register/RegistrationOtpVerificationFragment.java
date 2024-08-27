package com.assetgro.stockgro.feature_onboarding.presentation.register;

import a3.a;
import android.app.Activity;
import android.content.IntentFilter;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.j0;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.pl;
import bb.d;
import c2.p0;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.OtpChannel;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.register.RegistrationOtpVerificationFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.register.RegistrationOtpVerificationViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.b;
import ea.n0;
import eb.r;
import eb.s;
import gd.m;
import iu.a0;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import kotlin.text.y;
import kq.e;
import okhttp3.HttpUrl;
import qu.i0;
import r3.k;
import ut.g;
import ut.h;
import z9.c;
import zq.f;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/presentation/register/RegistrationOtpVerificationFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_onboarding/presentation/register/RegistrationOtpVerificationViewModel;", "Lba/pl;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RegistrationOtpVerificationFragment extends m<RegistrationOtpVerificationViewModel, pl> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f8778j = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f8779g = new i(a0.a(s.class), new z1(this, 12));

    /* renamed from: h, reason: collision with root package name */
    public final c f8780h = new c(new d(this, 1));

    /* renamed from: i, reason: collision with root package name */
    public final g f8781i = h.a(new p0(this, 27));

    public static final void H(RegistrationOtpVerificationFragment registrationOtpVerificationFragment) {
        CardView[] cardViewArr = {((pl) registrationOtpVerificationFragment.q()).f5783v, ((pl) registrationOtpVerificationFragment.q()).f5787z, ((pl) registrationOtpVerificationFragment.q()).D};
        for (int i10 = 0; i10 < 3; i10++) {
            CardView cardView = cardViewArr[i10];
            cardView.setClickable(true);
            cardView.setEnabled(true);
            cardView.setAlpha(1.0f);
        }
        ((pl) registrationOtpVerificationFragment.q()).f5782u.setTextColor(k.getColor(registrationOtpVerificationFragment.requireContext(), R.color.deep_purple));
        ((pl) registrationOtpVerificationFragment.q()).f5786y.setTextColor(k.getColor(registrationOtpVerificationFragment.requireContext(), R.color.deep_purple));
        ((pl) registrationOtpVerificationFragment.q()).C.setTextColor(k.getColor(registrationOtpVerificationFragment.requireContext(), R.color.deep_purple));
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_otp_entry_verification;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((RegistrationOtpVerificationViewModel) r()).f8786r.observe(this, new eb.c(2, new r(this, 0)));
        ((LoginViewModel) this.f8781i.getValue()).f8708t.observe(this, new eb.c(2, new r(this, 1)));
        ((RegistrationOtpVerificationViewModel) r()).f8785q.observe(this, new eb.c(2, new r(this, 2)));
        ((RegistrationOtpVerificationViewModel) r()).f9084g.observe(this, new eb.c(2, new r(this, 3)));
        ((RegistrationOtpVerificationViewModel) r()).f8784p.observe(this, new eb.c(2, new r(this, 4)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RegistrationOtpVerificationViewModel registrationOtpVerificationViewModel = (RegistrationOtpVerificationViewModel) r();
        String str = I().f15355c;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        registrationOtpVerificationViewModel.f8783o = str;
        Intrinsics.checkNotNullParameter(I().f15353a, "<set-?>");
        String str2 = I().f15353a;
        pl plVar = (pl) q();
        String string = getString(R.string.we_just_sent_you_on_your_mobile_number);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        final int i10 = 2;
        final int i11 = 1;
        plVar.f5784w.setText(a.m(new Object[]{y.b0(2, str2)}, 1, string, "format(...)"));
        if (getActivity() instanceof LoginActivity) {
            ((LoginViewModel) this.f8781i.getValue()).f8708t.observe(this, new eb.c(2, new r(this, 5)));
        }
        pl plVar2 = (pl) q();
        final int i12 = 0;
        plVar2.F.setOnClickListener(new View.OnClickListener(this) { // from class: eb.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegistrationOtpVerificationFragment f15350b;

            {
                this.f15350b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str3;
                int i13 = i12;
                RegistrationOtpVerificationFragment this$0 = this.f15350b;
                switch (i13) {
                    case 0:
                        int i14 = RegistrationOtpVerificationFragment.f8778j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Editable text = ((pl) this$0.q()).f5785x.getText();
                        if (text == null || (str3 = text.toString()) == null) {
                            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if ((!w.C(str3)) && str3.length() == 6) {
                            ((RegistrationOtpVerificationViewModel) this$0.r()).i(str3);
                        }
                        this$0.x(new AnalyticEvent("app_otp_submitted", new HashMap()));
                        this$0.A(new AnalyticEvent("app_otp_submitted", new HashMap()));
                        return;
                    case 1:
                        int i15 = RegistrationOtpVerificationFragment.f8778j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                    default:
                        int i16 = RegistrationOtpVerificationFragment.f8778j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                }
            }
        });
        pl plVar3 = (pl) q();
        plVar3.f5780s.setOnClickListener(new View.OnClickListener(this) { // from class: eb.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegistrationOtpVerificationFragment f15350b;

            {
                this.f15350b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str3;
                int i13 = i11;
                RegistrationOtpVerificationFragment this$0 = this.f15350b;
                switch (i13) {
                    case 0:
                        int i14 = RegistrationOtpVerificationFragment.f8778j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Editable text = ((pl) this$0.q()).f5785x.getText();
                        if (text == null || (str3 = text.toString()) == null) {
                            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if ((!w.C(str3)) && str3.length() == 6) {
                            ((RegistrationOtpVerificationViewModel) this$0.r()).i(str3);
                        }
                        this$0.x(new AnalyticEvent("app_otp_submitted", new HashMap()));
                        this$0.A(new AnalyticEvent("app_otp_submitted", new HashMap()));
                        return;
                    case 1:
                        int i15 = RegistrationOtpVerificationFragment.f8778j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                    default:
                        int i16 = RegistrationOtpVerificationFragment.f8778j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                }
            }
        });
        pl plVar4 = (pl) q();
        plVar4.f5781t.setOnClickListener(new View.OnClickListener(this) { // from class: eb.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegistrationOtpVerificationFragment f15350b;

            {
                this.f15350b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str3;
                int i13 = i10;
                RegistrationOtpVerificationFragment this$0 = this.f15350b;
                switch (i13) {
                    case 0:
                        int i14 = RegistrationOtpVerificationFragment.f8778j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Editable text = ((pl) this$0.q()).f5785x.getText();
                        if (text == null || (str3 = text.toString()) == null) {
                            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if ((!w.C(str3)) && str3.length() == 6) {
                            ((RegistrationOtpVerificationViewModel) this$0.r()).i(str3);
                        }
                        this$0.x(new AnalyticEvent("app_otp_submitted", new HashMap()));
                        this$0.A(new AnalyticEvent("app_otp_submitted", new HashMap()));
                        return;
                    case 1:
                        int i15 = RegistrationOtpVerificationFragment.f8778j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                    default:
                        int i16 = RegistrationOtpVerificationFragment.f8778j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        q6.l.h(this$0).p();
                        return;
                }
            }
        });
    }

    public final s I() {
        return (s) this.f8779g.getValue();
    }

    public final void J(TextView textView, CardView cardView, OtpChannel otpChannel, View[] viewArr) {
        for (View view : viewArr) {
            f.m0(view);
        }
        textView.setText(otpChannel.getDisplayName());
        cardView.setOnClickListener(new bb.a(3, this, otpChannel));
    }

    @Override // androidx.fragment.app.g0
    public final void onPause() {
        super.onPause();
        requireActivity().unregisterReceiver(this.f8780h);
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        j0 requireActivity = requireActivity();
        int i10 = Build.VERSION.SDK_INT;
        c cVar = this.f8780h;
        if (i10 >= 34) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
            Unit unit = Unit.f23355a;
            requireActivity.registerReceiver(cVar, intentFilter, 4);
        } else {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
            Unit unit2 = Unit.f23355a;
            requireActivity.registerReceiver(cVar, intentFilter2);
        }
        SmsRetriever.getClient((Activity) requireActivity).startSmsRetriever();
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(RegistrationOtpVerificationViewModel.class), new ea.j0(k10, c10, userRepository, 10));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, RegistrationOtpVerificationViewModel.class, "modelClass");
        iu.e b10 = a.b(RegistrationOtpVerificationViewModel.class, "<this>", RegistrationOtpVerificationViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            RegistrationOtpVerificationViewModel registrationOtpVerificationViewModel = (RegistrationOtpVerificationViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(registrationOtpVerificationViewModel);
            this.f17284b = registrationOtpVerificationViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
