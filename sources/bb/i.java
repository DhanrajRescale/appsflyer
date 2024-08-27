package bb;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.login.otp.ForgotPinOtpViewModel;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ForgotPinOtpViewModel f6924b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6925c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ForgotPinOtpViewModel forgotPinOtpViewModel, String str, String str2, String str3, yt.a aVar) {
        super(2, aVar);
        this.f6924b = forgotPinOtpViewModel;
        this.f6925c = str;
        this.f6926d = str2;
        this.f6927e = str3;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i(this.f6924b, this.f6925c, this.f6926d, this.f6927e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f6923a;
        ForgotPinOtpViewModel forgotPinOtpViewModel = this.f6924b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                forgotPinOtpViewModel.f9084g.postValue(Boolean.TRUE);
                UserRepository userRepository = forgotPinOtpViewModel.f9081d;
                String str2 = this.f6925c;
                String str3 = this.f6926d;
                String str4 = this.f6927e;
                this.f6923a = 1;
                obj = userRepository.resetPasswordOtp(str2, str3, str4, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null) {
                    if (baseResponseDto.getSuccess() && baseResponseDto.getData() != null) {
                        String str5 = (String) baseResponseDto.getData();
                        forgotPinOtpViewModel.getClass();
                        Intrinsics.checkNotNullParameter(str5, "<set-?>");
                        forgotPinOtpViewModel.f8738o = str5;
                        forgotPinOtpViewModel.f8743t = forgotPinOtpViewModel.h();
                        forgotPinOtpViewModel.f8740q.postValue(Unit.f23355a);
                    } else {
                        forgotPinOtpViewModel.f9083f.postValue(ni.j.i(baseResponseDto.getMessage()));
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
                forgotPinOtpViewModel.f9083f.postValue(ni.j.i(((ErrorResponse) gson.fromJson(str, ErrorResponse.class)).getMessage()));
            }
            forgotPinOtpViewModel.f9084g.postValue(Boolean.FALSE);
        } catch (Exception e10) {
            forgotPinOtpViewModel.f9083f.postValue(ni.j.i("Technical Error Occurred"));
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
