package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import h.c;
import un.a;

/* loaded from: classes2.dex */
public class TabItem extends View {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f11436a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f11437b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11438c;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c cVar = new c(context, context.obtainStyledAttributes(attributeSet, a.S));
        this.f11436a = cVar.F(2);
        this.f11437b = cVar.v(0);
        this.f11438c = cVar.C(1, 0);
        cVar.R();
    }
}
