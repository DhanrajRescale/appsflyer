package kg;

import android.widget.ImageView;
import android.widget.TextView;
import ba.x8;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.ChipView;
import com.bumptech.glide.g;
import ek.u;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m4.m;
import qj.j;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f23095b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i10) {
        super(1);
        this.f23094a = i10;
        this.f23095b = cVar;
    }

    public final void a(Boolean bool) {
        int i10 = this.f23094a;
        c cVar = this.f23095b;
        switch (i10) {
            case 6:
                TextView profitLossText = ((x8) cVar.f17291u).f6627y;
                Intrinsics.checkNotNullExpressionValue(profitLossText, "profitLossText");
                bh.a.e(profitLossText, bool);
                ImageView changeTypeIcon = ((x8) cVar.f17291u).f6626x;
                Intrinsics.checkNotNullExpressionValue(changeTypeIcon, "changeTypeIcon");
                bh.a.d(changeTypeIcon, bool);
                return;
            default:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ChipView chipView = ((x8) cVar.f17291u).A;
                    chipView.setVisibility(0);
                    chipView.setChipText(R.string.short_sell);
                    chipView.setChipType(j.f32017a);
                    x8 x8Var = (x8) cVar.f17291u;
                    x8Var.f6622t.setText(R.string.avg_short_price);
                    x8Var.f6624v.setText(R.string.avg_sq_off_price);
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE)) {
                    ((x8) cVar.f17291u).A.setVisibility(8);
                    x8 x8Var2 = (x8) cVar.f17291u;
                    x8Var2.f6622t.setText(R.string.avg_buy_price);
                    x8Var2.f6624v.setText(R.string.avg_sell_price);
                    return;
                }
                return;
        }
    }

    public final void d(String str) {
        int i10 = this.f23094a;
        c cVar = this.f23095b;
        switch (i10) {
            case 0:
                ((x8) cVar.f17291u).D.setText(str);
                return;
            case 1:
                ((x8) cVar.f17291u).f6628z.setText(str);
                return;
            case 2:
                ((x8) cVar.f17291u).f6621s.setText(str);
                return;
            case 3:
                ((x8) cVar.f17291u).f6623u.setText(str);
                return;
            case 4:
                ((x8) cVar.f17291u).C.setText(str);
                return;
            case 5:
                ((x8) cVar.f17291u).f6625w.setText(str);
                boolean a10 = Intrinsics.a(str, "0.0 %");
                m mVar = cVar.f17291u;
                if (!a10 && !Intrinsics.a(str, "-0.0 %")) {
                    ((x8) mVar).f6626x.setVisibility(0);
                    return;
                } else {
                    ((x8) mVar).f6626x.setVisibility(8);
                    return;
                }
            default:
                Intrinsics.c(str);
                Object[] objArr = new Object[0];
                Intrinsics.checkNotNullParameter("StockHoldingsItemViewHolder", "tag");
                com.google.android.gms.internal.p002firebaseauthapi.a.g(str, "s", objArr, "params", "StockHoldingsItemViewHolder").getClass();
                u.k(objArr);
                ((g) ((g) com.bumptech.glide.b.e(cVar.f22629a.getContext()).m(str).e()).i()).z(((x8) cVar.f17291u).B);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f23094a) {
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
                d((String) obj);
                return Unit.f23355a;
            case 4:
                d((String) obj);
                return Unit.f23355a;
            case 5:
                d((String) obj);
                return Unit.f23355a;
            case 6:
                a((Boolean) obj);
                return Unit.f23355a;
            case 7:
                d((String) obj);
                return Unit.f23355a;
            default:
                a((Boolean) obj);
                return Unit.f23355a;
        }
    }
}
