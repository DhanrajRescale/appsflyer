package com.webengage.sdk.android.utils.htmlspanner.m;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;
import com.webengage.sdk.android.utils.htmlspanner.n.c;

/* loaded from: classes2.dex */
public class f implements LineBackgroundSpan {

    /* renamed from: a, reason: collision with root package name */
    private int f12861a;

    /* renamed from: b, reason: collision with root package name */
    private int f12862b;

    /* renamed from: c, reason: collision with root package name */
    private com.webengage.sdk.android.utils.htmlspanner.n.a f12863c;

    public f(com.webengage.sdk.android.utils.htmlspanner.n.a aVar, int i10, int i11) {
        this.f12861a = i10;
        this.f12862b = i11;
        this.f12863c = aVar;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, int i17) {
        int i18 = 0;
        if (this.f12863c.m() != null) {
            com.webengage.sdk.android.utils.htmlspanner.n.c m10 = this.f12863c.m();
            if (m10.c() == c.a.PX) {
                if (m10.b() > 0) {
                    i18 = m10.b();
                }
            } else if (m10.a() > s0.g.f34069a) {
                i18 = (int) (m10.a() * 10.0f);
            }
            i18--;
        }
        int i19 = i18 > 0 ? i10 + i18 : i10;
        int color = paint.getColor();
        float strokeWidth = paint.getStrokeWidth();
        paint.setColor(Color.parseColor("#000000"));
        if (this.f12863c.b() != null) {
            paint.setColor(this.f12863c.b().intValue());
        }
        paint.setStrokeWidth((this.f12863c.d() == null || this.f12863c.d().c() != c.a.PX) ? 1 : this.f12863c.d().b());
        paint.setStyle(Paint.Style.STROKE);
        float f10 = (i14 + i12) / 2;
        canvas.drawLine(i19, f10, i11 - r5, f10, paint);
        paint.setColor(color);
        paint.setStrokeWidth(strokeWidth);
    }
}
