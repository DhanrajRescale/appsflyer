package xg;

import com.assetgro.stockgro.data.model.UnifiedStockTransaction;
import ij.h;
import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f40247b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f40248c = new c(1);

    /* renamed from: d, reason: collision with root package name */
    public static final c f40249d = new c(2);

    /* renamed from: e, reason: collision with root package name */
    public static final c f40250e = new c(3);

    /* renamed from: f, reason: collision with root package name */
    public static final c f40251f = new c(4);

    /* renamed from: g, reason: collision with root package name */
    public static final c f40252g = new c(5);

    /* renamed from: h, reason: collision with root package name */
    public static final c f40253h = new c(6);

    /* renamed from: i, reason: collision with root package name */
    public static final c f40254i = new c(7);

    /* renamed from: j, reason: collision with root package name */
    public static final c f40255j = new c(8);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40256a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(1);
        this.f40256a = i10;
    }

    public final String a(UnifiedStockTransaction unifiedStockTransaction) {
        String n10;
        String n11;
        int i10;
        String r10;
        switch (this.f40256a) {
            case 0:
                h hVar = h.f20067a;
                n10 = h.f20067a.n(1, unifiedStockTransaction.getAveragePriceSide1());
                return n10;
            case 1:
                return unifiedStockTransaction.getImageUrl();
            case 2:
            case 3:
            default:
                h hVar2 = h.f20067a;
                return h.t(String.valueOf(h.c(unifiedStockTransaction.getUnrealizedProfitPercentage())));
            case 4:
                h hVar3 = h.f20067a;
                n11 = h.f20067a.n(1, unifiedStockTransaction.getCurrentMarketPrice());
                return n11;
            case 5:
                return unifiedStockTransaction.getName();
            case 6:
                String totalQuantity = unifiedStockTransaction.getTotalQuantity();
                if (totalQuantity != null && totalQuantity.length() > 0) {
                    i10 = Integer.parseInt(totalQuantity);
                } else {
                    i10 = 0;
                }
                return String.valueOf(i10);
            case 7:
                h hVar4 = h.f20067a;
                r10 = h.f20067a.r(1, unifiedStockTransaction.getUnrealizedPNL());
                return r10;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f40256a;
        switch (i10) {
            case 0:
                return a((UnifiedStockTransaction) obj);
            case 1:
                return a((UnifiedStockTransaction) obj);
            case 2:
                UnifiedStockTransaction unifiedStockTransaction = (UnifiedStockTransaction) obj;
                switch (i10) {
                    case 2:
                        return Boolean.valueOf(unifiedStockTransaction.isPNLPositive());
                    default:
                        return Boolean.valueOf(unifiedStockTransaction.isShort());
                }
            case 3:
                UnifiedStockTransaction unifiedStockTransaction2 = (UnifiedStockTransaction) obj;
                switch (i10) {
                    case 2:
                        return Boolean.valueOf(unifiedStockTransaction2.isPNLPositive());
                    default:
                        return Boolean.valueOf(unifiedStockTransaction2.isShort());
                }
            case 4:
                return a((UnifiedStockTransaction) obj);
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
