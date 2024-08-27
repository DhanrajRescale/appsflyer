package oa;

import android.widget.TextView;
import ba.q7;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.widget.StockChangeInfoView;
import com.bumptech.glide.g;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zq.f;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f29869b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i10) {
        super(1);
        this.f29868a = i10;
        this.f29869b = cVar;
    }

    public final void a(String str) {
        int i10 = this.f29868a;
        c cVar = this.f29869b;
        switch (i10) {
            case 0:
                ((q7) cVar.f17291u).f5839u.setText(str);
                return;
            case 1:
                if (str != null && !cVar.f29871x) {
                    q7 q7Var = (q7) cVar.f17291u;
                    q7Var.f5840v.setText(str);
                    TextView price = q7Var.f5840v;
                    Intrinsics.checkNotNullExpressionValue(price, "price");
                    f.m0(price);
                    return;
                }
                TextView price2 = ((q7) cVar.f17291u).f5840v;
                Intrinsics.checkNotNullExpressionValue(price2, "price");
                Intrinsics.checkNotNullParameter(price2, "<this>");
                price2.setVisibility(4);
                return;
            default:
                ((g) ((g) com.bumptech.glide.b.e(cVar.f22629a.getContext()).m(str).e()).i()).z(((q7) cVar.f17291u).f5838t);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f29868a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                c cVar = this.f29869b;
                StockChangeInfoView changeInfoView = ((q7) cVar.f17291u).f5837s;
                Intrinsics.checkNotNullExpressionValue(changeInfoView, "changeInfoView");
                int i10 = StockChangeInfoView.f10739b;
                changeInfoView.c((ChangeDto) obj, cVar.f29871x, false);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
