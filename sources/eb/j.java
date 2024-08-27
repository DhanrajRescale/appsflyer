package eb;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.register.MobileRegisterViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.gson.Gson;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.ResponseBody;
import qu.f0;

/* loaded from: classes.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MobileRegisterViewModel f15320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15321c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f15322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f15323e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MobileRegisterViewModel mobileRegisterViewModel, String str, String str2, String str3, yt.a aVar) {
        super(2, aVar);
        this.f15320b = mobileRegisterViewModel;
        this.f15321c = str;
        this.f15322d = str2;
        this.f15323e = str3;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j(this.f15320b, this.f15321c, this.f15322d, this.f15323e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15319a;
        String str = this.f15322d;
        String str2 = this.f15321c;
        MobileRegisterViewModel mobileRegisterViewModel = this.f15320b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                UserRepository userRepository = mobileRegisterViewModel.f9081d;
                this.f15319a = 1;
                obj = userRepository.getPhoneNumberStatus(str2, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            mobileRegisterViewModel.f9084g.postValue(Boolean.FALSE);
            String str3 = null;
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null) {
                    boolean success = baseResponseDto.getSuccess();
                    String str4 = this.f15323e;
                    if (success) {
                        mobileRegisterViewModel.f8763p.postValue(new Integer(R.string.user_already_exists));
                        mobileRegisterViewModel.f8761n.postValue(new kj.j(str2));
                    } else {
                        String str5 = mobileRegisterViewModel.f8767t;
                        if (str5 != null) {
                            if (str5.length() == 0) {
                                mobileRegisterViewModel.f8764q.postValue(new kj.j(new Pair(Boolean.TRUE, null)));
                                MobileRegisterViewModel.h(mobileRegisterViewModel, str, str4);
                            } else {
                                MobileRegisterViewModel.i(mobileRegisterViewModel, str);
                            }
                        } else {
                            Intrinsics.k("_invitationCode");
                            throw null;
                        }
                    }
                }
            } else {
                Gson gson = new Gson();
                ResponseBody responseBody = v0Var.f29304c;
                if (responseBody != null) {
                    str3 = responseBody.string();
                }
                mobileRegisterViewModel.f8765r.postValue(((ErrorResponse) gson.fromJson(str3, ErrorResponse.class)).getMessage());
            }
        } catch (Exception unused) {
            mobileRegisterViewModel.f8765r.postValue("Technical Error Occurred");
        }
        return Unit.f23355a;
    }
}
