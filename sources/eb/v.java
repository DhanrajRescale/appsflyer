package eb;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.register.RegistrationOtpVerificationViewModel;
import com.google.gson.Gson;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;

/* loaded from: classes.dex */
public final class v extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RegistrationOtpVerificationViewModel f15368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15369c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(RegistrationOtpVerificationViewModel registrationOtpVerificationViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f15368b = registrationOtpVerificationViewModel;
        this.f15369c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new v(this.f15368b, this.f15369c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15367a;
        String str2 = this.f15369c;
        RegistrationOtpVerificationViewModel registrationOtpVerificationViewModel = this.f15368b;
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
                String str3 = registrationOtpVerificationViewModel.f8783o;
                this.f15367a = 1;
                obj = userRepository.verifyOtp(str3, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            e0 e0Var = registrationOtpVerificationViewModel.f9084g;
            Boolean bool = Boolean.FALSE;
            e0Var.postValue(bool);
            boolean isSuccessful = v0Var.f29302a.isSuccessful();
            e0 e0Var2 = registrationOtpVerificationViewModel.f9083f;
            e0 e0Var3 = registrationOtpVerificationViewModel.f8785q;
            if (isSuccessful) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null) {
                    if (baseResponseDto.getSuccess()) {
                        e0Var3.postValue(new Pair(Boolean.TRUE, new Pair(registrationOtpVerificationViewModel.f8783o, str2)));
                    } else {
                        e0Var3.postValue(new Pair(bool, null));
                        e0Var2.postValue(ni.j.i(baseResponseDto.getMessage()));
                    }
                }
            } else {
                Gson gson = new Gson();
                ResponseBody responseBody = v0Var.f29304c;
                if (responseBody != null) {
                    str = responseBody.string();
                } else {
                    str = null;
                }
                e0Var2.postValue(ni.j.i(((ErrorResponse) gson.fromJson(str, ErrorResponse.class)).getMessage()));
                e0Var3.postValue(new Pair(bool, null));
            }
        } catch (Exception e10) {
            e0 e0Var4 = registrationOtpVerificationViewModel.f9084g;
            Boolean bool2 = Boolean.FALSE;
            e0Var4.postValue(bool2);
            e10.printStackTrace();
            registrationOtpVerificationViewModel.f9083f.postValue(ni.j.i("Technical Error Occurred"));
            registrationOtpVerificationViewModel.f8785q.postValue(new Pair(bool2, null));
        }
        return Unit.f23355a;
    }
}
