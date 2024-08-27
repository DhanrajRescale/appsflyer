package com.assetgro.stockgro.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/widget/ProgressBarWithCounter;", "Landroid/view/View;", HttpUrl.FRAGMENT_ENCODE_SET, "i", "I", "getMaxValue", "()I", "setMaxValue", "(I)V", "maxValue", "j", "getMinValue", "setMinValue", "minValue", "k", "getCurrentValue", "setCurrentValue", "currentValue", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ProgressBarWithCounter extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f10683a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f10684b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f10685c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f10686d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f10687e;

    /* renamed from: f, reason: collision with root package name */
    public final Path f10688f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f10689g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f10690h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int maxValue;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int minValue;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int currentValue;

    /* renamed from: l, reason: collision with root package name */
    public final float f10694l;

    /* renamed from: m, reason: collision with root package name */
    public final float f10695m;

    /* renamed from: n, reason: collision with root package name */
    public final float f10696n;

    /* renamed from: o, reason: collision with root package name */
    public final float f10697o;

    /* renamed from: p, reason: collision with root package name */
    public final float f10698p;

    /* renamed from: q, reason: collision with root package name */
    public final float f10699q;

    /* renamed from: r, reason: collision with root package name */
    public final float f10700r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f10701s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressBarWithCounter(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#4A20E6"));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f10683a = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setColor(437918234);
        this.f10684b = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setColor(Color.parseColor("#FFCD00"));
        this.f10685c = paint3;
        Paint paint4 = new Paint();
        paint4.setStyle(style);
        paint4.setColor(Color.parseColor("#FFCD00"));
        this.f10686d = paint4;
        Paint paint5 = new Paint();
        paint5.setStyle(style);
        paint5.setColor(Color.parseColor("#FFCD00"));
        this.f10687e = paint5;
        this.f10688f = new Path();
        this.f10689g = new Path();
        Paint paint6 = new Paint();
        paint6.setColor(-16777216);
        paint6.setTextSize(context.getResources().getDisplayMetrics().scaledDensity * 8.0f);
        paint6.setStyle(style);
        paint6.setTextAlign(Paint.Align.CENTER);
        paint6.setTypeface(Typeface.create(HttpUrl.FRAGMENT_ENCODE_SET, 1));
        this.f10690h = paint6;
        this.maxValue = 100;
        this.minValue = 50;
        this.currentValue = 50;
        this.f10694l = getResources().getDisplayMetrics().density * 16.0f;
        this.f10695m = getResources().getDisplayMetrics().density * 40.0f;
        this.f10696n = getResources().getDisplayMetrics().density * 4.0f;
        this.f10697o = getResources().getDisplayMetrics().density * 4.0f;
        this.f10698p = getResources().getDisplayMetrics().density * 6.0f;
        this.f10699q = getResources().getDisplayMetrics().density * 1.0f;
        this.f10700r = getResources().getDisplayMetrics().density * 20.0f;
        this.f10701s = new Rect();
    }

    public final int getCurrentValue() {
        return this.currentValue;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.widget.ProgressBarWithCounter.onDraw(android.graphics.Canvas):void");
    }

    public final void setCurrentValue(int i10) {
        this.currentValue = i10;
    }

    public final void setMaxValue(int i10) {
        this.maxValue = i10;
    }

    public final void setMinValue(int i10) {
        this.minValue = i10;
    }
}
