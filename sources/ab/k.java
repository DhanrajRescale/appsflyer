package ab;

import ba.pk;
import ba.sk;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.CountrySelectDto;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.MobileLoginFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.MobileLoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.register.MobileRegisterFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.register.MobileRegisterViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import qj.c0;
import qj.d0;
import qj.e0;

/* loaded from: classes.dex */
public final class k implements c0, e0, d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gd.m f300b;

    public /* synthetic */ k(gd.m mVar, int i10) {
        this.f299a = i10;
        this.f300b = mVar;
    }

    public void a(String str) {
        int i10;
        int i11 = this.f299a;
        gd.m mVar = this.f300b;
        switch (i11) {
            case 0:
                if (str != null) {
                    MobileLoginFragment mobileLoginFragment = (MobileLoginFragment) mVar;
                    if (!((MobileLoginViewModel) mobileLoginFragment.r()).f8732r) {
                        ((MobileLoginViewModel) mobileLoginFragment.r()).f8732r = true;
                        AnalyticEvent analyticEvent = new AnalyticEvent("app_login_mobile_number_activity", new HashMap());
                        mobileLoginFragment.x(analyticEvent);
                        mobileLoginFragment.A(analyticEvent);
                    }
                    String inputValue = ((pk) mobileLoginFragment.q()).f5776t.getInputValue();
                    Intrinsics.checkNotNullParameter(inputValue, "<set-?>");
                    mobileLoginFragment.f8725h = inputValue;
                    mobileLoginFragment.I(w.X(inputValue).toString());
                    return;
                }
                return;
            default:
                if (str != null) {
                    MobileRegisterFragment mobileRegisterFragment = (MobileRegisterFragment) mVar;
                    String inputValue2 = ((sk) mobileRegisterFragment.q()).f6096t.getInputValue();
                    Intrinsics.checkNotNullParameter(inputValue2, "<set-?>");
                    mobileRegisterFragment.f8758g = inputValue2;
                    String obj = w.X(inputValue2).toString();
                    CountrySelectDto countrySelectDto = (CountrySelectDto) mobileRegisterFragment.H().f8708t.getValue();
                    if (countrySelectDto != null) {
                        i10 = countrySelectDto.getPhoneNumberLength();
                    } else {
                        i10 = 10;
                    }
                    mobileRegisterFragment.I(i10, obj);
                    if (!((MobileRegisterViewModel) mobileRegisterFragment.r()).f8769v) {
                        ((MobileRegisterViewModel) mobileRegisterFragment.r()).f8769v = true;
                        AnalyticEvent analyticEvent2 = new AnalyticEvent("app_registration_mobile_number_activity", new HashMap());
                        mobileRegisterFragment.x(analyticEvent2);
                        mobileRegisterFragment.A(analyticEvent2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
