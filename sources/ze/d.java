package ze;

import com.assetgro.stockgro.data.repository.ApiExceptionUtilitiesKt;
import com.assetgro.stockgro.ui.drawer.rate.RateAppViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ni.j;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RateAppViewModel f42441b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(RateAppViewModel rateAppViewModel, int i10) {
        super(1);
        this.f42440a = i10;
        this.f42441b = rateAppViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RateAppViewModel rateAppViewModel = this.f42441b;
        int i10 = this.f42440a;
        switch (i10) {
            case 0:
                rateAppViewModel.f9084g.postValue(Boolean.TRUE);
                return Unit.f23355a;
            case 1:
                switch (i10) {
                    case 1:
                        rateAppViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                    default:
                        rateAppViewModel.f9498n.postValue(Boolean.TRUE);
                        break;
                }
                return Unit.f23355a;
            case 2:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 3:
                switch (i10) {
                    case 1:
                        rateAppViewModel.f9084g.postValue(Boolean.FALSE);
                        break;
                    default:
                        rateAppViewModel.f9498n.postValue(Boolean.TRUE);
                        break;
                }
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f42440a;
        RateAppViewModel rateAppViewModel = this.f42441b;
        switch (i10) {
            case 2:
                rateAppViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            default:
                Intrinsics.c(th2);
                rateAppViewModel.f9083f.postValue(j.i(ApiExceptionUtilitiesKt.extractMessage(th2)));
                th2.printStackTrace();
                return;
        }
    }
}
