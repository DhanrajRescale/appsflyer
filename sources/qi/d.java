package qi;

import com.assetgro.stockgro.data.model.ModifyOrderDto;
import ij.h;
import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f31971b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f31972c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f31973d = new d(2);

    /* renamed from: e, reason: collision with root package name */
    public static final d f31974e = new d(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31975a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f31975a = i10;
    }

    public final String a(ModifyOrderDto modifyOrderDto) {
        switch (this.f31975a) {
            case 0:
                Double executionPrice = modifyOrderDto.getExecutionPrice();
                if (executionPrice != null) {
                    return h.m(h.f20067a, executionPrice.doubleValue());
                }
                return null;
            case 1:
                return modifyOrderDto.getQuantity();
            case 2:
                return modifyOrderDto.getStockImageUrl();
            default:
                return modifyOrderDto.getStockName();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f31975a) {
            case 0:
                return a((ModifyOrderDto) obj);
            case 1:
                return a((ModifyOrderDto) obj);
            case 2:
                return a((ModifyOrderDto) obj);
            default:
                return a((ModifyOrderDto) obj);
        }
    }
}
