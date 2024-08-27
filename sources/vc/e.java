package vc;

import com.assetgro.stockgro.data.model.PNL;
import com.assetgro.stockgro.data.model.UnifiedPortfolio;
import ij.h;
import iu.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f37941b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f37942c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f37943d = new e(2);

    /* renamed from: e, reason: collision with root package name */
    public static final e f37944e = new e(3);

    /* renamed from: f, reason: collision with root package name */
    public static final e f37945f = new e(4);

    /* renamed from: g, reason: collision with root package name */
    public static final e f37946g = new e(5);

    /* renamed from: h, reason: collision with root package name */
    public static final e f37947h = new e(6);

    /* renamed from: i, reason: collision with root package name */
    public static final e f37948i = new e(7);

    /* renamed from: j, reason: collision with root package name */
    public static final e f37949j = new e(8);

    /* renamed from: k, reason: collision with root package name */
    public static final e f37950k = new e(9);

    /* renamed from: l, reason: collision with root package name */
    public static final e f37951l = new e(10);

    /* renamed from: m, reason: collision with root package name */
    public static final e f37952m = new e(11);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37953a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f37953a = i10;
    }

    public final String a(UnifiedPortfolio unifiedPortfolio) {
        String r10;
        String r11;
        String r12;
        String r13;
        switch (this.f37953a) {
            case 0:
                h hVar = h.f20067a;
                r10 = h.f20067a.r(1, unifiedPortfolio.getPortfolioValue().getCashBalance());
                return r10;
            case 1:
            case 6:
            case 7:
            case 8:
            default:
                return h.f20067a.n(-1, unifiedPortfolio.getPortfolioValue().getTotalTransactionCharges());
            case 2:
                String portfolioName = unifiedPortfolio.getPortfolioName();
                if (portfolioName == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return portfolioName;
            case 3:
                h hVar2 = h.f20067a;
                r11 = h.f20067a.r(1, unifiedPortfolio.getPortfolioValue().getPortfolioValue());
                return r11;
            case 4:
                PNL pnl = unifiedPortfolio.getPortfolioValue().getPnl();
                h hVar3 = h.f20067a;
                r12 = h.f20067a.r(1, pnl.getNetPNL());
                return r12;
            case 5:
                String percentage = unifiedPortfolio.getPortfolioValue().getPnl().getPercentage();
                if (percentage != null) {
                    h hVar4 = h.f20067a;
                    String t10 = h.t(percentage);
                    if (t10 != null) {
                        return t10;
                    }
                }
                return "0.00";
            case 9:
                h hVar5 = h.f20067a;
                r13 = h.f20067a.r(1, unifiedPortfolio.getPortfolioValue().getTotalTurnover());
                return r13;
            case 10:
                h hVar6 = h.f20067a;
                return h.t(unifiedPortfolio.getPortfolioValue().getTransactionChargePercent());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        int i10 = this.f37953a;
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
                return a((UnifiedPortfolio) obj);
            case 3:
                return a((UnifiedPortfolio) obj);
            case 4:
                return a((UnifiedPortfolio) obj);
            case 5:
                return a((UnifiedPortfolio) obj);
            case 6:
                return Integer.valueOf(Intrinsics.a(((UnifiedPortfolio) obj).getPortfolioValue().getPnl().getType(), "POSITIVE") ? 1 : 0);
            case 7:
                h hVar = h.f20067a;
                if (h.c(((UnifiedPortfolio) obj).getPortfolioValue().getPnl().getPercentage()) == 0.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(!z10);
            case 8:
                UnifiedPortfolio unifiedPortfolio2 = (UnifiedPortfolio) obj;
                switch (i10) {
                    case 1:
                        return unifiedPortfolio2.getOptionValues();
                    default:
                        return unifiedPortfolio2.getStockvalues();
                }
            case 9:
                return a((UnifiedPortfolio) obj);
            case 10:
                return a((UnifiedPortfolio) obj);
            default:
                return a((UnifiedPortfolio) obj);
        }
    }
}
