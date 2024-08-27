package yc;

import com.assetgro.stockgro.data.model.PNL;
import com.assetgro.stockgro.data.model.UnifiedPortfolio;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f41482b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f41483c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f41484d = new e(2);

    /* renamed from: e, reason: collision with root package name */
    public static final e f41485e = new e(3);

    /* renamed from: f, reason: collision with root package name */
    public static final e f41486f = new e(4);

    /* renamed from: g, reason: collision with root package name */
    public static final e f41487g = new e(5);

    /* renamed from: h, reason: collision with root package name */
    public static final e f41488h = new e(6);

    /* renamed from: i, reason: collision with root package name */
    public static final e f41489i = new e(7);

    /* renamed from: j, reason: collision with root package name */
    public static final e f41490j = new e(8);

    /* renamed from: k, reason: collision with root package name */
    public static final e f41491k = new e(9);

    /* renamed from: l, reason: collision with root package name */
    public static final e f41492l = new e(10);

    /* renamed from: m, reason: collision with root package name */
    public static final e f41493m = new e(11);

    /* renamed from: n, reason: collision with root package name */
    public static final e f41494n = new e(12);

    /* renamed from: o, reason: collision with root package name */
    public static final e f41495o = new e(13);

    /* renamed from: p, reason: collision with root package name */
    public static final e f41496p = new e(14);

    /* renamed from: q, reason: collision with root package name */
    public static final e f41497q = new e(15);

    /* renamed from: r, reason: collision with root package name */
    public static final e f41498r = new e(16);

    /* renamed from: s, reason: collision with root package name */
    public static final e f41499s = new e(17);

    /* renamed from: t, reason: collision with root package name */
    public static final e f41500t = new e(18);

    /* renamed from: u, reason: collision with root package name */
    public static final e f41501u = new e(19);

    /* renamed from: v, reason: collision with root package name */
    public static final e f41502v = new e(20);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41503a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f41503a = i10;
    }

    public final Boolean a(UnifiedPortfolio unifiedPortfolio) {
        boolean z10 = false;
        switch (this.f41503a) {
            case 11:
                ij.h hVar = ij.h.f20067a;
                if (ij.h.c(unifiedPortfolio.getPortfolioValue().getRealizedPNL()) >= 0.0d) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 12:
            default:
                ij.h hVar2 = ij.h.f20067a;
                if (ij.h.c(unifiedPortfolio.getPortfolioValue().getUnrealizedPNL()) >= 0.0d) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 13:
                ij.h hVar3 = ij.h.f20067a;
                if (ij.h.c(unifiedPortfolio.getPortfolioValue().getPnl().getPercentage()) == 0.0d) {
                    z10 = true;
                }
                return Boolean.valueOf(!z10);
            case 14:
                return Boolean.FALSE;
        }
    }

    public final String d(UnifiedPortfolio unifiedPortfolio) {
        String n10;
        String n11;
        String n12;
        String r10;
        String r11;
        String n13;
        String r12;
        switch (this.f41503a) {
            case 2:
                ij.h hVar = ij.h.f20067a;
                n10 = ij.h.f20067a.n(1, unifiedPortfolio.getPortfolioValue().getCashBalance());
                return n10;
            case 3:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                ij.h hVar2 = ij.h.f20067a;
                r12 = ij.h.f20067a.r(1, unifiedPortfolio.getPortfolioValue().getUnrealizedPNL());
                return r12;
            case 4:
                ij.h hVar3 = ij.h.f20067a;
                n11 = ij.h.f20067a.n(1, unifiedPortfolio.getPortfolioValue().getPendingOrderAmount());
                return n11;
            case 5:
                String portfolioName = unifiedPortfolio.getPortfolioName();
                if (portfolioName == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return portfolioName;
            case 6:
                ij.h hVar4 = ij.h.f20067a;
                n12 = ij.h.f20067a.n(1, unifiedPortfolio.getPortfolioValue().getPortfolioValue());
                return n12;
            case 7:
                PNL pnl = unifiedPortfolio.getPortfolioValue().getPnl();
                ij.h hVar5 = ij.h.f20067a;
                r10 = ij.h.f20067a.r(1, pnl.getNetPNL());
                return r10;
            case 8:
                String percentage = unifiedPortfolio.getPortfolioValue().getPnl().getPercentage();
                if (percentage != null) {
                    ij.h hVar6 = ij.h.f20067a;
                    String t10 = ij.h.t(percentage);
                    if (t10 != null) {
                        return t10;
                    }
                }
                return "0.00";
            case 9:
                return unifiedPortfolio.getPortfolioValue().getPnl().getType();
            case 10:
                ij.h hVar7 = ij.h.f20067a;
                r11 = ij.h.f20067a.r(1, unifiedPortfolio.getPortfolioValue().getRealizedPNL());
                return r11;
            case 16:
                ij.h hVar8 = ij.h.f20067a;
                n13 = ij.h.f20067a.n(1, unifiedPortfolio.getPortfolioValue().getTotalTurnover());
                return n13;
            case 17:
                ij.h hVar9 = ij.h.f20067a;
                return ij.h.t(unifiedPortfolio.getPortfolioValue().getTransactionChargePercent());
            case 18:
                return ij.h.f20067a.n(-1, unifiedPortfolio.getPortfolioValue().getTotalTransactionCharges());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f41503a;
        switch (i10) {
            case 0:
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
            case 1:
                return Unit.f23355a;
            case 2:
                return d((UnifiedPortfolio) obj);
            case 3:
                UnifiedPortfolio unifiedPortfolio = (UnifiedPortfolio) obj;
                switch (i10) {
                    case 3:
                        return unifiedPortfolio.getOptionValues();
                    default:
                        return unifiedPortfolio.getStockvalues();
                }
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
                return d((UnifiedPortfolio) obj);
            case 10:
                return d((UnifiedPortfolio) obj);
            case 11:
                return a((UnifiedPortfolio) obj);
            case 12:
                return Unit.f23355a;
            case 13:
                return a((UnifiedPortfolio) obj);
            case 14:
                return a((UnifiedPortfolio) obj);
            case 15:
                UnifiedPortfolio unifiedPortfolio2 = (UnifiedPortfolio) obj;
                switch (i10) {
                    case 3:
                        return unifiedPortfolio2.getOptionValues();
                    default:
                        return unifiedPortfolio2.getStockvalues();
                }
            case 16:
                return d((UnifiedPortfolio) obj);
            case 17:
                return d((UnifiedPortfolio) obj);
            case 18:
                return d((UnifiedPortfolio) obj);
            case 19:
                return d((UnifiedPortfolio) obj);
            default:
                return a((UnifiedPortfolio) obj);
        }
    }
}
