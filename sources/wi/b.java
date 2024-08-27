package wi;

import android.os.Bundle;
import androidx.navigation.t;
import ba.xo;
import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.shortSell.confirm.StockShortSellConfirmationFragment;
import com.assetgro.stockgro.ui.stock.shortSell.confirm.StockSortSellConfirmationViewModel;
import com.bumptech.glide.g;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.kaopiz.kprogresshud.f;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q6.l;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockShortSellConfirmationFragment f39082b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(StockShortSellConfirmationFragment stockShortSellConfirmationFragment, int i10) {
        super(1);
        this.f39081a = i10;
        this.f39082b = stockShortSellConfirmationFragment;
    }

    public final void a(Boolean bool) {
        f fVar;
        int i10 = this.f39081a;
        StockShortSellConfirmationFragment stockShortSellConfirmationFragment = this.f39082b;
        switch (i10) {
            case 1:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    t h10 = l.h(stockShortSellConfirmationFragment);
                    Bundle bundle = new Bundle();
                    bundle.putAll(stockShortSellConfirmationFragment.getArguments());
                    Unit unit = Unit.f23355a;
                    h10.l(R.id.transactionSuccessful, bundle, null);
                    return;
                }
                Object value = ((StockSortSellConfirmationViewModel) stockShortSellConfirmationFragment.r()).f10410o.getValue();
                Intrinsics.c(value);
                StockOrderDto stockOrder = (StockOrderDto) value;
                Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
                l.h(stockShortSellConfirmationFragment).o(new c(stockOrder));
                return;
            case 2:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    f fVar2 = stockShortSellConfirmationFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.d();
                        return;
                    }
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = stockShortSellConfirmationFragment.f17283a) != null) {
                    fVar.b();
                    return;
                }
                return;
            default:
                xo xoVar = (xo) stockShortSellConfirmationFragment.q();
                Intrinsics.c(bool);
                xoVar.f6672t.setClickable(bool.booleanValue());
                ((xo) stockShortSellConfirmationFragment.q()).f6672t.setEnabled(bool.booleanValue());
                return;
        }
    }

    public final void d(String str) {
        int i10 = this.f39081a;
        StockShortSellConfirmationFragment stockShortSellConfirmationFragment = this.f39082b;
        switch (i10) {
            case 0:
                ((xo) stockShortSellConfirmationFragment.q()).f6671s.A.setText(str);
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                ((g) com.bumptech.glide.b.f(((xo) stockShortSellConfirmationFragment.q()).f6671s.f4611z).m(str).b()).z(((xo) stockShortSellConfirmationFragment.q()).f6671s.f4611z);
                return;
            case 5:
                ((xo) stockShortSellConfirmationFragment.q()).f6671s.f4608w.setValue(str);
                return;
            case 6:
                ((xo) stockShortSellConfirmationFragment.q()).f6671s.f4609x.setValue(str);
                return;
            case 7:
                ((xo) stockShortSellConfirmationFragment.q()).f6671s.f4606u.setValue(str);
                return;
            case 8:
                if (str != null && str.length() != 0 && !str.equals(IdManager.DEFAULT_VERSION_NAME)) {
                    ((xo) stockShortSellConfirmationFragment.q()).f6671s.B.setValue(str.concat("%"));
                    return;
                } else {
                    ((xo) stockShortSellConfirmationFragment.q()).f6671s.B.setValue("-");
                    return;
                }
            case 9:
                if (str != null && str.length() != 0 && !str.equals(IdManager.DEFAULT_VERSION_NAME)) {
                    ((xo) stockShortSellConfirmationFragment.q()).f6671s.f4604s.setValue(str.concat("%"));
                    return;
                } else {
                    ((xo) stockShortSellConfirmationFragment.q()).f6671s.f4604s.setValue("-");
                    return;
                }
            case 10:
                ((xo) stockShortSellConfirmationFragment.q()).f6671s.f4605t.setText(str);
                return;
            case 11:
                ((xo) stockShortSellConfirmationFragment.q()).f6671s.C.setValue(str);
                return;
            case 12:
                ((xo) stockShortSellConfirmationFragment.q()).f6671s.f4607v.setText(str);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f39081a) {
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
                this.f39082b.requireActivity().finish();
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
