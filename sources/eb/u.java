package eb;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.OtpChannel;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.register.RegistrationOtpVerificationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class u extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RegistrationOtpVerificationViewModel f15363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15364c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f15365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ OtpChannel f15366e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(RegistrationOtpVerificationViewModel registrationOtpVerificationViewModel, String str, String str2, OtpChannel otpChannel, yt.a aVar) {
        super(2, aVar);
        this.f15363b = registrationOtpVerificationViewModel;
        this.f15364c = str;
        this.f15365d = str2;
        this.f15366e = otpChannel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new u(this.f15363b, this.f15364c, this.f15365d, this.f15366e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15362a;
        RegistrationOtpVerificationViewModel registrationOtpVerificationViewModel = this.f15363b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                UserRepository userRepository = registrationOtpVerificationViewModel.f9081d;
                String str = this.f15364c;
                String str2 = this.f15365d;
                String name = this.f15366e.getName();
                this.f15362a = 1;
                obj = userRepository.verifyMobile(str, str2, name, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            registrationOtpVerificationViewModel.f9084g.postValue(Boolean.FALSE);
            boolean isSuccessful = v0Var.f29302a.isSuccessful();
            e0 e0Var = registrationOtpVerificationViewModel.f9083f;
            if (isSuccessful) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null) {
                    if (baseResponseDto.getSuccess()) {
                        String str3 = (String) baseResponseDto.getData();
                        if (str3 != null) {
                            Intrinsics.checkNotNullParameter(str3, "<set-?>");
                            registrationOtpVerificationViewModel.f8783o = str3;
                            registrationOtpVerificationViewModel.h(registrationOtpVerificationViewModel.f8782n);
                            registrationOtpVerificationViewModel.f8786r.postValue(Unit.f23355a);
                        }
                    } else {
                        e0Var.postValue(ni.j.i(baseResponseDto.getMessage()));
                    }
                }
            } else {
                e0Var.postValue(ni.j.i("Technical Error Occurred"));
            }
        } catch (Exception unused) {
            registrationOtpVerificationViewModel.f9084g.postValue(Boolean.FALSE);
            registrationOtpVerificationViewModel.f9083f.postValue(ni.j.i("Technical Error Occurred"));
        }
        return Unit.f23355a;
    }
}
