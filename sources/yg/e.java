package yg;

import com.assetgro.stockgro.data.model.portfolio.WalletBalanceResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.portfolio.unlock.detail.UnlockPortfolioDetailViewModel;
import iu.k;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnlockPortfolioDetailViewModel f41635b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(UnlockPortfolioDetailViewModel unlockPortfolioDetailViewModel, int i10) {
        super(1);
        this.f41634a = i10;
        this.f41635b = unlockPortfolioDetailViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UnlockPortfolioDetailViewModel unlockPortfolioDetailViewModel = this.f41635b;
        int i10 = this.f41634a;
        switch (i10) {
            case 0:
                unlockPortfolioDetailViewModel.f9084g.postValue(Boolean.TRUE);
                return Unit.f23355a;
            case 1:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 2:
                switch (i10) {
                    case 2:
                        unlockPortfolioDetailViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                    default:
                        unlockPortfolioDetailViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                }
                return Unit.f23355a;
            case 3:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 4:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            default:
                switch (i10) {
                    case 2:
                        unlockPortfolioDetailViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                    default:
                        unlockPortfolioDetailViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                }
                return Unit.f23355a;
        }
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        WalletBalanceResponseDto walletBalanceResponseDto;
        int i10 = this.f41634a;
        UnlockPortfolioDetailViewModel unlockPortfolioDetailViewModel = this.f41635b;
        switch (i10) {
            case 1:
                unlockPortfolioDetailViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            case 2:
            default:
                if (baseResponseDto.getData() != null) {
                    unlockPortfolioDetailViewModel.f9087j.postValue(new j(Unit.f23355a));
                    return;
                }
                return;
            case 3:
                if (!baseResponseDto.getSuccess() || (walletBalanceResponseDto = (WalletBalanceResponseDto) baseResponseDto.getData()) == null) {
                    return;
                }
                unlockPortfolioDetailViewModel.f9950s.postValue(walletBalanceResponseDto);
                unlockPortfolioDetailViewModel.i(unlockPortfolioDetailViewModel.f9947p, walletBalanceResponseDto);
                return;
        }
    }
}
