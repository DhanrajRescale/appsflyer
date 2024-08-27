package qi;

import ba.ro;
import com.assetgro.stockgro.ui.stock.modify.common.ModifyOrderPaymentSuccessFragment;
import com.bumptech.glide.g;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModifyOrderPaymentSuccessFragment f31969b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ModifyOrderPaymentSuccessFragment modifyOrderPaymentSuccessFragment, int i10) {
        super(1);
        this.f31968a = i10;
        this.f31969b = modifyOrderPaymentSuccessFragment;
    }

    public final void a(String str) {
        int i10 = this.f31968a;
        ModifyOrderPaymentSuccessFragment modifyOrderPaymentSuccessFragment = this.f31969b;
        switch (i10) {
            case 0:
                ((ro) modifyOrderPaymentSuccessFragment.q()).f5989t.setValue(str);
                return;
            case 1:
                ((ro) modifyOrderPaymentSuccessFragment.q()).f5992w.setValue(str);
                return;
            case 2:
                ((g) com.bumptech.glide.b.f(((ro) modifyOrderPaymentSuccessFragment.q()).f5993x).m(str).b()).z(((ro) modifyOrderPaymentSuccessFragment.q()).f5993x);
                return;
            default:
                ((ro) modifyOrderPaymentSuccessFragment.q()).f5994y.setText(str);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f31968a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                a((String) obj);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
