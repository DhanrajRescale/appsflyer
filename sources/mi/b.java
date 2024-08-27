package mi;

import android.os.Bundle;
import androidx.navigation.t;
import ba.lo;
import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderConfirmationFragment;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderConfirmationViewModel;
import com.assetgro.stockgro.widget.DisplayView;
import com.google.firebase.crashlytics.internal.common.IdManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockOrderConfirmationFragment f27762b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(StockOrderConfirmationFragment stockOrderConfirmationFragment, int i10) {
        super(1);
        this.f27761a = i10;
        this.f27762b = stockOrderConfirmationFragment;
    }

    public final void a(Boolean bool) {
        com.kaopiz.kprogresshud.f fVar;
        int i10 = this.f27761a;
        StockOrderConfirmationFragment stockOrderConfirmationFragment = this.f27762b;
        switch (i10) {
            case 1:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    t h10 = q6.l.h(stockOrderConfirmationFragment);
                    Bundle bundle = new Bundle();
                    bundle.putAll(stockOrderConfirmationFragment.getArguments());
                    Unit unit = Unit.f23355a;
                    h10.l(R.id.transactionSuccessful, bundle, null);
                    return;
                }
                Object value = ((StockOrderConfirmationViewModel) stockOrderConfirmationFragment.r()).f10207o.getValue();
                Intrinsics.c(value);
                StockOrderDto stockOrder = (StockOrderDto) value;
                Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
                q6.l.h(stockOrderConfirmationFragment).o(new c(stockOrder));
                return;
            case 2:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar2 = stockOrderConfirmationFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.d();
                        return;
                    }
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = stockOrderConfirmationFragment.f17283a) != null) {
                    fVar.b();
                    return;
                }
                return;
            default:
                lo loVar = (lo) stockOrderConfirmationFragment.q();
                Intrinsics.c(bool);
                loVar.f5378s.setClickable(bool.booleanValue());
                ((lo) stockOrderConfirmationFragment.q()).f5378s.setEnabled(bool.booleanValue());
                return;
        }
    }

    public final void d(String str) {
        int i10 = this.f27761a;
        String str2 = "-";
        StockOrderConfirmationFragment stockOrderConfirmationFragment = this.f27762b;
        switch (i10) {
            case 0:
                ((lo) stockOrderConfirmationFragment.q()).f5379t.f4368z.setText(str);
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                ((com.bumptech.glide.g) com.bumptech.glide.b.f(((lo) stockOrderConfirmationFragment.q()).f5379t.f4367y).m(str).b()).z(((lo) stockOrderConfirmationFragment.q()).f5379t.f4367y);
                return;
            case 5:
                ((lo) stockOrderConfirmationFragment.q()).f5379t.f4365w.setValue(str);
                return;
            case 6:
                ((lo) stockOrderConfirmationFragment.q()).f5379t.f4366x.setValue(str);
                return;
            case 7:
                ((lo) stockOrderConfirmationFragment.q()).f5379t.f4363u.setValue(str);
                return;
            case 8:
                DisplayView displayView = ((lo) stockOrderConfirmationFragment.q()).f5379t.A;
                if (str != null && str.length() != 0 && !str.equals(IdManager.DEFAULT_VERSION_NAME)) {
                    str2 = str.concat("%");
                }
                displayView.setValue(str2);
                return;
            case 9:
                DisplayView displayView2 = ((lo) stockOrderConfirmationFragment.q()).f5379t.f4361s;
                if (str != null && str.length() != 0 && !str.equals(IdManager.DEFAULT_VERSION_NAME)) {
                    str2 = str.concat("%");
                }
                displayView2.setValue(str2);
                return;
            case 10:
                ((lo) stockOrderConfirmationFragment.q()).f5379t.f4362t.setText(str);
                return;
            case 11:
                ((lo) stockOrderConfirmationFragment.q()).f5379t.B.setValue(str);
                return;
            case 12:
                ((lo) stockOrderConfirmationFragment.q()).f5379t.f4364v.setText(str);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f27761a) {
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
                this.f27762b.requireActivity().finish();
                return Unit.f23355a;
            case 4:
                a((Boolean) obj);
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
            case 12:
                d((String) obj);
                return Unit.f23355a;
            default:
                d((String) obj);
                return Unit.f23355a;
        }
    }
}
