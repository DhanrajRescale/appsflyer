package wi;

import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import ij.h;
import iu.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f39084b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f39085c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f39086d = new d(2);

    /* renamed from: e, reason: collision with root package name */
    public static final d f39087e = new d(3);

    /* renamed from: f, reason: collision with root package name */
    public static final d f39088f = new d(4);

    /* renamed from: g, reason: collision with root package name */
    public static final d f39089g = new d(5);

    /* renamed from: h, reason: collision with root package name */
    public static final d f39090h = new d(6);

    /* renamed from: i, reason: collision with root package name */
    public static final d f39091i = new d(7);

    /* renamed from: j, reason: collision with root package name */
    public static final d f39092j = new d(8);

    /* renamed from: k, reason: collision with root package name */
    public static final d f39093k = new d(9);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39094a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f39094a = i10;
    }

    public final String a(StockOrderDto stockOrderDto) {
        switch (this.f39094a) {
            case 0:
                return stockOrderDto.getBookProfit();
            case 1:
                Portfolio portfolioDropDownInfoDto = stockOrderDto.getPortfolioDropDownInfoDto();
                if (portfolioDropDownInfoDto == null) {
                    return null;
                }
                return h.m(h.f20067a, portfolioDropDownInfoDto.getCashBalance());
            case 2:
                Double executionPrice = stockOrderDto.getExecutionPrice();
                if (executionPrice == null) {
                    return null;
                }
                return h.m(h.f20067a, executionPrice.doubleValue());
            case 3:
                return stockOrderDto.getOrderType();
            case 4:
                Portfolio portfolioDropDownInfoDto2 = stockOrderDto.getPortfolioDropDownInfoDto();
                if (portfolioDropDownInfoDto2 == null) {
                    return null;
                }
                return portfolioDropDownInfoDto2.getPortfolioName();
            case 5:
                return stockOrderDto.getQuantity();
            case 6:
                return stockOrderDto.getStockImageUrl();
            case 7:
                return stockOrderDto.getStockName();
            case 8:
                return stockOrderDto.getStopLoss();
            default:
                String quantity = stockOrderDto.getQuantity();
                Intrinsics.c(quantity);
                int parseInt = Integer.parseInt(quantity);
                Double executionPrice2 = stockOrderDto.getExecutionPrice();
                Intrinsics.c(executionPrice2);
                return h.m(h.f20067a, parseInt * executionPrice2.doubleValue());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f39094a) {
            case 0:
                return a((StockOrderDto) obj);
            case 1:
                return a((StockOrderDto) obj);
            case 2:
                return a((StockOrderDto) obj);
            case 3:
                return a((StockOrderDto) obj);
            case 4:
                return a((StockOrderDto) obj);
            case 5:
                return a((StockOrderDto) obj);
            case 6:
                return a((StockOrderDto) obj);
            case 7:
                return a((StockOrderDto) obj);
            case 8:
                return a((StockOrderDto) obj);
            default:
                return a((StockOrderDto) obj);
        }
    }
}
