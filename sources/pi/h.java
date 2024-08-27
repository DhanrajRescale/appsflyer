package pi;

import com.assetgro.stockgro.data.model.ModifyOrderDto;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockModifyInfoDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final h f31124b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f31125c = new h(1);

    /* renamed from: d, reason: collision with root package name */
    public static final h f31126d = new h(2);

    /* renamed from: e, reason: collision with root package name */
    public static final h f31127e = new h(3);

    /* renamed from: f, reason: collision with root package name */
    public static final h f31128f = new h(4);

    /* renamed from: g, reason: collision with root package name */
    public static final h f31129g = new h(5);

    /* renamed from: h, reason: collision with root package name */
    public static final h f31130h = new h(6);

    /* renamed from: i, reason: collision with root package name */
    public static final h f31131i = new h(7);

    /* renamed from: j, reason: collision with root package name */
    public static final h f31132j = new h(8);

    /* renamed from: k, reason: collision with root package name */
    public static final h f31133k = new h(9);

    /* renamed from: l, reason: collision with root package name */
    public static final h f31134l = new h(10);

    /* renamed from: m, reason: collision with root package name */
    public static final h f31135m = new h(11);

    /* renamed from: n, reason: collision with root package name */
    public static final h f31136n = new h(12);

    /* renamed from: o, reason: collision with root package name */
    public static final h f31137o = new h(13);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31138a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10) {
        super(1);
        this.f31138a = i10;
    }

    public final String a(ModifyOrderDto modifyOrderDto) {
        switch (this.f31138a) {
            case 4:
                return modifyOrderDto.getBookProfit();
            case 5:
                Portfolio selectedPortfolio = modifyOrderDto.getSelectedPortfolio();
                if (selectedPortfolio == null) {
                    return null;
                }
                return ij.h.m(ij.h.f20067a, selectedPortfolio.getCashBalance());
            case 6:
                Double executionPrice = modifyOrderDto.getExecutionPrice();
                if (executionPrice == null) {
                    return null;
                }
                return ij.h.m(ij.h.f20067a, executionPrice.doubleValue());
            case 7:
                return modifyOrderDto.getOrderType();
            case 8:
                Portfolio selectedPortfolio2 = modifyOrderDto.getSelectedPortfolio();
                if (selectedPortfolio2 == null) {
                    return null;
                }
                return selectedPortfolio2.getPortfolioName();
            case 9:
                return modifyOrderDto.getQuantity();
            case 10:
                return modifyOrderDto.getStockImageUrl();
            case 11:
                return modifyOrderDto.getStockName();
            case 12:
                return modifyOrderDto.getStopLoss();
            default:
                String quantity = modifyOrderDto.getQuantity();
                Intrinsics.c(quantity);
                int parseInt = Integer.parseInt(quantity);
                Double executionPrice2 = modifyOrderDto.getExecutionPrice();
                Intrinsics.c(executionPrice2);
                return ij.h.m(ij.h.f20067a, parseInt * executionPrice2.doubleValue());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f31138a) {
            case 0:
                BaseResponseDto response = (BaseResponseDto) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                return (StockModifyInfoDto) response.getData();
            case 1:
                BaseResponseDto response2 = (BaseResponseDto) obj;
                Intrinsics.checkNotNullParameter(response2, "response");
                return (StockDetailDto) response2.getData();
            case 2:
                return ((StockModifyInfoDto) obj).getParentOrderType();
            case 3:
                String portfolioName = ((Portfolio) obj).getPortfolioName();
                if (portfolioName == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return portfolioName;
            case 4:
                return a((ModifyOrderDto) obj);
            case 5:
                return a((ModifyOrderDto) obj);
            case 6:
                return a((ModifyOrderDto) obj);
            case 7:
                return a((ModifyOrderDto) obj);
            case 8:
                return a((ModifyOrderDto) obj);
            case 9:
                return a((ModifyOrderDto) obj);
            case 10:
                return a((ModifyOrderDto) obj);
            case 11:
                return a((ModifyOrderDto) obj);
            case 12:
                return a((ModifyOrderDto) obj);
            default:
                return a((ModifyOrderDto) obj);
        }
    }
}
