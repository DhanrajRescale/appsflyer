package wf;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.KycResponseDto;
import com.assetgro.stockgro.data.model.portfolio.WalletBalanceResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.LifetimeEarning;
import com.assetgro.stockgro.ui.payments.home.WalletHomeViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletHomeViewModel f39051b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(WalletHomeViewModel walletHomeViewModel, int i10) {
        super(1);
        this.f39050a = i10;
        this.f39051b = walletHomeViewModel;
    }

    public final void a(KycResponseDto kycResponseDto) {
        int i10 = this.f39050a;
        WalletHomeViewModel walletHomeViewModel = this.f39051b;
        switch (i10) {
            case 0:
                walletHomeViewModel.f9653s.postValue(Boolean.FALSE);
                walletHomeViewModel.A = kycResponseDto;
                if (Intrinsics.a(kycResponseDto.getStatus(), "pending")) {
                    walletHomeViewModel.f9658x.postValue(kycResponseDto);
                    return;
                }
                return;
            default:
                walletHomeViewModel.f9653s.postValue(Boolean.FALSE);
                walletHomeViewModel.D.postValue(Boolean.valueOf(Intrinsics.a(kycResponseDto.getStatus(), "complete")));
                walletHomeViewModel.A = kycResponseDto;
                walletHomeViewModel.f9656v.postValue(kycResponseDto);
                return;
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f39050a;
        WalletHomeViewModel walletHomeViewModel = this.f39051b;
        switch (i10) {
            case 1:
                walletHomeViewModel.f9653s.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 2:
            default:
                walletHomeViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            case 3:
                walletHomeViewModel.f9653s.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f39050a) {
            case 0:
                a((KycResponseDto) obj);
                return Unit.f23355a;
            case 1:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 2:
                a((KycResponseDto) obj);
                return Unit.f23355a;
            case 3:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 4:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 5:
                this.f39051b.f9084g.postValue(Boolean.TRUE);
                return Unit.f23355a;
            case 6:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 7:
                invoke((Throwable) obj);
                return Unit.f23355a;
            default:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
        }
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        LifetimeEarning lifetimeEarning;
        WalletBalanceResponseDto walletBalanceResponseDto;
        int i10 = this.f39050a;
        WalletHomeViewModel walletHomeViewModel = this.f39051b;
        switch (i10) {
            case 4:
                if (!baseResponseDto.getSuccess() || (lifetimeEarning = (LifetimeEarning) baseResponseDto.getData()) == null) {
                    return;
                }
                e0 e0Var = walletHomeViewModel.f9655u;
                ij.h hVar = ij.h.f20067a;
                e0Var.postValue(new Pair(ij.h.h(lifetimeEarning.getTotalAmountWon(), 0, false, 6), lifetimeEarning.getNote()));
                return;
            case 5:
            default:
                if (!baseResponseDto.getSuccess() || (walletBalanceResponseDto = (WalletBalanceResponseDto) baseResponseDto.getData()) == null) {
                    return;
                }
                walletHomeViewModel.f9654t.postValue(walletBalanceResponseDto);
                walletHomeViewModel.B = walletBalanceResponseDto.getKycRequired();
                walletHomeViewModel.C = true;
                walletHomeViewModel.h();
                return;
            case 6:
                walletHomeViewModel.f9084g.postValue(Boolean.FALSE);
                return;
        }
    }
}
