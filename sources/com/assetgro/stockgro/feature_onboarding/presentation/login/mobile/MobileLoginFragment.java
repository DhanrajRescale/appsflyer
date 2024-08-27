package com.assetgro.stockgro.feature_onboarding.presentation.login.mobile;

import ab.j;
import ab.k;
import ab.l;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import androidx.navigation.i;
import androidx.navigation.t;
import ba.pk;
import c2.p0;
import ca.c;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.CountrySelectDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.MobileLoginFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.MobileLoginViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import da.b;
import da.f;
import ea.j0;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import kq.e;
import okhttp3.HttpUrl;
import qu.i0;
import ut.g;
import ut.h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/presentation/login/mobile/MobileLoginFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_onboarding/presentation/login/mobile/MobileLoginViewModel;", "Lba/pk;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MobileLoginFragment extends m<MobileLoginViewModel, pk> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f8723k = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f8724g = new i(a0.a(l.class), new z1(this, 5));

    /* renamed from: h, reason: collision with root package name */
    public String f8725h = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: i, reason: collision with root package name */
    public final i f8726i = new i(a0.a(l.class), new z1(this, 6));

    /* renamed from: j, reason: collision with root package name */
    public final g f8727j = h.a(new p0(this, 21));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_mobile_login;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((MobileLoginViewModel) r()).f9084g.observe(this, new f7.i(26, new j(this, 0)));
        ((MobileLoginViewModel) r()).f8728n.observe(this, new f7.i(26, new j(this, 1)));
        ((MobileLoginViewModel) r()).f8729o.observe(this, new f7.i(26, new j(this, 2)));
        ((MobileLoginViewModel) r()).f8731q.observe(this, new f7.i(26, new j(this, 3)));
        ((MobileLoginViewModel) r()).f8730p.observe(this, new f7.i(26, new j(this, 4)));
    }

    @Override // gd.m
    public final void E(View view) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(view, "view");
        if (getActivity() instanceof LoginActivity) {
            H().f8708t.observe(getViewLifecycleOwner(), new f7.i(26, new j(this, 5)));
            H().f8710v.observe(this, new f7.i(26, new j(this, 6)));
        }
        pk pkVar = (pk) q();
        final int i10 = 0;
        pkVar.f5776t.setOnInputViewAction(new k(this, i10));
        pk pkVar2 = (pk) q();
        pkVar2.f5776t.setOnSecondaryActionClicked(new k(this, i10));
        String str = ((l) this.f8726i.getValue()).f303c;
        if (str != null && str.length() > 0) {
            ((pk) q()).f5776t.setDisplayValue(str);
        }
        pk pkVar3 = (pk) q();
        pkVar3.f5776t.setOnInputViewActionDone(new k(this, i10));
        pk pkVar4 = (pk) q();
        pkVar4.f5777u.setOnClickListener(new View.OnClickListener(this) { // from class: ab.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MobileLoginFragment f291b;

            {
                this.f291b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String countryCode;
                int i11 = i10;
                MobileLoginFragment this$0 = this.f291b;
                switch (i11) {
                    case 0:
                        int i12 = MobileLoginFragment.f8723k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.I(this$0.f8725h)) {
                            ((pk) this$0.q()).f5776t.setOnInputViewActionDone(null);
                            MobileLoginViewModel mobileLoginViewModel = (MobileLoginViewModel) this$0.r();
                            String phoneNumber = this$0.f8725h;
                            CountrySelectDto countrySelectDto = (CountrySelectDto) this$0.H().f8708t.getValue();
                            if (countrySelectDto == null || (countryCode = countrySelectDto.getCode()) == null) {
                                countryCode = "IN";
                            }
                            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                mobileLoginViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                                return;
                            } else {
                                mobileLoginViewModel.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(mobileLoginViewModel), null, null, new o(mobileLoginViewModel, phoneNumber, countryCode, null), 3);
                                return;
                            }
                        }
                        ((pk) this$0.q()).f5776t.setErrorText(R.string.invalid_mobile_number);
                        return;
                    default:
                        int i13 = MobileLoginFragment.f8723k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        LoginViewModel H = this$0.H();
                        String inputValue = ((pk) this$0.q()).f5776t.getInputValue();
                        H.getClass();
                        Intrinsics.checkNotNullParameter(inputValue, "<set-?>");
                        H.f8707s = inputValue;
                        t h10 = q6.l.h(this$0);
                        new Bundle();
                        String str2 = this$0.f8725h;
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneNumber", str2);
                        h10.l(R.id.registrationFlow, bundle, null);
                        return;
                }
            }
        });
        final int i11 = 1;
        ((pk) q()).f5775s.f6346s.setOnClickListener(new View.OnClickListener(this) { // from class: ab.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MobileLoginFragment f291b;

            {
                this.f291b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String countryCode;
                int i112 = i11;
                MobileLoginFragment this$0 = this.f291b;
                switch (i112) {
                    case 0:
                        int i12 = MobileLoginFragment.f8723k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.I(this$0.f8725h)) {
                            ((pk) this$0.q()).f5776t.setOnInputViewActionDone(null);
                            MobileLoginViewModel mobileLoginViewModel = (MobileLoginViewModel) this$0.r();
                            String phoneNumber = this$0.f8725h;
                            CountrySelectDto countrySelectDto = (CountrySelectDto) this$0.H().f8708t.getValue();
                            if (countrySelectDto == null || (countryCode = countrySelectDto.getCode()) == null) {
                                countryCode = "IN";
                            }
                            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                mobileLoginViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                                return;
                            } else {
                                mobileLoginViewModel.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(mobileLoginViewModel), null, null, new o(mobileLoginViewModel, phoneNumber, countryCode, null), 3);
                                return;
                            }
                        }
                        ((pk) this$0.q()).f5776t.setErrorText(R.string.invalid_mobile_number);
                        return;
                    default:
                        int i13 = MobileLoginFragment.f8723k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        LoginViewModel H = this$0.H();
                        String inputValue = ((pk) this$0.q()).f5776t.getInputValue();
                        H.getClass();
                        Intrinsics.checkNotNullParameter(inputValue, "<set-?>");
                        H.f8707s = inputValue;
                        t h10 = q6.l.h(this$0);
                        new Bundle();
                        String str2 = this$0.f8725h;
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneNumber", str2);
                        h10.l(R.id.registrationFlow, bundle, null);
                        return;
                }
            }
        });
        i iVar = this.f8724g;
        if (((l) iVar.getValue()).f301a) {
            if (((l) iVar.getValue()).f302b) {
                string = getString(R.string.multiple_login_title);
            } else {
                string = getString(R.string.authentication_required);
            }
            Intrinsics.c(string);
            if (((l) iVar.getValue()).f302b) {
                string2 = getString(R.string.multiple_login_description);
            } else {
                string2 = getString(R.string.relogin_required_message);
            }
            Intrinsics.c(string2);
            new h.i(requireContext(), R.style.StockgroDialogTheme).setTitle(string).b(string2).a().setPositiveButton(R.string.login, new ab.h(0)).c();
        }
        pk pkVar5 = (pk) q();
        pkVar5.f5778v.setOnCheckedChangeListener(new ab.g(this, i10));
        ((pk) q()).f5778v.setChecked(true);
        String string3 = getString(R.string.title_terms_and_conditions);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = getString(R.string.text_privacy_policy);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("I agree to the ");
        spannableStringBuilder.append((CharSequence) getString(R.string.title_terms_and_conditions));
        spannableStringBuilder.setSpan(new ab.i(this, i10), spannableStringBuilder.length() - string3.length(), spannableStringBuilder.length(), 0);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-16776961), spannableStringBuilder.length() - string3.length(), spannableStringBuilder.length(), 0);
        spannableStringBuilder.append((CharSequence) " and ");
        spannableStringBuilder.append((CharSequence) string4);
        spannableStringBuilder.setSpan(new ab.i(this, i11), spannableStringBuilder.length() - string4.length(), spannableStringBuilder.length(), 0);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-16776961), spannableStringBuilder.length() - string4.length(), spannableStringBuilder.length(), 0);
        ((pk) q()).f5779w.setMovementMethod(LinkMovementMethod.getInstance());
        ((pk) q()).f5779w.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
    }

    public final LoginViewModel H() {
        return (LoginViewModel) this.f8727j.getValue();
    }

    public final boolean I(String mobileNo) {
        int i10;
        LoginViewModel H = H();
        H.getClass();
        Intrinsics.checkNotNullParameter(mobileNo, "mobileNo");
        if (!TextUtils.isEmpty(w.X(mobileNo).toString())) {
            int length = w.X(mobileNo).toString().length();
            CountrySelectDto countrySelectDto = (CountrySelectDto) H.f8708t.getValue();
            if (countrySelectDto != null) {
                i10 = countrySelectDto.getPhoneNumberLength();
            } else {
                i10 = 10;
            }
            if (length == i10) {
                ((pk) q()).f5776t.m();
                ((pk) q()).f5776t.setIcon(R.drawable.ic_success);
                return true;
            }
        }
        ((pk) q()).f5776t.C.f5918y.setVisibility(8);
        return false;
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        c factory = new c(a0.a(MobileLoginViewModel.class), new j0(k10, c10, userRepository, 4));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, MobileLoginViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MobileLoginViewModel.class, "<this>", MobileLoginViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MobileLoginViewModel mobileLoginViewModel = (MobileLoginViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(mobileLoginViewModel);
            this.f17284b = mobileLoginViewModel;
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
