package ji;

import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import com.assetgro.stockgro.data.repository.ApiExceptionUtilitiesKt;
import com.assetgro.stockgro.ui.stock.cover.order.StockCoverOrderViewModel;
import iu.k;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ni.j;

/* loaded from: classes.dex */
public final class h extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockCoverOrderViewModel f21409b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(StockCoverOrderViewModel stockCoverOrderViewModel, int i10) {
        super(1);
        this.f21408a = i10;
        this.f21409b = stockCoverOrderViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        int i10 = this.f21408a;
        StockCoverOrderViewModel stockCoverOrderViewModel = this.f21409b;
        switch (i10) {
            case 0:
                stockCoverOrderViewModel.f9084g.postValue(Boolean.TRUE);
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
                        if (Intrinsics.a(((Portfolio) obj2).getPortfolioId(), stockCoverOrderViewModel.f10174p)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                return (Portfolio) obj2;
        }
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        int i10 = this.f21408a;
        StockCoverOrderViewModel stockCoverOrderViewModel = this.f21409b;
        switch (i10) {
            case 1:
                stockCoverOrderViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto = (StockSellSelectOrderResponseDto) baseResponseDto.getData();
                if (stockSellSelectOrderResponseDto != null) {
                    stockCoverOrderViewModel.f10176r.postValue(stockSellSelectOrderResponseDto);
                    stockCoverOrderViewModel.f10177s.postValue("Market");
                    stockCoverOrderViewModel.f10179u.postValue(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f21408a;
        StockCoverOrderViewModel stockCoverOrderViewModel = this.f21409b;
        switch (i10) {
            case 2:
                stockCoverOrderViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                Intrinsics.c(th2);
                stockCoverOrderViewModel.f9083f.postValue(j.i(ApiExceptionUtilitiesKt.extractMessage(th2)));
                th2.printStackTrace();
                return;
        }
    }
}
