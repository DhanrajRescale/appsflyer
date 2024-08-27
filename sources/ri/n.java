package ri;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.StockDetailDto;
import com.assetgro.stockgro.data.model.StockModifyInfoDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.modify.cover.ModifyStockCoverOrderViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModifyStockCoverOrderViewModel f33784b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(ModifyStockCoverOrderViewModel modifyStockCoverOrderViewModel, int i10) {
        super(1);
        this.f33783a = i10;
        this.f33784b = modifyStockCoverOrderViewModel;
    }

    public final void a(StockModifyInfoDto stockModifyInfoDto) {
        String str;
        int i10 = this.f33783a;
        ModifyStockCoverOrderViewModel modifyStockCoverOrderViewModel = this.f33784b;
        switch (i10) {
            case 2:
                modifyStockCoverOrderViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                modifyStockCoverOrderViewModel.f9084g.postValue(Boolean.FALSE);
                modifyStockCoverOrderViewModel.f10327v.postValue(stockModifyInfoDto);
                e0 e0Var = modifyStockCoverOrderViewModel.f10325t;
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
        int i10 = this.f33783a;
        ModifyStockCoverOrderViewModel modifyStockCoverOrderViewModel = this.f33784b;
        switch (i10) {
            case 17:
                modifyStockCoverOrderViewModel.f10328w.decrementAndGet();
                modifyStockCoverOrderViewModel.f10329x.postValue(Unit.f23355a);
                return;
            default:
                if (stockSellSelectOrderResponseDto != null) {
                    modifyStockCoverOrderViewModel.f10323r.postValue(stockSellSelectOrderResponseDto);
                    modifyStockCoverOrderViewModel.f10330y.postValue(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public final void e() {
        int i10 = this.f33783a;
        ModifyStockCoverOrderViewModel modifyStockCoverOrderViewModel = this.f33784b;
        switch (i10) {
            case 1:
                modifyStockCoverOrderViewModel.f9084g.postValue(Boolean.TRUE);
                return;
            case 6:
                modifyStockCoverOrderViewModel.f10328w.incrementAndGet();
                modifyStockCoverOrderViewModel.f10329x.postValue(Unit.f23355a);
                return;
            case 11:
                modifyStockCoverOrderViewModel.f10328w.incrementAndGet();
                modifyStockCoverOrderViewModel.f10329x.postValue(Unit.f23355a);
                return;
            default:
                modifyStockCoverOrderViewModel.f10328w.incrementAndGet();
                modifyStockCoverOrderViewModel.f10329x.postValue(Unit.f23355a);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ModifyStockCoverOrderViewModel modifyStockCoverOrderViewModel = this.f33784b;
        int i10 = this.f33783a;
        switch (i10) {
            case 0:
                return Boolean.valueOf(modifyStockCoverOrderViewModel.f10328w.get() > 0);
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
                        modifyStockCoverOrderViewModel.f10328w.decrementAndGet();
                        modifyStockCoverOrderViewModel.f10329x.postValue(Unit.f23355a);
                        break;
                    default:
                        modifyStockCoverOrderViewModel.f10322q.postValue(portfolio);
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
                        modifyStockCoverOrderViewModel.f10328w.decrementAndGet();
                        modifyStockCoverOrderViewModel.f10329x.postValue(Unit.f23355a);
                        break;
                    default:
                        modifyStockCoverOrderViewModel.f10322q.postValue(portfolio2);
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
                        modifyStockCoverOrderViewModel.f10328w.decrementAndGet();
                        modifyStockCoverOrderViewModel.f10329x.postValue(Unit.f23355a);
                        break;
                    default:
                        modifyStockCoverOrderViewModel.f10324s.postValue(stockDetailDto);
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
                        modifyStockCoverOrderViewModel.f10328w.decrementAndGet();
                        modifyStockCoverOrderViewModel.f10329x.postValue(Unit.f23355a);
                        break;
                    default:
                        modifyStockCoverOrderViewModel.f10324s.postValue(stockDetailDto2);
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
        int i10 = this.f33783a;
        ModifyStockCoverOrderViewModel modifyStockCoverOrderViewModel = this.f33784b;
        switch (i10) {
            case 3:
                modifyStockCoverOrderViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            case 5:
                modifyStockCoverOrderViewModel.f9082e.postValue(ni.j.i(valueOf));
                th2.printStackTrace();
                return;
            case 8:
                modifyStockCoverOrderViewModel.f10328w.decrementAndGet();
                modifyStockCoverOrderViewModel.f10329x.postValue(Unit.f23355a);
                return;
            case 10:
                modifyStockCoverOrderViewModel.f9082e.postValue(ni.j.i(Integer.valueOf(R.string.portfolio_not_known)));
                th2.printStackTrace();
                return;
            case 13:
                modifyStockCoverOrderViewModel.f10328w.decrementAndGet();
                modifyStockCoverOrderViewModel.f10329x.postValue(Unit.f23355a);
                return;
            case 15:
                modifyStockCoverOrderViewModel.f9082e.postValue(ni.j.i(valueOf));
                th2.printStackTrace();
                return;
            case 18:
                modifyStockCoverOrderViewModel.f10328w.decrementAndGet();
                modifyStockCoverOrderViewModel.f10329x.postValue(Unit.f23355a);
                return;
            default:
                modifyStockCoverOrderViewModel.f9082e.postValue(ni.j.i(valueOf));
                th2.printStackTrace();
                return;
        }
    }
}
