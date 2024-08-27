package ki;

import androidx.navigation.d0;
import ba.wn;
import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.ui.stock.cover.review.StockCoverOrderConfirmationFragment;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q6.l;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockCoverOrderConfirmationFragment f23200b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(StockCoverOrderConfirmationFragment stockCoverOrderConfirmationFragment, int i10) {
        super(1);
        this.f23199a = i10;
        this.f23200b = stockCoverOrderConfirmationFragment;
    }

    public final void a(Boolean bool) {
        d0 dVar;
        int i10;
        int i11 = this.f23199a;
        StockCoverOrderConfirmationFragment stockCoverOrderConfirmationFragment = this.f23200b;
        switch (i11) {
            case 0:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    int i12 = StockCoverOrderConfirmationFragment.f10182h;
                    StockOrderDto stock = stockCoverOrderConfirmationFragment.H().f23201a;
                    Intrinsics.checkNotNullParameter(stock, "stock");
                    dVar = new e(stock);
                } else {
                    int i13 = StockCoverOrderConfirmationFragment.f10182h;
                    StockOrderDto stockOrder = stockCoverOrderConfirmationFragment.H().f23201a;
                    Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
                    dVar = new d(stockOrder);
                }
                l.h(stockCoverOrderConfirmationFragment).o(dVar);
                return;
            default:
                wn wnVar = (wn) stockCoverOrderConfirmationFragment.q();
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                wnVar.f6556w.setVisibility(i10);
                ((wn) stockCoverOrderConfirmationFragment.q()).f6558y.setEnabled(!bool.booleanValue());
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f23199a) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            default:
                a((Boolean) obj);
                return Unit.f23355a;
        }
    }
}
