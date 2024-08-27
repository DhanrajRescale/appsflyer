package mi;

import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockOrderInfoResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.z;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f27764b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f27765c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f27766d = new d(2);

    /* renamed from: e, reason: collision with root package name */
    public static final d f27767e = new d(3);

    /* renamed from: f, reason: collision with root package name */
    public static final d f27768f = new d(4);

    /* renamed from: g, reason: collision with root package name */
    public static final d f27769g = new d(5);

    /* renamed from: h, reason: collision with root package name */
    public static final d f27770h = new d(6);

    /* renamed from: i, reason: collision with root package name */
    public static final d f27771i = new d(7);

    /* renamed from: j, reason: collision with root package name */
    public static final d f27772j = new d(8);

    /* renamed from: k, reason: collision with root package name */
    public static final d f27773k = new d(9);

    /* renamed from: l, reason: collision with root package name */
    public static final d f27774l = new d(10);

    /* renamed from: m, reason: collision with root package name */
    public static final d f27775m = new d(11);

    /* renamed from: n, reason: collision with root package name */
    public static final d f27776n = new d(12);

    /* renamed from: o, reason: collision with root package name */
    public static final d f27777o = new d(13);

    /* renamed from: p, reason: collision with root package name */
    public static final d f27778p = new d(14);

    /* renamed from: q, reason: collision with root package name */
    public static final d f27779q = new d(15);

    /* renamed from: r, reason: collision with root package name */
    public static final d f27780r = new d(16);

    /* renamed from: s, reason: collision with root package name */
    public static final d f27781s = new d(17);

    /* renamed from: t, reason: collision with root package name */
    public static final d f27782t = new d(18);

    /* renamed from: u, reason: collision with root package name */
    public static final d f27783u = new d(19);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27784a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f27784a = i10;
    }

    public final String a(StockOrderDto stockOrderDto) {
        switch (this.f27784a) {
            case 0:
                return stockOrderDto.getBookProfit();
            case 1:
                Portfolio portfolioDropDownInfoDto = stockOrderDto.getPortfolioDropDownInfoDto();
                if (portfolioDropDownInfoDto == null) {
                    return null;
                }
                return ij.h.m(ij.h.f20067a, portfolioDropDownInfoDto.getCashBalance());
            case 2:
                Double executionPrice = stockOrderDto.getExecutionPrice();
                if (executionPrice == null) {
                    return null;
                }
                return ij.h.m(ij.h.f20067a, executionPrice.doubleValue());
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
            case 9:
                Double executionPrice2 = stockOrderDto.getExecutionPrice();
                if (executionPrice2 == null) {
                    return null;
                }
                return ij.h.m(ij.h.f20067a, executionPrice2.doubleValue());
            case 10:
                return stockOrderDto.getQuantity();
            case 11:
                return stockOrderDto.getStockImageUrl();
            default:
                return stockOrderDto.getStockName();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f27784a;
        switch (i10) {
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
            case 9:
                return a((StockOrderDto) obj);
            case 10:
                return a((StockOrderDto) obj);
            case 11:
                return a((StockOrderDto) obj);
            case 12:
                return a((StockOrderDto) obj);
            case 13:
                StockOrderInfoResponseDto stockOrderInfoResponseDto = (StockOrderInfoResponseDto) obj;
                switch (i10) {
                    case 13:
                        return Float.valueOf(stockOrderInfoResponseDto.getBookProfit());
                    default:
                        return Float.valueOf(stockOrderInfoResponseDto.getStop_loss());
                }
            case 14:
                BaseResponseDto response = (BaseResponseDto) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                return (StockDetailDto) response.getData();
            case 15:
                String portfolioName = ((Portfolio) obj).getPortfolioName();
                if (portfolioName == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return portfolioName;
            case 16:
                List<Portfolio> portfolioDetails = ((StockOrderInfoResponseDto) obj).getPortfolioDetails();
                ArrayList arrayList = new ArrayList(z.k(portfolioDetails));
                Iterator<T> it = portfolioDetails.iterator();
                while (it.hasNext()) {
                    String portfolioName2 = ((Portfolio) it.next()).getPortfolioName();
                    if (portfolioName2 == null) {
                        portfolioName2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    arrayList.add(portfolioName2);
                }
                return arrayList;
            case 17:
                return Double.valueOf(Double.parseDouble(((StockOrderInfoResponseDto) obj).getStockPrice()));
            case 18:
                return Integer.valueOf(((StockOrderInfoResponseDto) obj).getQuantity());
            default:
                StockOrderInfoResponseDto stockOrderInfoResponseDto2 = (StockOrderInfoResponseDto) obj;
                switch (i10) {
                    case 13:
                        return Float.valueOf(stockOrderInfoResponseDto2.getBookProfit());
                    default:
                        return Float.valueOf(stockOrderInfoResponseDto2.getStop_loss());
                }
        }
    }
}
