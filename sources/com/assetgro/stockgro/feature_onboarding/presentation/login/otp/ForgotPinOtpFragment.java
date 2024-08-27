package com.assetgro.stockgro.feature_onboarding.presentation.login.otp;

import a3.a;
import android.app.Activity;
import android.content.IntentFilter;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.j0;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.pl;
import bb.d;
import bb.e;
import c2.p0;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.otp.ForgotPinOtpFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.login.otp.ForgotPinOtpViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.b;
import ea.o0;
import gd.m;
import iu.a0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import ls.n0;
import q6.l;
import qu.i0;
import ut.g;
import ut.h;
import z9.c;
import zq.f;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/presentation/login/otp/ForgotPinOtpFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_onboarding/presentation/login/otp/ForgotPinOtpViewModel;", "Lba/pl;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ForgotPinOtpFragment extends m<ForgotPinOtpViewModel, pl> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f8733j = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f8734g = new i(a0.a(e.class), new z1(this, 7));

    /* renamed from: h, reason: collision with root package name */
    public final c f8735h = new c(new d(this, 0));

    /* renamed from: i, reason: collision with root package name */
    public final g f8736i = h.a(new p0(this, 22));

    public static final void H(ForgotPinOtpFragment forgotPinOtpFragment) {
        CardView[] cardViewArr = {((pl) forgotPinOtpFragment.q()).f5783v, ((pl) forgotPinOtpFragment.q()).f5787z, ((pl) forgotPinOtpFragment.q()).D};
        for (int i10 = 0; i10 < 3; i10++) {
            CardView cardView = cardViewArr[i10];
            cardView.setClickable(true);
            cardView.setEnabled(true);
            cardView.setAlpha(1.0f);
        }
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_otp_entry_verification;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((ForgotPinOtpViewModel) r()).f8740q.observe(this, new f7.i(27, new bb.c(this, 0)));
        ((LoginViewModel) this.f8736i.getValue()).f8708t.observe(this, new f7.i(27, new bb.c(this, 1)));
        ((ForgotPinOtpViewModel) r()).f8741r.observe(this, new f7.i(27, new bb.c(this, 2)));
        ((ForgotPinOtpViewModel) r()).f9084g.observe(this, new f7.i(27, new bb.c(this, 3)));
        ((ForgotPinOtpViewModel) r()).f8742s.observe(this, new f7.i(27, new bb.c(this, 4)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ForgotPinOtpViewModel forgotPinOtpViewModel = (ForgotPinOtpViewModel) r();
        i iVar = this.f8734g;
        String str = ((e) iVar.getValue()).f6914b;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        forgotPinOtpViewModel.f8738o = str;
        ForgotPinOtpViewModel forgotPinOtpViewModel2 = (ForgotPinOtpViewModel) r();
        String str2 = ((e) iVar.getValue()).f6913a;
        Intrinsics.checkNotNullParameter(str2, "<set-?>");
        forgotPinOtpViewModel2.f8739p = str2;
        e eVar = (e) iVar.getValue();
        pl plVar = (pl) q();
        String string = getString(R.string.we_just_sent_you_on_your_mobile_number);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        final int i10 = 2;
        final int i11 = 1;
        plVar.f5784w.setText(a.m(new Object[]{y.b0(2, eVar.f6913a)}, 1, string, "format(...)"));
        pl plVar2 = (pl) q();
        final int i12 = 0;
        plVar2.F.setOnClickListener(new View.OnClickListener(this) { // from class: bb.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForgotPinOtpFragment f6908b;

            {
                this.f6908b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i12;
                ForgotPinOtpFragment this$0 = this.f6908b;
                switch (i13) {
                    case 0:
                        int i14 = ForgotPinOtpFragment.f8733j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String valueOf = String.valueOf(((pl) this$0.q()).f5785x.getText());
                        if (valueOf.length() == 6) {
                            ((ForgotPinOtpViewModel) this$0.r()).i(valueOf);
                            return;
                        }
                        return;
                    case 1:
                        int i15 = ForgotPinOtpFragment.f8733j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).p();
                        return;
                    default:
                        int i16 = ForgotPinOtpFragment.f8733j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).p();
                        return;
                }
            }
        });
        pl plVar3 = (pl) q();
        plVar3.f5780s.setOnClickListener(new View.OnClickListener(this) { // from class: bb.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForgotPinOtpFragment f6908b;

            {
                this.f6908b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i11;
                ForgotPinOtpFragment this$0 = this.f6908b;
                switch (i13) {
                    case 0:
                        int i14 = ForgotPinOtpFragment.f8733j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String valueOf = String.valueOf(((pl) this$0.q()).f5785x.getText());
                        if (valueOf.length() == 6) {
                            ((ForgotPinOtpViewModel) this$0.r()).i(valueOf);
                            return;
                        }
                        return;
                    case 1:
                        int i15 = ForgotPinOtpFragment.f8733j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).p();
                        return;
                    default:
                        int i16 = ForgotPinOtpFragment.f8733j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).p();
                        return;
                }
            }
        });
        pl plVar4 = (pl) q();
        plVar4.f5781t.setOnClickListener(new View.OnClickListener(this) { // from class: bb.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForgotPinOtpFragment f6908b;

            {
                this.f6908b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i10;
                ForgotPinOtpFragment this$0 = this.f6908b;
                switch (i13) {
                    case 0:
                        int i14 = ForgotPinOtpFragment.f8733j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String valueOf = String.valueOf(((pl) this$0.q()).f5785x.getText());
                        if (valueOf.length() == 6) {
                            ((ForgotPinOtpViewModel) this$0.r()).i(valueOf);
                            return;
                        }
                        return;
                    case 1:
                        int i15 = ForgotPinOtpFragment.f8733j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).p();
                        return;
                    default:
                        int i16 = ForgotPinOtpFragment.f8733j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).p();
                        return;
                }
            }
        });
    }

    public final void I(TextView textView, CardView cardView, String str, View[] viewArr) {
        for (View view : viewArr) {
            f.m0(view);
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        textView.setText(upperCase);
        cardView.setOnClickListener(new bb.a(0, this, str));
    }

    @Override // androidx.fragment.app.g0
    public final void onPause() {
        super.onPause();
        j0 activity = getActivity();
        if (activity != null) {
            activity.unregisterReceiver(this.f8735h);
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        j0 activity = getActivity();
        if (activity != null) {
            int i10 = Build.VERSION.SDK_INT;
            c cVar = this.f8735h;
            if (i10 >= 34) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
                Unit unit = Unit.f23355a;
                activity.registerReceiver(cVar, intentFilter, 4);
            } else {
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
                Unit unit2 = Unit.f23355a;
                activity.registerReceiver(cVar, intentFilter2);
            }
            SmsRetriever.getClient((Activity) activity).startSmsRetriever();
        }
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        kq.e schedulerProvider = bVar.k();
        ct.a compositeDisposable = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        o0 o0Var = fragmentComponent.f14280c;
        o0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(ForgotPinOtpViewModel.class), new ea.j0(schedulerProvider, compositeDisposable, userRepository, 20));
        m mVar = o0Var.f15244a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, ForgotPinOtpViewModel.class, "modelClass");
        iu.e b10 = a.b(ForgotPinOtpViewModel.class, "<this>", ForgotPinOtpViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ForgotPinOtpViewModel forgotPinOtpViewModel = (ForgotPinOtpViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(forgotPinOtpViewModel);
            this.f17284b = forgotPinOtpViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
