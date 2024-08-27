package mi;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockOrderInfoResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qj.u;
import vt.g0;

/* loaded from: classes.dex */
public final class o extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockOrderViewModel f27808b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(StockOrderViewModel stockOrderViewModel, int i10) {
        super(1);
        this.f27807a = i10;
        this.f27808b = stockOrderViewModel;
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f27807a;
        StockOrderViewModel stockOrderViewModel = this.f27808b;
        switch (i10) {
            case 5:
                stockOrderViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            case 6:
            default:
                stockOrderViewModel.f9084g.postValue(Boolean.FALSE);
                stockOrderViewModel.K.postValue(th2.getLocalizedMessage());
                th2.printStackTrace();
                return;
            case 7:
                stockOrderViewModel.f9082e.postValue(ni.j.i(Integer.valueOf(R.string.error_stock_details)));
                th2.printStackTrace();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        int i10 = this.f27807a;
        StockOrderViewModel stockOrderViewModel = this.f27808b;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj;
                StockOrderInfoResponseDto stockOrderInfoResponseDto = (StockOrderInfoResponseDto) stockOrderViewModel.J.getValue();
                if (stockOrderInfoResponseDto != null) {
                    List<Portfolio> portfolioDetails = stockOrderInfoResponseDto.getPortfolioDetails();
                    Intrinsics.c(num);
                    stockOrderViewModel.f10234p = portfolioDetails.get(num.intValue());
                    stockOrderViewModel.E.setValue(ij.h.m(ij.h.f20067a, stockOrderInfoResponseDto.getPortfolioDetails().get(num.intValue()).getCashBalance()));
                }
                return Unit.f23355a;
            case 1:
                Portfolio portfolio = (Portfolio) obj;
                if (portfolio != null) {
                    stockOrderViewModel.E.setValue(ij.h.m(ij.h.f20067a, portfolio.getCashBalance()));
                }
                return Unit.f23355a;
            case 2:
                stockOrderViewModel.F.setValue(Double.valueOf(Double.parseDouble(((StockOrderInfoResponseDto) obj).getStockPrice()) * r6.getQuantity()));
                return Unit.f23355a;
            case 3:
                stockOrderViewModel.f9084g.postValue(Boolean.TRUE);
                return Unit.f23355a;
            case 4:
                StockDetailDto stockDetailDto = (StockDetailDto) obj;
                switch (i10) {
                    case 4:
                        stockOrderViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                    default:
                        stockOrderViewModel.M.postValue(stockDetailDto);
                        break;
                }
                return Unit.f23355a;
            case 5:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 6:
                StockDetailDto stockDetailDto2 = (StockDetailDto) obj;
                switch (i10) {
                    case 4:
                        stockOrderViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                    default:
                        stockOrderViewModel.M.postValue(stockDetailDto2);
                        break;
                }
                return Unit.f23355a;
            case 7:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 8:
                Iterator<T> it = ((StockOrderInfoResponseDto) obj).getPortfolioDetails().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        String portfolioId = ((Portfolio) next).getPortfolioId();
                        Portfolio portfolio2 = (Portfolio) stockOrderViewModel.P.getValue();
                        if (Intrinsics.a(portfolioId, portfolio2 != null ? portfolio2.getPortfolioId() : null)) {
                            obj2 = next;
                        }
                    }
                }
                return (Portfolio) obj2;
            case 9:
                stockOrderViewModel.f9084g.postValue(Boolean.FALSE);
                StockOrderInfoResponseDto stockOrderInfoResponseDto2 = (StockOrderInfoResponseDto) ((BaseResponseDto) obj).getData();
                if (stockOrderInfoResponseDto2 != null) {
                    stockOrderViewModel.J.postValue(stockOrderInfoResponseDto2);
                    stockOrderViewModel.L.postValue(Boolean.TRUE);
                    e0 e0Var = stockOrderViewModel.H;
                    CharSequence charSequence = (CharSequence) e0Var.getValue();
                    if (charSequence != null && charSequence.length() != 0) {
                        String str = (String) e0Var.getValue();
                        if (str != null) {
                            int hashCode = str.hashCode();
                            e0 e0Var2 = stockOrderViewModel.Q;
                            if (hashCode == -1997438884 && str.equals("Market")) {
                                e0Var2.postValue(u.f32064a);
                            } else {
                                e0Var2.postValue(u.f32065b);
                            }
                        }
                    } else {
                        e0Var.postValue(g0.u(stockOrderInfoResponseDto2.getOrderType()));
                    }
                    stockOrderViewModel.f10242x = Double.parseDouble(stockOrderInfoResponseDto2.getStockPrice());
                }
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }
}
