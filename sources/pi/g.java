package pi;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.StockModifyInfoDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.modify.buy.ModifyBuyOrderViewModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModifyBuyOrderViewModel f31123b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ModifyBuyOrderViewModel modifyBuyOrderViewModel, int i10) {
        super(1);
        this.f31122a = i10;
        this.f31123b = modifyBuyOrderViewModel;
    }

    public final void a(StockModifyInfoDto stockModifyInfoDto) {
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
        int i11 = this.f31122a;
        ModifyBuyOrderViewModel modifyBuyOrderViewModel = this.f31123b;
        switch (i11) {
            case 1:
                modifyBuyOrderViewModel.K.setValue(Double.valueOf(Double.parseDouble(stockModifyInfoDto.getEntryPrice()) * stockModifyInfoDto.getQuantity()));
                return;
            case 2:
            default:
                modifyBuyOrderViewModel.f9084g.postValue(Boolean.FALSE);
                modifyBuyOrderViewModel.Z.postValue(stockModifyInfoDto);
                modifyBuyOrderViewModel.U.postValue(Boolean.TRUE);
                e0 e0Var = modifyBuyOrderViewModel.P;
                Double d12 = null;
                if (stockModifyInfoDto != null && (entryPrice3 = stockModifyInfoDto.getEntryPrice()) != null) {
                    d10 = Double.valueOf(Double.parseDouble(entryPrice3));
                } else {
                    d10 = null;
                }
                e0Var.postValue(d10);
                e0 e0Var2 = modifyBuyOrderViewModel.N;
                if (stockModifyInfoDto != null) {
                    num = Integer.valueOf(stockModifyInfoDto.getQuantity());
                } else {
                    num = null;
                }
                e0Var2.postValue(num);
                e0 e0Var3 = modifyBuyOrderViewModel.M;
                if (stockModifyInfoDto == null || (str = stockModifyInfoDto.getOrderType()) == null) {
                    str = "Market";
                }
                e0Var3.postValue(str);
                if (stockModifyInfoDto != null && (entryPrice2 = stockModifyInfoDto.getEntryPrice()) != null) {
                    d11 = Double.parseDouble(entryPrice2);
                } else {
                    d11 = 0.0d;
                }
                modifyBuyOrderViewModel.f10284y = d11;
                if (stockModifyInfoDto != null) {
                    i10 = stockModifyInfoDto.getQuantity();
                } else {
                    i10 = 0;
                }
                modifyBuyOrderViewModel.H = i10;
                if (stockModifyInfoDto != null && (entryPrice = stockModifyInfoDto.getEntryPrice()) != null) {
                    f10 = Float.parseFloat(entryPrice);
                } else {
                    f10 = s0.g.f34069a;
                }
                modifyBuyOrderViewModel.G = f10 * modifyBuyOrderViewModel.H;
                e0 e0Var4 = modifyBuyOrderViewModel.Q;
                if (stockModifyInfoDto != null) {
                    f11 = Float.valueOf(stockModifyInfoDto.getStop_loss());
                } else {
                    f11 = null;
                }
                e0Var4.postValue(f11);
                e0 e0Var5 = modifyBuyOrderViewModel.R;
                if (stockModifyInfoDto != null) {
                    f12 = Float.valueOf(stockModifyInfoDto.getBookProfit());
                } else {
                    f12 = null;
                }
                e0Var5.postValue(f12);
                e0 e0Var6 = modifyBuyOrderViewModel.O;
                if (stockModifyInfoDto != null && (stockPrice = stockModifyInfoDto.getStockPrice()) != null) {
                    d12 = Double.valueOf(Double.parseDouble(stockPrice));
                }
                e0Var6.postValue(d12);
                return;
            case 3:
                modifyBuyOrderViewModel.f9084g.postValue(Boolean.FALSE);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        int i10 = this.f31122a;
        ModifyBuyOrderViewModel modifyBuyOrderViewModel = this.f31123b;
        switch (i10) {
            case 0:
                Portfolio portfolio = (Portfolio) obj;
                if (portfolio != null) {
                    modifyBuyOrderViewModel.J.setValue(ij.h.m(ij.h.f20067a, portfolio.getCashBalance()));
                }
                return Unit.f23355a;
            case 1:
                a((StockModifyInfoDto) obj);
                return Unit.f23355a;
            case 2:
                switch (i10) {
                    case 2:
                        modifyBuyOrderViewModel.f9084g.postValue(Boolean.TRUE);
                        break;
                    default:
                        modifyBuyOrderViewModel.f9084g.postValue(Boolean.TRUE);
                        break;
                }
                return Unit.f23355a;
            case 3:
                a((StockModifyInfoDto) obj);
                return Unit.f23355a;
            case 4:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 5:
                a((StockModifyInfoDto) obj);
                return Unit.f23355a;
            case 6:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 7:
                switch (i10) {
                    case 2:
                        modifyBuyOrderViewModel.f9084g.postValue(Boolean.TRUE);
                        break;
                    default:
                        modifyBuyOrderViewModel.f9084g.postValue(Boolean.TRUE);
                        break;
                }
                return Unit.f23355a;
            case 8:
                modifyBuyOrderViewModel.f9084g.postValue(Boolean.FALSE);
                return Unit.f23355a;
            case 9:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 10:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 11:
                Iterator<T> it = ((StockSellSelectOrderResponseDto) obj).getPortfolioDetails().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        String portfolioId = ((Portfolio) next).getPortfolioId();
                        Portfolio portfolio2 = (Portfolio) modifyBuyOrderViewModel.Y.getValue();
                        if (Intrinsics.a(portfolioId, portfolio2 != null ? portfolio2.getPortfolioId() : null)) {
                            obj2 = next;
                        }
                    }
                }
                return (Portfolio) obj2;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }

    public final void invoke(Throwable th2) {
        Integer valueOf = Integer.valueOf(R.string.error_stock_details);
        int i10 = this.f31122a;
        ModifyBuyOrderViewModel modifyBuyOrderViewModel = this.f31123b;
        switch (i10) {
            case 4:
                modifyBuyOrderViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            case 5:
            case 7:
            case 8:
            default:
                modifyBuyOrderViewModel.f9084g.postValue(Boolean.FALSE);
                modifyBuyOrderViewModel.T.postValue(th2.getLocalizedMessage());
                th2.printStackTrace();
                return;
            case 6:
                modifyBuyOrderViewModel.f9082e.postValue(ni.j.i(valueOf));
                th2.printStackTrace();
                return;
            case 9:
                modifyBuyOrderViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            case 10:
                modifyBuyOrderViewModel.f9082e.postValue(ni.j.i(valueOf));
                th2.printStackTrace();
                return;
        }
    }
}
