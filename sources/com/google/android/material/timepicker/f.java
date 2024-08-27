package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.prod.R;
import d4.n1;
import d4.v0;
import d4.w0;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class f extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final e f11552s;

    /* renamed from: t, reason: collision with root package name */
    public int f11553t;

    /* renamed from: u, reason: collision with root package name */
    public final to.h f11554u;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.e] */
    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        to.h hVar = new to.h();
        this.f11554u = hVar;
        to.j jVar = new to.j(0.5f);
        in.i f10 = hVar.f36253a.f36231a.f();
        f10.f20166e = jVar;
        f10.f20167f = jVar;
        f10.f20168g = jVar;
        f10.f20169h = jVar;
        hVar.setShapeAppearanceModel(f10.a());
        this.f11554u.n(ColorStateList.valueOf(-1));
        to.h hVar2 = this.f11554u;
        WeakHashMap weakHashMap = n1.f13788a;
        v0.q(this, hVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, un.a.K, R.attr.materialClockStyle, 0);
        this.f11553t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f11552s = new Runnable() { // from class: com.google.android.material.timepicker.e
            @Override // java.lang.Runnable
            public final void run() {
                f.this.m();
            }
        };
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = n1.f13788a;
            view.setId(w0.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f11552s;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f11552s;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.f11554u.n(ColorStateList.valueOf(i10));
    }
}
