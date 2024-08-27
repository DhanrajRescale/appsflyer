package xi;

import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockOrderInfoResponseDto;
import iu.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.z;

/* loaded from: classes.dex */
public final class h extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final h f40278b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f40279c = new h(1);

    /* renamed from: d, reason: collision with root package name */
    public static final h f40280d = new h(2);

    /* renamed from: e, reason: collision with root package name */
    public static final h f40281e = new h(3);

    /* renamed from: f, reason: collision with root package name */
    public static final h f40282f = new h(4);

    /* renamed from: g, reason: collision with root package name */
    public static final h f40283g = new h(5);

    /* renamed from: h, reason: collision with root package name */
    public static final h f40284h = new h(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40285a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10) {
        super(1);
        this.f40285a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f40285a;
        switch (i10) {
            case 0:
                StockOrderInfoResponseDto stockOrderInfoResponseDto = (StockOrderInfoResponseDto) obj;
                switch (i10) {
                    case 0:
                        return Float.valueOf(stockOrderInfoResponseDto.getBookProfit());
                    default:
                        return Float.valueOf(stockOrderInfoResponseDto.getStop_loss());
                }
            case 1:
                BaseResponseDto response = (BaseResponseDto) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                return (StockDetailDto) response.getData();
            case 2:
                String portfolioName = ((Portfolio) obj).getPortfolioName();
                if (portfolioName == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return portfolioName;
            case 3:
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
            case 4:
                return Double.valueOf(Double.parseDouble(((StockOrderInfoResponseDto) obj).getStockPrice()));
            case 5:
                return Integer.valueOf(((StockOrderInfoResponseDto) obj).getQuantity());
            default:
                StockOrderInfoResponseDto stockOrderInfoResponseDto2 = (StockOrderInfoResponseDto) obj;
                switch (i10) {
                    case 0:
                        return Float.valueOf(stockOrderInfoResponseDto2.getBookProfit());
                    default:
                        return Float.valueOf(stockOrderInfoResponseDto2.getStop_loss());
                }
        }
    }
}
