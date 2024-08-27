package lg;

import com.assetgro.stockgro.data.model.portfolio.PortfolioHistoryDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioHistoryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PortfolioHistoryViewModel f24831b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(PortfolioHistoryViewModel portfolioHistoryViewModel, int i10) {
        super(1);
        this.f24830a = i10;
        this.f24831b = portfolioHistoryViewModel;
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f24830a;
        PortfolioHistoryViewModel portfolioHistoryViewModel = this.f24831b;
        switch (i10) {
            case 1:
                portfolioHistoryViewModel.f9084g.postValue(Boolean.FALSE);
                portfolioHistoryViewModel.f9820p.postValue(th2.getLocalizedMessage());
                th2.printStackTrace();
                return;
            case 4:
                portfolioHistoryViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                portfolioHistoryViewModel.f9082e.postValue(ni.j.i(Integer.valueOf(R.string.error_stock_list)));
                th2.printStackTrace();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f24830a;
        PortfolioHistoryViewModel portfolioHistoryViewModel = this.f24831b;
        switch (i10) {
            case 0:
                PortfolioHistoryDto portfolioHistoryDto = (PortfolioHistoryDto) ((BaseResponseDto) obj).getData();
                if (portfolioHistoryDto != null) {
                    portfolioHistoryViewModel.f9819o.postValue(portfolioHistoryDto);
                }
                portfolioHistoryViewModel.f9084g.postValue(Boolean.FALSE);
                return Unit.f23355a;
            case 1:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 2:
                portfolioHistoryViewModel.f9084g.postValue(Boolean.TRUE);
                return Unit.f23355a;
            case 3:
                PortfolioHistoryDto portfolioHistoryDto2 = (PortfolioHistoryDto) obj;
                switch (i10) {
                    case 3:
                        portfolioHistoryViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                    default:
                        portfolioHistoryViewModel.f9819o.postValue(portfolioHistoryDto2);
                        break;
                }
                return Unit.f23355a;
            case 4:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 5:
                PortfolioHistoryDto portfolioHistoryDto3 = (PortfolioHistoryDto) obj;
                switch (i10) {
                    case 3:
                        portfolioHistoryViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                    default:
                        portfolioHistoryViewModel.f9819o.postValue(portfolioHistoryDto3);
                        break;
                }
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }
}
