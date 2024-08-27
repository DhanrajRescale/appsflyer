package com.assetgro.stockgro.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import s0.g;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/assetgro/stockgro/widget/CurveSeekBar;", "Landroidx/appcompat/widget/AppCompatSeekBar;", HttpUrl.FRAGMENT_ENCODE_SET, "d", "I", "getThumbColor", "()I", "setThumbColor", "(I)V", "thumbColor", "e", "getProgressBarColor", "setProgressBarColor", "progressBarColor", "f", "getThumbStrokeColor", "setThumbStrokeColor", "thumbStrokeColor", "g", "getThresholdValue", "setThresholdValue", "thresholdValue", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class CurveSeekBar extends AppCompatSeekBar {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f10610b;

    /* renamed from: c, reason: collision with root package name */
    public final Path f10611c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int thumbColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int progressBarColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int thumbStrokeColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int thresholdValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurveSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.c(context);
        this.f10610b = new Paint(1);
        this.f10611c = new Path();
        this.thumbColor = -1;
        this.progressBarColor = -16777216;
        this.thumbStrokeColor = -16777216;
        this.thresholdValue = 100;
    }

    public final int getProgressBarColor() {
        return this.progressBarColor;
    }

    public final int getThresholdValue() {
        return this.thresholdValue;
    }

    public final int getThumbColor() {
        return this.thumbColor;
    }

    public final int getThumbStrokeColor() {
        return this.thumbStrokeColor;
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float min = ((Math.min(this.thresholdValue, getProgress()) / getMax()) * 0.9f) + 0.05f;
        Path path = this.f10611c;
        path.reset();
        path.moveTo(getWidth() * g.f34069a, getHeight() * 0.35f);
        path.lineTo(getWidth() * (min - 0.05f), getHeight() * 0.35f);
        path.quadTo(getWidth() * min, getHeight() * 0.15f, getWidth() * (0.05f + min), getHeight() * 0.35f);
        path.lineTo(getWidth() * 1.0f, getHeight() * 0.35f);
        Paint paint = this.f10610b;
        paint.setColor(this.progressBarColor);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        canvas.drawPath(path, paint);
        setProgressDrawable(null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.thumbColor);
        gradientDrawable.setShape(1);
        int height = (int) (getHeight() * 0.3f);
        if (getProgress() > this.thresholdValue) {
            int i10 = height / 2;
            gradientDrawable.setSize(i10, i10);
        } else {
            gradientDrawable.setSize(height, height);
        }
        gradientDrawable.setStroke(2, this.thumbStrokeColor);
        setThumb(gradientDrawable);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure((int) (i10 * 0.6d), i11);
    }

    public final void setProgressBarColor(int i10) {
        this.progressBarColor = i10;
    }

    public final void setThresholdValue(int i10) {
        this.thresholdValue = i10;
    }

    public final void setThumbColor(int i10) {
        this.thumbColor = i10;
    }

    public final void setThumbStrokeColor(int i10) {
        this.thumbStrokeColor = i10;
    }
}
