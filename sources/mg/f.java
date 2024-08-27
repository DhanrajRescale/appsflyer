package mg;

import com.assetgro.stockgro.ui.portfolio.history.model.PortfolioHistoryFnoDataItem;
import iu.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final f f27755b = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f27756c = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27757a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10) {
        super(1);
        this.f27757a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f27757a) {
            case 0:
                PortfolioHistoryFnoDataItem item = (PortfolioHistoryFnoDataItem) obj;
                Intrinsics.checkNotNullParameter(item, "item");
                return item.getOrderId();
            default:
                return null;
        }
    }
}
