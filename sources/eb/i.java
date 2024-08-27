package eb;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.ApiExceptionUtilitiesKt;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.register.MobileRegisterViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MobileRegisterViewModel f15316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15317c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f15318d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(MobileRegisterViewModel mobileRegisterViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f15316b = mobileRegisterViewModel;
        this.f15317c = str;
        this.f15318d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i(this.f15316b, this.f15317c, this.f15318d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15315a;
        String str = this.f15317c;
        MobileRegisterViewModel mobileRegisterViewModel = this.f15316b;
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
                String str2 = mobileRegisterViewModel.f8767t;
                if (str2 != null) {
                    String str3 = mobileRegisterViewModel.f8766s;
                    if (str3 != null) {
                        this.f15315a = 1;
                        obj = userRepository.checkInvitationCode(str2, str3, str, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        Intrinsics.k("_mobileNumber");
                        throw null;
                    }
                } else {
                    Intrinsics.k("_invitationCode");
                    throw null;
                }
            }
            v0 v0Var = (v0) obj;
            mobileRegisterViewModel.f9084g.postValue(Boolean.FALSE);
            if (v0Var.f29302a.isSuccessful()) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null) {
                    if (baseResponseDto.getSuccess()) {
                        mobileRegisterViewModel.f8764q.postValue(new kj.j(new Pair(Boolean.TRUE, baseResponseDto.getMessage())));
                        MobileRegisterViewModel.h(mobileRegisterViewModel, str, this.f15318d);
                    } else {
                        mobileRegisterViewModel.f8765r.postValue(baseResponseDto.getMessage());
                    }
                } else {
                    mobileRegisterViewModel.f8765r.postValue("Try again Later!!!");
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            mobileRegisterViewModel.f9084g.postValue(Boolean.FALSE);
            mobileRegisterViewModel.f8765r.postValue(ApiExceptionUtilitiesKt.extractMessage(e10));
        }
        return Unit.f23355a;
    }
}
