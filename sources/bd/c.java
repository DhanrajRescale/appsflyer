package bd;

import android.widget.TextView;
import ba.kj;
import com.assetgro.stockgro.prod.R;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f6944b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(1);
        this.f6943a = i10;
        this.f6944b = dVar;
    }

    public final void a(String str) {
        int i10 = this.f6943a;
        d dVar = this.f6944b;
        switch (i10) {
            case 0:
                ((kj) dVar.q()).f5255t.f6351w.f6579y.setText(str);
                return;
            default:
                ((kj) dVar.q()).f5255t.H.setText(str);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        int i11 = this.f6943a;
        d dVar = this.f6944b;
        switch (i11) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                Integer num = (Integer) obj;
                TextView textView = ((kj) dVar.q()).f5255t.f6351w.f6580z;
                Intrinsics.c(num);
                textView.setText(dVar.getString(num.intValue()));
                return Unit.f23355a;
            case 2:
                a((String) obj);
                return Unit.f23355a;
            default:
                Boolean bool = (Boolean) obj;
                TextView textView2 = ((kj) dVar.q()).f5255t.I;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i10 = R.string.realised_profit;
                } else {
                    i10 = R.string.realised_loss;
                }
                textView2.setText(dVar.getString(i10));
                return Unit.f23355a;
        }
    }
}
