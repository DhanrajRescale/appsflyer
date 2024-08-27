package com.kaopiz.kprogresshud;

import android.graphics.Canvas;
import android.widget.ImageView;
import h.q0;

/* loaded from: classes2.dex */
public final class g extends ImageView implements d {

    /* renamed from: a, reason: collision with root package name */
    public float f12069a;

    /* renamed from: b, reason: collision with root package name */
    public int f12070b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12071c;

    /* renamed from: d, reason: collision with root package name */
    public q0 f12072d;

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12071c = true;
        post(this.f12072d);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.f12071c = false;
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.rotate(this.f12069a, getWidth() / 2, getHeight() / 2);
        super.onDraw(canvas);
    }
}
