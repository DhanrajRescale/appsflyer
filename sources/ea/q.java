package ea;

import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.presentation.fno.chain.OptionChainViewModel;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailViewModel;
import com.assetgro.stockgro.feature_market.presentation.fno.option.MarketOptionsListViewModel;
import com.assetgro.stockgro.feature_market.presentation.fno.search.MarketOptionSearchViewModel;
import com.assetgro.stockgro.feature_market.presentation.market.search.MarketAdvancedSearchViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class q extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15257c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FnoRepository f15258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15259e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(kq.e eVar, ct.a aVar, FnoRepository fnoRepository, UserRepository userRepository, int i10) {
        super(0);
        this.f15255a = i10;
        this.f15256b = eVar;
        this.f15257c = aVar;
        this.f15258d = fnoRepository;
        this.f15259e = userRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15255a;
        UserRepository userRepository = this.f15259e;
        FnoRepository fnoRepository = this.f15258d;
        ct.a aVar = this.f15257c;
        pj.a aVar2 = this.f15256b;
        switch (i10) {
            case 0:
                return new MarketAdvancedSearchViewModel(fnoRepository, userRepository, aVar2, aVar);
            case 1:
                switch (i10) {
                    case 1:
                        return new MarketOptionSearchViewModel(fnoRepository, userRepository, aVar2, aVar);
                    default:
                        return new MarketOptionSearchViewModel(fnoRepository, userRepository, aVar2, aVar);
                }
            case 2:
                return new OptionDetailViewModel(fnoRepository, userRepository, aVar2, aVar);
            case 3:
                return new OptionChainViewModel(fnoRepository, userRepository, aVar2, aVar);
            case 4:
                switch (i10) {
                    case 1:
                        return new MarketOptionSearchViewModel(fnoRepository, userRepository, aVar2, aVar);
                    default:
                        return new MarketOptionSearchViewModel(fnoRepository, userRepository, aVar2, aVar);
                }
            default:
                return new MarketOptionsListViewModel(fnoRepository, userRepository, aVar2, aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(kq.e eVar, ct.a aVar, UserRepository userRepository, FnoRepository fnoRepository, int i10) {
        super(0);
        this.f15255a = i10;
        this.f15256b = eVar;
        this.f15257c = aVar;
        this.f15259e = userRepository;
        this.f15258d = fnoRepository;
    }
}
