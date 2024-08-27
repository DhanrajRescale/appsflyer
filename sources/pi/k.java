package pi;

import ba.vk;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import com.assetgro.stockgro.ui.stock.modify.buy.StockModifyOrderConfirmationFragment;
import com.assetgro.stockgro.ui.stock.modify.buy.StockModifyOrderConfirmationViewModel;
import com.google.firebase.crashlytics.internal.common.IdManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockModifyOrderConfirmationFragment f31145b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(StockModifyOrderConfirmationFragment stockModifyOrderConfirmationFragment, int i10) {
        super(1);
        this.f31144a = i10;
        this.f31145b = stockModifyOrderConfirmationFragment;
    }

    public final void a(Boolean bool) {
        com.kaopiz.kprogresshud.f fVar;
        int i10 = this.f31144a;
        StockModifyOrderConfirmationFragment stockModifyOrderConfirmationFragment = this.f31145b;
        switch (i10) {
            case 1:
                Object value = ((StockModifyOrderConfirmationViewModel) stockModifyOrderConfirmationFragment.r()).f10288o.getValue();
                Intrinsics.c(value);
                ModifyOrderDto stockOrder = (ModifyOrderDto) value;
                Intrinsics.checkNotNullParameter(stockOrder, "stockOrder");
                q6.l.h(stockModifyOrderConfirmationFragment).o(new l(stockOrder));
                return;
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar2 = stockModifyOrderConfirmationFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.d();
                        return;
                    }
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = stockModifyOrderConfirmationFragment.f17283a) != null) {
                    fVar.b();
                    return;
                }
                return;
        }
    }

    public final void d(String str) {
        int i10 = this.f31144a;
        StockModifyOrderConfirmationFragment stockModifyOrderConfirmationFragment = this.f31145b;
        switch (i10) {
            case 0:
                ((vk) stockModifyOrderConfirmationFragment.q()).f6446t.f4360z.setText(str);
                return;
            case 1:
            case 2:
            case 3:
            default:
                ((com.bumptech.glide.g) com.bumptech.glide.b.f(((vk) stockModifyOrderConfirmationFragment.q()).f6446t.f4359y).m(str).b()).z(((vk) stockModifyOrderConfirmationFragment.q()).f6446t.f4359y);
                return;
            case 4:
                ((vk) stockModifyOrderConfirmationFragment.q()).f6446t.f4357w.setValue(str);
                return;
            case 5:
                ((vk) stockModifyOrderConfirmationFragment.q()).f6446t.f4358x.setValue(str);
                return;
            case 6:
                ((vk) stockModifyOrderConfirmationFragment.q()).f6446t.f4355u.setValue(str);
                return;
            case 7:
                if (str != null && str.length() != 0 && !Intrinsics.a(str, IdManager.DEFAULT_VERSION_NAME)) {
                    ((vk) stockModifyOrderConfirmationFragment.q()).f6446t.A.setValue(str.concat("%"));
                    return;
                } else {
                    ((vk) stockModifyOrderConfirmationFragment.q()).f6446t.A.setValue("-");
                    return;
                }
            case 8:
                if (str != null && str.length() != 0 && !Intrinsics.a(str, IdManager.DEFAULT_VERSION_NAME)) {
                    ((vk) stockModifyOrderConfirmationFragment.q()).f6446t.f4353s.setValue(str.concat("%"));
                    return;
                } else {
                    ((vk) stockModifyOrderConfirmationFragment.q()).f6446t.f4353s.setValue("-");
                    return;
                }
            case 9:
                ((vk) stockModifyOrderConfirmationFragment.q()).f6446t.f4354t.setText(str);
                return;
            case 10:
                ((vk) stockModifyOrderConfirmationFragment.q()).f6446t.B.setValue(str);
                return;
            case 11:
                ((vk) stockModifyOrderConfirmationFragment.q()).f6446t.f4356v.setText(str);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f31144a) {
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
                this.f31145b.requireActivity().finish();
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
