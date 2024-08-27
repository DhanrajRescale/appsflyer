package ti;

import androidx.navigation.d0;
import ba.xk;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import com.assetgro.stockgro.ui.stock.modify.short_sell.StockModifyShortSellOrderConfirmationFragment;
import com.assetgro.stockgro.ui.stock.modify.short_sell.StockModifyShortSellOrderConfirmationViewModel;
import com.google.firebase.crashlytics.internal.common.IdManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockModifyShortSellOrderConfirmationFragment f36125b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(StockModifyShortSellOrderConfirmationFragment stockModifyShortSellOrderConfirmationFragment, int i10) {
        super(1);
        this.f36124a = i10;
        this.f36125b = stockModifyShortSellOrderConfirmationFragment;
    }

    public final void a(Boolean bool) {
        d0 lVar;
        com.kaopiz.kprogresshud.f fVar;
        int i10 = this.f36124a;
        StockModifyShortSellOrderConfirmationFragment stockModifyShortSellOrderConfirmationFragment = this.f36125b;
        switch (i10) {
            case 1:
                Object value = ((StockModifyShortSellOrderConfirmationViewModel) stockModifyShortSellOrderConfirmationFragment.r()).f10373o.getValue();
                Intrinsics.c(value);
                ModifyOrderDto stockOrder = (ModifyOrderDto) value;
                switch (l.f36127a.f28733a) {
                    case 6:
                        Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
                        lVar = new si.l(stockOrder);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
                        lVar = new k(stockOrder);
                        break;
                }
                q6.l.h(stockModifyShortSellOrderConfirmationFragment).o(lVar);
                return;
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar2 = stockModifyShortSellOrderConfirmationFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.d();
                        return;
                    }
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = stockModifyShortSellOrderConfirmationFragment.f17283a) != null) {
                    fVar.b();
                    return;
                }
                return;
        }
    }

    public final void d(String str) {
        int i10 = this.f36124a;
        StockModifyShortSellOrderConfirmationFragment stockModifyShortSellOrderConfirmationFragment = this.f36125b;
        switch (i10) {
            case 0:
                ((xk) stockModifyShortSellOrderConfirmationFragment.q()).f6665s.A.setText(str);
                return;
            case 1:
            case 2:
            case 3:
            default:
                ((com.bumptech.glide.g) com.bumptech.glide.b.f(((xk) stockModifyShortSellOrderConfirmationFragment.q()).f6665s.f4603z).m(str).b()).z(((xk) stockModifyShortSellOrderConfirmationFragment.q()).f6665s.f4603z);
                return;
            case 4:
                ((xk) stockModifyShortSellOrderConfirmationFragment.q()).f6665s.f4600w.setValue(str);
                return;
            case 5:
                ((xk) stockModifyShortSellOrderConfirmationFragment.q()).f6665s.f4601x.setValue(str);
                return;
            case 6:
                ((xk) stockModifyShortSellOrderConfirmationFragment.q()).f6665s.f4598u.setValue(str);
                return;
            case 7:
                if (str != null && str.length() != 0 && !Intrinsics.a(str, IdManager.DEFAULT_VERSION_NAME)) {
                    ((xk) stockModifyShortSellOrderConfirmationFragment.q()).f6665s.B.setValue(str.concat("%"));
                    return;
                } else {
                    ((xk) stockModifyShortSellOrderConfirmationFragment.q()).f6665s.B.setValue("-");
                    return;
                }
            case 8:
                if (str != null && str.length() != 0 && !Intrinsics.a(str, IdManager.DEFAULT_VERSION_NAME)) {
                    ((xk) stockModifyShortSellOrderConfirmationFragment.q()).f6665s.f4596s.setValue(str.concat("%"));
                    return;
                } else {
                    ((xk) stockModifyShortSellOrderConfirmationFragment.q()).f6665s.f4596s.setValue("-");
                    return;
                }
            case 9:
                ((xk) stockModifyShortSellOrderConfirmationFragment.q()).f6665s.f4597t.setText(str);
                return;
            case 10:
                ((xk) stockModifyShortSellOrderConfirmationFragment.q()).f6665s.C.setValue(str);
                return;
            case 11:
                ((xk) stockModifyShortSellOrderConfirmationFragment.q()).f6665s.f4599v.setText(str);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f36124a) {
            case 0:
                d((String) obj);
                return Unit.f23355a;
            case 1:
                a((Boolean) obj);
                return Unit.f23355a;
            case 2:
                a((Boolean) obj);
                return Unit.f23355a;
            case 3:
                this.f36125b.requireActivity().finish();
                return Unit.f23355a;
            case 4:
                d((String) obj);
                return Unit.f23355a;
            case 5:
                d((String) obj);
                return Unit.f23355a;
            case 6:
                d((String) obj);
                return Unit.f23355a;
            case 7:
                d((String) obj);
                return Unit.f23355a;
            case 8:
                d((String) obj);
                return Unit.f23355a;
            case 9:
                d((String) obj);
                return Unit.f23355a;
            case 10:
                d((String) obj);
                return Unit.f23355a;
            case 11:
                d((String) obj);
                return Unit.f23355a;
            default:
                d((String) obj);
                return Unit.f23355a;
        }
    }
}
