package sg;

import android.widget.ImageView;
import android.widget.TextView;
import ba.x6;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.ChipView;
import com.bumptech.glide.g;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m4.m;
import qj.j;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f34623b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(1);
        this.f34622a = i10;
        this.f34623b = dVar;
    }

    public final void a(Boolean bool) {
        int i10 = this.f34622a;
        d dVar = this.f34623b;
        switch (i10) {
            case 0:
                TextView profitLossText = ((x6) dVar.f17291u).A;
                Intrinsics.checkNotNullExpressionValue(profitLossText, "profitLossText");
                bh.a.e(profitLossText, bool);
                ImageView changeTypeIcon = ((x6) dVar.f17291u).f6617x;
                Intrinsics.checkNotNullExpressionValue(changeTypeIcon, "changeTypeIcon");
                bh.a.d(changeTypeIcon, bool);
                return;
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ChipView chipView = ((x6) dVar.f17291u).D;
                    chipView.setVisibility(0);
                    chipView.setChipText(R.string.short_sell);
                    chipView.setChipType(j.f32017a);
                    x6 x6Var = (x6) dVar.f17291u;
                    x6Var.f6613t.setText(R.string.avg_short_price);
                    x6Var.f6615v.setText(R.string.avg_sq_off_price);
                    x6Var.F.setText(R.string.total_sold);
                    x6Var.H.setText(R.string.total_brought);
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE)) {
                    ((x6) dVar.f17291u).D.setVisibility(8);
                    x6 x6Var2 = (x6) dVar.f17291u;
                    x6Var2.f6613t.setText(R.string.avg_buy_price);
                    x6Var2.f6615v.setText(R.string.avg_sell_price);
                    x6Var2.F.setText(R.string.total_brought);
                    x6Var2.H.setText(R.string.total_sold);
                    return;
                }
                return;
        }
    }

    public final void d(String str) {
        int i10 = this.f34622a;
        d dVar = this.f34623b;
        switch (i10) {
            case 2:
                ((x6) dVar.f17291u).C.setText(str);
                return;
            case 3:
                ((x6) dVar.f17291u).E.setText(str);
                return;
            case 4:
                ((x6) dVar.f17291u).G.setText(str);
                return;
            case 5:
                ((x6) dVar.f17291u).f6618y.setText(str);
                return;
            case 6:
                ((x6) dVar.f17291u).f6612s.setText(str);
                return;
            case 7:
                ((x6) dVar.f17291u).f6614u.setText(str);
                return;
            case 8:
                ((g) ((g) ((g) ((g) com.bumptech.glide.b.e(dVar.f22629a.getContext()).m(str).e()).i()).l(R.drawable.ic_placeholder_stock)).g(R.drawable.ic_placeholder_stock)).z(((x6) dVar.f17291u).B);
                return;
            case 9:
                ((x6) dVar.f17291u).f6619z.setText(str);
                return;
            default:
                ((x6) dVar.f17291u).f6616w.setText(str);
                boolean a10 = Intrinsics.a(str, "0.00 %");
                m mVar = dVar.f17291u;
                if (!a10 && !Intrinsics.a(str, "-0.00 %")) {
                    ((x6) mVar).f6617x.setVisibility(0);
                    return;
                } else {
                    ((x6) mVar).f6617x.setVisibility(8);
                    return;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f34622a) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            case 1:
                a((Boolean) obj);
                return Unit.f23355a;
            case 2:
                d((String) obj);
                return Unit.f23355a;
            case 3:
                d((String) obj);
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
            default:
                d((String) obj);
                return Unit.f23355a;
        }
    }
}
