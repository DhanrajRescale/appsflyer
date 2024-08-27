package nf;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.SocialConfigResponseDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.main.MainViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class u extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f28674b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(MainViewModel mainViewModel, yt.a aVar) {
        super(2, aVar);
        this.f28674b = mainViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new u(this.f28674b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        SocialConfigResponseDto socialConfigResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f28673a;
        MainViewModel mainViewModel = this.f28674b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                UserRepository userRepository = mainViewModel.f9081d;
                this.f28673a = 1;
                obj = userRepository.getSocialConfig(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (socialConfigResponseDto = (SocialConfigResponseDto) baseResponseDto.getData()) != null) {
                mainViewModel.f9081d.saveSocialConfigToPreferences(socialConfigResponseDto.isSocialFeedEnabled(), socialConfigResponseDto.getSocialLanding());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
