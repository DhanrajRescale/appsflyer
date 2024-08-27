package d1;

import com.assetgro.stockgro.data.LogoutSubject;
import com.assetgro.stockgro.data.MultipleSignInLogoutSubject;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.SocialAuthRepository;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.payments.home.WalletHomeViewModel;
import com.assetgro.stockgro.ui.social.auth.SocialActivityViewModel;
import com.assetgro.stockgro.ui.splash.SplashViewModel;
import com.assetgro.stockgro.ui.stock.modify.buy.ModifyBuyOrderViewModel;
import com.assetgro.stockgro.ui.stock.modify.cover.ModifyStockCoverOrderViewModel;
import com.assetgro.stockgro.ui.stock.modify.sell.ModifyStockSellViewModel;
import com.assetgro.stockgro.ui.stock.modify.short_sell.ModifyShortSellOrderViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13247b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13248c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13252g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        super(0);
        this.f13246a = i10;
        this.f13247b = obj;
        this.f13248c = obj2;
        this.f13249d = obj3;
        this.f13250e = obj4;
        this.f13251f = obj5;
        this.f13252g = obj6;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        boolean z10;
        int i10 = this.f13246a;
        Object obj = this.f13252g;
        Object obj2 = this.f13251f;
        Object obj3 = this.f13250e;
        Object obj4 = this.f13249d;
        Object obj5 = this.f13248c;
        Object obj6 = this.f13247b;
        switch (i10) {
            case 0:
                d dVar = (d) obj6;
                r rVar = (r) obj5;
                n nVar = (n) obj4;
                String str = (String) obj3;
                Object[] objArr = (Object[]) obj;
                boolean z11 = true;
                if (dVar.f13255b != nVar) {
                    dVar.f13255b = nVar;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!Intrinsics.a(dVar.f13256c, str)) {
                    dVar.f13256c = str;
                } else {
                    z11 = z10;
                }
                dVar.f13254a = rVar;
                dVar.f13257d = obj2;
                dVar.f13258e = objArr;
                m mVar = dVar.f13259f;
                if (mVar != null && z11) {
                    ((o) mVar).a();
                    dVar.f13259f = null;
                    dVar.c();
                }
                return Unit.f23355a;
            case 1:
                return new SocialActivityViewModel((pj.a) obj6, (ct.a) obj5, (ChatRepository) obj4, (FollowerRepository) obj3, (SocialAuthRepository) obj2, (UserRepository) obj);
            case 2:
                return new SplashViewModel((pj.a) obj6, (ct.a) obj5, (UserRepository) obj4, (jj.a) obj3, (LogoutSubject) obj2, (MultipleSignInLogoutSubject) obj);
            case 3:
                return new WalletHomeViewModel((pj.a) obj6, (ct.a) obj5, (mt.p) obj4, (PaymentRepository) obj3, (UserRepository) obj2, (qf.a) obj);
            case 4:
                return new ModifyBuyOrderViewModel((pj.a) obj6, (ct.a) obj5, (StockRepository) obj4, (mt.p) obj3, (PortfolioRepository) obj2, (UserRepository) obj);
            case 5:
                return new ModifyShortSellOrderViewModel((pj.a) obj6, (ct.a) obj5, (StockRepository) obj4, (kq.e) obj3, (PortfolioRepository) obj2, (UserRepository) obj);
            case 6:
                return new ModifyStockCoverOrderViewModel((PortfolioRepository) obj4, (StockRepository) obj3, (UserRepository) obj, (mt.p) obj2, (pj.a) obj6, (ct.a) obj5);
            default:
                return new ModifyStockSellViewModel((PortfolioRepository) obj4, (StockRepository) obj3, (UserRepository) obj, (mt.p) obj2, (pj.a) obj6, (ct.a) obj5);
        }
    }
}
