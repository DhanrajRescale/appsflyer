package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import d4.n1;
import k4.b;
import m.b0;
import mo.a;
import x7.e;

/* loaded from: classes2.dex */
public class CheckableImageButton extends b0 implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f11385g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f11386d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11387e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11388f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.assetgro.stockgro.prod.R.attr.imageButtonStyle);
        this.f11387e = true;
        this.f11388f = true;
        n1.n(this, new e(this, 3));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f11386d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.f11386d) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f11385g);
        }
        return super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f22040a);
        setChecked(aVar.f27858c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, mo.a, k4.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        bVar.f27858c = this.f11386d;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f11387e != z10) {
            this.f11387e = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f11387e && this.f11386d != z10) {
            this.f11386d = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z10) {
        this.f11388f = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f11388f) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f11386d);
    }
}
