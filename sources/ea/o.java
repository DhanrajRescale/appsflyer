package ea;

import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.presentation.market.asset.MarketAssetHostViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupFeedAndChatHostViewModel;
import com.assetgro.stockgro.ui.maintenance.MaintenanceV2ViewModel;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockDetailHostViewModel;
import com.assetgro.stockgro.ui.stock.list.StockListHostViewModel;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class o extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15241c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf.a f15243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(pj.a aVar, ct.a aVar2, UserRepository userRepository, qf.a aVar3, int i10) {
        super(0);
        this.f15239a = i10;
        this.f15240b = aVar;
        this.f15241c = aVar2;
        this.f15242d = userRepository;
        this.f15243e = aVar3;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15239a;
        qf.a aVar = this.f15243e;
        UserRepository userRepository = this.f15242d;
        ct.a aVar2 = this.f15241c;
        pj.a aVar3 = this.f15240b;
        switch (i10) {
            case 0:
                return new LoginViewModel(aVar3, aVar2, userRepository, aVar);
            case 1:
                return new MaintenanceWindowViewModel(aVar3, aVar2, userRepository, aVar);
            case 2:
                return new ManageSubscriptionViewModel(aVar3, aVar2, userRepository, aVar);
            case 3:
                return new StockDetailHostViewModel(aVar3, aVar2, userRepository, aVar);
            case 4:
                return new StockListHostViewModel(aVar3, aVar2, userRepository, aVar);
            case 5:
                return new GroupFeedAndChatHostViewModel(aVar3, aVar2, userRepository, aVar);
            case 6:
                return new MaintenanceV2ViewModel(aVar3, aVar2, userRepository, aVar);
            default:
                return new MarketAssetHostViewModel(aVar3, aVar2, userRepository, aVar);
        }
    }
}
