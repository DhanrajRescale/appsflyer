package ea;

import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.presentation.market.asset.insights.detail.MarketInsightsDetailViewModel;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanGroupsViewModel;
import com.assetgro.stockgro.ui.home.stockgyan.gyan.StockGyanViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockDetailViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class r extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15264b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15265c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StockRepository f15266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf.a f15268f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(kq.e eVar, ct.a aVar, StockRepository stockRepository, UserRepository userRepository, qf.a aVar2, int i10) {
        super(0);
        this.f15263a = i10;
        this.f15264b = eVar;
        this.f15265c = aVar;
        this.f15266d = stockRepository;
        this.f15267e = userRepository;
        this.f15268f = aVar2;
    }

    public final MarketInsightsDetailViewModel a() {
        switch (this.f15263a) {
            case 0:
                pj.a aVar = this.f15264b;
                ct.a aVar2 = this.f15265c;
                return new MarketInsightsDetailViewModel(this.f15266d, this.f15267e, this.f15268f, aVar, aVar2);
            default:
                pj.a aVar3 = this.f15264b;
                ct.a aVar4 = this.f15265c;
                return new MarketInsightsDetailViewModel(this.f15266d, this.f15267e, this.f15268f, aVar3, aVar4);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f15263a) {
            case 0:
                return a();
            case 1:
                return new StockGyanGroupsViewModel(this.f15266d, this.f15267e, this.f15268f, this.f15264b, this.f15265c);
            case 2:
                return new StockGyanViewModel(this.f15266d, this.f15267e, this.f15268f, this.f15264b, this.f15265c);
            case 3:
                return a();
            default:
                return new StockDetailViewModel(this.f15266d, this.f15267e, this.f15268f, this.f15264b, this.f15265c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(kq.e eVar, ct.a aVar, UserRepository userRepository, StockRepository stockRepository, qf.a aVar2, int i10) {
        super(0);
        this.f15263a = i10;
        this.f15264b = eVar;
        this.f15265c = aVar;
        this.f15267e = userRepository;
        this.f15266d = stockRepository;
        this.f15268f = aVar2;
    }
}
