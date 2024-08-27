package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import c2.p;
import com.assetgro.stockgro.prod.R;
import d4.b1;
import d4.n1;
import d4.v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import l.o;
import mo.c0;
import to.h;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: t0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f11129t0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: o0, reason: collision with root package name */
    public Integer f11130o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f11131p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f11132q0;

    /* renamed from: r0, reason: collision with root package name */
    public ImageView.ScaleType f11133r0;

    /* renamed from: s0, reason: collision with root package name */
    public Boolean f11134s0;

    public MaterialToolbar(@NonNull Context context, AttributeSet attributeSet) {
        super(ap.a.a(context, attributeSet, R.attr.toolbarStyle, 2132083986), attributeSet, 0);
        Context context2 = getContext();
        TypedArray f10 = c0.f(context2, attributeSet, un.a.G, R.attr.toolbarStyle, 2132083986, new int[0]);
        if (f10.hasValue(2)) {
            setNavigationIconTint(f10.getColor(2, -1));
        }
        this.f11131p0 = f10.getBoolean(4, false);
        this.f11132q0 = f10.getBoolean(3, false);
        int i10 = f10.getInt(1, -1);
        if (i10 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f11129t0;
            if (i10 < scaleTypeArr.length) {
                this.f11133r0 = scaleTypeArr[i10];
            }
        }
        if (f10.hasValue(0)) {
            this.f11134s0 = Boolean.valueOf(f10.getBoolean(0, false));
        }
        f10.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            h hVar = new h();
            hVar.n(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            hVar.k(context2);
            WeakHashMap weakHashMap = n1.f13788a;
            hVar.m(b1.i(this));
            v0.q(this, hVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f11133r0;
    }

    public Integer getNavigationIconTint() {
        return this.f11130o0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void n(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof o;
        if (z10) {
            ((o) menu).z();
        }
        super.n(i10);
        if (z10) {
            ((o) menu).y();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dp.b.K1(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        ImageView imageView2 = null;
        if (this.f11131p0 || this.f11132q0) {
            ArrayList e10 = c0.e(this, getTitle());
            boolean isEmpty = e10.isEmpty();
            p pVar = c0.f27905c;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(e10, pVar);
            }
            ArrayList e11 = c0.e(this, getSubtitle());
            if (e11.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(e11, pVar);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i15 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i15 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i15 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f11131p0 && textView != null) {
                    y(textView, pair);
                }
                if (this.f11132q0 && textView2 != null) {
                    y(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i14 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i14);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i14++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f11134s0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f11133r0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        dp.b.I1(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f11134s0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f11134s0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.f11133r0 != scaleType) {
            this.f11133r0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f11130o0 != null) {
            drawable = drawable.mutate();
            v3.b.g(drawable, this.f11130o0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f11130o0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f11132q0 != z10) {
            this.f11132q0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f11131p0 != z10) {
            this.f11131p0 = z10;
            requestLayout();
        }
    }

    public final void y(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }
}
