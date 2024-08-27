package si;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockModifyInfoDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.modify.sell.ModifyStockSellViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModifyStockSellViewModel f34650b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ModifyStockSellViewModel modifyStockSellViewModel, int i10) {
        super(1);
        this.f34649a = i10;
        this.f34650b = modifyStockSellViewModel;
    }

    public final void a(StockModifyInfoDto stockModifyInfoDto) {
        String str;
        int i10 = this.f34649a;
        ModifyStockSellViewModel modifyStockSellViewModel = this.f34650b;
        switch (i10) {
            case 2:
                modifyStockSellViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                modifyStockSellViewModel.f9084g.postValue(Boolean.FALSE);
                modifyStockSellViewModel.f10343v.postValue(stockModifyInfoDto);
                e0 e0Var = modifyStockSellViewModel.f10341t;
                if (stockModifyInfoDto != null) {
                    str = stockModifyInfoDto.getOrderType();
                } else {
                    str = null;
                }
                e0Var.postValue(str);
                return;
        }
    }

    public final void d(StockSellSelectOrderResponseDto stockSellSelectOrderResponseDto) {
        int i10 = this.f34649a;
        ModifyStockSellViewModel modifyStockSellViewModel = this.f34650b;
        switch (i10) {
            case 17:
                modifyStockSellViewModel.f10344w.decrementAndGet();
                modifyStockSellViewModel.f10345x.postValue(Unit.f23355a);
                return;
            default:
                if (stockSellSelectOrderResponseDto != null) {
                    modifyStockSellViewModel.f10339r.postValue(stockSellSelectOrderResponseDto);
                    modifyStockSellViewModel.f10346y.postValue(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public final void e() {
        int i10 = this.f34649a;
        ModifyStockSellViewModel modifyStockSellViewModel = this.f34650b;
        switch (i10) {
            case 1:
                modifyStockSellViewModel.f9084g.postValue(Boolean.TRUE);
                return;
            case 6:
                modifyStockSellViewModel.f10344w.incrementAndGet();
                modifyStockSellViewModel.f10345x.postValue(Unit.f23355a);
                return;
            case 11:
                modifyStockSellViewModel.f10344w.incrementAndGet();
                modifyStockSellViewModel.f10345x.postValue(Unit.f23355a);
                return;
            default:
                modifyStockSellViewModel.f10344w.incrementAndGet();
                modifyStockSellViewModel.f10345x.postValue(Unit.f23355a);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ModifyStockSellViewModel modifyStockSellViewModel = this.f34650b;
        int i10 = this.f34649a;
        switch (i10) {
            case 0:
                return Boolean.valueOf(modifyStockSellViewModel.f10344w.get() > 0);
            case 1:
                e();
                return Unit.f23355a;
            case 2:
                a((StockModifyInfoDto) obj);
                return Unit.f23355a;
            case 3:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 4:
                a((StockModifyInfoDto) obj);
                return Unit.f23355a;
            case 5:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 6:
                e();
                return Unit.f23355a;
            case 7:
                Portfolio portfolio = (Portfolio) obj;
                switch (i10) {
                    case 7:
                        modifyStockSellViewModel.f10344w.decrementAndGet();
                        modifyStockSellViewModel.f10345x.postValue(Unit.f23355a);
                        break;
                    default:
                        modifyStockSellViewModel.f10338q.postValue(portfolio);
                        break;
                }
                return Unit.f23355a;
            case 8:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 9:
                Portfolio portfolio2 = (Portfolio) obj;
                switch (i10) {
                    case 7:
                        modifyStockSellViewModel.f10344w.decrementAndGet();
                        modifyStockSellViewModel.f10345x.postValue(Unit.f23355a);
                        break;
                    default:
                        modifyStockSellViewModel.f10338q.postValue(portfolio2);
                        break;
                }
                return Unit.f23355a;
            case 10:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 11:
                e();
                return Unit.f23355a;
            case 12:
                StockDetailDto stockDetailDto = (StockDetailDto) obj;
                switch (i10) {
                    case 12:
                        modifyStockSellViewModel.f10344w.decrementAndGet();
                        modifyStockSellViewModel.f10345x.postValue(Unit.f23355a);
                        break;
                    default:
                        modifyStockSellViewModel.f10340s.postValue(stockDetailDto);
                        break;
                }
                return Unit.f23355a;
            case 13:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 14:
                StockDetailDto stockDetailDto2 = (StockDetailDto) obj;
                switch (i10) {
                    case 12:
                        modifyStockSellViewModel.f10344w.decrementAndGet();
                        modifyStockSellViewModel.f10345x.postValue(Unit.f23355a);
                        break;
                    default:
                        modifyStockSellViewModel.f10340s.postValue(stockDetailDto2);
                        break;
                }
                return Unit.f23355a;
            case 15:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 16:
                e();
                return Unit.f23355a;
            case 17:
                d((StockSellSelectOrderResponseDto) obj);
                return Unit.f23355a;
            case 18:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 19:
                d((StockSellSelectOrderResponseDto) obj);
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }

    public final void invoke(Throwable th2) {
        Integer valueOf = Integer.valueOf(R.string.error_stock_details);
        int i10 = this.f34649a;
        ModifyStockSellViewModel modifyStockSellViewModel = this.f34650b;
        switch (i10) {
            case 3:
                modifyStockSellViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            case 5:
                modifyStockSellViewModel.f9082e.postValue(ni.j.i(valueOf));
                th2.printStackTrace();
                return;
            case 8:
                modifyStockSellViewModel.f10344w.decrementAndGet();
                modifyStockSellViewModel.f10345x.postValue(Unit.f23355a);
                return;
            case 10:
                modifyStockSellViewModel.f9082e.postValue(ni.j.i(Integer.valueOf(R.string.portfolio_not_known)));
                th2.printStackTrace();
                return;
            case 13:
                modifyStockSellViewModel.f10344w.decrementAndGet();
                modifyStockSellViewModel.f10345x.postValue(Unit.f23355a);
                return;
            case 15:
                modifyStockSellViewModel.f9082e.postValue(ni.j.i(valueOf));
                th2.printStackTrace();
                return;
            case 18:
                modifyStockSellViewModel.f10344w.decrementAndGet();
                modifyStockSellViewModel.f10345x.postValue(Unit.f23355a);
                return;
            default:
                modifyStockSellViewModel.f9082e.postValue(ni.j.i(valueOf));
                th2.printStackTrace();
                return;
        }
    }
}
