package com.mixpanel.android.takeoverinapp;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class MiniCircleImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f12115a;

    public MiniCircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f12115a = paint;
        paint.setColor(getResources().getColor(R.color.white, null));
        this.f12115a.setStyle(Paint.Style.STROKE);
        this.f12115a.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }
}
