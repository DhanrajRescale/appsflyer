package ib;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RiaProfileViewModel f19775b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(RiaProfileViewModel riaProfileViewModel, yt.a aVar) {
        super(2, aVar);
        this.f19775b = riaProfileViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new e0(this.f19775b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        BaseResponseDto baseResponseDto;
        RiaProfileResponseDto riaProfileResponseDto;
        Boolean bool;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19774a;
        RiaProfileViewModel riaProfileViewModel = this.f19775b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            UserRepository userRepository = riaProfileViewModel.f9081d;
            String str = riaProfileViewModel.f8804x;
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            this.f19774a = 1;
            obj = userRepository.getRiaProfileData(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful() && (obj2 = v0Var.f29303b) != null && (baseResponseDto = (BaseResponseDto) obj2) != null && (riaProfileResponseDto = (RiaProfileResponseDto) baseResponseDto.getData()) != null) {
            riaProfileViewModel.k(new z(riaProfileResponseDto));
            androidx.lifecycle.e0 e0Var = riaProfileViewModel.f8799s;
            RiaProfileResponseDto.ExpertMeta expertMeta = riaProfileResponseDto.getExpertMeta();
            if (expertMeta != null) {
                bool = expertMeta.isFollowing();
            } else {
                bool = null;
            }
            e0Var.postValue(bool);
            riaProfileViewModel.f8802v.postValue(riaProfileResponseDto.getBlockStatus());
        }
        return Unit.f23355a;
    }
}
