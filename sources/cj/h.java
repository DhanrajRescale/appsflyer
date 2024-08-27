package cj;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import hv.q;
import hv.t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends tm.h {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8172d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, boolean z10) {
        super(context, R.layout.marker_stock_chart);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8172d = z10;
    }

    @Override // tm.d
    public final void b(um.i e10, wm.c highlight) {
        String a10;
        Intrinsics.checkNotNullParameter(e10, "e");
        Intrinsics.checkNotNullParameter(highlight, "highlight");
        ((TextView) findViewById(R.id.y_axis)).setText(String.valueOf(e10.a()));
        TextView textView = (TextView) findViewById(R.id.x_axis);
        if (this.f8172d) {
            long b10 = e10.b();
            jv.a b11 = jv.a.b("hh:mm");
            Intrinsics.checkNotNullExpressionValue(b11, "ofPattern(...)");
            hv.e l10 = hv.e.l(0, b10);
            q p10 = q.p();
            l10.getClass();
            a10 = b11.a(t.p(l10, p10));
            Intrinsics.checkNotNullExpressionValue(a10, "format(...)");
        } else {
            long b12 = e10.b();
            jv.a b13 = jv.a.b("dd/M");
            Intrinsics.checkNotNullExpressionValue(b13, "ofPattern(...)");
            hv.e l11 = hv.e.l(0, b12);
            q p11 = q.p();
            l11.getClass();
            a10 = b13.a(t.p(l11, p11));
            Intrinsics.checkNotNullExpressionValue(a10, "format(...)");
        }
        textView.setText(a10);
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
