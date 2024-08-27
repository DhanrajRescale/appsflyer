package vi;

import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import com.assetgro.stockgro.data.repository.ApiExceptionUtilitiesKt;
import com.assetgro.stockgro.ui.stock.sell.StockSellViewModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockSellViewModel f38106b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(StockSellViewModel stockSellViewModel, int i10) {
        super(1);
        this.f38105a = i10;
        this.f38106b = stockSellViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        int i10 = this.f38105a;
        StockSellViewModel stockSellViewModel = this.f38106b;
        switch (i10) {
            case 0:
                stockSellViewModel.f9084g.postValue(Boolean.TRUE);
                return Unit.f23355a;
            case 1:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 2:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 3:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 4:
                invoke((Throwable) obj);
                return Unit.f23355a;
            default:
                Iterator<T> it = ((StockSellSelectOrderResponseDto) obj).getPortfolioDetails().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (Intrinsics.a(((Portfolio) obj2).getPortfolioId(), stockSellViewModel.f10400p)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                return (Portfolio) obj2;
        }
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        int i10 = this.f38105a;
        StockSellViewModel stockSellViewModel = this.f38106b;
        switch (i10) {
            case 1:
                stockSellViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto = (StockSellSelectOrderResponseDto) baseResponseDto.getData();
                if (stockSellSelectOrderResponseDto != null) {
                    stockSellViewModel.f10402r.postValue(stockSellSelectOrderResponseDto);
                    stockSellViewModel.f10403s.postValue("Market");
                    stockSellViewModel.f10405u.postValue(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f38105a;
        StockSellViewModel stockSellViewModel = this.f38106b;
        switch (i10) {
            case 2:
                stockSellViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                Intrinsics.c(th2);
                stockSellViewModel.f9083f.postValue(ni.j.i(ApiExceptionUtilitiesKt.extractMessage(th2)));
                th2.printStackTrace();
                return;
        }
    }
}
