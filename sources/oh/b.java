package oh;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.RedemptionOffer;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.ApiExceptionUtilitiesKt;
import com.assetgro.stockgro.ui.redemption.home.RedemptionHostViewModel;
import iu.k;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.g;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RedemptionHostViewModel f30093b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(RedemptionHostViewModel redemptionHostViewModel, int i10) {
        super(1);
        this.f30092a = i10;
        this.f30093b = redemptionHostViewModel;
    }

    public final void a() {
        int i10 = this.f30092a;
        RedemptionHostViewModel redemptionHostViewModel = this.f30093b;
        switch (i10) {
            case 0:
                redemptionHostViewModel.f9084g.postValue(Boolean.TRUE);
                return;
            case 4:
                redemptionHostViewModel.f9084g.postValue(Boolean.TRUE);
                return;
            case 8:
                redemptionHostViewModel.f9084g.postValue(Boolean.TRUE);
                return;
            default:
                redemptionHostViewModel.f9084g.postValue(Boolean.TRUE);
                return;
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f30092a;
        RedemptionHostViewModel redemptionHostViewModel = this.f30093b;
        switch (i10) {
            case 2:
                redemptionHostViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            case 6:
                redemptionHostViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            case 10:
                redemptionHostViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                e0 e0Var = redemptionHostViewModel.f9084g;
                Boolean bool = Boolean.FALSE;
                e0Var.postValue(bool);
                redemptionHostViewModel.f10087t.postValue(bool);
                e0 e0Var2 = redemptionHostViewModel.f10091x;
                Intrinsics.c(th2);
                e0Var2.postValue(ApiExceptionUtilitiesKt.extractMessage(th2));
                return;
        }
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        RedemptionOffer redemptionOffer;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f30092a;
        RedemptionHostViewModel redemptionHostViewModel = this.f30093b;
        switch (i10) {
            case 1:
                redemptionHostViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            case 3:
                if (!baseResponseDto.getSuccess() || (redemptionOffer = (RedemptionOffer) baseResponseDto.getData()) == null) {
                    return;
                }
                redemptionHostViewModel.f10086s.postValue(redemptionOffer);
                return;
            case 5:
                redemptionHostViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            case 7:
                if (!baseResponseDto.getSuccess() || (arrayList = (ArrayList) baseResponseDto.getData()) == null) {
                    return;
                }
                redemptionHostViewModel.f10093z.postValue(arrayList);
                return;
            case 9:
                redemptionHostViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            case 11:
                if (!baseResponseDto.getSuccess() || (arrayList2 = (ArrayList) baseResponseDto.getData()) == null) {
                    return;
                }
                redemptionHostViewModel.A.postValue(arrayList2);
                return;
            case 14:
                redemptionHostViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                redemptionHostViewModel.f10087t.postValue(Boolean.valueOf(baseResponseDto.getSuccess()));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f10;
        switch (this.f30092a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 2:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 3:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 4:
                a();
                return Unit.f23355a;
            case 5:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 6:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 7:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 8:
                a();
                return Unit.f23355a;
            case 9:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 10:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 11:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 12:
                RedemptionOffer redemptionOffer = (RedemptionOffer) obj;
                float cash = redemptionOffer.getPricing().getCash();
                float cash2 = redemptionOffer.getWalletInfo().getCash();
                RedemptionHostViewModel redemptionHostViewModel = this.f30093b;
                if (cash > cash2) {
                    redemptionHostViewModel.f10083p = Float.valueOf(redemptionOffer.getPricing().getCash() - redemptionOffer.getWalletInfo().getCash());
                    f10 = redemptionOffer.getPricing().getCash() - redemptionOffer.getWalletInfo().getCash();
                } else {
                    f10 = g.f34069a;
                    redemptionHostViewModel.f10083p = Float.valueOf(g.f34069a);
                }
                return Float.valueOf(f10);
            case 13:
                a();
                return Unit.f23355a;
            case 14:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 15:
                invoke((Throwable) obj);
                return Unit.f23355a;
            default:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
        }
    }
}
