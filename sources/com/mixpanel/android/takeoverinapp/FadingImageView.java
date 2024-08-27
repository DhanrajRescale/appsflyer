package com.mixpanel.android.takeoverinapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.ImageView;
import s0.g;

/* loaded from: classes2.dex */
public class FadingImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f12113a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f12114b;

    public FadingImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Matrix();
        this.f12113a = new Paint();
        float[] fArr = {g.f34069a, 0.2f, 0.4f, 1.0f};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f12113a.setShader(new LinearGradient(g.f34069a, g.f34069a, g.f34069a, 1.0f, new int[]{-16777216, -16777216, -452984832, 0}, fArr, tileMode));
        Paint paint = this.f12113a;
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        paint.setXfermode(new PorterDuffXfermode(mode));
        this.f12114b = new Paint();
        this.f12114b.setShader(new LinearGradient(g.f34069a, g.f34069a, g.f34069a, 1.0f, new int[]{0, 0, -16777216, -16777216}, new float[]{g.f34069a, 0.85f, 0.98f, 1.0f}, tileMode));
        this.f12113a.setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }
}
