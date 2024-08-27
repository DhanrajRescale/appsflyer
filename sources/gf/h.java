package gf;

import com.assetgro.stockgro.data.remote.NetworkResult;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.TopChartsRepository;
import com.assetgro.stockgro.ui.home.HomeViewModel;
import com.assetgro.stockgro.ui.home.homepage.data.MainHomeDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import tu.k1;
import ut.n;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f17374b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(HomeViewModel homeViewModel, yt.a aVar) {
        super(2, aVar);
        this.f17374b = homeViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f17374b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        MainHomeDto mainHomeDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17373a;
        hf.h hVar = hf.h.f18372b;
        HomeViewModel homeViewModel = this.f17374b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                TopChartsRepository topChartsRepository = homeViewModel.f9545n;
                this.f17373a = 1;
                obj = topChartsRepository.getHomePageDataV3(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            NetworkResult networkResult = (NetworkResult) obj;
            if (networkResult instanceof NetworkResult.Error) {
                homeViewModel.j(hVar);
            } else if (networkResult instanceof NetworkResult.Success) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) networkResult.getData();
                if (baseResponseDto != null && (mainHomeDto = (MainHomeDto) baseResponseDto.getData()) != null) {
                    homeViewModel.j(new hf.f(homeViewModel.f9551t.toDomainHome(mainHomeDto).getSection()));
                }
                k1 k1Var = homeViewModel.A;
                k1Var.m(hf.j.a((hf.j) k1Var.getValue(), false, false, null, null, false, 15));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            homeViewModel.j(hVar);
        }
        return Unit.f23355a;
    }
}
