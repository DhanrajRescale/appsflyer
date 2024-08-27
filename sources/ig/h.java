package ig;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PortfolioDetailViewModel f19982b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(PortfolioDetailViewModel portfolioDetailViewModel, int i10) {
        super(1);
        this.f19981a = i10;
        this.f19982b = portfolioDetailViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f19981a;
        PortfolioDetailViewModel portfolioDetailViewModel = this.f19982b;
        switch (i10) {
            case 0:
                portfolioDetailViewModel.f9084g.postValue(Boolean.FALSE);
                portfolioDetailViewModel.f9779p.postValue(Boolean.valueOf(((BaseResponseDto) obj).getSuccess()));
                return Unit.f23355a;
            case 1:
                portfolioDetailViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
            default:
                portfolioDetailViewModel.j();
                return Unit.f23355a;
        }
    }
}
