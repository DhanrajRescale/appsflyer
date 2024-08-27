package ea;

import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.TopChartsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.list.MarketStocksListViewModel;
import com.assetgro.stockgro.ui.stock.list.StockListViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class k0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15206a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15207b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15208c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StockRepository f15209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TopChartsRepository f15210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15211f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(kq.e eVar, ct.a aVar, StockRepository stockRepository, TopChartsRepository topChartsRepository, UserRepository userRepository) {
        super(0);
        this.f15207b = eVar;
        this.f15208c = aVar;
        this.f15209d = stockRepository;
        this.f15210e = topChartsRepository;
        this.f15211f = userRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f15206a) {
            case 0:
                return new MarketStocksListViewModel(this.f15207b, this.f15208c, this.f15211f, this.f15209d, this.f15210e);
            default:
                return new StockListViewModel(this.f15207b, this.f15208c, this.f15209d, this.f15210e, this.f15211f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(kq.e eVar, ct.a aVar, UserRepository userRepository, StockRepository stockRepository, TopChartsRepository topChartsRepository) {
        super(0);
        this.f15207b = eVar;
        this.f15208c = aVar;
        this.f15211f = userRepository;
        this.f15209d = stockRepository;
        this.f15210e = topChartsRepository;
    }
}
