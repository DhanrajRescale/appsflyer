package com.kaopiz.kprogresshud;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes2.dex */
public final class a extends View implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12040a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f12041b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f12042c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f12043d;

    /* renamed from: e, reason: collision with root package name */
    public int f12044e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i10) {
        super(context);
        this.f12040a = i10;
        if (i10 != 1) {
            this.f12044e = 100;
            Paint paint = new Paint(1);
            this.f12041b = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            this.f12041b.setStrokeWidth(yk.g.r(3.0f, getContext()));
            this.f12041b.setColor(-1);
            Paint paint2 = new Paint(1);
            this.f12042c = paint2;
            paint2.setStyle(style);
            this.f12042c.setStrokeWidth(yk.g.r(3.0f, getContext()));
            this.f12042c.setColor(context.getResources().getColor(R.color.kprogresshud_grey_color));
            this.f12043d = new RectF();
            return;
        }
        super(context);
        this.f12044e = 100;
        Paint paint3 = new Paint(1);
        this.f12041b = paint3;
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f12041b.setStrokeWidth(yk.g.r(0.1f, getContext()));
        this.f12041b.setColor(-1);
        Paint paint4 = new Paint(1);
        this.f12042c = paint4;
        paint4.setStyle(Paint.Style.STROKE);
        this.f12042c.setStrokeWidth(yk.g.r(2.0f, getContext()));
        this.f12042c.setColor(-1);
        this.f12043d = new RectF();
    }

    @Override // com.kaopiz.kprogresshud.c
    public final void a() {
        switch (this.f12040a) {
            case 0:
                this.f12044e = 0;
                return;
            default:
                this.f12044e = 0;
                return;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.f12040a) {
            case 0:
                super.onDraw(canvas);
                float f10 = (0 * 360.0f) / this.f12044e;
                canvas.drawArc(this.f12043d, 270.0f, f10, false, this.f12041b);
                canvas.drawArc(this.f12043d, f10 + 270.0f, 360.0f - f10, false, this.f12042c);
                return;
            default:
                super.onDraw(canvas);
                canvas.drawArc(this.f12043d, 270.0f, (0 * 360.0f) / this.f12044e, true, this.f12041b);
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, (getWidth() / 2) - yk.g.r(4.0f, getContext()), this.f12042c);
                return;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.f12040a) {
            case 0:
                super.onMeasure(i10, i11);
                int r10 = yk.g.r(40.0f, getContext());
                setMeasuredDimension(r10, r10);
                return;
            default:
                super.onMeasure(i10, i11);
                int r11 = yk.g.r(40.0f, getContext());
                setMeasuredDimension(r11, r11);
                return;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f12040a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                float r10 = yk.g.r(4.0f, getContext());
                this.f12043d.set(r10, r10, i10 - r5, i11 - r5);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                float r11 = yk.g.r(4.0f, getContext());
                this.f12043d.set(r11, r11, i10 - r5, i11 - r5);
                return;
        }
    }
}
