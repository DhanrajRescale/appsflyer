package com.google.android.material.navigation;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import d4.n1;
import d4.w0;
import dp.b;
import h.c;
import in.i;
import java.util.WeakHashMap;
import k.j;
import l.e;
import l.q;
import mo.h;
import mo.s;
import mo.v;
import no.m;
import r3.k;
import s0.g;
import to.a;
import to.l;
import to.n;

/* loaded from: classes2.dex */
public class NavigationView extends v {

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f11395t = {R.attr.state_checked};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f11396u = {-16842910};

    /* renamed from: h, reason: collision with root package name */
    public final h f11397h;

    /* renamed from: i, reason: collision with root package name */
    public final s f11398i;

    /* renamed from: j, reason: collision with root package name */
    public final int f11399j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f11400k;

    /* renamed from: l, reason: collision with root package name */
    public j f11401l;

    /* renamed from: m, reason: collision with root package name */
    public final e f11402m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11403n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11404o;

    /* renamed from: p, reason: collision with root package name */
    public final int f11405p;

    /* renamed from: q, reason: collision with root package name */
    public final int f11406q;

    /* renamed from: r, reason: collision with root package name */
    public Path f11407r;

    /* renamed from: s, reason: collision with root package name */
    public final RectF f11408s;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.Menu, l.o, mo.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NavigationView(@androidx.annotation.NonNull android.content.Context r19, android.util.AttributeSet r20) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.f11401l == null) {
            this.f11401l = new j(getContext());
        }
        return this.f11401l;
    }

    public final ColorStateList a(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = k.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.assetgro.stockgro.prod.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f11396u;
        return new ColorStateList(new int[][]{iArr, f11395t, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public final InsetDrawable b(c cVar, ColorStateList colorStateList) {
        to.h hVar = new to.h(l.a(getContext(), cVar.C(17, 0), cVar.C(18, 0)).a());
        hVar.n(colorStateList);
        return new InsetDrawable((Drawable) hVar, cVar.u(22, 0), cVar.u(23, 0), cVar.u(21, 0), cVar.u(20, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f11407r == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f11407r);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public MenuItem getCheckedItem() {
        return this.f11398i.f27933e.f27921e;
    }

    public int getDividerInsetEnd() {
        return this.f11398i.f27947s;
    }

    public int getDividerInsetStart() {
        return this.f11398i.f27946r;
    }

    public int getHeaderCount() {
        return this.f11398i.f27930b.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f11398i.f27940l;
    }

    public int getItemHorizontalPadding() {
        return this.f11398i.f27942n;
    }

    public int getItemIconPadding() {
        return this.f11398i.f27944p;
    }

    public ColorStateList getItemIconTintList() {
        return this.f11398i.f27939k;
    }

    public int getItemMaxLines() {
        return this.f11398i.f27952x;
    }

    public ColorStateList getItemTextColor() {
        return this.f11398i.f27938j;
    }

    public int getItemVerticalPadding() {
        return this.f11398i.f27943o;
    }

    @NonNull
    public Menu getMenu() {
        return this.f11397h;
    }

    public int getSubheaderInsetEnd() {
        return this.f11398i.f27949u;
    }

    public int getSubheaderInsetStart() {
        return this.f11398i.f27948t;
    }

    @Override // mo.v, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.K1(this);
    }

    @Override // mo.v, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f11402m);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = this.f11399j;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i10 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            }
        } else {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), i12), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.f22040a);
        this.f11397h.t(mVar.f29069c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [no.m, android.os.Parcelable, k4.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new k4.b(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        bVar.f29069c = bundle;
        this.f11397h.v(bundle);
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        boolean z10 = getParent() instanceof DrawerLayout;
        RectF rectF = this.f11408s;
        if (z10 && (i14 = this.f11406q) > 0 && (getBackground() instanceof to.h)) {
            to.h hVar = (to.h) getBackground();
            i f10 = hVar.f36253a.f36231a.f();
            WeakHashMap weakHashMap = n1.f13788a;
            if (Gravity.getAbsoluteGravity(this.f11405p, w0.d(this)) == 3) {
                float f11 = i14;
                f10.f20167f = new a(f11);
                f10.f20168g = new a(f11);
            } else {
                float f12 = i14;
                f10.f20166e = new a(f12);
                f10.f20169h = new a(f12);
            }
            hVar.setShapeAppearanceModel(f10.a());
            if (this.f11407r == null) {
                this.f11407r = new Path();
            }
            this.f11407r.reset();
            rectF.set(g.f34069a, g.f34069a, i10, i11);
            n nVar = to.m.f36291a;
            to.g gVar = hVar.f36253a;
            nVar.a(gVar.f36231a, gVar.f36240j, rectF, null, this.f11407r);
            invalidate();
            return;
        }
        this.f11407r = null;
        rectF.setEmpty();
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.f11404o = z10;
    }

    public void setCheckedItem(int i10) {
        MenuItem findItem = this.f11397h.findItem(i10);
        if (findItem != null) {
            this.f11398i.f27933e.q((q) findItem);
        }
    }

    public void setDividerInsetEnd(int i10) {
        s sVar = this.f11398i;
        sVar.f27947s = i10;
        sVar.d(false);
    }

    public void setDividerInsetStart(int i10) {
        s sVar = this.f11398i;
        sVar.f27946r = i10;
        sVar.d(false);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        b.I1(this, f10);
    }

    public void setItemBackground(Drawable drawable) {
        s sVar = this.f11398i;
        sVar.f27940l = drawable;
        sVar.d(false);
    }

    public void setItemBackgroundResource(int i10) {
        setItemBackground(k.getDrawable(getContext(), i10));
    }

    public void setItemHorizontalPadding(int i10) {
        s sVar = this.f11398i;
        sVar.f27942n = i10;
        sVar.d(false);
    }

    public void setItemHorizontalPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        s sVar = this.f11398i;
        sVar.f27942n = dimensionPixelSize;
        sVar.d(false);
    }

    public void setItemIconPadding(int i10) {
        s sVar = this.f11398i;
        sVar.f27944p = i10;
        sVar.d(false);
    }

    public void setItemIconPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        s sVar = this.f11398i;
        sVar.f27944p = dimensionPixelSize;
        sVar.d(false);
    }

    public void setItemIconSize(int i10) {
        s sVar = this.f11398i;
        if (sVar.f27945q != i10) {
            sVar.f27945q = i10;
            sVar.f27950v = true;
            sVar.d(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        s sVar = this.f11398i;
        sVar.f27939k = colorStateList;
        sVar.d(false);
    }

    public void setItemMaxLines(int i10) {
        s sVar = this.f11398i;
        sVar.f27952x = i10;
        sVar.d(false);
    }

    public void setItemTextAppearance(int i10) {
        s sVar = this.f11398i;
        sVar.f27937i = i10;
        sVar.d(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        s sVar = this.f11398i;
        sVar.f27938j = colorStateList;
        sVar.d(false);
    }

    public void setItemVerticalPadding(int i10) {
        s sVar = this.f11398i;
        sVar.f27943o = i10;
        sVar.d(false);
    }

    public void setItemVerticalPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        s sVar = this.f11398i;
        sVar.f27943o = dimensionPixelSize;
        sVar.d(false);
    }

    public void setNavigationItemSelectedListener(no.l lVar) {
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        s sVar = this.f11398i;
        if (sVar != null) {
            sVar.A = i10;
            NavigationMenuView navigationMenuView = sVar.f27929a;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i10);
            }
        }
    }

    public void setSubheaderInsetEnd(int i10) {
        s sVar = this.f11398i;
        sVar.f27949u = i10;
        sVar.d(false);
    }

    public void setSubheaderInsetStart(int i10) {
        s sVar = this.f11398i;
        sVar.f27948t = i10;
        sVar.d(false);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.f11403n = z10;
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem findItem = this.f11397h.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f11398i.f27933e.q((q) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
