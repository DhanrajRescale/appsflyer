package eb;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.j0;
import ba.hl;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.CountrySelectDto;
import com.assetgro.stockgro.feature_onboarding.presentation.register.NameRegisterFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.register.NameRegisterViewModel;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.widget.InputView;
import com.webengage.sdk.android.User;
import com.webengage.sdk.android.WebEngage;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NameRegisterFragment f15331b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(NameRegisterFragment nameRegisterFragment, int i10) {
        super(1);
        this.f15330a = i10;
        this.f15331b = nameRegisterFragment;
    }

    public final void a(String str) {
        int i10 = this.f15330a;
        NameRegisterFragment nameRegisterFragment = this.f15331b;
        switch (i10) {
            case 2:
                hl hlVar = (hl) nameRegisterFragment.q();
                Intrinsics.c(str);
                InputView inputView = hlVar.f4951s;
                inputView.setErrorText(str);
                inputView.n();
                return;
            default:
                hl hlVar2 = (hl) nameRegisterFragment.q();
                Intrinsics.c(str);
                InputView inputView2 = hlVar2.f4951s;
                inputView2.setErrorText(str);
                inputView2.n();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.kaopiz.kprogresshud.f fVar;
        Bundle extras;
        int i10 = this.f15330a;
        NameRegisterFragment nameRegisterFragment = this.f15331b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar2 = nameRegisterFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.d();
                    }
                } else if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = nameRegisterFragment.f17283a) != null) {
                    fVar.b();
                }
                return Unit.f23355a;
            case 1:
                Map map = (Map) ((kj.j) obj).a();
                if (map != null) {
                    nameRegisterFragment.v((String) map.get("UUID"));
                    nameRegisterFragment.y(new AnalyticEvent("app_registration_completed", new HashMap()));
                    nameRegisterFragment.x(new AnalyticEvent("complete_registration", null, 2, null));
                    User user = WebEngage.get().user();
                    Intrinsics.checkNotNullExpressionValue(user, "user(...)");
                    user.login((String) map.get("UUID"));
                    user.setPhoneNumber((String) map.get("phone_number"));
                    user.setAttribute("refcode", (String) map.get("refcode"));
                    user.setFirstName((String) map.get("first_name"));
                    Intent intent = new Intent(nameRegisterFragment.getActivity(), (Class<?>) MainActivity.class);
                    nameRegisterFragment.startActivity(intent);
                    j0 activity = nameRegisterFragment.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    Intent intent2 = nameRegisterFragment.requireActivity().getIntent();
                    if (intent2 != null && (extras = intent2.getExtras()) != null) {
                        intent.putExtras(extras);
                    }
                }
                return Unit.f23355a;
            case 2:
                a((String) obj);
                return Unit.f23355a;
            case 3:
                a((String) obj);
                return Unit.f23355a;
            default:
                NameRegisterViewModel nameRegisterViewModel = (NameRegisterViewModel) nameRegisterFragment.r();
                String code = ((CountrySelectDto) obj).getCode();
                Intrinsics.checkNotNullParameter(code, "<set-?>");
                nameRegisterViewModel.f8774o = code;
                return Unit.f23355a;
        }
    }
}
