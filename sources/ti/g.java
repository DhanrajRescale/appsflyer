package ti;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.model.StockModifyInfoDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.modify.short_sell.ModifyShortSellOrderViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModifyShortSellOrderViewModel f36105b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ModifyShortSellOrderViewModel modifyShortSellOrderViewModel, int i10) {
        super(1);
        this.f36104a = i10;
        this.f36105b = modifyShortSellOrderViewModel;
    }

    public final void a(StockDetailDto stockDetailDto) {
        Double d10;
        StockDto stockDto;
        int i10 = this.f36104a;
        ModifyShortSellOrderViewModel modifyShortSellOrderViewModel = this.f36105b;
        switch (i10) {
            case 9:
                modifyShortSellOrderViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                e0 e0Var = modifyShortSellOrderViewModel.M;
                if (stockDetailDto != null && (stockDto = stockDetailDto.getStockDto()) != null) {
                    d10 = Double.valueOf(stockDto.getLtp());
                } else {
                    d10 = null;
                }
                e0Var.postValue(d10);
                modifyShortSellOrderViewModel.T.postValue(stockDetailDto);
                return;
        }
    }

    public final void d(StockModifyInfoDto stockModifyInfoDto) {
        Double d10;
        Integer num;
        String str;
        double d11;
        int i10;
        float f10;
        Float f11;
        Float f12;
        String stockPrice;
        String entryPrice;
        String entryPrice2;
        String entryPrice3;
        int i11 = this.f36104a;
        ModifyShortSellOrderViewModel modifyShortSellOrderViewModel = this.f36105b;
        switch (i11) {
            case 2:
                modifyShortSellOrderViewModel.I.setValue(Double.valueOf(Double.parseDouble(stockModifyInfoDto.getEntryPrice()) * stockModifyInfoDto.getQuantity()));
                return;
            case 3:
            default:
                modifyShortSellOrderViewModel.f9084g.postValue(Boolean.FALSE);
                modifyShortSellOrderViewModel.X.postValue(stockModifyInfoDto);
                modifyShortSellOrderViewModel.S.postValue(Boolean.TRUE);
                e0 e0Var = modifyShortSellOrderViewModel.N;
                Double d12 = null;
                if (stockModifyInfoDto != null && (entryPrice3 = stockModifyInfoDto.getEntryPrice()) != null) {
                    d10 = Double.valueOf(Double.parseDouble(entryPrice3));
                } else {
                    d10 = null;
                }
                e0Var.postValue(d10);
                e0 e0Var2 = modifyShortSellOrderViewModel.L;
                if (stockModifyInfoDto != null) {
                    num = Integer.valueOf(stockModifyInfoDto.getQuantity());
                } else {
                    num = null;
                }
                e0Var2.postValue(num);
                e0 e0Var3 = modifyShortSellOrderViewModel.K;
                if (stockModifyInfoDto == null || (str = stockModifyInfoDto.getOrderType()) == null) {
                    str = "Market";
                }
                e0Var3.postValue(str);
                if (stockModifyInfoDto != null && (entryPrice2 = stockModifyInfoDto.getEntryPrice()) != null) {
                    d11 = Double.parseDouble(entryPrice2);
                } else {
                    d11 = 0.0d;
                }
                modifyShortSellOrderViewModel.f10367w = d11;
                if (stockModifyInfoDto != null) {
                    i10 = stockModifyInfoDto.getQuantity();
                } else {
                    i10 = 0;
                }
                modifyShortSellOrderViewModel.F = i10;
                if (stockModifyInfoDto != null && (entryPrice = stockModifyInfoDto.getEntryPrice()) != null) {
                    f10 = Float.parseFloat(entryPrice);
                } else {
                    f10 = s0.g.f34069a;
                }
                modifyShortSellOrderViewModel.E = f10 * modifyShortSellOrderViewModel.F;
                e0 e0Var4 = modifyShortSellOrderViewModel.O;
                if (stockModifyInfoDto != null) {
                    f11 = Float.valueOf(stockModifyInfoDto.getStop_loss());
                } else {
                    f11 = null;
                }
                e0Var4.postValue(f11);
                e0 e0Var5 = modifyShortSellOrderViewModel.P;
                if (stockModifyInfoDto != null) {
                    f12 = Float.valueOf(stockModifyInfoDto.getBookProfit());
                } else {
                    f12 = null;
                }
                e0Var5.postValue(f12);
                e0 e0Var6 = modifyShortSellOrderViewModel.M;
                if (stockModifyInfoDto != null && (stockPrice = stockModifyInfoDto.getStockPrice()) != null) {
                    d12 = Double.valueOf(Double.parseDouble(stockPrice));
                }
                e0Var6.postValue(d12);
                return;
            case 4:
                modifyShortSellOrderViewModel.f9084g.postValue(Boolean.FALSE);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        int i10 = this.f36104a;
        ModifyShortSellOrderViewModel modifyShortSellOrderViewModel = this.f36105b;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj;
                StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto = (StockSellSelectOrderResponseDto) modifyShortSellOrderViewModel.Q.getValue();
                if (stockSellSelectOrderResponseDto != null) {
                    List<Portfolio> portfolioDetails = stockSellSelectOrderResponseDto.getPortfolioDetails();
                    Intrinsics.c(num);
                    modifyShortSellOrderViewModel.f10360p = portfolioDetails.get(num.intValue());
                    modifyShortSellOrderViewModel.H.setValue(ij.h.m(ij.h.f20067a, stockSellSelectOrderResponseDto.getPortfolioDetails().get(num.intValue()).getCashBalance()));
                }
                return Unit.f23355a;
            case 1:
                Portfolio portfolio = (Portfolio) obj;
                if (portfolio != null) {
                    modifyShortSellOrderViewModel.H.setValue(ij.h.m(ij.h.f20067a, portfolio.getCashBalance()));
                }
                return Unit.f23355a;
            case 2:
                d((StockModifyInfoDto) obj);
                return Unit.f23355a;
            case 3:
                switch (i10) {
                    case 3:
                        modifyShortSellOrderViewModel.f9084g.postValue(Boolean.TRUE);
                        break;
                    default:
                        modifyShortSellOrderViewModel.f9084g.postValue(Boolean.TRUE);
                        break;
                }
                return Unit.f23355a;
            case 4:
                d((StockModifyInfoDto) obj);
                return Unit.f23355a;
            case 5:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 6:
                d((StockModifyInfoDto) obj);
                return Unit.f23355a;
            case 7:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 8:
                switch (i10) {
                    case 3:
                        modifyShortSellOrderViewModel.f9084g.postValue(Boolean.TRUE);
                        break;
                    default:
                        modifyShortSellOrderViewModel.f9084g.postValue(Boolean.TRUE);
                        break;
                }
                return Unit.f23355a;
            case 9:
                a((StockDetailDto) obj);
                return Unit.f23355a;
            case 10:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 11:
                a((StockDetailDto) obj);
                return Unit.f23355a;
            case 12:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 13:
                Iterator<T> it = ((StockSellSelectOrderResponseDto) obj).getPortfolioDetails().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        String portfolioId = ((Portfolio) next).getPortfolioId();
                        Portfolio portfolio2 = (Portfolio) modifyShortSellOrderViewModel.W.getValue();
                        if (Intrinsics.a(portfolioId, portfolio2 != null ? portfolio2.getPortfolioId() : null)) {
                            obj2 = next;
                        }
                    }
                }
                return (Portfolio) obj2;
            case 14:
                modifyShortSellOrderViewModel.f9084g.postValue(Boolean.FALSE);
                StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto2 = (StockSellSelectOrderResponseDto) ((BaseResponseDto) obj).getData();
                if (stockSellSelectOrderResponseDto2 != null) {
                    modifyShortSellOrderViewModel.Q.postValue(stockSellSelectOrderResponseDto2);
                    modifyShortSellOrderViewModel.S.postValue(Boolean.TRUE);
                }
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }

    public final void invoke(Throwable th2) {
        Integer valueOf = Integer.valueOf(R.string.error_stock_details);
        int i10 = this.f36104a;
        ModifyShortSellOrderViewModel modifyShortSellOrderViewModel = this.f36105b;
        switch (i10) {
            case 5:
                modifyShortSellOrderViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            case 7:
                modifyShortSellOrderViewModel.f9082e.postValue(ni.j.i(valueOf));
                th2.printStackTrace();
                return;
            case 10:
                modifyShortSellOrderViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            case 12:
                modifyShortSellOrderViewModel.f9082e.postValue(ni.j.i(valueOf));
                th2.printStackTrace();
                return;
            default:
                modifyShortSellOrderViewModel.f9084g.postValue(Boolean.FALSE);
                modifyShortSellOrderViewModel.R.postValue(th2.getLocalizedMessage());
                th2.printStackTrace();
                return;
        }
    }
}
