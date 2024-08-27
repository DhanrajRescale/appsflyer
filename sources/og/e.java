package og;

import com.assetgro.stockgro.data.model.PNL;
import com.assetgro.stockgro.data.model.UnifiedPortfolio;
import com.assetgro.stockgro.data.model.UnifiedStockTransaction;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30038a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f30013b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f30014c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f30015d = new e(2);

    /* renamed from: e, reason: collision with root package name */
    public static final e f30016e = new e(3);

    /* renamed from: f, reason: collision with root package name */
    public static final e f30017f = new e(4);

    /* renamed from: g, reason: collision with root package name */
    public static final e f30018g = new e(5);

    /* renamed from: h, reason: collision with root package name */
    public static final e f30019h = new e(6);

    /* renamed from: i, reason: collision with root package name */
    public static final e f30020i = new e(7);

    /* renamed from: j, reason: collision with root package name */
    public static final e f30021j = new e(8);

    /* renamed from: k, reason: collision with root package name */
    public static final e f30022k = new e(9);

    /* renamed from: l, reason: collision with root package name */
    public static final e f30023l = new e(10);

    /* renamed from: m, reason: collision with root package name */
    public static final e f30024m = new e(11);

    /* renamed from: n, reason: collision with root package name */
    public static final e f30025n = new e(12);

    /* renamed from: o, reason: collision with root package name */
    public static final e f30026o = new e(13);

    /* renamed from: p, reason: collision with root package name */
    public static final e f30027p = new e(14);

    /* renamed from: q, reason: collision with root package name */
    public static final e f30028q = new e(15);

    /* renamed from: r, reason: collision with root package name */
    public static final e f30029r = new e(16);

    /* renamed from: s, reason: collision with root package name */
    public static final e f30030s = new e(17);

    /* renamed from: t, reason: collision with root package name */
    public static final e f30031t = new e(18);

    /* renamed from: u, reason: collision with root package name */
    public static final e f30032u = new e(19);

    /* renamed from: v, reason: collision with root package name */
    public static final e f30033v = new e(20);

    /* renamed from: w, reason: collision with root package name */
    public static final e f30034w = new e(21);

    /* renamed from: x, reason: collision with root package name */
    public static final e f30035x = new e(22);

    /* renamed from: y, reason: collision with root package name */
    public static final e f30036y = new e(23);

    /* renamed from: z, reason: collision with root package name */
    public static final e f30037z = new e(24);
    public static final e A = new e(25);
    public static final e B = new e(26);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f30038a = i10;
    }

    public final Boolean a(UnifiedPortfolio unifiedPortfolio) {
        boolean z10 = false;
        switch (this.f30038a) {
            case 9:
                ij.h hVar = ij.h.f20067a;
                if (ij.h.c(unifiedPortfolio.getPortfolioValue().getRealizedPNL()) >= 0.0d) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                ij.h hVar2 = ij.h.f20067a;
                if (ij.h.c(unifiedPortfolio.getPortfolioValue().getUnrealizedPNL()) >= 0.0d) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }

    public final String d(UnifiedPortfolio unifiedPortfolio) {
        String n10;
        String n11;
        String n12;
        String n13;
        String r10;
        String r11;
        String r12;
        switch (this.f30038a) {
            case 0:
                ij.h hVar = ij.h.f20067a;
                n10 = ij.h.f20067a.n(1, unifiedPortfolio.getPortfolioValue().getCashBalance());
                return n10;
            case 1:
                ij.h hVar2 = ij.h.f20067a;
                n11 = ij.h.f20067a.n(1, unifiedPortfolio.getPortfolioValue().getInvestedAmount());
                return n11;
            case 2:
                ij.h hVar3 = ij.h.f20067a;
                n12 = ij.h.f20067a.n(1, unifiedPortfolio.getPortfolioValue().getPendingOrderAmount());
                return n12;
            case 3:
                String portfolioStatus = unifiedPortfolio.getPortfolioStatus();
                if (portfolioStatus == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return portfolioStatus;
            case 4:
                ij.h hVar4 = ij.h.f20067a;
                n13 = ij.h.f20067a.n(1, unifiedPortfolio.getPortfolioValue().getPortfolioValue());
                return n13;
            case 5:
                PNL pnl = unifiedPortfolio.getPortfolioValue().getPnl();
                ij.h hVar5 = ij.h.f20067a;
                r10 = ij.h.f20067a.r(1, pnl.getNetPNL());
                return r10;
            case 6:
                String percentage = unifiedPortfolio.getPortfolioValue().getPnl().getPercentage();
                if (percentage != null) {
                    ij.h hVar6 = ij.h.f20067a;
                    String t10 = ij.h.t(percentage);
                    if (t10 != null) {
                        return t10;
                    }
                }
                return "0.00";
            case 7:
                return unifiedPortfolio.getPortfolioValue().getPnl().getType();
            case 8:
                ij.h hVar7 = ij.h.f20067a;
                r11 = ij.h.f20067a.r(1, unifiedPortfolio.getPortfolioValue().getRealizedPNL());
                return r11;
            case 9:
            case 10:
            default:
                ij.h hVar8 = ij.h.f20067a;
                r12 = ij.h.f20067a.r(1, unifiedPortfolio.getPortfolioValue().getUnrealizedPNL());
                return r12;
            case 11:
                ij.h hVar9 = ij.h.f20067a;
                return ij.h.t(unifiedPortfolio.getPortfolioValue().getTransactionChargePercent());
            case 12:
                return ij.h.f20067a.r(-1, unifiedPortfolio.getPortfolioValue().getTotalTransactionCharges());
        }
    }

    public final String e(UnifiedStockTransaction unifiedStockTransaction) {
        String n10;
        String n11;
        String n12;
        String n13;
        String r10;
        switch (this.f30038a) {
            case 15:
                ij.h hVar = ij.h.f20067a;
                n10 = ij.h.f20067a.n(1, unifiedStockTransaction.getAveragePriceSide1());
                return n10;
            case 16:
                ij.h hVar2 = ij.h.f20067a;
                n11 = ij.h.f20067a.n(1, unifiedStockTransaction.getCurrentMarketPrice());
                return n11;
            case 17:
                return unifiedStockTransaction.getImageUrl();
            case 18:
            case 19:
            case 23:
            default:
                ij.h hVar3 = ij.h.f20067a;
                return ij.h.t(unifiedStockTransaction.getUnrealizedProfitPercentage());
            case 20:
                ij.h hVar4 = ij.h.f20067a;
                n12 = ij.h.f20067a.n(1, unifiedStockTransaction.getMarketValue());
                return n12;
            case 21:
                return unifiedStockTransaction.getName();
            case 22:
                ij.h hVar5 = ij.h.f20067a;
                n13 = ij.h.f20067a.n(1, unifiedStockTransaction.getPurchaseValue());
                return n13;
            case 24:
                return unifiedStockTransaction.getQuantity();
            case 25:
                ij.h hVar6 = ij.h.f20067a;
                r10 = ij.h.f20067a.r(1, unifiedStockTransaction.getUnrealizedPNL());
                return r10;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        int i11 = this.f30038a;
        switch (i11) {
            case 0:
                return d((UnifiedPortfolio) obj);
            case 1:
                return d((UnifiedPortfolio) obj);
            case 2:
                return d((UnifiedPortfolio) obj);
            case 3:
                return d((UnifiedPortfolio) obj);
            case 4:
                return d((UnifiedPortfolio) obj);
            case 5:
                return d((UnifiedPortfolio) obj);
            case 6:
                return d((UnifiedPortfolio) obj);
            case 7:
                return d((UnifiedPortfolio) obj);
            case 8:
                return d((UnifiedPortfolio) obj);
            case 9:
                return a((UnifiedPortfolio) obj);
            case 10:
                return ((UnifiedPortfolio) obj).getStockvalues();
            case 11:
                return d((UnifiedPortfolio) obj);
            case 12:
                return d((UnifiedPortfolio) obj);
            case 13:
                return d((UnifiedPortfolio) obj);
            case 14:
                return a((UnifiedPortfolio) obj);
            case 15:
                return e((UnifiedStockTransaction) obj);
            case 16:
                return e((UnifiedStockTransaction) obj);
            case 17:
                return e((UnifiedStockTransaction) obj);
            case 18:
                UnifiedStockTransaction unifiedStockTransaction = (UnifiedStockTransaction) obj;
                switch (i11) {
                    case 18:
                        return Boolean.valueOf(unifiedStockTransaction.isPNLPositive());
                    default:
                        return Boolean.valueOf(unifiedStockTransaction.isShort());
                }
            case 19:
                UnifiedStockTransaction unifiedStockTransaction2 = (UnifiedStockTransaction) obj;
                switch (i11) {
                    case 18:
                        return Boolean.valueOf(unifiedStockTransaction2.isPNLPositive());
                    default:
                        return Boolean.valueOf(unifiedStockTransaction2.isShort());
                }
            case 20:
                return e((UnifiedStockTransaction) obj);
            case 21:
                return e((UnifiedStockTransaction) obj);
            case 22:
                return e((UnifiedStockTransaction) obj);
            case 23:
                if (((UnifiedStockTransaction) obj).isShort()) {
                    i10 = R.string.text_investment_value;
                } else {
                    i10 = R.string.text_purchase_value;
                }
                return Integer.valueOf(i10);
            case 24:
                return e((UnifiedStockTransaction) obj);
            case 25:
                return e((UnifiedStockTransaction) obj);
            default:
                return e((UnifiedStockTransaction) obj);
        }
    }
}
