package ji;

import com.assetgro.stockgro.data.remote.response.StockSellSelectOrderResponseDto;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f21399b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f21400c = new d(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21401a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f21401a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21401a) {
            case 0:
                return Unit.f23355a;
            default:
                return ((StockSellSelectOrderResponseDto) obj).getOrderType();
        }
    }
}
