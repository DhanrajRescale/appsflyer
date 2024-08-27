package sg;

import com.assetgro.stockgro.data.model.UnifiedStockTransaction;
import ij.h;
import iu.k;
import kotlin.jvm.functions.Function1;
import s0.g;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final b f34610b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f34611c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f34612d = new b(2);

    /* renamed from: e, reason: collision with root package name */
    public static final b f34613e = new b(3);

    /* renamed from: f, reason: collision with root package name */
    public static final b f34614f = new b(4);

    /* renamed from: g, reason: collision with root package name */
    public static final b f34615g = new b(5);

    /* renamed from: h, reason: collision with root package name */
    public static final b f34616h = new b(6);

    /* renamed from: i, reason: collision with root package name */
    public static final b f34617i = new b(7);

    /* renamed from: j, reason: collision with root package name */
    public static final b f34618j = new b(8);

    /* renamed from: k, reason: collision with root package name */
    public static final b f34619k = new b(9);

    /* renamed from: l, reason: collision with root package name */
    public static final b f34620l = new b(10);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34621a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(1);
        this.f34621a = i10;
    }

    public final String a(UnifiedStockTransaction unifiedStockTransaction) {
        String n10;
        String n11;
        String r10;
        float f10;
        switch (this.f34621a) {
            case 0:
                h hVar = h.f20067a;
                n10 = h.f20067a.n(1, unifiedStockTransaction.getAveragePriceSide1());
                return n10;
            case 1:
                h hVar2 = h.f20067a;
                n11 = h.f20067a.n(1, unifiedStockTransaction.getAveragePriceSide2());
                return n11;
            case 2:
                return unifiedStockTransaction.getImageUrl();
            case 3:
            case 4:
            default:
                String totalQuantity = unifiedStockTransaction.getTotalQuantity();
                float f11 = g.f34069a;
                if (totalQuantity != null && totalQuantity.length() > 0) {
                    f10 = Float.parseFloat(totalQuantity);
                } else {
                    f10 = 0.0f;
                }
                String quantity = unifiedStockTransaction.getQuantity();
                if (quantity != null && quantity.length() > 0) {
                    f11 = Float.parseFloat(quantity);
                }
                return String.valueOf(ku.c.b(f10 - f11));
            case 5:
                return h.m(h.f20067a, Double.parseDouble(unifiedStockTransaction.getCurrentMarketPrice()));
            case 6:
                return unifiedStockTransaction.getName();
            case 7:
                h hVar3 = h.f20067a;
                r10 = h.f20067a.r(1, unifiedStockTransaction.getNetPNL());
                return r10;
            case 8:
                if (unifiedStockTransaction.getProfitPercentage().length() == 0) {
                    return "0.00 %";
                }
                h hVar4 = h.f20067a;
                return h.t(unifiedStockTransaction.getProfitPercentage());
            case 9:
                return unifiedStockTransaction.getTotalQuantity();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f34621a;
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
                        return Boolean.valueOf(unifiedStockTransaction.isShort());
                }
            case 4:
                UnifiedStockTransaction unifiedStockTransaction2 = (UnifiedStockTransaction) obj;
                switch (i10) {
                    case 3:
                        return Boolean.valueOf(unifiedStockTransaction2.isPNLPositive());
                    default:
                        return Boolean.valueOf(unifiedStockTransaction2.isShort());
                }
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
            default:
                return a((UnifiedStockTransaction) obj);
        }
    }
}
