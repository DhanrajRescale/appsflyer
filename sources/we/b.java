package we;

import au.i;
import com.assetgro.stockgro.data.remote.NetworkResult;
import com.assetgro.stockgro.data.remote.SGError;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.TopChartsRepository;
import com.assetgro.stockgro.ui.drawer.championsChart.ChampionsChartViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChampionsChartViewModel f39036b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ChampionsChartViewModel championsChartViewModel, yt.a aVar) {
        super(2, aVar);
        this.f39036b = championsChartViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new b(this.f39036b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        List list;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39035a;
        ChampionsChartViewModel championsChartViewModel = this.f39036b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                TopChartsRepository topChartsRepository = championsChartViewModel.f9475n;
                this.f39035a = 1;
                obj = topChartsRepository.getAllChampions(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            NetworkResult networkResult = (NetworkResult) obj;
            if (networkResult instanceof NetworkResult.Success) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) networkResult.getData();
                if (baseResponseDto != null && (list = (List) baseResponseDto.getData()) != null) {
                    championsChartViewModel.f9476o.postValue(list);
                }
            } else if (networkResult instanceof NetworkResult.Error) {
                SGError error = networkResult.getError();
                if (error != null) {
                    str = error.getErrorText();
                } else {
                    str = null;
                }
                championsChartViewModel.f(str);
            }
            championsChartViewModel.f9084g.postValue(Boolean.FALSE);
        } catch (Exception unused) {
            championsChartViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
