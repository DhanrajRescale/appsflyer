package ab;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.navigation.t;
import ba.pk;
import ba.qx;
import com.assetgro.stockgro.data.model.CountrySelectDto;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.MobileLoginFragment;
import com.assetgro.stockgro.prod.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MobileLoginFragment f298b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(MobileLoginFragment mobileLoginFragment, int i10) {
        super(1);
        this.f297a = i10;
        this.f298b = mobileLoginFragment;
    }

    public final void a(kj.j jVar) {
        int i10 = this.f297a;
        MobileLoginFragment mobileLoginFragment = this.f298b;
        switch (i10) {
            case 1:
                String phoneNumber = mobileLoginFragment.f8725h;
                Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                q6.l.h(mobileLoginFragment).o(new m(phoneNumber));
                return;
            case 2:
                LoginViewModel H = mobileLoginFragment.H();
                String inputValue = ((pk) mobileLoginFragment.q()).f5776t.getInputValue();
                H.getClass();
                Intrinsics.checkNotNullParameter(inputValue, "<set-?>");
                H.f8707s = inputValue;
                String str = (String) jVar.a();
                t h10 = q6.l.h(mobileLoginFragment);
                Bundle bundle = new Bundle();
                bundle.putString("phoneNumber", str);
                h10.l(R.id.registrationFlow, bundle, null);
                return;
            default:
                String phoneNumber2 = (String) jVar.a();
                if (phoneNumber2 != null) {
                    t h11 = q6.l.h(mobileLoginFragment);
                    Intrinsics.checkNotNullParameter(phoneNumber2, "phoneNumber");
                    h11.o(new n(phoneNumber2));
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f297a;
        MobileLoginFragment mobileLoginFragment = this.f298b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    com.kaopiz.kprogresshud.f fVar = mobileLoginFragment.f17283a;
                    if (fVar != null) {
                        fVar.d();
                    }
                } else {
                    com.kaopiz.kprogresshud.f fVar2 = mobileLoginFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.b();
                    }
                }
                return Unit.f23355a;
            case 1:
                a((kj.j) obj);
                return Unit.f23355a;
            case 2:
                a((kj.j) obj);
                return Unit.f23355a;
            case 3:
                Context context = mobileLoginFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Context requireContext = mobileLoginFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                String text = ((z9.i) obj).a(requireContext);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                }
                return Unit.f23355a;
            case 4:
                a((kj.j) obj);
                return Unit.f23355a;
            case 5:
                CountrySelectDto countrySelectDto = (CountrySelectDto) obj;
                pk pkVar = (pk) mobileLoginFragment.q();
                Intrinsics.c(countrySelectDto);
                pkVar.f5776t.o(countrySelectDto);
                if (mobileLoginFragment.H().f8707s.length() > 0) {
                    ((pk) mobileLoginFragment.q()).f5776t.getInputEditText().setText(mobileLoginFragment.H().f8707s);
                }
                return Unit.f23355a;
            default:
                if (((List) obj).size() == 1) {
                    qx qxVar = ((pk) mobileLoginFragment.q()).f5776t.C;
                    ImageView displayValueChevron = qxVar.f5913t;
                    Intrinsics.checkNotNullExpressionValue(displayValueChevron, "displayValueChevron");
                    zq.f.M(displayValueChevron);
                    ImageView displayValueImage = qxVar.f5914u;
                    Intrinsics.checkNotNullExpressionValue(displayValueImage, "displayValueImage");
                    zq.f.M(displayValueImage);
                }
                return Unit.f23355a;
        }
    }
}
