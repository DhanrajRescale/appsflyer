package ib;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;

/* loaded from: classes.dex */
public final class g0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RiaProfileViewModel f19784b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19785c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(RiaProfileViewModel riaProfileViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f19784b = riaProfileViewModel;
        this.f19785c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g0(this.f19784b, this.f19785c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19783a;
        RiaProfileViewModel riaProfileViewModel = this.f19784b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                FollowerRepository followerRepository = riaProfileViewModel.f8794n;
                String str = this.f19785c;
                this.f19783a = 1;
                obj = followerRepository.unfriend(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            androidx.lifecycle.e0 e0Var = riaProfileViewModel.f9084g;
            Boolean bool = Boolean.FALSE;
            e0Var.postValue(bool);
            if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && baseResponseDto.getSuccess()) {
                riaProfileViewModel.f8799s.postValue(bool);
                riaProfileViewModel.f8800t.postValue("Successfully removed");
                riaProfileViewModel.i();
            } else {
                riaProfileViewModel.f8800t.postValue("Some error occurred");
            }
        } catch (Exception e10) {
            riaProfileViewModel.f8799s.postValue(Boolean.TRUE);
            riaProfileViewModel.f9084g.postValue(Boolean.FALSE);
            riaProfileViewModel.f8800t.postValue(e10.getLocalizedMessage());
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
