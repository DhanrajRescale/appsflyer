package zg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba.qd;
import com.assetgro.stockgro.prod.R;
import el.l;
import iu.k;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f42446b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i10) {
        super(1);
        this.f42445a = i10;
        this.f42446b = cVar;
    }

    public final void a(String str) {
        int i10 = this.f42445a;
        c cVar = this.f42446b;
        switch (i10) {
            case 0:
                ((qd) cVar.f17291u).f5846t.setText(str);
                return;
            case 1:
                ((qd) cVar.f17291u).f5849w.setText(str);
                return;
            case 2:
                TextView textView = ((qd) cVar.f17291u).f5847u;
                String string = textView.getResources().getString(R.string.valid_till);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                textView.setText(String.valueOf(format));
                return;
            case 3:
            default:
                TextView textView2 = ((qd) cVar.f17291u).f5850x;
                String string2 = textView2.getResources().getString(R.string.price_per_day);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                textView2.setText(format2);
                return;
            case 4:
                TextView textView3 = ((qd) cVar.f17291u).f5851y;
                String string3 = textView3.getResources().getString(R.string.save_text);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                textView3.setText(a3.a.m(new Object[]{str}, 1, string3, "format(...)") + "%");
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f42445a;
        c cVar = this.f42446b;
        switch (i10) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            case 2:
                a((String) obj);
                return Unit.f23355a;
            case 3:
                Boolean bool = (Boolean) obj;
                LinearLayout linearLayout = ((qd) cVar.f17291u).f5848v;
                Intrinsics.c(bool);
                linearLayout.setVisibility(l.u(bool.booleanValue()));
                return Unit.f23355a;
            case 4:
                a((String) obj);
                return Unit.f23355a;
            case 5:
                a((String) obj);
                return Unit.f23355a;
            default:
                Integer num = (Integer) obj;
                ConstraintLayout constraintLayout = ((qd) cVar.f17291u).f5845s;
                Context context = constraintLayout.getContext();
                Intrinsics.c(num);
                constraintLayout.setBackgroundColor(r3.k.getColor(context, num.intValue()));
                return Unit.f23355a;
        }
    }
}
