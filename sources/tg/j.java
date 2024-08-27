package tg;

import com.assetgro.stockgro.data.model.portfolio.orders.PortfolioOrdersDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioOrdersViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PortfolioOrdersViewModel f36057b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(PortfolioOrdersViewModel portfolioOrdersViewModel, int i10) {
        super(1);
        this.f36056a = i10;
        this.f36057b = portfolioOrdersViewModel;
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f36056a;
        PortfolioOrdersViewModel portfolioOrdersViewModel = this.f36057b;
        switch (i10) {
            case 1:
                portfolioOrdersViewModel.f9084g.postValue(Boolean.FALSE);
                portfolioOrdersViewModel.f9919r.postValue(th2.getLocalizedMessage());
                th2.printStackTrace();
                return;
            case 3:
                portfolioOrdersViewModel.f9084g.postValue(Boolean.FALSE);
                portfolioOrdersViewModel.f9919r.postValue(th2.getLocalizedMessage());
                th2.printStackTrace();
                return;
            case 6:
                portfolioOrdersViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                portfolioOrdersViewModel.f9082e.postValue(ni.j.i(Integer.valueOf(R.string.error_stock_list)));
                th2.printStackTrace();
                return;
        }
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        int i10 = this.f36056a;
        PortfolioOrdersViewModel portfolioOrdersViewModel = this.f36057b;
        switch (i10) {
            case 0:
                portfolioOrdersViewModel.f9084g.postValue(Boolean.FALSE);
                if (baseResponseDto.getSuccess()) {
                    String str = (String) baseResponseDto.getData();
                    if (str != null) {
                        portfolioOrdersViewModel.f9917p.postValue(str);
                        return;
                    }
                    return;
                }
                portfolioOrdersViewModel.f9083f.postValue(ni.j.i(baseResponseDto.getMessage()));
                return;
            default:
                PortfolioOrdersDto portfolioOrdersDto = (PortfolioOrdersDto) baseResponseDto.getData();
                if (portfolioOrdersDto != null) {
                    portfolioOrdersViewModel.f9916o.postValue(portfolioOrdersDto);
                }
                portfolioOrdersViewModel.f9084g.postValue(Boolean.FALSE);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PortfolioOrdersViewModel portfolioOrdersViewModel = this.f36057b;
        int i10 = this.f36056a;
        switch (i10) {
            case 0:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 1:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 2:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 3:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 4:
                portfolioOrdersViewModel.f9084g.postValue(Boolean.TRUE);
                return Unit.f23355a;
            case 5:
                PortfolioOrdersDto portfolioOrdersDto = (PortfolioOrdersDto) obj;
                switch (i10) {
                    case 5:
                        portfolioOrdersViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                    default:
                        portfolioOrdersViewModel.f9916o.postValue(portfolioOrdersDto);
                        break;
                }
                return Unit.f23355a;
            case 6:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 7:
                PortfolioOrdersDto portfolioOrdersDto2 = (PortfolioOrdersDto) obj;
                switch (i10) {
                    case 5:
                        portfolioOrdersViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                    default:
                        portfolioOrdersViewModel.f9916o.postValue(portfolioOrdersDto2);
                        break;
                }
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }
}
