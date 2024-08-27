package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import bn.c;
import bn.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import sm.a;
import um.j;
import xm.d;

/* loaded from: classes2.dex */
public class LineChart extends a implements d {
    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // xm.d
    public j getLineData() {
        return (j) this.f34696b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bn.h, bn.g, bn.d, bn.c] */
    @Override // sm.a, sm.b
    public final void h() {
        super.h();
        ?? cVar = new c(this.f34714t, this.f34713s);
        cVar.f7172h = new Path();
        cVar.f7165m = Bitmap.Config.ARGB_8888;
        cVar.f7166n = new Path();
        cVar.f7167o = new Path();
        cVar.f7168p = new float[4];
        cVar.f7169q = new Path();
        cVar.f7170r = new HashMap();
        cVar.f7171s = new float[2];
        cVar.f7161i = this;
        Paint paint = new Paint(1);
        cVar.f7162j = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.f34711q = cVar;
    }

    @Override // sm.b, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        bn.d dVar = this.f34711q;
        if (dVar != null && (dVar instanceof g)) {
            g gVar = (g) dVar;
            Canvas canvas = gVar.f7164l;
            if (canvas != null) {
                canvas.setBitmap(null);
                gVar.f7164l = null;
            }
            WeakReference weakReference = gVar.f7163k;
            if (weakReference != null) {
                Bitmap bitmap = (Bitmap) weakReference.get();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                gVar.f7163k.clear();
                gVar.f7163k = null;
            }
        }
        super.onDetachedFromWindow();
    }
}
