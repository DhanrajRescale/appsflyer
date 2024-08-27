package com.kaopiz.kprogresshud;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes2.dex */
class BackgroundLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public float f12038a;

    /* renamed from: b, reason: collision with root package name */
    public int f12039b;

    public BackgroundLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(getContext().getResources().getColor(R.color.kprogresshud_default_color), this.f12038a);
    }

    public final void a(int i10, float f10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(f10);
        setBackground(gradientDrawable);
    }
}
