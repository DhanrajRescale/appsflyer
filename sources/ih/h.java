package ih;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.data.remote.UserInfoResponseDto;
import com.assetgro.stockgro.ui.profile.self.EditProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f20004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditProfileViewModel f20005b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(EditProfileViewModel editProfileViewModel, yt.a aVar) {
        super(2, aVar);
        this.f20005b = editProfileViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f20005b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        UserInfoResponseDto userInfoResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f20004a;
        EditProfileViewModel editProfileViewModel = this.f20005b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            UserRepository userRepository = editProfileViewModel.f9081d;
            this.f20004a = 1;
            obj = userRepository.userInfo(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        editProfileViewModel.f9084g.postValue(Boolean.FALSE);
        if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (userInfoResponseDto = (UserInfoResponseDto) baseResponseDto.getData()) != null) {
            editProfileViewModel.f10032p.postValue(userInfoResponseDto);
        }
        return Unit.f23355a;
    }
}
