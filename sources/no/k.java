package no;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.prod.R;
import d4.n1;
import d4.v0;
import java.util.WeakHashMap;
import l.e0;
import ll.o;
import mo.c0;

/* loaded from: classes2.dex */
public abstract class k extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f29063f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final d f29064a;

    /* renamed from: b, reason: collision with root package name */
    public final zn.b f29065b;

    /* renamed from: c, reason: collision with root package name */
    public final g f29066c;

    /* renamed from: d, reason: collision with root package name */
    public k.j f29067d;

    /* renamed from: e, reason: collision with root package name */
    public i f29068e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [no.g, java.lang.Object, l.c0] */
    public k(Context context, AttributeSet attributeSet) {
        super(ap.a.a(context, attributeSet, R.attr.bottomNavigationStyle, 2132083693), attributeSet, R.attr.bottomNavigationStyle);
        ?? obj = new Object();
        obj.f29060b = false;
        this.f29066c = obj;
        Context context2 = getContext();
        h.c g10 = c0.g(context2, attributeSet, un.a.I, R.attr.bottomNavigationStyle, 2132083693, 10, 9);
        d dVar = new d(context2, getClass(), getMaxItemCount());
        this.f29064a = dVar;
        zn.b bVar = new zn.b(context2);
        this.f29065b = bVar;
        obj.f29059a = bVar;
        obj.f29061c = 1;
        bVar.setPresenter(obj);
        dVar.b(obj, dVar.f23636a);
        getContext();
        obj.f29059a.C = dVar;
        if (g10.H(5)) {
            bVar.setIconTintList(g10.r(5));
        } else {
            bVar.setIconTintList(bVar.b());
        }
        setItemIconSize(g10.u(4, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (g10.H(10)) {
            setItemTextAppearanceInactive(g10.C(10, 0));
        }
        if (g10.H(9)) {
            setItemTextAppearanceActive(g10.C(9, 0));
        }
        if (g10.H(11)) {
            setItemTextColor(g10.r(11));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            to.h hVar = new to.h();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                hVar.n(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            hVar.k(context2);
            WeakHashMap weakHashMap = n1.f13788a;
            v0.q(this, hVar);
        }
        int i10 = 7;
        if (g10.H(7)) {
            setItemPaddingTop(g10.u(7, 0));
        }
        if (g10.H(6)) {
            setItemPaddingBottom(g10.u(6, 0));
        }
        if (g10.H(1)) {
            setElevation(g10.u(1, 0));
        }
        v3.b.h(getBackground().mutate(), dp.b.m1(context2, g10, 0));
        setLabelVisibilityMode(((TypedArray) g10.f17584c).getInteger(12, -1));
        int C = g10.C(3, 0);
        if (C != 0) {
            bVar.setItemBackgroundRes(C);
        } else {
            setItemRippleColor(dp.b.m1(context2, g10, 8));
        }
        int C2 = g10.C(2, 0);
        if (C2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(C2, un.a.H);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(dp.b.l1(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(to.l.a(context2, obtainStyledAttributes.getResourceId(4, 0), 0).a());
            obtainStyledAttributes.recycle();
        }
        if (g10.H(13)) {
            int C3 = g10.C(13, 0);
            obj.f29060b = true;
            getMenuInflater().inflate(C3, dVar);
            obj.f29060b = false;
            obj.d(true);
        }
        g10.R();
        addView(bVar);
        dVar.f23640e = new o(this, i10);
    }

    private MenuInflater getMenuInflater() {
        if (this.f29067d == null) {
            this.f29067d = new k.j(getContext());
        }
        return this.f29067d;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f29065b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f29065b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f29065b.getItemActiveIndicatorMarginHorizontal();
    }

    public to.l getItemActiveIndicatorShapeAppearance() {
        return this.f29065b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f29065b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f29065b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f29065b.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f29065b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f29065b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f29065b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f29065b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f29065b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f29065b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f29065b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f29065b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f29065b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.f29064a;
    }

    @NonNull
    public e0 getMenuView() {
        return this.f29065b;
    }

    @NonNull
    public g getPresenter() {
        return this.f29066c;
    }

    public int getSelectedItemId() {
        return this.f29065b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dp.b.K1(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.f22040a);
        this.f29064a.t(jVar.f29062c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, k4.b, no.j] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new k4.b(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        bVar.f29062c = bundle;
        this.f29064a.v(bundle);
        return bVar;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        dp.b.I1(this, f10);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f29065b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f29065b.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f29065b.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f29065b.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(to.l lVar) {
        this.f29065b.setItemActiveIndicatorShapeAppearance(lVar);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f29065b.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f29065b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        this.f29065b.setItemBackgroundRes(i10);
    }

    public void setItemIconSize(int i10) {
        this.f29065b.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f29065b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i10) {
        this.f29065b.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f29065b.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f29065b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f29065b.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f29065b.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f29065b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i10) {
        zn.b bVar = this.f29065b;
        if (bVar.getLabelVisibilityMode() != i10) {
            bVar.setLabelVisibilityMode(i10);
            this.f29066c.d(false);
        }
    }

    public void setOnItemReselectedListener(h hVar) {
    }

    public void setOnItemSelectedListener(i iVar) {
        this.f29068e = iVar;
    }

    public void setSelectedItemId(int i10) {
        d dVar = this.f29064a;
        MenuItem findItem = dVar.findItem(i10);
        if (findItem != null && !dVar.q(findItem, this.f29066c, 0)) {
            findItem.setChecked(true);
        }
    }
}
