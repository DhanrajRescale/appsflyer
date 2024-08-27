package ni;

import android.widget.TextView;
import ba.vc;
import com.assetgro.stockgro.data.model.ChangeDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f28729b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i10) {
        super(1);
        this.f28728a = i10;
        this.f28729b = fVar;
    }

    public final void a(String str) {
        int i10 = this.f28728a;
        f fVar = this.f28729b;
        switch (i10) {
            case 0:
                ((vc) fVar.f17291u).f6427v.setText(str);
                return;
            case 1:
                if (str != null && !fVar.f28731x) {
                    vc vcVar = (vc) fVar.f17291u;
                    TextView stockPrice = vcVar.f6428w;
                    Intrinsics.checkNotNullExpressionValue(stockPrice, "stockPrice");
                    zq.f.m0(stockPrice);
                    vcVar.f6428w.setText(str);
                    return;
                }
                TextView stockPrice2 = ((vc) fVar.f17291u).f6428w;
                Intrinsics.checkNotNullExpressionValue(stockPrice2, "stockPrice");
                Intrinsics.checkNotNullParameter(stockPrice2, "<this>");
                stockPrice2.setVisibility(4);
                ((vc) fVar.f17291u).f6425t.setGravity(8388611);
                return;
            case 2:
            default:
                ((vc) fVar.f17291u).f6424s.setText(str);
                return;
            case 3:
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.e(fVar.f22629a.getContext()).m(str).e()).i()).z(((vc) fVar.f17291u).f6426u);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28728a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                f fVar = this.f28729b;
                ((vc) fVar.f17291u).f6425t.c((ChangeDto) obj, fVar.f28731x, true);
                return Unit.f23355a;
            case 3:
                a((String) obj);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
