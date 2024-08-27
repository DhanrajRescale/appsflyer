package ha;

import androidx.lifecycle.d0;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionOrderPageBottomSheetViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class y extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OptionOrderPageBottomSheetViewModel f18127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f18128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(OptionOrderPageBottomSheetViewModel optionOrderPageBottomSheetViewModel, d0 d0Var, int i10) {
        super(1);
        this.f18126a = i10;
        this.f18127b = optionOrderPageBottomSheetViewModel;
        this.f18128c = d0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f18126a;
        d0 d0Var = this.f18128c;
        OptionOrderPageBottomSheetViewModel optionOrderPageBottomSheetViewModel = this.f18127b;
        switch (i10) {
            case 0:
                OptionOrderPageBottomSheetViewModel.f(optionOrderPageBottomSheetViewModel, d0Var);
                return Unit.f23355a;
            case 1:
                OptionOrderPageBottomSheetViewModel.f(optionOrderPageBottomSheetViewModel, d0Var);
                return Unit.f23355a;
            default:
                OptionOrderPageBottomSheetViewModel.f(optionOrderPageBottomSheetViewModel, d0Var);
                return Unit.f23355a;
        }
    }
}
