package xa;

import androidx.lifecycle.e0;
import au.i;
import com.assetgro.stockgro.data.model.CountriesDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f40147b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LoginViewModel loginViewModel, yt.a aVar) {
        super(2, aVar);
        this.f40147b = loginViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f40147b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        CountriesDto countriesDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f40146a;
        LoginViewModel loginViewModel = this.f40147b;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            UserRepository userRepository = loginViewModel.f9081d;
            this.f40146a = 1;
            obj = userRepository.updateAvailableCountriesList(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful()) {
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null && (countriesDto = (CountriesDto) baseResponseDto.getData()) != null) {
                loginViewModel.f8709u.postValue(countriesDto.getCountries());
            }
        } else {
            e0 e0Var = loginViewModel.f8709u;
            byte[] bArr = kj.a.f23206a;
            e0Var.postValue(kj.a.f23209d);
        }
        loginViewModel.f9084g.postValue(Boolean.FALSE);
        return Unit.f23355a;
    }
}
