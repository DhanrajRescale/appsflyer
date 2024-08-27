package ed;

import com.assetgro.stockgro.data.model.PrizeDistributionDto;
import com.assetgro.stockgro.prod.R;
import ij.h;
import iu.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f15375b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f15376c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f15377d = new d(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15378a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f15378a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        int i11 = this.f15378a;
        switch (i11) {
            case 0:
                PrizeDistributionDto prizeDistributionDto = (PrizeDistributionDto) obj;
                switch (i11) {
                    case 0:
                        h hVar = h.f20067a;
                        return h.h(prizeDistributionDto.getAmount(), 0, false, 6);
                    default:
                        return prizeDistributionDto.getRank();
                }
            case 1:
                PrizeDistributionDto prizeDistributionDto2 = (PrizeDistributionDto) obj;
                switch (i11) {
                    case 0:
                        h hVar2 = h.f20067a;
                        return h.h(prizeDistributionDto2.getAmount(), 0, false, 6);
                    default:
                        return prizeDistributionDto2.getRank();
                }
            default:
                if (Intrinsics.a(((PrizeDistributionDto) obj).getWinCash(), Boolean.TRUE)) {
                    if (kj.a.f23207b) {
                        i10 = R.drawable.ic_aed;
                    } else {
                        i10 = R.drawable.ic_cash_14dp_new;
                    }
                } else {
                    i10 = R.drawable.ic_bonus_14dp_new;
                }
                return Integer.valueOf(i10);
        }
    }
}
