package cb;

import au.i;
import com.assetgro.stockgro.data.model.OtpChannel;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.ApiExceptionUtilitiesKt;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.login.pin.PinLoginViewModel;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ni.j;
import nv.v0;
import okhttp3.HttpUrl;
import okhttp3.ResponseBody;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class f extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinLoginViewModel f8090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8091c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f8092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ OtpChannel f8093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PinLoginViewModel pinLoginViewModel, String str, String str2, OtpChannel otpChannel, yt.a aVar) {
        super(2, aVar);
        this.f8090b = pinLoginViewModel;
        this.f8091c = str;
        this.f8092d = str2;
        this.f8093e = otpChannel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f8090b, this.f8091c, this.f8092d, this.f8093e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f8089a;
        PinLoginViewModel pinLoginViewModel = this.f8090b;
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
                String str3 = this.f8091c;
                String str4 = this.f8092d;
                OtpChannel otpChannel = this.f8093e;
                if (otpChannel == null || (str = otpChannel.getName()) == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                this.f8089a = 1;
                obj = userRepository.resetPasswordOtp(str3, str4, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null) {
                    if (baseResponseDto.getSuccess()) {
                        String str5 = (String) baseResponseDto.getData();
                        if (str5 != null) {
                            pinLoginViewModel.f8748o.postValue(str5);
                        }
                    } else {
                        pinLoginViewModel.f8751r.postValue(baseResponseDto.getMessage());
                    }
                }
            } else {
                Gson gson = new Gson();
                ResponseBody responseBody = v0Var.f29304c;
                if (responseBody != null) {
                    str2 = responseBody.string();
                } else {
                    str2 = null;
                }
                pinLoginViewModel.f9083f.postValue(j.i(((ErrorResponse) gson.fromJson(str2, ErrorResponse.class)).getMessage()));
            }
            pinLoginViewModel.f9084g.postValue(Boolean.FALSE);
        } catch (Exception e10) {
            pinLoginViewModel.f8751r.postValue(ApiExceptionUtilitiesKt.extractMessage(e10));
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
