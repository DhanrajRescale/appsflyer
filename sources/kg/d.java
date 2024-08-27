package kg;

import com.assetgro.stockgro.data.model.UnifiedStockTransaction;
import ij.h;
import iu.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f23096b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f23097c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f23098d = new d(2);

    /* renamed from: e, reason: collision with root package name */
    public static final d f23099e = new d(3);

    /* renamed from: f, reason: collision with root package name */
    public static final d f23100f = new d(4);

    /* renamed from: g, reason: collision with root package name */
    public static final d f23101g = new d(5);

    /* renamed from: h, reason: collision with root package name */
    public static final d f23102h = new d(6);

    /* renamed from: i, reason: collision with root package name */
    public static final d f23103i = new d(7);

    /* renamed from: j, reason: collision with root package name */
    public static final d f23104j = new d(8);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23105a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f23105a = i10;
    }

    public final String a(UnifiedStockTransaction unifiedStockTransaction) {
        String n10;
        String n11;
        String n12;
        String n13;
        String r10;
        switch (this.f23105a) {
            case 0:
                if (Intrinsics.a(unifiedStockTransaction.getStockType(), "short")) {
                    h hVar = h.f20067a;
                    n11 = h.f20067a.n(1, unifiedStockTransaction.getAveragePriceSide1());
                    return n11;
                }
                h hVar2 = h.f20067a;
                n10 = h.f20067a.n(1, unifiedStockTransaction.getAveragePriceSide1());
                return n10;
            case 1:
                if (Intrinsics.a(unifiedStockTransaction.getStockType(), "short")) {
                    h hVar3 = h.f20067a;
                    n13 = h.f20067a.n(1, unifiedStockTransaction.getAveragePriceSide2());
                    return n13;
                }
                h hVar4 = h.f20067a;
                n12 = h.f20067a.n(1, unifiedStockTransaction.getAveragePriceSide2());
                return n12;
            case 2:
                return unifiedStockTransaction.getImageUrl();
            case 3:
            case 4:
            default:
                return unifiedStockTransaction.getTotalQuantity();
            case 5:
                return unifiedStockTransaction.getName();
            case 6:
                h hVar5 = h.f20067a;
                r10 = h.f20067a.r(1, unifiedStockTransaction.getNetPNL());
                return r10;
            case 7:
                if (unifiedStockTransaction.getProfitPercentage().length() == 0) {
                    return "0.00 %";
                }
                h hVar6 = h.f20067a;
                return h.t(unifiedStockTransaction.getProfitPercentage());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f23105a;
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
            default:
                return a((UnifiedStockTransaction) obj);
        }
    }
}
