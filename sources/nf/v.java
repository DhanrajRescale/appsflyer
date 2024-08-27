package nf;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.data.remote.UserInfoResponseDto;
import com.assetgro.stockgro.ui.main.MainViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class v extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f28676b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(MainViewModel mainViewModel, yt.a aVar) {
        super(2, aVar);
        this.f28676b = mainViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new v(this.f28676b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        UserInfoResponseDto userInfoResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f28675a;
        MainViewModel mainViewModel = this.f28676b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            UserRepository userRepository = mainViewModel.f9081d;
            this.f28675a = 1;
            obj = userRepository.userInfo(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (userInfoResponseDto = (UserInfoResponseDto) baseResponseDto.getData()) != null) {
            mainViewModel.f9081d.saveUserInfo(userInfoResponseDto);
        }
        return Unit.f23355a;
    }
}
