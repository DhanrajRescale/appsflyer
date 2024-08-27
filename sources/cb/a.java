package cb;

import ab.n;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.j0;
import androidx.navigation.t;
import ba.vl;
import com.assetgro.stockgro.data.model.CountrySelectDto;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.pin.PinLoginFragment;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.webengage.sdk.android.User;
import com.webengage.sdk.android.WebEngage;
import iu.k;
import java.util.HashMap;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import q6.l;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinLoginFragment f8077b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(PinLoginFragment pinLoginFragment, int i10) {
        super(1);
        this.f8076a = i10;
        this.f8077b = pinLoginFragment;
    }

    public final void a(String text) {
        int i10 = this.f8076a;
        PinLoginFragment pinLoginFragment = this.f8077b;
        switch (i10) {
            case 1:
                ((vl) pinLoginFragment.q()).f6450u.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                ((vl) pinLoginFragment.q()).f6449t.setTextInput(HttpUrl.FRAGMENT_ENCODE_SET);
                com.kaopiz.kprogresshud.f fVar = pinLoginFragment.f17283a;
                if (fVar != null) {
                    fVar.b();
                }
                j0 context = pinLoginFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(context, "requireActivity(...)");
                Intrinsics.c(text);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                    return;
                }
                return;
            default:
                int i11 = PinLoginFragment.f8744i;
                b bVar = (b) pinLoginFragment.f8745g.getValue();
                Intrinsics.c(text);
                String phoneNumber = bVar.f8078a;
                Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                Intrinsics.checkNotNullParameter(text, "secret");
                l.h(pinLoginFragment).o(new c(phoneNumber, text));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        Bundle extras;
        int i10 = this.f8076a;
        PinLoginFragment pinLoginFragment = this.f8077b;
        switch (i10) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                pinLoginFragment.v((String) hashMap.get("UUID"));
                User user = WebEngage.get().user();
                Intrinsics.checkNotNullExpressionValue(user, "user(...)");
                user.login((String) hashMap.get("UUID"));
                user.setPhoneNumber((String) hashMap.get("phone_number"));
                user.setAttribute("refcode", (String) hashMap.get("refcode"));
                user.setFirstName((String) hashMap.get(AppMeasurementSdk.ConditionalUserProperty.NAME));
                Intent intent = new Intent(pinLoginFragment.requireContext(), (Class<?>) MainActivity.class);
                Intent intent2 = pinLoginFragment.requireActivity().getIntent();
                if (intent2 != null && (extras = intent2.getExtras()) != null) {
                    intent.putExtras(extras);
                }
                CountrySelectDto countrySelectDto = (CountrySelectDto) ((LoginViewModel) pinLoginFragment.f8746h.getValue()).f8708t.getValue();
                if (countrySelectDto != null) {
                    str = countrySelectDto.getCode();
                } else {
                    str = null;
                }
                intent.putExtra("CURRENT_COUNTRY", str);
                pinLoginFragment.startActivity(intent);
                pinLoginFragment.requireActivity().finish();
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    com.kaopiz.kprogresshud.f fVar = pinLoginFragment.f17283a;
                    if (fVar != null) {
                        fVar.d();
                    }
                } else {
                    com.kaopiz.kprogresshud.f fVar2 = pinLoginFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.b();
                    }
                }
                return Unit.f23355a;
            case 3:
                a((String) obj);
                return Unit.f23355a;
            case 4:
                String phoneNumber = (String) ((j) obj).a();
                if (phoneNumber != null) {
                    t h10 = l.h(pinLoginFragment);
                    Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                    h10.o(new n(phoneNumber));
                }
                return Unit.f23355a;
            default:
                Intrinsics.checkNotNullParameter((View) obj, "<anonymous parameter 0>");
                ((vl) pinLoginFragment.q()).f6450u.setText(((vl) pinLoginFragment.q()).f6449t.getTextInput(), TextView.BufferType.EDITABLE);
                return Unit.f23355a;
        }
    }
}
