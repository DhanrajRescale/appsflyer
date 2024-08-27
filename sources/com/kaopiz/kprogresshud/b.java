package com.kaopiz.kprogresshud;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes2.dex */
public final class b extends View implements c {

    /* renamed from: a, reason: collision with root package name */
    public Paint f12045a;

    /* renamed from: b, reason: collision with root package name */
    public Paint f12046b;

    /* renamed from: c, reason: collision with root package name */
    public RectF f12047c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f12048d;

    /* renamed from: e, reason: collision with root package name */
    public int f12049e;

    /* renamed from: f, reason: collision with root package name */
    public float f12050f;

    @Override // com.kaopiz.kprogresshud.c
    public final void a() {
        this.f12049e = 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f12047c;
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f12047c.height() / 2.0f, this.f12045a);
        RectF rectF2 = this.f12048d;
        canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, this.f12048d.height() / 2.0f, this.f12046b);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(yk.g.r(100.0f, getContext()), yk.g.r(20.0f, getContext()));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float r10 = yk.g.r(2.0f, getContext());
        this.f12047c.set(r10, r10, i10 - r4, i11 - r4);
    }
}
