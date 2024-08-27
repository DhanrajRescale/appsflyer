package ug;

import com.assetgro.stockgro.ui.portfolio.orders.model.FnoOrderResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f37178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FnoOrderResponseData f37179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Function1 function1, FnoOrderResponseData fnoOrderResponseData, int i10) {
        super(0);
        this.f37177a = i10;
        this.f37178b = function1;
        this.f37179c = fnoOrderResponseData;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        FnoOrderResponseData fnoOrderResponseData = this.f37179c;
        Function1 function1 = this.f37178b;
        int i10 = this.f37177a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        function1.invoke(String.valueOf(fnoOrderResponseData.getOrderId()));
                        break;
                    default:
                        String orderId = fnoOrderResponseData.getOrderId();
                        if (orderId != null) {
                            str = orderId;
                        }
                        function1.invoke(str);
                        break;
                }
                return Unit.f23355a;
            default:
                switch (i10) {
                    case 0:
                        function1.invoke(String.valueOf(fnoOrderResponseData.getOrderId()));
                        break;
                    default:
                        String orderId2 = fnoOrderResponseData.getOrderId();
                        if (orderId2 != null) {
                            str = orderId2;
                        }
                        function1.invoke(str);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
