package tg;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoResponseDto;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioFnoOrdersViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.model.PortfolioPendingOrderCancelRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f36044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PortfolioFnoOrdersViewModel f36045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36046c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PortfolioPendingOrderCancelRequest f36047d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PortfolioFnoOrdersViewModel portfolioFnoOrdersViewModel, String str, PortfolioPendingOrderCancelRequest portfolioPendingOrderCancelRequest, yt.a aVar) {
        super(2, aVar);
        this.f36045b = portfolioFnoOrdersViewModel;
        this.f36046c = str;
        this.f36047d = portfolioPendingOrderCancelRequest;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f36045b, this.f36046c, this.f36047d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BuySellModifyFnoResponseDto buySellModifyFnoResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f36044a;
        PortfolioFnoOrdersViewModel portfolioFnoOrdersViewModel = this.f36045b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            PortfolioRepository portfolioRepository = portfolioFnoOrdersViewModel.f9908n;
            this.f36044a = 1;
            obj = portfolioRepository.cancelOption(this.f36046c, this.f36047d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful()) {
            portfolioFnoOrdersViewModel.f9084g.setValue(Boolean.FALSE);
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null && (buySellModifyFnoResponseDto = (BuySellModifyFnoResponseDto) baseResponseDto.getData()) != null) {
                portfolioFnoOrdersViewModel.f9913s.postValue(buySellModifyFnoResponseDto);
            }
        }
        return Unit.f23355a;
    }
}
