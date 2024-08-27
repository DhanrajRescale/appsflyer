package ja;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.feature_market.data.remote.MarketOptionDto;
import com.assetgro.stockgro.feature_market.domain.model.MarketOption;
import com.assetgro.stockgro.feature_market.presentation.fno.option.MarketOptionsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class q extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f21286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarketOptionsListViewModel f21287b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(MarketOptionsListViewModel marketOptionsListViewModel, yt.a aVar) {
        super(2, aVar);
        this.f21287b = marketOptionsListViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new q(this.f21287b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        MarketOptionDto marketOptionDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f21286a;
        MarketOptionsListViewModel marketOptionsListViewModel = this.f21287b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                FnoRepository fnoRepository = marketOptionsListViewModel.f8627n;
                String str = marketOptionsListViewModel.f8630q;
                this.f21286a = 1;
                obj = FnoRepository.getOptionListData$default(fnoRepository, str, null, null, null, this, 14, null);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (marketOptionDto = (MarketOptionDto) baseResponseDto.getData()) != null) {
                MarketOption marketOption = marketOptionDto.toMarketOption();
                if (Intrinsics.a(marketOptionsListViewModel.f8630q, "index")) {
                    marketOptionsListViewModel.i(new k(marketOption.getIndices()));
                } else {
                    marketOptionsListViewModel.i(new k(marketOption.getStocks()));
                }
            }
        } catch (Exception e10) {
            marketOptionsListViewModel.f9084g.postValue(Boolean.FALSE);
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
