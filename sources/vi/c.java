package vi;

import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f38087b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f38088c = new c(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38089a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(1);
        this.f38089a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38089a) {
            case 0:
                return Unit.f23355a;
            default:
                return ((StockSellSelectOrderResponseDto) obj).getOrderType();
        }
    }
}
