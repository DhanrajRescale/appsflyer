package ea;

import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.ui.base.BaseBottomSheetViewModel;
import com.assetgro.stockgro.ui.portfolio.rename.RenamePortfolioBottomSheetViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15145c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PortfolioRepository f15146d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(kq.e eVar, ct.a aVar, PortfolioRepository portfolioRepository, int i10) {
        super(0);
        this.f15143a = i10;
        this.f15144b = eVar;
        this.f15145c = aVar;
        this.f15146d = portfolioRepository;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.assetgro.stockgro.ui.base.BaseBottomSheetViewModel, com.assetgro.stockgro.ui.portfolio.reset.ResetPortfolioBottomSheetViewModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15143a;
        PortfolioRepository portfolioRepository = this.f15146d;
        ct.a compositeDisposable = this.f15145c;
        pj.a schedulerProvider = this.f15144b;
        switch (i10) {
            case 0:
                return new RenamePortfolioBottomSheetViewModel(schedulerProvider, compositeDisposable, portfolioRepository);
            default:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
                ?? baseBottomSheetViewModel = new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
                baseBottomSheetViewModel.f9931g = HttpUrl.FRAGMENT_ENCODE_SET;
                return baseBottomSheetViewModel;
        }
    }
}
