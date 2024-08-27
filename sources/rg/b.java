package rg;

import com.assetgro.stockgro.data.model.UnifiedStockTransaction;
import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final b f33712b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f33713c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f33714d = new b(2);

    /* renamed from: e, reason: collision with root package name */
    public static final b f33715e = new b(3);

    /* renamed from: f, reason: collision with root package name */
    public static final b f33716f = new b(4);

    /* renamed from: g, reason: collision with root package name */
    public static final b f33717g = new b(5);

    /* renamed from: h, reason: collision with root package name */
    public static final b f33718h = new b(6);

    /* renamed from: i, reason: collision with root package name */
    public static final b f33719i = new b(7);

    /* renamed from: j, reason: collision with root package name */
    public static final b f33720j = new b(8);

    /* renamed from: k, reason: collision with root package name */
    public static final b f33721k = new b(9);

    /* renamed from: l, reason: collision with root package name */
    public static final b f33722l = new b(10);

    /* renamed from: m, reason: collision with root package name */
    public static final b f33723m = new b(11);

    /* renamed from: n, reason: collision with root package name */
    public static final b f33724n = new b(12);

    /* renamed from: o, reason: collision with root package name */
    public static final b f33725o = new b(13);

    /* renamed from: p, reason: collision with root package name */
    public static final b f33726p = new b(14);

    /* renamed from: q, reason: collision with root package name */
    public static final b f33727q = new b(15);

    /* renamed from: r, reason: collision with root package name */
    public static final b f33728r = new b(16);

    /* renamed from: s, reason: collision with root package name */
    public static final b f33729s = new b(17);

    /* renamed from: t, reason: collision with root package name */
    public static final b f33730t = new b(18);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33731a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(1);
        this.f33731a = i10;
    }

    public final String a(UnifiedStockTransaction unifiedStockTransaction) {
        String n10;
        String n11;
        String r10;
        String n12;
        String n13;
        String r11;
        switch (this.f33731a) {
            case 0:
                ij.h hVar = ij.h.f20067a;
                n10 = ij.h.f20067a.n(1, unifiedStockTransaction.getBuyAveragePrice());
                return n10;
            case 1:
                ij.h hVar2 = ij.h.f20067a;
                n11 = ij.h.f20067a.n(1, unifiedStockTransaction.getSellAveragePrice());
                return n11;
            case 2:
                return unifiedStockTransaction.getImageUrl();
            case 3:
            case 14:
            default:
                ij.h hVar3 = ij.h.f20067a;
                return ij.h.g(0, unifiedStockTransaction.getNoOfLots());
            case 4:
                ij.h hVar4 = ij.h.f20067a;
                return nn.d.k("1 Lot = ", ij.h.g(0, unifiedStockTransaction.getLotSize()), " Qty");
            case 5:
                return ij.h.m(ij.h.f20067a, Double.parseDouble(unifiedStockTransaction.getCurrentMarketPrice()));
            case 6:
                ij.h hVar5 = ij.h.f20067a;
                r10 = ij.h.f20067a.r(1, unifiedStockTransaction.getNetPNL());
                return r10;
            case 7:
                if (unifiedStockTransaction.getProfitPercentage().length() == 0) {
                    return "0.00 %";
                }
                ij.h hVar6 = ij.h.f20067a;
                return ij.h.t(unifiedStockTransaction.getProfitPercentage());
            case 8:
                ij.h hVar7 = ij.h.f20067a;
                return ij.h.g(0, unifiedStockTransaction.getLotsBought());
            case 9:
                ij.h hVar8 = ij.h.f20067a;
                return ij.h.g(0, unifiedStockTransaction.getLotsSold());
            case 10:
                ij.h hVar9 = ij.h.f20067a;
                n12 = ij.h.f20067a.n(1, unifiedStockTransaction.getBuyAveragePrice());
                return n12;
            case 11:
                ij.h hVar10 = ij.h.f20067a;
                n13 = ij.h.f20067a.n(1, unifiedStockTransaction.getSellAveragePrice());
                return n13;
            case 12:
                return unifiedStockTransaction.getContractName();
            case 13:
                return unifiedStockTransaction.getImageUrl();
            case 15:
                ij.h hVar11 = ij.h.f20067a;
                return nn.d.k("1 Lot = ", ij.h.g(0, unifiedStockTransaction.getLotSize()), " Qty");
            case 16:
                ij.h hVar12 = ij.h.f20067a;
                r11 = ij.h.f20067a.r(1, unifiedStockTransaction.getNetPNL());
                return r11;
            case 17:
                if (unifiedStockTransaction.getProfitPercentage().length() == 0) {
                    return "0.00 %";
                }
                ij.h hVar13 = ij.h.f20067a;
                return ij.h.t(unifiedStockTransaction.getProfitPercentage());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f33731a;
        switch (i10) {
            case 0:
                return a((UnifiedStockTransaction) obj);
            case 1:
                return a((UnifiedStockTransaction) obj);
            case 2:
                return a((UnifiedStockTransaction) obj);
            case 3:
                UnifiedStockTransaction unifiedStockTransaction = (UnifiedStockTransaction) obj;
                switch (i10) {
                    case 3:
                        return Boolean.valueOf(unifiedStockTransaction.isPNLPositive());
                    default:
                        return Boolean.valueOf(unifiedStockTransaction.isPNLPositive());
                }
            case 4:
                return a((UnifiedStockTransaction) obj);
            case 5:
                return a((UnifiedStockTransaction) obj);
            case 6:
                return a((UnifiedStockTransaction) obj);
            case 7:
                return a((UnifiedStockTransaction) obj);
            case 8:
                return a((UnifiedStockTransaction) obj);
            case 9:
                return a((UnifiedStockTransaction) obj);
            case 10:
                return a((UnifiedStockTransaction) obj);
            case 11:
                return a((UnifiedStockTransaction) obj);
            case 12:
                return a((UnifiedStockTransaction) obj);
            case 13:
                return a((UnifiedStockTransaction) obj);
            case 14:
                UnifiedStockTransaction unifiedStockTransaction2 = (UnifiedStockTransaction) obj;
                switch (i10) {
                    case 3:
                        return Boolean.valueOf(unifiedStockTransaction2.isPNLPositive());
                    default:
                        return Boolean.valueOf(unifiedStockTransaction2.isPNLPositive());
                }
            case 15:
                return a((UnifiedStockTransaction) obj);
            case 16:
                return a((UnifiedStockTransaction) obj);
            case 17:
                return a((UnifiedStockTransaction) obj);
            default:
                return a((UnifiedStockTransaction) obj);
        }
    }
}
