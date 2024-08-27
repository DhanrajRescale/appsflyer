package gf;

import com.assetgro.stockgro.data.model.homedata.Widget;
import com.assetgro.stockgro.data.model.homedata.WidgetData;
import com.assetgro.stockgro.data.remote.NetworkResult;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.TopChartsRepository;
import com.assetgro.stockgro.ui.home.HomeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import tu.k1;
import ut.n;
import vt.i0;

/* loaded from: classes.dex */
public final class g extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f17372b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(HomeViewModel homeViewModel, yt.a aVar) {
        super(2, aVar);
        this.f17372b = homeViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f17372b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        WidgetData widgetData;
        List<Widget> list;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17371a;
        hf.h hVar = hf.h.f18372b;
        HomeViewModel homeViewModel = this.f17372b;
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
                this.f17371a = 1;
                obj = topChartsRepository.getHomePageDataV2(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            NetworkResult networkResult = (NetworkResult) obj;
            if (networkResult instanceof NetworkResult.Error) {
                homeViewModel.j(hVar);
            } else if (networkResult instanceof NetworkResult.Success) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) networkResult.getData();
                if (baseResponseDto != null) {
                    widgetData = (WidgetData) baseResponseDto.getData();
                } else {
                    widgetData = null;
                }
                homeViewModel.getClass();
                if (widgetData == null || (list = widgetData.getWidgets()) == null) {
                    list = i0.f38321a;
                }
                homeViewModel.j(new hf.e(list));
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
