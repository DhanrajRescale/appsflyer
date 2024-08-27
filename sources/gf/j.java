package gf;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.home.HomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f17378b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(HomeViewModel homeViewModel, yt.a aVar) {
        super(2, aVar);
        this.f17378b = homeViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j(this.f17378b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        sh.c cVar;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17377a;
        HomeViewModel homeViewModel = this.f17378b;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            UserRepository userRepository = homeViewModel.f9081d;
            this.f17377a = 1;
            obj = userRepository.getUnclaimedScratchCardsForMainDashBoard(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful()) {
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null && (cVar = (sh.c) baseResponseDto.getData()) != null) {
                th.c a10 = cVar.a();
                if (!a10.f36086c.isEmpty()) {
                    homeViewModel.f9552u.postValue(Boolean.TRUE);
                    homeViewModel.k(new uh.f(a10));
                } else {
                    homeViewModel.f9552u.postValue(Boolean.FALSE);
                }
                unit = Unit.f23355a;
            } else {
                unit = null;
            }
            if (unit == null) {
                homeViewModel.f9552u.postValue(Boolean.FALSE);
            }
        }
        return Unit.f23355a;
    }
}
