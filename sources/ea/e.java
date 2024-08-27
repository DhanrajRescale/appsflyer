package ea;

import com.assetgro.stockgro.data.repository.TopChartsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.drawer.championsChart.ChampionsChartViewModel;
import com.assetgro.stockgro.ui.home.portfolio.list.TopPortfolioListViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15140c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TopChartsRepository f15141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15142e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(kq.e eVar, ct.a aVar, TopChartsRepository topChartsRepository, UserRepository userRepository, int i10) {
        super(0);
        this.f15138a = i10;
        this.f15139b = eVar;
        this.f15140c = aVar;
        this.f15141d = topChartsRepository;
        this.f15142e = userRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15138a;
        UserRepository userRepository = this.f15142e;
        TopChartsRepository topChartsRepository = this.f15141d;
        ct.a aVar = this.f15140c;
        pj.a aVar2 = this.f15139b;
        switch (i10) {
            case 0:
                return new ChampionsChartViewModel(aVar2, aVar, topChartsRepository, userRepository);
            default:
                return new TopPortfolioListViewModel(aVar2, aVar, topChartsRepository, userRepository);
        }
    }
}
