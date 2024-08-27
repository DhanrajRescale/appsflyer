package gh;

import com.assetgro.stockgro.data.model.UnifiedPortfolio;
import com.assetgro.stockgro.data.model.UserDefaultPortfolioDto;
import com.assetgro.stockgro.ui.profile.portfolio.UserPortfolioDetailsViewModel;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserPortfolioDetailsViewModel f17435b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(UserPortfolioDetailsViewModel userPortfolioDetailsViewModel, int i10) {
        super(1);
        this.f17434a = i10;
        this.f17435b = userPortfolioDetailsViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f17434a;
        UserPortfolioDetailsViewModel userPortfolioDetailsViewModel = this.f17435b;
        switch (i10) {
            case 0:
                List<UnifiedPortfolio> portfolios = ((UserDefaultPortfolioDto) obj).getPortfolios();
                if (portfolios != null && !portfolios.isEmpty()) {
                    userPortfolioDetailsViewModel.f10005o.postValue(portfolios.get(0));
                }
                userPortfolioDetailsViewModel.f9084g.postValue(Boolean.FALSE);
                return Unit.f23355a;
            default:
                Throwable th2 = (Throwable) obj;
                userPortfolioDetailsViewModel.f9084g.postValue(Boolean.FALSE);
                userPortfolioDetailsViewModel.f10007q.postValue(th2.getLocalizedMessage());
                th2.printStackTrace();
                return Unit.f23355a;
        }
    }
}
