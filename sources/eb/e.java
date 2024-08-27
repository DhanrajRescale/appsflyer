package eb;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import ba.sk;
import com.assetgro.stockgro.data.model.CountrySelectDto;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.register.MobileRegisterFragment;
import com.assetgro.stockgro.prod.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MobileRegisterFragment f15307b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(MobileRegisterFragment mobileRegisterFragment, int i10) {
        super(1);
        this.f15306a = i10;
        this.f15307b = mobileRegisterFragment;
    }

    public final void a(String secret) {
        int i10 = this.f15306a;
        MobileRegisterFragment mobileRegisterFragment = this.f15307b;
        switch (i10) {
            case 0:
                androidx.navigation.t h10 = q6.l.h(mobileRegisterFragment);
                String phoneNumber = mobileRegisterFragment.f8758g;
                String invitationCode = ((sk) mobileRegisterFragment.q()).f6097u.getInputValue();
                boolean isChecked = ((sk) mobileRegisterFragment.q()).f6101y.f6482u.isChecked();
                Intrinsics.c(secret);
                Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                Intrinsics.checkNotNullParameter(invitationCode, "invitationCode");
                Intrinsics.checkNotNullParameter(secret, "secret");
                h hVar = new h(phoneNumber, invitationCode, secret, isChecked);
                if (mobileRegisterFragment.isAdded()) {
                    h10.o(hVar);
                    return;
                }
                return;
            case 1:
            default:
                sk skVar = (sk) mobileRegisterFragment.q();
                Intrinsics.c(secret);
                skVar.f6097u.setDisplayValue(secret);
                return;
            case 2:
                Context context = mobileRegisterFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.c(secret);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(secret, "text");
                if (secret.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(secret, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                    return;
                }
                return;
        }
    }

    public final void d(kj.j jVar) {
        int i10 = this.f15306a;
        MobileRegisterFragment mobileRegisterFragment = this.f15307b;
        switch (i10) {
            case 1:
                LoginViewModel H = mobileRegisterFragment.H();
                String inputValue = ((sk) mobileRegisterFragment.q()).f6096t.getInputValue();
                H.getClass();
                Intrinsics.checkNotNullParameter(inputValue, "<set-?>");
                H.f8707s = inputValue;
                String str = (String) jVar.a();
                if (str != null) {
                    q6.l.h(mobileRegisterFragment).w(R.navigation.login_navigation, hl.f.y(new Pair("phoneNumber", str)));
                    return;
                }
                return;
            default:
                Pair data = (Pair) jVar.a();
                if (data != null) {
                    int i11 = a.f15299i;
                    Intrinsics.checkNotNullParameter(data, "data");
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("TYPE", data);
                    a aVar = new a();
                    aVar.setArguments(bundle);
                    aVar.setCancelable(false);
                    aVar.show(mobileRegisterFragment.requireActivity().getSupportFragmentManager(), "InvitationResponseBottomSheet");
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f15306a;
        MobileRegisterFragment mobileRegisterFragment = this.f15307b;
        switch (i10) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                d((kj.j) obj);
                return Unit.f23355a;
            case 2:
                a((String) obj);
                return Unit.f23355a;
            case 3:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    com.kaopiz.kprogresshud.f fVar = mobileRegisterFragment.f17283a;
                    if (fVar != null) {
                        fVar.d();
                    }
                } else {
                    com.kaopiz.kprogresshud.f fVar2 = mobileRegisterFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.b();
                    }
                }
                return Unit.f23355a;
            case 4:
                Integer num = (Integer) obj;
                Context context = mobileRegisterFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.c(num);
                String text = mobileRegisterFragment.getString(num.intValue());
                Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    ((TextView) inflate.findViewById(R.id.message)).setText(text);
                    makeText.setView(inflate);
                    makeText.show();
                }
                return Unit.f23355a;
            case 5:
                d((kj.j) obj);
                return Unit.f23355a;
            case 6:
                a((String) obj);
                return Unit.f23355a;
            default:
                CountrySelectDto countrySelectDto = (CountrySelectDto) obj;
                Intrinsics.c(countrySelectDto);
                int i11 = MobileRegisterFragment.f8757j;
                mobileRegisterFragment.J(countrySelectDto);
                ((sk) mobileRegisterFragment.q()).f6096t.o(countrySelectDto);
                if (mobileRegisterFragment.H().f8707s.length() > 0) {
                    ((sk) mobileRegisterFragment.q()).f6096t.getInputEditText().setText(mobileRegisterFragment.H().f8707s);
                }
                return Unit.f23355a;
        }
    }
}
