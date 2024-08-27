package cb;

import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import au.i;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.ApiExceptionUtilitiesKt;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.data.remote.OnboardingResponseDto;
import com.assetgro.stockgro.feature_onboarding.presentation.login.pin.PinLoginViewModel;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;
import ut.n;
import yk.g;

/* loaded from: classes.dex */
public final class e extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinLoginViewModel f8084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8085c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f8086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f8087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f8088f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PinLoginViewModel pinLoginViewModel, String str, String str2, String str3, String str4, yt.a aVar) {
        super(2, aVar);
        this.f8084b = pinLoginViewModel;
        this.f8085c = str;
        this.f8086d = str2;
        this.f8087e = str3;
        this.f8088f = str4;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new e(this.f8084b, this.f8085c, this.f8086d, this.f8087e, this.f8088f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f8083a;
        PinLoginViewModel pinLoginViewModel = this.f8084b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                pinLoginViewModel.f9084g.postValue(Boolean.TRUE);
                UserRepository userRepository = pinLoginViewModel.f9081d;
                String str = this.f8085c;
                String str2 = this.f8086d;
                String str3 = this.f8087e;
                String str4 = this.f8088f;
                this.f8083a = 1;
                obj = userRepository.numberLogin(str, str2, str3, str4, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            e0 e0Var = pinLoginViewModel.f9084g;
            Boolean bool = Boolean.FALSE;
            e0Var.postValue(bool);
            if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null) {
                String str5 = this.f8085c;
                boolean success = baseResponseDto.getSuccess();
                e0 e0Var2 = pinLoginViewModel.f9084g;
                if (success) {
                    OnboardingResponseDto onboardingResponseDto = (OnboardingResponseDto) baseResponseDto.getData();
                    if (onboardingResponseDto != null) {
                        pinLoginViewModel.f9081d.saveUserInfo(onboardingResponseDto);
                        e0Var2.postValue(Boolean.TRUE);
                        try {
                            g.H(u0.f(pinLoginViewModel), null, null, new d(pinLoginViewModel, null), 3);
                        } catch (Exception e10) {
                            e0Var2.postValue(Boolean.FALSE);
                            e10.printStackTrace();
                            pinLoginViewModel.f8751r.postValue(ApiExceptionUtilitiesKt.extractMessage(e10));
                        }
                    }
                } else {
                    e0Var2.postValue(bool);
                    if (Intrinsics.a(baseResponseDto.getErrorCode(), "BLOCKED_USER")) {
                        pinLoginViewModel.f8749p.postValue(new j(str5));
                    } else {
                        pinLoginViewModel.f8751r.postValue(baseResponseDto.getMessage());
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            pinLoginViewModel.f9084g.postValue(Boolean.FALSE);
            pinLoginViewModel.f8751r.postValue("Technical Error Occurred");
        }
        return Unit.f23355a;
    }
}
