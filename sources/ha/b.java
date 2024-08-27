package ha;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.assetgro.stockgro.feature_market.domain.model.BEChartData;
import com.assetgro.stockgro.feature_market.domain.model.BreakEvenChartInputData;
import com.assetgro.stockgro.prod.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b extends tm.h {

    /* renamed from: d, reason: collision with root package name */
    public final BreakEvenChartInputData f18065d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18066e;

    /* renamed from: f, reason: collision with root package name */
    public final float f18067f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f18068g;

    /* renamed from: h, reason: collision with root package name */
    public final TextPaint f18069h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f18070i;

    /* renamed from: j, reason: collision with root package name */
    public final float f18071j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, BreakEvenChartInputData inputData) {
        super(context, R.layout.layout_break_even_marker);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f18065d = inputData;
        this.f18066e = b.class.getSimpleName();
        this.f18067f = 8.0f;
        Paint paint = new Paint();
        this.f18068g = paint;
        TextPaint textPaint = new TextPaint();
        this.f18069h = textPaint;
        Typeface a10 = t3.p.a(R.font.inter_400, context);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        textPaint.setColor(-16777216);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(25.0f);
        textPaint.setTypeface(a10);
        this.f18070i = (TextView) findViewById(R.id.marker_view);
        this.f18071j = 20 * Resources.getSystem().getDisplayMetrics().density;
    }

    @Override // tm.h, tm.d
    public final void a(Canvas canvas, float f10, float f11) {
        boolean z10;
        int i10;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String spannableStringBuilder;
        String str = this.f18066e;
        Log.d(str, "Draw method called");
        float height = getChartView().getHeight() / 2.0f;
        Log.d(str, "X = " + f10 + " Y = " + f11 + " centre = " + height);
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f11));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        boolean z11 = false;
        if (bigDecimal.setScale(2, roundingMode).floatValue() < height) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (new BigDecimal(String.valueOf(f11)).setScale(2, roundingMode).floatValue() > height) {
            z11 = true;
        }
        Paint paint = this.f18068g;
        if (z10) {
            i10 = Color.rgb(25, 165, 116);
        } else if (z11) {
            i10 = Color.rgb(231, 56, 23);
        } else {
            i10 = -16777216;
        }
        paint.setColor(i10);
        if (canvas != null) {
            canvas.drawCircle(f10, f11, this.f18067f, paint);
        }
        TextView textView = this.f18070i;
        SpannableStringBuilder spannableStringBuilder2 = null;
        if (textView != null) {
            charSequence = textView.getText();
        } else {
            charSequence = null;
        }
        if (textView != null) {
            charSequence2 = textView.getText();
        } else {
            charSequence2 = null;
        }
        if (charSequence2 instanceof SpannableStringBuilder) {
            spannableStringBuilder2 = (SpannableStringBuilder) charSequence2;
        }
        if (spannableStringBuilder2 != null && (spannableStringBuilder = spannableStringBuilder2.toString()) != null) {
            charSequence3 = spannableStringBuilder;
        } else {
            charSequence3 = charSequence;
        }
        TextPaint textPaint = this.f18069h;
        float measureText = textPaint.measureText(String.valueOf(charSequence3));
        float width = getChartView().getWidth();
        float f12 = f10 + measureText;
        float f13 = this.f18071j;
        if (f12 > width - f13) {
            f10 = (width - measureText) - f13;
        }
        if (canvas != null) {
            StaticLayout staticLayout = new StaticLayout(charSequence3, textPaint, canvas.getWidth(), Layout.Alignment.ALIGN_NORMAL, 3.0f, 30.0f, true);
            canvas.translate(f10, -10.0f);
            staticLayout.draw(canvas);
        }
        invalidate();
    }

    @Override // tm.d
    public final void b(um.i iVar, wm.c cVar) {
        String str;
        TextView textView = this.f18070i;
        Object obj = getChartView().getData().f37256i.get(0);
        Intrinsics.d(obj, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        List list = ((um.k) obj).f37272p;
        Intrinsics.checkNotNullExpressionValue(list, "getValues(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (Intrinsics.a((um.i) obj2, iVar)) {
                arrayList.add(obj2);
            }
        }
        Object obj3 = getChartView().getData().f37256i.get(1);
        Intrinsics.d(obj3, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        List list2 = ((um.k) obj3).f37272p;
        Intrinsics.checkNotNullExpressionValue(list2, "getValues(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : list2) {
            if (Intrinsics.a((um.i) obj4, iVar)) {
                arrayList2.add(obj4);
            }
        }
        Object obj5 = getChartView().getData().f37256i.get(3);
        Intrinsics.d(obj5, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        List list3 = ((um.k) obj5).f37272p;
        Intrinsics.checkNotNullExpressionValue(list3, "getValues(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Object obj6 : list3) {
            if (Intrinsics.a((um.i) obj6, iVar)) {
                arrayList3.add(obj6);
            }
        }
        Object obj7 = getChartView().getData().f37256i.get(2);
        Intrinsics.d(obj7, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        List list4 = ((um.k) obj7).f37272p;
        Intrinsics.checkNotNullExpressionValue(list4, "getValues(...)");
        ArrayList arrayList4 = new ArrayList();
        for (Object obj8 : list4) {
            if (Intrinsics.a((um.i) obj8, iVar)) {
                arrayList4.add(obj8);
            }
        }
        if (!arrayList.isEmpty()) {
            Object obj9 = ((um.i) arrayList.get(0)).f37247b;
            Intrinsics.d(obj9, "null cannot be cast to non-null type com.assetgro.stockgro.feature_market.domain.model.BEChartData");
            str = String.valueOf(el.l.E0(2, ((BEChartData) obj9).getItemValue()));
        } else if (!arrayList2.isEmpty()) {
            Object obj10 = ((um.i) arrayList2.get(0)).f37247b;
            Intrinsics.d(obj10, "null cannot be cast to non-null type com.assetgro.stockgro.feature_market.domain.model.BEChartData");
            str = String.valueOf(el.l.E0(2, ((BEChartData) obj10).getItemValue()));
        } else if (!arrayList3.isEmpty()) {
            Object obj11 = ((um.i) arrayList3.get(0)).f37247b;
            Intrinsics.d(obj11, "null cannot be cast to non-null type com.assetgro.stockgro.feature_market.domain.model.BEChartData");
            str = String.valueOf(el.l.E0(2, ((BEChartData) obj11).getItemValue()));
        } else if (!arrayList4.isEmpty()) {
            Object obj12 = ((um.i) arrayList4.get(0)).f37247b;
            Intrinsics.d(obj12, "null cannot be cast to non-null type com.assetgro.stockgro.feature_market.domain.model.BEChartData");
            str = String.valueOf(el.l.E0(2, ((BEChartData) obj12).getItemValue()));
        } else {
            str = "0";
        }
        Log.d(this.f18066e, a3.a.f("plotted value text = ", str));
        double parseFloat = Float.parseFloat(str);
        BreakEvenChartInputData breakEvenChartInputData = this.f18065d;
        double E0 = el.l.E0(2, ((parseFloat - breakEvenChartInputData.getParentStockPrice()) / breakEvenChartInputData.getParentStockPrice()) * 100);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, str.length(), 18);
        if (textView != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(textView.getContext().getString(R.string.formatted_marker_text, breakEvenChartInputData.getOptionName(), spannableStringBuilder, String.valueOf(E0)));
            String spannableStringBuilder3 = spannableStringBuilder.toString();
            Intrinsics.checkNotNullExpressionValue(spannableStringBuilder3, "toString(...)");
            int A = kotlin.text.w.A(spannableStringBuilder2, spannableStringBuilder3, 0, false, 6);
            if (A != -1) {
                spannableStringBuilder2.setSpan(new StyleSpan(1), A, spannableStringBuilder.length() + A, 33);
            }
            textView.setText(spannableStringBuilder2);
            textView.setTextColor(-16777216);
            textView.setVisibility(0);
        }
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // tm.h
    @NotNull
    public cn.d getOffset() {
        if (getOffset() == null) {
            setOffset(new cn.d((-getWidth()) / 2, -getHeight()));
        }
        cn.d offset = getOffset();
        Intrinsics.d(offset, "null cannot be cast to non-null type com.github.mikephil.charting.utils.MPPointF");
        return offset;
    }
}
