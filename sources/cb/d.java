package cb;

import au.i;
import com.appsflyer.AppsFlyerProperties;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.data.remote.UserInfoResponseDto;
import com.assetgro.stockgro.feature_onboarding.presentation.login.pin.PinLoginViewModel;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class d extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinLoginViewModel f8082b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PinLoginViewModel pinLoginViewModel, yt.a aVar) {
        super(2, aVar);
        this.f8082b = pinLoginViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f8082b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        UserInfoResponseDto userInfoResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f8081a;
        PinLoginViewModel pinLoginViewModel = this.f8082b;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            UserRepository userRepository = pinLoginViewModel.f9081d;
            this.f8081a = 1;
            obj = userRepository.userInfo(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        pinLoginViewModel.f9084g.postValue(Boolean.FALSE);
        if (v0Var.f29302a.isSuccessful()) {
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null && (userInfoResponseDto = (UserInfoResponseDto) baseResponseDto.getData()) != null) {
                pinLoginViewModel.f9081d.saveUserInfo(userInfoResponseDto);
                String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
                if (string == null || string.length() == 0) {
                    pinLoginViewModel.f8747n.t0(userInfoResponseDto.getUuid());
                }
                pinLoginViewModel.f8750q.postValue(userInfoResponseDto.toAnalyticsParam());
            }
        } else {
            Gson gson = new Gson();
            ResponseBody responseBody = v0Var.f29304c;
            if (responseBody != null) {
                str = responseBody.string();
            } else {
                str = null;
            }
            pinLoginViewModel.f8751r.postValue(((ErrorResponse) gson.fromJson(str, ErrorResponse.class)).getMessage());
        }
        return Unit.f23355a;
    }
}
