package com.assetgro.stockgro.feature_onboarding.presentation.register;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import androidx.navigation.i;
import ba.hl;
import c2.p0;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.register.NameRegisterFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.register.NameRegisterViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.drawer.about.AppTncActivity;
import com.assetgro.stockgro.widget.InputView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import da.b;
import ea.m0;
import ea.n0;
import eb.c;
import eb.f;
import eb.n;
import gd.m;
import iu.a0;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import qu.i0;
import ut.g;
import ut.h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/presentation/register/NameRegisterFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_onboarding/presentation/register/NameRegisterViewModel;", "Lba/hl;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class NameRegisterFragment extends m<NameRegisterViewModel, hl> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f8770i = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f8771g = new i(a0.a(n.class), new z1(this, 11));

    /* renamed from: h, reason: collision with root package name */
    public final g f8772h = h.a(new p0(this, 26));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_name_register;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((NameRegisterViewModel) r()).f9084g.observe(this, new c(1, new eb.m(this, 0)));
        ((NameRegisterViewModel) r()).f8777r.observe(this, new c(1, new eb.m(this, 1)));
        ((NameRegisterViewModel) r()).f8775p.observe(this, new c(1, new eb.m(this, 2)));
        ((NameRegisterViewModel) r()).f8776q.observe(this, new c(1, new eb.m(this, 3)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((hl) q()).f4951s.setTitle(R.string.name_field_hint);
        final int i10 = 1;
        if (getActivity() instanceof LoginActivity) {
            ((LoginViewModel) this.f8772h.getValue()).f8708t.observe(this, new c(1, new eb.m(this, 4)));
        }
        hl hlVar = (hl) q();
        final int i11 = 0;
        hlVar.f4954v.setOnClickListener(new View.OnClickListener(this) { // from class: eb.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NameRegisterFragment f15329b;

            {
                this.f15329b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                NameRegisterFragment this$0 = this.f15329b;
                switch (i12) {
                    case 0:
                        int i13 = NameRegisterFragment.f8770i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0.requireActivity(), (Class<?>) AppTncActivity.class));
                        return;
                    default:
                        int i14 = NameRegisterFragment.f8770i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String displayName = ((hl) this$0.q()).f4951s.getInputValue();
                        if (this$0.I(displayName)) {
                            this$0.x(new AnalyticEvent("app_display_name_submitted", new HashMap()));
                            this$0.A(new AnalyticEvent("app_display_name_submitted", new HashMap()));
                            NameRegisterViewModel nameRegisterViewModel = (NameRegisterViewModel) this$0.r();
                            String mobileNumber = this$0.H().f15332a;
                            String pin = this$0.H().f15334c;
                            String str = this$0.H().f15333b;
                            boolean z10 = this$0.H().f15337f;
                            String sessionId = this$0.H().f15335d;
                            String otp = this$0.H().f15336e;
                            Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
                            Intrinsics.checkNotNullParameter(displayName, "displayName");
                            Intrinsics.checkNotNullParameter(pin, "pin");
                            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
                            Intrinsics.checkNotNullParameter(otp, "otp");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                nameRegisterViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                                return;
                            } else {
                                nameRegisterViewModel.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(nameRegisterViewModel), null, null, new p(nameRegisterViewModel, mobileNumber, pin, displayName, str, z10, sessionId, otp, null), 3);
                                return;
                            }
                        }
                        return;
                }
            }
        });
        hl hlVar2 = (hl) q();
        hlVar2.f4951s.setOnInputViewAction(new f(this, 0));
        hl hlVar3 = (hl) q();
        hlVar3.f4951s.setOnInputViewActionDone(new f(this, 1));
        hl hlVar4 = (hl) q();
        hlVar4.f4953u.setOnClickListener(new View.OnClickListener(this) { // from class: eb.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NameRegisterFragment f15329b;

            {
                this.f15329b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i10;
                NameRegisterFragment this$0 = this.f15329b;
                switch (i12) {
                    case 0:
                        int i13 = NameRegisterFragment.f8770i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0.requireActivity(), (Class<?>) AppTncActivity.class));
                        return;
                    default:
                        int i14 = NameRegisterFragment.f8770i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String displayName = ((hl) this$0.q()).f4951s.getInputValue();
                        if (this$0.I(displayName)) {
                            this$0.x(new AnalyticEvent("app_display_name_submitted", new HashMap()));
                            this$0.A(new AnalyticEvent("app_display_name_submitted", new HashMap()));
                            NameRegisterViewModel nameRegisterViewModel = (NameRegisterViewModel) this$0.r();
                            String mobileNumber = this$0.H().f15332a;
                            String pin = this$0.H().f15334c;
                            String str = this$0.H().f15333b;
                            boolean z10 = this$0.H().f15337f;
                            String sessionId = this$0.H().f15335d;
                            String otp = this$0.H().f15336e;
                            Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
                            Intrinsics.checkNotNullParameter(displayName, "displayName");
                            Intrinsics.checkNotNullParameter(pin, "pin");
                            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
                            Intrinsics.checkNotNullParameter(otp, "otp");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                nameRegisterViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                                return;
                            } else {
                                nameRegisterViewModel.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(nameRegisterViewModel), null, null, new p(nameRegisterViewModel, mobileNumber, pin, displayName, str, z10, sessionId, otp, null), 3);
                                return;
                            }
                        }
                        return;
                }
            }
        });
    }

    public final n H() {
        return (n) this.f8771g.getValue();
    }

    public final boolean I(String str) {
        if (str != null && str.length() != 0) {
            if (str.length() >= 4 && str.length() <= 30) {
                InputView inputView = ((hl) q()).f4951s;
                inputView.m();
                inputView.setIcon(R.drawable.ic_success);
                return true;
            }
            hl hlVar = (hl) q();
            String string = getString(R.string.name_length_validation_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            InputView inputView2 = hlVar.f4951s;
            inputView2.setErrorText(string);
            inputView2.n();
        } else {
            hl hlVar2 = (hl) q();
            String string2 = getString(R.string.name_length_empty_validation_message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            InputView inputView3 = hlVar2.f4951s;
            inputView3.setErrorText(string2);
            inputView3.n();
        }
        return false;
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        jj.a appsFlyerAnalyticsEngineImpl = bVar.n();
        yk.g.i(appsFlyerAnalyticsEngineImpl);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(appsFlyerAnalyticsEngineImpl, "appsFlyerAnalyticsEngineImpl");
        ca.c factory = new ca.c(a0.a(NameRegisterViewModel.class), new m0(k10, c10, userRepository, appsFlyerAnalyticsEngineImpl, 0));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, NameRegisterViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(NameRegisterViewModel.class, "<this>", NameRegisterViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            NameRegisterViewModel nameRegisterViewModel = (NameRegisterViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(nameRegisterViewModel);
            this.f17284b = nameRegisterViewModel;
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
