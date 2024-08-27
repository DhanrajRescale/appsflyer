package vg;

import com.assetgro.stockgro.ui.portfolio.rename.RenamePortfolioBottomSheetViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RenamePortfolioBottomSheetViewModel f38045b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(RenamePortfolioBottomSheetViewModel renamePortfolioBottomSheetViewModel, int i10) {
        super(1);
        this.f38044a = i10;
        this.f38045b = renamePortfolioBottomSheetViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f38044a;
        RenamePortfolioBottomSheetViewModel renamePortfolioBottomSheetViewModel = this.f38045b;
        switch (i10) {
            case 0:
                renamePortfolioBottomSheetViewModel.f9070f.postValue(Boolean.FALSE);
                renamePortfolioBottomSheetViewModel.f9928i.postValue(Boolean.TRUE);
                return Unit.f23355a;
            default:
                renamePortfolioBottomSheetViewModel.f9070f.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
