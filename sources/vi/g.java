package vi;

import androidx.navigation.d0;
import ba.vo;
import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.ui.stock.sell.StockSellOrderConfirmationFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockSellOrderConfirmationFragment f38097b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(StockSellOrderConfirmationFragment stockSellOrderConfirmationFragment, int i10) {
        super(1);
        this.f38096a = i10;
        this.f38097b = stockSellOrderConfirmationFragment;
    }

    public final void a(Boolean bool) {
        d0 iVar;
        int i10;
        int i11 = this.f38096a;
        StockSellOrderConfirmationFragment stockSellOrderConfirmationFragment = this.f38097b;
        switch (i11) {
            case 0:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    int i12 = StockSellOrderConfirmationFragment.f10394h;
                    StockOrderDto stock = stockSellOrderConfirmationFragment.H().f38098a;
                    Intrinsics.checkNotNullParameter(stock, "stock");
                    iVar = new j(stock);
                } else {
                    int i13 = StockSellOrderConfirmationFragment.f10394h;
                    StockOrderDto stockOrder = stockSellOrderConfirmationFragment.H().f38098a;
                    Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
                    iVar = new i(stockOrder);
                }
                q6.l.h(stockSellOrderConfirmationFragment).o(iVar);
                return;
            default:
                vo voVar = (vo) stockSellOrderConfirmationFragment.q();
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                voVar.f6458w.setVisibility(i10);
                ((vo) stockSellOrderConfirmationFragment.q()).f6460y.setEnabled(!bool.booleanValue());
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f38096a) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            default:
                a((Boolean) obj);
                return Unit.f23355a;
        }
    }
}
