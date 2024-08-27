package ab;

import com.assetgro.stockgro.data.model.CountrySelectDto;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f285b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i10) {
        super(1);
        this.f284a = i10;
        this.f285b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f284a;
        c cVar = this.f285b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                a aVar = cVar.f286i;
                if (aVar != null) {
                    aVar.u(list);
                    return Unit.f23355a;
                }
                Intrinsics.k("countryListAdapter");
                throw null;
            default:
                CountrySelectDto it = (CountrySelectDto) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                LoginViewModel loginViewModel = (LoginViewModel) cVar.f287j.getValue();
                loginViewModel.getClass();
                Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "<set-?>");
                loginViewModel.f8707s = HttpUrl.FRAGMENT_ENCODE_SET;
                ut.g gVar = cVar.f287j;
                if (!Intrinsics.a(((LoginViewModel) gVar.getValue()).f8708t.getValue(), it)) {
                    ((LoginViewModel) gVar.getValue()).f8708t.setValue(it);
                }
                cVar.dismiss();
                return Unit.f23355a;
        }
    }
}
