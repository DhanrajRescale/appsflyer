package si;

import androidx.navigation.d0;
import ba.vo;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import com.assetgro.stockgro.ui.stock.modify.sell.StockModifySellOrderConfirmationFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockModifySellOrderConfirmationFragment f34654b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(StockModifySellOrderConfirmationFragment stockModifySellOrderConfirmationFragment, int i10) {
        super(1);
        this.f34653a = i10;
        this.f34654b = stockModifySellOrderConfirmationFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d0 lVar;
        d0 d0Var;
        int i10;
        int i11 = this.f34653a;
        StockModifySellOrderConfirmationFragment stockModifySellOrderConfirmationFragment = this.f34654b;
        switch (i11) {
            case 0:
                int i12 = StockModifySellOrderConfirmationFragment.f10348h;
                String orderType = stockModifySellOrderConfirmationFragment.H().f34655a.getOrderType();
                if (Intrinsics.a(orderType, "Market")) {
                    ni.g gVar = m.f34658a;
                    ModifyOrderDto stock = stockModifySellOrderConfirmationFragment.H().f34655a;
                    Intrinsics.checkNotNullParameter(stock, "stock");
                    d0Var = new k(stock);
                } else if (Intrinsics.a(orderType, "Limit")) {
                    ni.g gVar2 = m.f34658a;
                    ModifyOrderDto stockOrder = stockModifySellOrderConfirmationFragment.H().f34655a;
                    switch (gVar2.f28733a) {
                        case 6:
                            Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
                            lVar = new l(stockOrder);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
                            lVar = new ti.k(stockOrder);
                            break;
                    }
                    d0Var = lVar;
                } else {
                    throw new IllegalStateException(("Unknown order-type value: " + orderType).toString());
                }
                q6.l.h(stockModifySellOrderConfirmationFragment).o(d0Var);
                return Unit.f23355a;
            default:
                Boolean bool = (Boolean) obj;
                vo voVar = (vo) stockModifySellOrderConfirmationFragment.q();
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                voVar.f6458w.setVisibility(i10);
                ((vo) stockModifySellOrderConfirmationFragment.q()).f6460y.setEnabled(!bool.booleanValue());
                return Unit.f23355a;
        }
    }
}
