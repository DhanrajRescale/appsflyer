package og;

import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import ba.nb;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.ChipView;
import ek.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f30069b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i10) {
        super(1);
        this.f30068a = i10;
        this.f30069b = rVar;
    }

    public final void a(Boolean bool) {
        int i10 = this.f30068a;
        r rVar = this.f30069b;
        switch (i10) {
            case 2:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ChipView chipView = ((nb) rVar.f17291u).f5553z;
                    chipView.setVisibility(0);
                    chipView.setChipText(R.string.short_sell);
                    chipView.setChipType(qj.j.f32017a);
                    nb nbVar = (nb) rVar.f17291u;
                    nbVar.f5546s.setVisibility(8);
                    nbVar.A.setVisibility(0);
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE)) {
                    ((nb) rVar.f17291u).f5553z.setVisibility(8);
                    nb nbVar2 = (nb) rVar.f17291u;
                    nbVar2.f5546s.setVisibility(0);
                    nbVar2.A.setVisibility(8);
                    return;
                }
                return;
            default:
                TextView profitLossText = ((nb) rVar.f17291u).D.f5902s;
                Intrinsics.checkNotNullExpressionValue(profitLossText, "profitLossText");
                bh.a.e(profitLossText, bool);
                ImageView changeTypeIcon = ((nb) rVar.f17291u).f5548u;
                Intrinsics.checkNotNullExpressionValue(changeTypeIcon, "changeTypeIcon");
                bh.a.d(changeTypeIcon, bool);
                return;
        }
    }

    public final void d(String str) {
        int i10 = this.f30068a;
        r rVar = this.f30069b;
        switch (i10) {
            case 0:
                Intrinsics.c(str);
                Object[] objArr = new Object[0];
                Intrinsics.checkNotNullParameter("StockHoldingsItemViewHolder", "tag");
                com.google.android.gms.internal.p002firebaseauthapi.a.g(str, "s", objArr, "params", "StockHoldingsItemViewHolder").getClass();
                u.k(objArr);
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.e(rVar.f22629a.getContext()).m(str).e()).i()).z(((nb) rVar.f17291u).B);
                return;
            case 1:
            case 2:
            default:
                ((nb) rVar.f17291u).f5547t.setText(str);
                return;
            case 3:
                ((nb) rVar.f17291u).C.setText(str);
                m4.m mVar = rVar.f17291u;
                boolean z10 = rVar.f30071y;
                if (z10) {
                    ((nb) mVar).f5546s.setVisibility(8);
                    return;
                } else {
                    if (!z10) {
                        ((nb) mVar).f5546s.setVisibility(0);
                        return;
                    }
                    return;
                }
            case 4:
                ((nb) rVar.f17291u).D.f5909z.setText(str);
                return;
            case 5:
                ((nb) rVar.f17291u).D.f5903t.setText(str);
                return;
            case 6:
                ((nb) rVar.f17291u).D.f5904u.setText(str);
                return;
            case 7:
                ((nb) rVar.f17291u).D.f5905v.setText(str);
                return;
            case 8:
                ((nb) rVar.f17291u).D.f5907x.setText(str);
                return;
            case 9:
                ((nb) rVar.f17291u).D.f5906w.setText(str);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f30068a) {
            case 0:
                d((String) obj);
                return Unit.f23355a;
            case 1:
                Integer num = (Integer) obj;
                TextView textView = ((nb) this.f30069b.f17291u).D.f5908y;
                Resources resources = textView.getResources();
                Intrinsics.c(num);
                textView.setText(resources.getString(num.intValue()));
                return Unit.f23355a;
            case 2:
                a((Boolean) obj);
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
            case 10:
                d((String) obj);
                return Unit.f23355a;
            default:
                a((Boolean) obj);
                return Unit.f23355a;
        }
    }
}
