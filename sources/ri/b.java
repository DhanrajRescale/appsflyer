package ri;

import android.widget.ProgressBar;
import androidx.navigation.d0;
import ba.bl;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import com.assetgro.stockgro.ui.stock.modify.cover.ModifyStockCoverOrderConfirmationFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModifyStockCoverOrderConfirmationFragment f33760b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ModifyStockCoverOrderConfirmationFragment modifyStockCoverOrderConfirmationFragment, int i10) {
        super(1);
        this.f33759a = i10;
        this.f33760b = modifyStockCoverOrderConfirmationFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d0 eVar;
        int i10;
        int i11 = this.f33759a;
        ModifyStockCoverOrderConfirmationFragment modifyStockCoverOrderConfirmationFragment = this.f33760b;
        switch (i11) {
            case 0:
                int i12 = ModifyStockCoverOrderConfirmationFragment.f10312h;
                String orderType = modifyStockCoverOrderConfirmationFragment.H().f33761a.getOrderType();
                if (Intrinsics.a(orderType, "Market")) {
                    ModifyOrderDto stock = modifyStockCoverOrderConfirmationFragment.H().f33761a;
                    Intrinsics.checkNotNullParameter(stock, "stock");
                    eVar = new d(stock);
                } else if (Intrinsics.a(orderType, "Limit")) {
                    ModifyOrderDto stockOrder = modifyStockCoverOrderConfirmationFragment.H().f33761a;
                    Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
                    eVar = new e(stockOrder);
                } else {
                    throw new IllegalStateException(("Unknown order-type value: " + orderType).toString());
                }
                q6.l.h(modifyStockCoverOrderConfirmationFragment).o(eVar);
                return Unit.f23355a;
            default:
                Boolean bool = (Boolean) obj;
                ProgressBar progressBar = ((bl) modifyStockCoverOrderConfirmationFragment.q()).f4302s.f4802w;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                progressBar.setVisibility(i10);
                ((bl) modifyStockCoverOrderConfirmationFragment.q()).f4303t.setEnabled(!bool.booleanValue());
                return Unit.f23355a;
        }
    }
}
