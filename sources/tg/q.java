package tg;

import android.view.View;
import ba.pb;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.model.portfolio.orders.Bought;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.orders.OrderItemViewModel;
import com.assetgro.stockgro.widget.ChipView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;

/* loaded from: classes.dex */
public final class q extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f36073b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i10) {
        super(1);
        this.f36072a = i10;
        this.f36073b = rVar;
    }

    public final void a(String str) {
        int i10 = this.f36072a;
        r rVar = this.f36073b;
        switch (i10) {
            case 0:
                if (Intrinsics.a(str, "Market")) {
                    ChipView chipView = ((pb) rVar.f17291u).I;
                    String string = rVar.f22629a.getContext().getResources().getString(R.string.text_market);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    chipView.setChipText(string);
                    ((pb) rVar.f17291u).I.setChipType(qj.j.f32022f);
                    return;
                }
                if (Intrinsics.a(str, "Limit")) {
                    ChipView chipView2 = ((pb) rVar.f17291u).I;
                    String string2 = rVar.f22629a.getContext().getResources().getString(R.string.text_limit);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    chipView2.setChipText(string2);
                    ((pb) rVar.f17291u).I.setChipType(qj.j.f32022f);
                    return;
                }
                return;
            case 1:
                ((pb) rVar.f17291u).C.setText(str);
                return;
            case 2:
            case 7:
            default:
                ((pb) rVar.f17291u).f5753w.f4748u.setText(str);
                return;
            case 3:
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.e(rVar.f22629a.getContext()).m(str).e()).i()).z(((pb) rVar.f17291u).G);
                return;
            case 4:
                if (!s.j((String) ((OrderItemViewModel) rVar.v()).f9901s.getValue(), "executed", true) && !s.j((String) ((OrderItemViewModel) rVar.v()).f9901s.getValue(), "pending", true)) {
                    m4.m mVar = rVar.f17291u;
                    if (str != null && str.length() != 0 && Intrinsics.a(str, "balance-exceed-cancelled")) {
                        pb pbVar = (pb) mVar;
                        pbVar.B.setVisibility(0);
                        pbVar.B.setText(rVar.f22629a.getContext().getString(R.string.text_cancelled_order_reason));
                        return;
                    }
                    ((pb) mVar).B.setVisibility(8);
                    return;
                }
                return;
            case 5:
                Bought bought = (Bought) ((OrderItemViewModel) rVar.v()).f9075c.getValue();
                if (bought != null) {
                    boolean a10 = Intrinsics.a(bought.getTradeType(), "SOLD");
                    m4.m mVar2 = rVar.f17291u;
                    if (a10 && s.j(bought.getOrderStatus(), "pending", true)) {
                        pb pbVar2 = (pb) mVar2;
                        pbVar2.f5750t.setChipType(qj.j.f32018b);
                        pbVar2.f5750t.setChipTextColor(R.color.white);
                    } else {
                        pb pbVar3 = (pb) mVar2;
                        pbVar3.f5750t.setChipType(qj.j.f32027k);
                        pbVar3.f5750t.setChipTextColor(R.color.black_1A1A1A);
                    }
                    ChipView chipView3 = ((pb) mVar2).f5750t;
                    Intrinsics.c(str);
                    chipView3.setChipText(str);
                    return;
                }
                return;
            case 6:
                Bought bought2 = (Bought) ((OrderItemViewModel) rVar.v()).f9075c.getValue();
                if (bought2 != null) {
                    boolean a11 = Intrinsics.a(bought2.getTradeType(), "BOUGHT");
                    m4.m mVar3 = rVar.f17291u;
                    if (a11 && s.j(bought2.getOrderStatus(), "pending", true)) {
                        pb pbVar4 = (pb) mVar3;
                        pbVar4.f5749s.setChipType(qj.j.f32025i);
                        pbVar4.f5749s.setChipTextColor(R.color.black_1A1A1A);
                    } else {
                        pb pbVar5 = (pb) mVar3;
                        pbVar5.f5749s.setChipType(qj.j.f32027k);
                        pbVar5.f5749s.setChipTextColor(R.color.black_1A1A1A);
                    }
                    ChipView chipView4 = ((pb) mVar3).f5749s;
                    Intrinsics.c(str);
                    chipView4.setChipText(str);
                    return;
                }
                return;
            case 8:
                ((pb) rVar.f17291u).H.setText(str);
                return;
            case 9:
                ((pb) rVar.f17291u).f5753w.f4747t.setText(str);
                return;
            case 10:
                ChipView chipView5 = ((pb) rVar.f17291u).f5753w.f4746s;
                Intrinsics.c(str);
                chipView5.setChipText(str);
                return;
            case 11:
                ((pb) rVar.f17291u).E.setText(str);
                boolean j10 = s.j(str, "executed", true);
                View view = rVar.f22629a;
                m4.m mVar4 = rVar.f17291u;
                if (j10) {
                    pb pbVar6 = (pb) mVar4;
                    pbVar6.E.setTextColor(r3.k.getColor(view.getContext(), R.color.chipGreen));
                    pbVar6.f5754x.setVisibility(8);
                    pbVar6.B.setVisibility(0);
                    return;
                }
                if (s.j(str, "pending", true)) {
                    pb pbVar7 = (pb) mVar4;
                    pbVar7.E.setTextColor(r3.k.getColor(view.getContext(), R.color.orange));
                    pbVar7.f5754x.setVisibility(0);
                    pbVar7.B.setVisibility(8);
                    return;
                }
                pb pbVar8 = (pb) mVar4;
                pbVar8.E.setTextColor(r3.k.getColor(view.getContext(), R.color.red_FF2525));
                pbVar8.f5754x.setVisibility(8);
                pbVar8.B.setVisibility(8);
                return;
            case 12:
                ((pb) rVar.f17291u).A.setText(str);
                return;
            case 13:
                ((pb) rVar.f17291u).B.setText(str);
                return;
        }
    }

    public final void d(Pair pair) {
        int i10 = this.f36072a;
        r rVar = this.f36073b;
        switch (i10) {
            case 15:
                ChipView chipView = ((pb) rVar.f17291u).J;
                String string = rVar.f22629a.getContext().getResources().getString(((Number) pair.f23353a).intValue());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                chipView.setChipText(string);
                chipView.setChipType((qj.j) pair.f23354b);
                return;
            default:
                ChipView chipView2 = ((pb) rVar.f17291u).f5753w.f4746s;
                chipView2.setChipType((qj.j) pair.f23353a);
                chipView2.setChipTextColor(((Number) pair.f23354b).intValue());
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f36072a;
        r rVar = this.f36073b;
        switch (i10) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                ((pb) rVar.f17291u).F.a((ChangeDto) obj);
                return Unit.f23355a;
            case 3:
                a((String) obj);
                return Unit.f23355a;
            case 4:
                a((String) obj);
                return Unit.f23355a;
            case 5:
                a((String) obj);
                return Unit.f23355a;
            case 6:
                a((String) obj);
                return Unit.f23355a;
            case 7:
                Boolean bool = (Boolean) obj;
                Bought bought = (Bought) ((OrderItemViewModel) rVar.v()).f9075c.getValue();
                if (bought != null) {
                    boolean j10 = s.j((String) ((OrderItemViewModel) rVar.v()).f9901s.getValue(), "pending", true);
                    m4.m mVar = rVar.f17291u;
                    if (j10) {
                        pb pbVar = (pb) mVar;
                        pbVar.f5751u.setVisibility(el.l.u(true));
                        ChipView chipView = pbVar.f5753w.f4746s;
                        Intrinsics.c(bool);
                        chipView.setVisibility(el.l.t(bool.booleanValue()));
                        if (Intrinsics.a(bought.getTradeType(), "SOLD")) {
                            pbVar.f5750t.setVisibility(el.l.t(bool.booleanValue()));
                        } else {
                            pbVar.f5749s.setVisibility(el.l.t(bool.booleanValue()));
                        }
                    } else {
                        pb pbVar2 = (pb) mVar;
                        pbVar2.f5751u.setVisibility(el.l.u(false));
                        pbVar2.f5753w.f4746s.setVisibility(el.l.t(true));
                    }
                }
                return Unit.f23355a;
            case 8:
                a((String) obj);
                return Unit.f23355a;
            case 9:
                a((String) obj);
                return Unit.f23355a;
            case 10:
                a((String) obj);
                return Unit.f23355a;
            case 11:
                a((String) obj);
                return Unit.f23355a;
            case 12:
                a((String) obj);
                return Unit.f23355a;
            case 13:
                a((String) obj);
                return Unit.f23355a;
            case 14:
                a((String) obj);
                return Unit.f23355a;
            case 15:
                d((Pair) obj);
                return Unit.f23355a;
            default:
                d((Pair) obj);
                return Unit.f23355a;
        }
    }
}
