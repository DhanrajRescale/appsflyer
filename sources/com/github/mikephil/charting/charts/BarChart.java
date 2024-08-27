package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import java.util.List;
import s0.g;
import sm.a;
import tm.i;
import wm.b;
import wm.c;

/* loaded from: classes2.dex */
public class BarChart extends a implements xm.a {
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D0 = false;
        this.E0 = true;
        this.F0 = false;
        this.G0 = false;
    }

    @Override // sm.b
    public final c e(float f10, float f11) {
        if (this.f34696b == null) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        c f12 = getHighlighter().f(f10, f11);
        if (f12 != null && this.D0) {
            return new c(f12.f39307a, f12.f39308b, f12.f39309c, f12.f39310d, f12.f39311e, f12.f39313g, 0);
        }
        return f12;
    }

    @Override // xm.a
    public um.a getBarData() {
        return (um.a) this.f34696b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bn.d, bn.b, bn.c] */
    @Override // sm.a, sm.b
    public final void h() {
        super.h();
        ?? cVar = new bn.c(this.f34714t, this.f34713s);
        cVar.f7142i = new RectF();
        cVar.f7146m = new RectF();
        cVar.f7141h = this;
        Paint paint = new Paint(1);
        cVar.f7150e = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        cVar.f7150e.setColor(Color.rgb(0, 0, 0));
        cVar.f7150e.setAlpha(120);
        Paint paint2 = new Paint(1);
        cVar.f7144k = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        cVar.f7145l = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.f34711q = cVar;
        setHighlighter(new b(this));
        getXAxis().f36179z = 0.5f;
        getXAxis().A = 0.5f;
    }

    @Override // sm.a
    public final void l() {
        if (this.G0) {
            i iVar = this.f34703i;
            um.a aVar = (um.a) this.f34696b;
            float f10 = aVar.f37251d;
            float f11 = aVar.f37239j;
            iVar.b(f10 - (f11 / 2.0f), (f11 / 2.0f) + aVar.f37250c);
        } else {
            i iVar2 = this.f34703i;
            um.a aVar2 = (um.a) this.f34696b;
            iVar2.b(aVar2.f37251d, aVar2.f37250c);
        }
        this.f34684p0.b(((um.a) this.f34696b).h(1), ((um.a) this.f34696b).g(1));
        this.f34685q0.b(((um.a) this.f34696b).h(2), ((um.a) this.f34696b).g(2));
    }

    public final void o(float f10) {
        um.c cVar;
        if (getBarData() != null) {
            um.a barData = getBarData();
            List<um.b> list = barData.f37256i;
            if (list.size() > 1) {
                int size = ((um.b) barData.f()).f37272p.size();
                float f11 = f10 / 2.0f;
                float f12 = barData.f37239j / 2.0f;
                float size2 = ((barData.f37239j + 0.06f) * barData.f37256i.size()) + f10;
                float f13 = 0.5f;
                for (int i10 = 0; i10 < size; i10++) {
                    float f14 = f13 + f11;
                    for (um.b bVar : list) {
                        float f15 = f14 + 0.03f + f12;
                        if (i10 < bVar.f37272p.size() && (cVar = (um.c) bVar.g(i10)) != null) {
                            cVar.f37277c = f15;
                        }
                        f14 = f15 + f12 + 0.03f;
                    }
                    float f16 = f14 + f11;
                    float f17 = size2 - (f16 - f13);
                    if (f17 > g.f34069a || f17 < g.f34069a) {
                        f16 += f17;
                    }
                    f13 = f16;
                }
                barData.a();
                i();
                return;
            }
            throw new RuntimeException("BarData needs to hold at least 2 BarDataSets to allow grouping.");
        }
        throw new RuntimeException("You need to set data for the chart before grouping bars.");
    }

    public void setDrawBarShadow(boolean z10) {
        this.F0 = z10;
    }

    public void setDrawValueAboveBar(boolean z10) {
        this.E0 = z10;
    }

    public void setFitBars(boolean z10) {
        this.G0 = z10;
    }

    public void setHighlightFullBarEnabled(boolean z10) {
        this.D0 = z10;
    }
}
