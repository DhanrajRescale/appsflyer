package mi;

import android.widget.ProgressBar;
import ba.ro;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderPaymentSuccessFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockOrderPaymentSuccessFragment f27800b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(StockOrderPaymentSuccessFragment stockOrderPaymentSuccessFragment, int i10) {
        super(1);
        this.f27799a = i10;
        this.f27800b = stockOrderPaymentSuccessFragment;
    }

    public final void a(Boolean bool) {
        int i10 = this.f27799a;
        StockOrderPaymentSuccessFragment stockOrderPaymentSuccessFragment = this.f27800b;
        switch (i10) {
            case 3:
                ((ro) stockOrderPaymentSuccessFragment.q()).f5991v.setVisibility(8);
                return;
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ProgressBar progressBar = ((ro) stockOrderPaymentSuccessFragment.q()).f5990u;
                    Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                    stockOrderPaymentSuccessFragment.F(progressBar);
                    return;
                } else {
                    ProgressBar progressBar2 = ((ro) stockOrderPaymentSuccessFragment.q()).f5990u;
                    Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                    stockOrderPaymentSuccessFragment.t(progressBar2);
                    return;
                }
        }
    }

    public final void d(String str) {
        int i10 = this.f27799a;
        StockOrderPaymentSuccessFragment stockOrderPaymentSuccessFragment = this.f27800b;
        switch (i10) {
            case 0:
                ((ro) stockOrderPaymentSuccessFragment.q()).f5989t.setValue(str);
                return;
            case 1:
                ((ro) stockOrderPaymentSuccessFragment.q()).f5992w.setValue(str);
                return;
            case 2:
                ((com.bumptech.glide.g) com.bumptech.glide.b.f(((ro) stockOrderPaymentSuccessFragment.q()).f5993x).m(str).b()).z(((ro) stockOrderPaymentSuccessFragment.q()).f5993x);
                return;
            default:
                ((ro) stockOrderPaymentSuccessFragment.q()).f5994y.setText(str);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f27799a) {
            case 0:
                d((String) obj);
                return Unit.f23355a;
            case 1:
                d((String) obj);
                return Unit.f23355a;
            case 2:
                d((String) obj);
                return Unit.f23355a;
            case 3:
                a((Boolean) obj);
                return Unit.f23355a;
            case 4:
                a((Boolean) obj);
                return Unit.f23355a;
            default:
                d((String) obj);
                return Unit.f23355a;
        }
    }
}
