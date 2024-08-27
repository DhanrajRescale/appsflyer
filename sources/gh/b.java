package gh;

import com.assetgro.stockgro.data.model.PNL;
import com.assetgro.stockgro.data.model.UnifiedPortfolio;
import com.assetgro.stockgro.data.model.User;
import ij.h;
import iu.k;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final b f17413b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f17414c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f17415d = new b(2);

    /* renamed from: e, reason: collision with root package name */
    public static final b f17416e = new b(3);

    /* renamed from: f, reason: collision with root package name */
    public static final b f17417f = new b(4);

    /* renamed from: g, reason: collision with root package name */
    public static final b f17418g = new b(5);

    /* renamed from: h, reason: collision with root package name */
    public static final b f17419h = new b(6);

    /* renamed from: i, reason: collision with root package name */
    public static final b f17420i = new b(7);

    /* renamed from: j, reason: collision with root package name */
    public static final b f17421j = new b(8);

    /* renamed from: k, reason: collision with root package name */
    public static final b f17422k = new b(9);

    /* renamed from: l, reason: collision with root package name */
    public static final b f17423l = new b(10);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17424a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(1);
        this.f17424a = i10;
    }

    public final String a(UnifiedPortfolio unifiedPortfolio) {
        String r10;
        String r11;
        String r12;
        String r13;
        switch (this.f17424a) {
            case 0:
                h hVar = h.f20067a;
                r10 = h.f20067a.r(1, unifiedPortfolio.getPortfolioValue().getCashBalance());
                return r10;
            case 1:
            case 2:
            case 5:
            case 6:
            default:
                return h.f20067a.r(-1, unifiedPortfolio.getPortfolioValue().getTotalTransactionCharges());
            case 3:
                h hVar2 = h.f20067a;
                r11 = h.f20067a.r(1, unifiedPortfolio.getPortfolioValue().getPortfolioValue());
                return r11;
            case 4:
                PNL pnl = unifiedPortfolio.getPortfolioValue().getPnl();
                h hVar3 = h.f20067a;
                r12 = h.f20067a.r(1, pnl.getNetPNL());
                return r12;
            case 7:
                h hVar4 = h.f20067a;
                r13 = h.f20067a.r(1, unifiedPortfolio.getPortfolioValue().getTotalTurnover());
                return r13;
            case 8:
                h hVar5 = h.f20067a;
                return h.t(unifiedPortfolio.getPortfolioValue().getTransactionChargePercent());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double d10;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        int i10 = this.f17424a;
        switch (i10) {
            case 0:
                return a((UnifiedPortfolio) obj);
            case 1:
                UnifiedPortfolio unifiedPortfolio = (UnifiedPortfolio) obj;
                switch (i10) {
                    case 1:
                        return unifiedPortfolio.getOptionValues();
                    default:
                        return unifiedPortfolio.getStockvalues();
                }
            case 2:
                User user = (User) obj;
                switch (i10) {
                    case 2:
                        String portfolioId = user.getPortfolio().getPortfolioId();
                        if (portfolioId != null) {
                            str = portfolioId;
                        }
                        return str;
                    default:
                        return user.getName();
                }
            case 3:
                return a((UnifiedPortfolio) obj);
            case 4:
                return a((UnifiedPortfolio) obj);
            case 5:
                String percentage = ((UnifiedPortfolio) obj).getPortfolioValue().getPnl().getPercentage();
                if (percentage != null) {
                    h hVar = h.f20067a;
                    d10 = h.c(percentage);
                } else {
                    d10 = 0.0d;
                }
                return Double.valueOf(d10);
            case 6:
                UnifiedPortfolio unifiedPortfolio2 = (UnifiedPortfolio) obj;
                switch (i10) {
                    case 1:
                        return unifiedPortfolio2.getOptionValues();
                    default:
                        return unifiedPortfolio2.getStockvalues();
                }
            case 7:
                return a((UnifiedPortfolio) obj);
            case 8:
                return a((UnifiedPortfolio) obj);
            case 9:
                return a((UnifiedPortfolio) obj);
            default:
                User user2 = (User) obj;
                switch (i10) {
                    case 2:
                        String portfolioId2 = user2.getPortfolio().getPortfolioId();
                        if (portfolioId2 != null) {
                            str = portfolioId2;
                        }
                        return str;
                    default:
                        return user2.getName();
                }
        }
    }
}
