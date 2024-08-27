package fg;

import android.widget.TextView;
import ba.f6;
import ba.x4;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f16069b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i10) {
        super(1);
        this.f16068a = i10;
        this.f16069b = fVar;
    }

    public final void a(String str) {
        int i10 = this.f16068a;
        f fVar = this.f16069b;
        switch (i10) {
            case 0:
                ((f6) fVar.r()).f4674w.setText(str);
                return;
            default:
                fVar.dismiss();
                WithdrawalDetailActivity withdrawalDetailActivity = (WithdrawalDetailActivity) fVar.f16072j.getValue();
                ((x4) withdrawalDetailActivity.w()).C.setVisibility(8);
                ((x4) withdrawalDetailActivity.w()).A.f6689s.setVisibility(0);
                TextView textView = ((x4) withdrawalDetailActivity.w()).A.f6691u;
                if (str == null || str.length() == 0) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                textView.setText(str);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.kaopiz.kprogresshud.f fVar;
        switch (this.f16068a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            default:
                Boolean bool = (Boolean) obj;
                boolean a10 = Intrinsics.a(bool, Boolean.TRUE);
                f fVar2 = this.f16069b;
                if (a10) {
                    com.kaopiz.kprogresshud.f fVar3 = fVar2.f17276h;
                    if (fVar3 != null) {
                        fVar3.d();
                    }
                } else if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = fVar2.f17276h) != null) {
                    fVar.b();
                }
                return Unit.f23355a;
        }
    }
}
