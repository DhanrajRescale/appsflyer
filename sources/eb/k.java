package eb;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.register.MobileRegisterViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class k extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MobileRegisterViewModel f15325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15326c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f15327d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(MobileRegisterViewModel mobileRegisterViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f15325b = mobileRegisterViewModel;
        this.f15326c = str;
        this.f15327d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k(this.f15325b, this.f15326c, this.f15327d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15324a;
        MobileRegisterViewModel mobileRegisterViewModel = this.f15325b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                mobileRegisterViewModel.f9084g.postValue(Boolean.TRUE);
                UserRepository userRepository = mobileRegisterViewModel.f9081d;
                String str = mobileRegisterViewModel.f8766s;
                if (str != null) {
                    String str2 = this.f15326c;
                    String str3 = this.f15327d;
                    this.f15324a = 1;
                    obj = userRepository.verifyMobile(str, str2, str3, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    Intrinsics.k("_mobileNumber");
                    throw null;
                }
            }
            v0 v0Var = (v0) obj;
            mobileRegisterViewModel.f9084g.postValue(Boolean.FALSE);
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null) {
                    if (baseResponseDto.getSuccess()) {
                        String str4 = (String) baseResponseDto.getData();
                        if (str4 != null) {
                            mobileRegisterViewModel.f8762o.postValue(str4);
                        }
                    } else {
                        mobileRegisterViewModel.f8765r.postValue(baseResponseDto.getMessage());
                    }
                }
            } else {
                mobileRegisterViewModel.f8765r.postValue("Technical Error Occurred");
            }
        } catch (Exception unused) {
            mobileRegisterViewModel.f8765r.postValue("Technical Error Occurred");
        }
        return Unit.f23355a;
    }
}
