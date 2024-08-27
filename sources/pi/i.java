package pi;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.model.StockModifyInfoDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import com.assetgro.stockgro.ui.stock.modify.buy.ModifyBuyOrderViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ni.q;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModifyBuyOrderViewModel f31140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f31141c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(ModifyBuyOrderViewModel modifyBuyOrderViewModel, String str, int i10) {
        super(1);
        this.f31139a = i10;
        this.f31140b = modifyBuyOrderViewModel;
        this.f31141c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Double d10;
        StockDto stockDto;
        int i10 = 1;
        int i11 = this.f31139a;
        String stockId = this.f31141c;
        ModifyBuyOrderViewModel modifyBuyOrderViewModel = this.f31140b;
        switch (i11) {
            case 0:
                StockDetailDto stockDetailDto = (StockDetailDto) obj;
                e0 e0Var = modifyBuyOrderViewModel.O;
                if (stockDetailDto != null && (stockDto = stockDetailDto.getStockDto()) != null) {
                    d10 = Double.valueOf(stockDto.getLtp());
                } else {
                    d10 = null;
                }
                e0Var.postValue(d10);
                modifyBuyOrderViewModel.V.postValue(stockDetailDto);
                Portfolio portfolio = modifyBuyOrderViewModel.f10275p;
                Intrinsics.c(portfolio);
                String portfolioId = portfolio.getPortfolioId();
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(stockId, "stockId");
                modifyBuyOrderViewModel.f9084g.postValue(Boolean.TRUE);
                nt.h c10 = modifyBuyOrderViewModel.f10273n.getStockOrderInfoForPortfolio(portfolioId, stockId).c(((kq.e) modifyBuyOrderViewModel.f9079b).J());
                jt.d dVar = new jt.d(new q(12, new i(modifyBuyOrderViewModel, stockId, i10)), new q(13, new g(modifyBuyOrderViewModel, 12)));
                c10.a(dVar);
                modifyBuyOrderViewModel.f9080c.c(dVar);
                return Unit.f23355a;
            default:
                modifyBuyOrderViewModel.f9084g.postValue(Boolean.FALSE);
                StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto = (StockSellSelectOrderResponseDto) ((BaseResponseDto) obj).getData();
                if (stockSellSelectOrderResponseDto != null) {
                    modifyBuyOrderViewModel.S.postValue(stockSellSelectOrderResponseDto);
                    modifyBuyOrderViewModel.U.postValue(Boolean.TRUE);
                    Portfolio portfolio2 = modifyBuyOrderViewModel.f10275p;
                    Intrinsics.c(portfolio2);
                    String portfolioId2 = portfolio2.getPortfolioId();
                    String orderId = modifyBuyOrderViewModel.f10277r;
                    Intrinsics.c(orderId);
                    String type = modifyBuyOrderViewModel.f10276q;
                    Intrinsics.c(type);
                    Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                    Intrinsics.checkNotNullParameter(stockId, "stockId");
                    Intrinsics.checkNotNullParameter(type, "type");
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    at.m<BaseResponseDto<StockModifyInfoDto>> orderDetails = modifyBuyOrderViewModel.f10273n.getOrderDetails(portfolioId2, stockId, type, orderId);
                    q qVar = new q(14, h.f31124b);
                    orderDetails.getClass();
                    nt.h c11 = new nt.b(new nt.b(new nt.b(new nt.f(orderDetails, qVar, 1), new q(15, new g(modifyBuyOrderViewModel, 2)), 1), new q(16, new g(modifyBuyOrderViewModel, 3)), 2), new q(17, new g(modifyBuyOrderViewModel, 4)), 0).c(((kq.e) modifyBuyOrderViewModel.f9079b).J());
                    jt.d dVar2 = new jt.d(new q(18, new g(modifyBuyOrderViewModel, 5)), new q(19, new g(modifyBuyOrderViewModel, 6)));
                    c11.a(dVar2);
                    Intrinsics.checkNotNullExpressionValue(dVar2, "subscribe(...)");
                    modifyBuyOrderViewModel.f9080c.c(dVar2);
                }
                return Unit.f23355a;
        }
    }
}
