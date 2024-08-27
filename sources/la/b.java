package la;

import au.i;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.feature_market.data.remote.MarketOptionDto;
import com.assetgro.stockgro.feature_market.domain.model.MarketOption;
import com.assetgro.stockgro.feature_market.presentation.fno.search.MarketOptionSearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f24377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarketOptionSearchViewModel f24378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24379c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MarketOptionSearchViewModel marketOptionSearchViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f24378b = marketOptionSearchViewModel;
        this.f24379c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new b(this.f24378b, this.f24379c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        MarketOptionDto marketOptionDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f24377a;
        MarketOptionSearchViewModel marketOptionSearchViewModel = this.f24378b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                FnoRepository fnoRepository = marketOptionSearchViewModel.f8648n;
                String str = this.f24379c;
                String str2 = marketOptionSearchViewModel.f8649o;
                this.f24377a = 1;
                obj = FnoRepository.getOptionListData$default(fnoRepository, str, null, null, str2, this, 6, null);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                marketOptionSearchViewModel.f9084g.postValue(Boolean.FALSE);
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (marketOptionDto = (MarketOptionDto) baseResponseDto.getData()) != null) {
                    String str3 = this.f24379c;
                    MarketOption marketOption = marketOptionDto.toMarketOption();
                    if (Intrinsics.a(str3, "index")) {
                        marketOptionSearchViewModel.f8651q.postValue(marketOption.getIndices());
                    } else {
                        marketOptionSearchViewModel.f8651q.postValue(marketOption.getStocks());
                    }
                }
            }
        } catch (Exception e10) {
            marketOptionSearchViewModel.f9084g.postValue(Boolean.FALSE);
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
