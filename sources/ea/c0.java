package ea;

import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionOrderPageBottomSheetViewModel;
import com.assetgro.stockgro.feature_market.presentation.fno.order.ModifyOrderPageBottomSheetViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class c0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FnoRepository f15128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(kq.e eVar, ct.a aVar, FnoRepository fnoRepository, int i10) {
        super(0);
        this.f15125a = i10;
        this.f15126b = eVar;
        this.f15127c = aVar;
        this.f15128d = fnoRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15125a;
        ct.a aVar = this.f15127c;
        pj.a aVar2 = this.f15126b;
        FnoRepository fnoRepository = this.f15128d;
        switch (i10) {
            case 0:
                return new ModifyOrderPageBottomSheetViewModel(aVar2, aVar, fnoRepository);
            default:
                return new OptionOrderPageBottomSheetViewModel(aVar2, aVar, fnoRepository);
        }
    }
}
