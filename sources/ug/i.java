package ug;

import com.assetgro.stockgro.ui.portfolio.orders.model.FnoOrderResponseData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final i f37183b = new i(0);

    /* renamed from: c, reason: collision with root package name */
    public static final i f37184c = new i(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37185a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10) {
        super(1);
        this.f37185a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37185a) {
            case 0:
                FnoOrderResponseData item = (FnoOrderResponseData) obj;
                Intrinsics.checkNotNullParameter(item, "item");
                return String.valueOf(item.getOrderId());
            default:
                return null;
        }
    }
}
