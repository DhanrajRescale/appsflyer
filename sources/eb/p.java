package eb;

import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.ApiExceptionUtilitiesKt;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.data.remote.OnboardingResponseDto;
import com.assetgro.stockgro.feature_onboarding.presentation.register.NameRegisterViewModel;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;

/* loaded from: classes.dex */
public final class p extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NameRegisterViewModel f15341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15342c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f15343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f15344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f15345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f15346g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f15347h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f15348i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(NameRegisterViewModel nameRegisterViewModel, String str, String str2, String str3, String str4, boolean z10, String str5, String str6, yt.a aVar) {
        super(2, aVar);
        this.f15341b = nameRegisterViewModel;
        this.f15342c = str;
        this.f15343d = str2;
        this.f15344e = str3;
        this.f15345f = str4;
        this.f15346g = z10;
        this.f15347h = str5;
        this.f15348i = str6;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new p(this.f15341b, this.f15342c, this.f15343d, this.f15344e, this.f15345f, this.f15346g, this.f15347h, this.f15348i, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        OnboardingResponseDto onboardingResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15340a;
        NameRegisterViewModel nameRegisterViewModel = this.f15341b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                UserRepository userRepository = nameRegisterViewModel.f9081d;
                String str = this.f15342c;
                String str2 = this.f15343d;
                String str3 = this.f15344e;
                String str4 = this.f15345f;
                boolean z10 = this.f15346g;
                String str5 = this.f15347h;
                String str6 = this.f15348i;
                String str7 = nameRegisterViewModel.f8774o;
                this.f15340a = 1;
                obj = userRepository.register(str, str2, str3, str4, z10, str5, str6, str7, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            String str8 = null;
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (onboardingResponseDto = (OnboardingResponseDto) baseResponseDto.getData()) != null) {
                    nameRegisterViewModel.f9081d.saveUserInfo(onboardingResponseDto);
                    e0 e0Var = nameRegisterViewModel.f9084g;
                    e0Var.setValue(Boolean.TRUE);
                    try {
                        yk.g.H(u0.f(nameRegisterViewModel), null, null, new o(nameRegisterViewModel, null), 3);
                    } catch (Exception e10) {
                        e0Var.postValue(Boolean.FALSE);
                        e10.printStackTrace();
                        nameRegisterViewModel.f8775p.postValue(ApiExceptionUtilitiesKt.extractMessage(e10));
                    }
                }
            } else {
                Gson gson = new Gson();
                ResponseBody responseBody = v0Var.f29304c;
                if (responseBody != null) {
                    str8 = responseBody.string();
                }
                nameRegisterViewModel.f8775p.postValue(((ErrorResponse) gson.fromJson(str8, ErrorResponse.class)).getMessage());
            }
        } catch (Exception unused) {
            nameRegisterViewModel.f9084g.postValue(Boolean.FALSE);
            nameRegisterViewModel.f8775p.postValue("Technical Error Occurred");
        }
        return Unit.f23355a;
    }
}
