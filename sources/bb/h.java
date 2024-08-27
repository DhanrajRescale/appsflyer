package bb;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.login.otp.ForgotPinOtpViewModel;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ForgotPinOtpViewModel f6921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ForgotPinOtpViewModel forgotPinOtpViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f6921b = forgotPinOtpViewModel;
        this.f6922c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f6921b, this.f6922c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f6920a;
        String str2 = this.f6922c;
        ForgotPinOtpViewModel forgotPinOtpViewModel = this.f6921b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                UserRepository userRepository = forgotPinOtpViewModel.f9081d;
                String str3 = forgotPinOtpViewModel.f8738o;
                this.f6920a = 1;
                obj = userRepository.verifyOtp(str3, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            forgotPinOtpViewModel.f9084g.postValue(Boolean.FALSE);
            boolean isSuccessful = v0Var.f29302a.isSuccessful();
            e0 e0Var = forgotPinOtpViewModel.f9083f;
            e0 e0Var2 = forgotPinOtpViewModel.f8741r;
            if (isSuccessful) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null) {
                    if (baseResponseDto.getSuccess()) {
                        e0Var2.postValue(new kj.j(new j(forgotPinOtpViewModel.f8739p, str2, forgotPinOtpViewModel.f8738o)));
                    } else {
                        e0Var2.postValue(new kj.j(null));
                        e0Var.postValue(ni.j.i(baseResponseDto.getMessage()));
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
                e0Var.postValue(ni.j.i(((ErrorResponse) gson.fromJson(str, ErrorResponse.class)).getMessage()));
                e0Var2.postValue(new kj.j(null));
            }
        } catch (Exception unused) {
            forgotPinOtpViewModel.f9084g.postValue(Boolean.FALSE);
            forgotPinOtpViewModel.f9083f.postValue(ni.j.i("Technical Error Occurred"));
            forgotPinOtpViewModel.f8741r.postValue(new kj.j(null));
        }
        return Unit.f23355a;
    }
}
