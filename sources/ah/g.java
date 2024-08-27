package ah;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.UnlockPortfolioResponse;
import com.assetgro.stockgro.ui.portfolio.unlock.list.UnlockPortfolioListViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnlockPortfolioListViewModel f438b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(UnlockPortfolioListViewModel unlockPortfolioListViewModel, int i10) {
        super(1);
        this.f437a = i10;
        this.f438b = unlockPortfolioListViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f437a;
        UnlockPortfolioListViewModel unlockPortfolioListViewModel = this.f438b;
        switch (i10) {
            case 0:
                UnlockPortfolioResponse unlockPortfolioResponse = (UnlockPortfolioResponse) ((BaseResponseDto) obj).getData();
                if (unlockPortfolioResponse != null) {
                    unlockPortfolioListViewModel.f9970n.postValue(unlockPortfolioResponse);
                }
                return Unit.f23355a;
            default:
                unlockPortfolioListViewModel.f9084g.postValue(Boolean.FALSE);
                return Unit.f23355a;
        }
    }
}
