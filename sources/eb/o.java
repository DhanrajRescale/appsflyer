package eb;

import com.appsflyer.AFInAppEventType;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.data.remote.UserInfoResponseDto;
import com.assetgro.stockgro.feature_onboarding.presentation.register.NameRegisterViewModel;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;

/* loaded from: classes.dex */
public final class o extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NameRegisterViewModel f15339b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(NameRegisterViewModel nameRegisterViewModel, yt.a aVar) {
        super(2, aVar);
        this.f15339b = nameRegisterViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new o(this.f15339b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        UserInfoResponseDto userInfoResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15338a;
        NameRegisterViewModel nameRegisterViewModel = this.f15339b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            UserRepository userRepository = nameRegisterViewModel.f9081d;
            this.f15338a = 1;
            obj = userRepository.userInfo(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        nameRegisterViewModel.f9084g.postValue(Boolean.FALSE);
        if (v0Var.f29302a.isSuccessful()) {
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null && (userInfoResponseDto = (UserInfoResponseDto) baseResponseDto.getData()) != null) {
                nameRegisterViewModel.f9081d.saveUserInfo(userInfoResponseDto);
                String uuid = userInfoResponseDto.getUuid();
                jj.a aVar2 = nameRegisterViewModel.f8773n;
                aVar2.t0(uuid);
                aVar2.g0(AFInAppEventType.COMPLETE_REGISTRATION);
                nameRegisterViewModel.f8777r.postValue(new kj.j(userInfoResponseDto.toLaunchMainParams()));
            }
        } else {
            Gson gson = new Gson();
            ResponseBody responseBody = v0Var.f29304c;
            if (responseBody != null) {
                str = responseBody.string();
            } else {
                str = null;
            }
            nameRegisterViewModel.f8775p.postValue(((ErrorResponse) gson.fromJson(str, ErrorResponse.class)).getMessage());
        }
        return Unit.f23355a;
    }
}
