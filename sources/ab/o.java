package ab;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.MobileLoginViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;

/* loaded from: classes.dex */
public final class o extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MobileLoginViewModel f307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f308c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f309d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(MobileLoginViewModel mobileLoginViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f307b = mobileLoginViewModel;
        this.f308c = str;
        this.f309d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new o(this.f307b, this.f308c, this.f309d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f306a;
        String str2 = this.f309d;
        String str3 = this.f308c;
        MobileLoginViewModel mobileLoginViewModel = this.f307b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                UserRepository userRepository = mobileLoginViewModel.f9081d;
                this.f306a = 1;
                obj = userRepository.getPhoneNumberStatus(str3, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            mobileLoginViewModel.f9084g.postValue(Boolean.FALSE);
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null) {
                    if (baseResponseDto.getSuccess()) {
                        MobileLoginViewModel.h(mobileLoginViewModel, str3, str2);
                    } else {
                        mobileLoginViewModel.f8729o.postValue(new kj.j(str3));
                        mobileLoginViewModel.f8731q.postValue(new z9.h(R.string.user_does_not_exists, new Object[0]));
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
                mobileLoginViewModel.f8731q.postValue(new z9.g(((ErrorResponse) gson.fromJson(str, ErrorResponse.class)).getMessage()));
            }
        } catch (Exception unused) {
            mobileLoginViewModel.f8731q.postValue(new z9.g("Technical Error Occurred"));
        }
        return Unit.f23355a;
    }
}
