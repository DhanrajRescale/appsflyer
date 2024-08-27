package com.assetgro.stockgro.feature_onboarding.presentation.register;

import ab.k;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import androidx.navigation.i;
import ba.qx;
import ba.sk;
import c2.p0;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.CountrySelectDto;
import com.assetgro.stockgro.data.model.OtpChannel;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.register.MobileRegisterFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.register.MobileRegisterViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.MultipleCountryInputView;
import com.bumptech.glide.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ct.a;
import ea.j0;
import ea.o0;
import eb.c;
import eb.d;
import eb.e;
import gd.m;
import iu.a0;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import ls.n0;
import okhttp3.HttpUrl;
import qu.i0;
import ut.g;
import ut.h;
import zq.f;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/feature_onboarding/presentation/register/MobileRegisterFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/feature_onboarding/presentation/register/MobileRegisterViewModel;", "Lba/sk;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MobileRegisterFragment extends m<MobileRegisterViewModel, sk> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f8757j = 0;

    /* renamed from: g, reason: collision with root package name */
    public String f8758g = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: h, reason: collision with root package name */
    public final g f8759h = h.a(new p0(this, 25));

    /* renamed from: i, reason: collision with root package name */
    public final i f8760i = new i(a0.a(eb.g.class), new z1(this, 10));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_mobile_register;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((MobileRegisterViewModel) r()).f8762o.observe(this, new c(0, new e(this, 0)));
        ((MobileRegisterViewModel) r()).f8761n.observe(this, new c(0, new e(this, 1)));
        ((MobileRegisterViewModel) r()).f8765r.observe(this, new c(0, new e(this, 2)));
        ((MobileRegisterViewModel) r()).f9084g.observe(this, new c(0, new e(this, 3)));
        ((MobileRegisterViewModel) r()).f8763p.observe(this, new c(0, new e(this, 4)));
        ((MobileRegisterViewModel) r()).f8764q.observe(this, new c(0, new e(this, 5)));
        ((MobileRegisterViewModel) r()).f8768u.observe(this, new c(0, new e(this, 6)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!H().h()) {
            qx qxVar = ((sk) q()).f6096t.C;
            ImageView displayValueChevron = qxVar.f5913t;
            Intrinsics.checkNotNullExpressionValue(displayValueChevron, "displayValueChevron");
            f.M(displayValueChevron);
            ImageView displayValueImage = qxVar.f5914u;
            Intrinsics.checkNotNullExpressionValue(displayValueImage, "displayValueImage");
            f.M(displayValueImage);
        }
        final int i10 = 0;
        if (getActivity() instanceof LoginActivity) {
            H().f8708t.observe(getViewLifecycleOwner(), new c(0, new e(this, 7)));
            CountrySelectDto countrySelectDto = (CountrySelectDto) H().f8708t.getValue();
            if (countrySelectDto != null) {
                J(countrySelectDto);
            }
        }
        sk skVar = (sk) q();
        final int i11 = 1;
        skVar.f6096t.setOnSecondaryActionClicked(new k(this, i11));
        ((sk) q()).f6097u.getInputEditText().setAllCaps(true);
        sk skVar2 = (sk) q();
        skVar2.f6096t.setOnInputViewAction(new k(this, i11));
        String str = ((eb.g) this.f8760i.getValue()).f15310a;
        if (str != null && str.length() > 0) {
            ((sk) q()).f6096t.setDisplayValue(str);
        }
        sk skVar3 = (sk) q();
        skVar3.f6096t.setOnInputViewActionDone(new k(this, i11));
        sk skVar4 = (sk) q();
        skVar4.f6097u.setOnInputViewActionDone(new eb.f(this, i10));
        sk skVar5 = (sk) q();
        skVar5.f6099w.setOnClickListener(new View.OnClickListener(this) { // from class: eb.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MobileRegisterFragment f15301b;

            {
                this.f15301b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12;
                String str2;
                String str3;
                OtpChannel defaultOtpChannel;
                int i13 = i10;
                MobileRegisterFragment this$0 = this.f15301b;
                switch (i13) {
                    case 0:
                        int i14 = MobileRegisterFragment.f8757j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str4 = this$0.f8758g;
                        CountrySelectDto countrySelectDto2 = (CountrySelectDto) this$0.H().f8708t.getValue();
                        if (countrySelectDto2 != null) {
                            i12 = countrySelectDto2.getPhoneNumberLength();
                        } else {
                            i12 = 10;
                        }
                        if (this$0.I(i12, str4)) {
                            this$0.x(new AnalyticEvent("app_registration_started", new HashMap()));
                            this$0.A(new AnalyticEvent("app_registration_started", new HashMap()));
                            MobileRegisterViewModel mobileRegisterViewModel = (MobileRegisterViewModel) this$0.r();
                            String inputValue = ((sk) this$0.q()).f6097u.getInputValue();
                            Locale locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                            String invitationCode = inputValue.toUpperCase(locale);
                            Intrinsics.checkNotNullExpressionValue(invitationCode, "toUpperCase(...)");
                            String phoneNumber = this$0.f8758g;
                            CountrySelectDto countrySelectDto3 = (CountrySelectDto) this$0.H().f8708t.getValue();
                            if (countrySelectDto3 == null || (str2 = countrySelectDto3.getCode()) == null) {
                                str2 = "IN";
                            }
                            String countryCode = str2;
                            CountrySelectDto countrySelectDto4 = (CountrySelectDto) this$0.H().f8708t.getValue();
                            if (countrySelectDto4 == null || (defaultOtpChannel = countrySelectDto4.getDefaultOtpChannel()) == null || (str3 = defaultOtpChannel.getName()) == null) {
                                str3 = "sms";
                            }
                            String otpChannel = str3;
                            Intrinsics.checkNotNullParameter(invitationCode, "invitationCode");
                            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                            Intrinsics.checkNotNullParameter(otpChannel, "otpChannel");
                            mobileRegisterViewModel.f8766s = phoneNumber;
                            mobileRegisterViewModel.f8767t = invitationCode;
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                mobileRegisterViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                            } else {
                                mobileRegisterViewModel.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(mobileRegisterViewModel), null, null, new j(mobileRegisterViewModel, phoneNumber, countryCode, otpChannel, null), 3);
                            }
                            ((sk) this$0.q()).f6096t.setOnInputViewActionDone(null);
                            ((sk) this$0.q()).f6097u.setOnInputViewActionDone(null);
                            return;
                        }
                        return;
                    case 1:
                        int i15 = MobileRegisterFragment.f8757j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        LoginViewModel H = this$0.H();
                        String inputValue2 = ((sk) this$0.q()).f6096t.getInputValue();
                        H.getClass();
                        Intrinsics.checkNotNullParameter(inputValue2, "<set-?>");
                        H.f8707s = inputValue2;
                        androidx.navigation.t h10 = q6.l.h(this$0);
                        ab.l lVar = new ab.l(false, false, this$0.f8758g, 3);
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("isForcedLogout", lVar.f301a);
                        bundle.putBoolean("invalidSession", lVar.f302b);
                        bundle.putString("phoneNumber", lVar.f303c);
                        h10.w(R.navigation.login_navigation, bundle);
                        return;
                    default:
                        int i16 = MobileRegisterFragment.f8757j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((sk) this$0.q()).f6101y.f6482u.performClick();
                        return;
                }
            }
        });
        ((sk) q()).f6098v.f4414s.setOnClickListener(new View.OnClickListener(this) { // from class: eb.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MobileRegisterFragment f15301b;

            {
                this.f15301b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12;
                String str2;
                String str3;
                OtpChannel defaultOtpChannel;
                int i13 = i11;
                MobileRegisterFragment this$0 = this.f15301b;
                switch (i13) {
                    case 0:
                        int i14 = MobileRegisterFragment.f8757j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str4 = this$0.f8758g;
                        CountrySelectDto countrySelectDto2 = (CountrySelectDto) this$0.H().f8708t.getValue();
                        if (countrySelectDto2 != null) {
                            i12 = countrySelectDto2.getPhoneNumberLength();
                        } else {
                            i12 = 10;
                        }
                        if (this$0.I(i12, str4)) {
                            this$0.x(new AnalyticEvent("app_registration_started", new HashMap()));
                            this$0.A(new AnalyticEvent("app_registration_started", new HashMap()));
                            MobileRegisterViewModel mobileRegisterViewModel = (MobileRegisterViewModel) this$0.r();
                            String inputValue = ((sk) this$0.q()).f6097u.getInputValue();
                            Locale locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                            String invitationCode = inputValue.toUpperCase(locale);
                            Intrinsics.checkNotNullExpressionValue(invitationCode, "toUpperCase(...)");
                            String phoneNumber = this$0.f8758g;
                            CountrySelectDto countrySelectDto3 = (CountrySelectDto) this$0.H().f8708t.getValue();
                            if (countrySelectDto3 == null || (str2 = countrySelectDto3.getCode()) == null) {
                                str2 = "IN";
                            }
                            String countryCode = str2;
                            CountrySelectDto countrySelectDto4 = (CountrySelectDto) this$0.H().f8708t.getValue();
                            if (countrySelectDto4 == null || (defaultOtpChannel = countrySelectDto4.getDefaultOtpChannel()) == null || (str3 = defaultOtpChannel.getName()) == null) {
                                str3 = "sms";
                            }
                            String otpChannel = str3;
                            Intrinsics.checkNotNullParameter(invitationCode, "invitationCode");
                            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                            Intrinsics.checkNotNullParameter(otpChannel, "otpChannel");
                            mobileRegisterViewModel.f8766s = phoneNumber;
                            mobileRegisterViewModel.f8767t = invitationCode;
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                mobileRegisterViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                            } else {
                                mobileRegisterViewModel.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(mobileRegisterViewModel), null, null, new j(mobileRegisterViewModel, phoneNumber, countryCode, otpChannel, null), 3);
                            }
                            ((sk) this$0.q()).f6096t.setOnInputViewActionDone(null);
                            ((sk) this$0.q()).f6097u.setOnInputViewActionDone(null);
                            return;
                        }
                        return;
                    case 1:
                        int i15 = MobileRegisterFragment.f8757j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        LoginViewModel H = this$0.H();
                        String inputValue2 = ((sk) this$0.q()).f6096t.getInputValue();
                        H.getClass();
                        Intrinsics.checkNotNullParameter(inputValue2, "<set-?>");
                        H.f8707s = inputValue2;
                        androidx.navigation.t h10 = q6.l.h(this$0);
                        ab.l lVar = new ab.l(false, false, this$0.f8758g, 3);
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("isForcedLogout", lVar.f301a);
                        bundle.putBoolean("invalidSession", lVar.f302b);
                        bundle.putString("phoneNumber", lVar.f303c);
                        h10.w(R.navigation.login_navigation, bundle);
                        return;
                    default:
                        int i16 = MobileRegisterFragment.f8757j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((sk) this$0.q()).f6101y.f6482u.performClick();
                        return;
                }
            }
        });
        final int i12 = 2;
        ((sk) q()).f6101y.f6483v.setOnClickListener(new View.OnClickListener(this) { // from class: eb.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MobileRegisterFragment f15301b;

            {
                this.f15301b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i122;
                String str2;
                String str3;
                OtpChannel defaultOtpChannel;
                int i13 = i12;
                MobileRegisterFragment this$0 = this.f15301b;
                switch (i13) {
                    case 0:
                        int i14 = MobileRegisterFragment.f8757j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str4 = this$0.f8758g;
                        CountrySelectDto countrySelectDto2 = (CountrySelectDto) this$0.H().f8708t.getValue();
                        if (countrySelectDto2 != null) {
                            i122 = countrySelectDto2.getPhoneNumberLength();
                        } else {
                            i122 = 10;
                        }
                        if (this$0.I(i122, str4)) {
                            this$0.x(new AnalyticEvent("app_registration_started", new HashMap()));
                            this$0.A(new AnalyticEvent("app_registration_started", new HashMap()));
                            MobileRegisterViewModel mobileRegisterViewModel = (MobileRegisterViewModel) this$0.r();
                            String inputValue = ((sk) this$0.q()).f6097u.getInputValue();
                            Locale locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                            String invitationCode = inputValue.toUpperCase(locale);
                            Intrinsics.checkNotNullExpressionValue(invitationCode, "toUpperCase(...)");
                            String phoneNumber = this$0.f8758g;
                            CountrySelectDto countrySelectDto3 = (CountrySelectDto) this$0.H().f8708t.getValue();
                            if (countrySelectDto3 == null || (str2 = countrySelectDto3.getCode()) == null) {
                                str2 = "IN";
                            }
                            String countryCode = str2;
                            CountrySelectDto countrySelectDto4 = (CountrySelectDto) this$0.H().f8708t.getValue();
                            if (countrySelectDto4 == null || (defaultOtpChannel = countrySelectDto4.getDefaultOtpChannel()) == null || (str3 = defaultOtpChannel.getName()) == null) {
                                str3 = "sms";
                            }
                            String otpChannel = str3;
                            Intrinsics.checkNotNullParameter(invitationCode, "invitationCode");
                            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                            Intrinsics.checkNotNullParameter(otpChannel, "otpChannel");
                            mobileRegisterViewModel.f8766s = phoneNumber;
                            mobileRegisterViewModel.f8767t = invitationCode;
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                mobileRegisterViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                            } else {
                                mobileRegisterViewModel.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(mobileRegisterViewModel), null, null, new j(mobileRegisterViewModel, phoneNumber, countryCode, otpChannel, null), 3);
                            }
                            ((sk) this$0.q()).f6096t.setOnInputViewActionDone(null);
                            ((sk) this$0.q()).f6097u.setOnInputViewActionDone(null);
                            return;
                        }
                        return;
                    case 1:
                        int i15 = MobileRegisterFragment.f8757j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        LoginViewModel H = this$0.H();
                        String inputValue2 = ((sk) this$0.q()).f6096t.getInputValue();
                        H.getClass();
                        Intrinsics.checkNotNullParameter(inputValue2, "<set-?>");
                        H.f8707s = inputValue2;
                        androidx.navigation.t h10 = q6.l.h(this$0);
                        ab.l lVar = new ab.l(false, false, this$0.f8758g, 3);
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("isForcedLogout", lVar.f301a);
                        bundle.putBoolean("invalidSession", lVar.f302b);
                        bundle.putString("phoneNumber", lVar.f303c);
                        h10.w(R.navigation.login_navigation, bundle);
                        return;
                    default:
                        int i16 = MobileRegisterFragment.f8757j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((sk) this$0.q()).f6101y.f6482u.performClick();
                        return;
                }
            }
        });
        ((sk) q()).f6101y.f6480s.setOnCheckedChangeListener(new ab.g(this, i11));
        ((sk) q()).f6101y.f6480s.setChecked(true);
        String string = getString(R.string.title_terms_and_conditions);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R.string.text_privacy_policy);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("I agree to the ");
        spannableStringBuilder.append((CharSequence) getString(R.string.title_terms_and_conditions));
        spannableStringBuilder.setSpan(new d(this, i10), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 0);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-16776961), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 0);
        spannableStringBuilder.append((CharSequence) " and ");
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(new d(this, i11), spannableStringBuilder.length() - string2.length(), spannableStringBuilder.length(), 0);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-16776961), spannableStringBuilder.length() - string2.length(), spannableStringBuilder.length(), 0);
        ((sk) q()).f6101y.f6481t.setMovementMethod(LinkMovementMethod.getInstance());
        ((sk) q()).f6101y.f6481t.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
    }

    public final LoginViewModel H() {
        return (LoginViewModel) this.f8759h.getValue();
    }

    public final boolean I(int i10, String str) {
        if (!TextUtils.isEmpty(w.X(str).toString()) && w.X(str).toString().length() >= i10) {
            MultipleCountryInputView multipleCountryInputView = ((sk) q()).f6096t;
            multipleCountryInputView.m();
            multipleCountryInputView.setIcon(R.drawable.ic_success);
            return true;
        }
        MultipleCountryInputView multipleCountryInputView2 = ((sk) q()).f6096t;
        multipleCountryInputView2.setErrorText(R.string.invalid_mobile_number);
        multipleCountryInputView2.C.f5918y.setVisibility(8);
        return false;
    }

    public final void J(CountrySelectDto countrySelectDto) {
        String referralCodeBannerUrl = countrySelectDto.getReferralCodeBannerUrl();
        if (referralCodeBannerUrl != null && referralCodeBannerUrl.length() != 0) {
            ImageView imageView = ((sk) q()).f6095s;
            ((com.bumptech.glide.g) ((com.bumptech.glide.g) b.f(imageView).m(countrySelectDto.getReferralCodeBannerUrl()).m(com.bumptech.glide.e.f10811a)).g(R.drawable.ic_register)).z(imageView);
        } else {
            ImageView imageView2 = ((sk) q()).f6095s;
            imageView2.setImageDrawable(r3.k.getDrawable(imageView2.getContext(), R.drawable.ic_register));
        }
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e schedulerProvider = bVar.k();
        a compositeDisposable = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        o0 o0Var = fragmentComponent.f14280c;
        o0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(MobileRegisterViewModel.class), new j0(schedulerProvider, compositeDisposable, userRepository, 19));
        m mVar = o0Var.f15244a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, MobileRegisterViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(MobileRegisterViewModel.class, "<this>", MobileRegisterViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            MobileRegisterViewModel mobileRegisterViewModel = (MobileRegisterViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(mobileRegisterViewModel);
            this.f17284b = mobileRegisterViewModel;
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
