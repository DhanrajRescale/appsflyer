package no;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import d4.n1;
import d4.v0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.WeakHashMap;
import l.e0;
import l.o;
import l.q;
import t7.p;

/* loaded from: classes2.dex */
public abstract class e extends ViewGroup implements e0 {
    public static final int[] D = {R.attr.state_checked};
    public static final int[] E = {-16842910};
    public ColorStateList A;
    public g B;
    public o C;

    /* renamed from: a, reason: collision with root package name */
    public final t7.a f29031a;

    /* renamed from: b, reason: collision with root package name */
    public final h.b f29032b;

    /* renamed from: c, reason: collision with root package name */
    public final c4.f f29033c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f29034d;

    /* renamed from: e, reason: collision with root package name */
    public int f29035e;

    /* renamed from: f, reason: collision with root package name */
    public c[] f29036f;

    /* renamed from: g, reason: collision with root package name */
    public int f29037g;

    /* renamed from: h, reason: collision with root package name */
    public int f29038h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f29039i;

    /* renamed from: j, reason: collision with root package name */
    public int f29040j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f29041k;

    /* renamed from: l, reason: collision with root package name */
    public final ColorStateList f29042l;

    /* renamed from: m, reason: collision with root package name */
    public int f29043m;

    /* renamed from: n, reason: collision with root package name */
    public int f29044n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f29045o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f29046p;

    /* renamed from: q, reason: collision with root package name */
    public int f29047q;

    /* renamed from: r, reason: collision with root package name */
    public final SparseArray f29048r;

    /* renamed from: s, reason: collision with root package name */
    public int f29049s;

    /* renamed from: t, reason: collision with root package name */
    public int f29050t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f29051u;

    /* renamed from: v, reason: collision with root package name */
    public int f29052v;

    /* renamed from: w, reason: collision with root package name */
    public int f29053w;

    /* renamed from: x, reason: collision with root package name */
    public int f29054x;

    /* renamed from: y, reason: collision with root package name */
    public to.l f29055y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f29056z;

    public e(Context context) {
        super(context);
        this.f29033c = new c4.f(5);
        this.f29034d = new SparseArray(5);
        this.f29037g = 0;
        this.f29038h = 0;
        this.f29048r = new SparseArray(5);
        this.f29049s = -1;
        this.f29050t = -1;
        this.f29056z = false;
        this.f29042l = b();
        if (isInEditMode()) {
            this.f29031a = null;
        } else {
            t7.a aVar = new t7.a();
            this.f29031a = aVar;
            aVar.L(0);
            aVar.A(dp.b.E1(getContext(), com.assetgro.stockgro.prod.R.attr.motionDurationMedium4, getResources().getInteger(com.assetgro.stockgro.prod.R.integer.material_motion_duration_long_1)));
            aVar.C(dp.b.F1(getContext(), com.assetgro.stockgro.prod.R.attr.motionEasingStandard, vn.a.f38181b));
            aVar.I(new p());
        }
        this.f29032b = new h.b(this, 8);
        WeakHashMap weakHashMap = n1.f13788a;
        v0.s(this, 1);
    }

    private c getNewItem() {
        c cVar = (c) this.f29033c.c();
        if (cVar == null) {
            return new c(getContext());
        }
        return cVar;
    }

    private void setBadgeIfNeeded(@NonNull c cVar) {
        xn.a aVar;
        int id2 = cVar.getId();
        if (id2 != -1 && (aVar = (xn.a) this.f29048r.get(id2)) != null) {
            cVar.setBadge(aVar);
        }
    }

    public final void a() {
        boolean z10;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        removeAllViews();
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    this.f29033c.b(cVar);
                    if (cVar.D != null) {
                        ImageView imageView = cVar.f29016m;
                        if (imageView != null) {
                            cVar.setClipChildren(true);
                            cVar.setClipToPadding(true);
                            xn.a aVar = cVar.D;
                            if (aVar != null) {
                                WeakReference weakReference = aVar.f40501m;
                                if (weakReference != null) {
                                    frameLayout = (FrameLayout) weakReference.get();
                                } else {
                                    frameLayout = null;
                                }
                                if (frameLayout != null) {
                                    WeakReference weakReference2 = aVar.f40501m;
                                    if (weakReference2 != null) {
                                        frameLayout2 = (FrameLayout) weakReference2.get();
                                    } else {
                                        frameLayout2 = null;
                                    }
                                    frameLayout2.setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(aVar);
                                }
                            }
                        }
                        cVar.D = null;
                    }
                    cVar.f29021r = null;
                    cVar.f29027x = s0.g.f34069a;
                    cVar.f29004a = false;
                }
            }
        }
        if (this.C.f23641f.size() == 0) {
            this.f29037g = 0;
            this.f29038h = 0;
            this.f29036f = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.C.f23641f.size(); i10++) {
            hashSet.add(Integer.valueOf(this.C.getItem(i10).getItemId()));
        }
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f29048r;
            if (i11 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i11++;
        }
        this.f29036f = new c[this.C.f23641f.size()];
        int i12 = this.f29035e;
        int size = this.C.l().size();
        if (i12 != -1 ? i12 == 0 : size > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i13 = 0; i13 < this.C.f23641f.size(); i13++) {
            this.B.f29060b = true;
            this.C.getItem(i13).setCheckable(true);
            this.B.f29060b = false;
            c newItem = getNewItem();
            this.f29036f[i13] = newItem;
            newItem.setIconTintList(this.f29039i);
            newItem.setIconSize(this.f29040j);
            newItem.setTextColor(this.f29042l);
            newItem.setTextAppearanceInactive(this.f29043m);
            newItem.setTextAppearanceActive(this.f29044n);
            newItem.setTextColor(this.f29041k);
            int i14 = this.f29049s;
            if (i14 != -1) {
                newItem.setItemPaddingTop(i14);
            }
            int i15 = this.f29050t;
            if (i15 != -1) {
                newItem.setItemPaddingBottom(i15);
            }
            newItem.setActiveIndicatorWidth(this.f29052v);
            newItem.setActiveIndicatorHeight(this.f29053w);
            newItem.setActiveIndicatorMarginHorizontal(this.f29054x);
            newItem.setActiveIndicatorDrawable(c());
            newItem.setActiveIndicatorResizeable(this.f29056z);
            newItem.setActiveIndicatorEnabled(this.f29051u);
            Drawable drawable = this.f29045o;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f29047q);
            }
            newItem.setItemRippleColor(this.f29046p);
            newItem.setShifting(z10);
            newItem.setLabelVisibilityMode(this.f29035e);
            q qVar = (q) this.C.getItem(i13);
            newItem.b(qVar);
            newItem.setItemPosition(i13);
            SparseArray sparseArray2 = this.f29034d;
            int i16 = qVar.f23663a;
            newItem.setOnTouchListener((View.OnTouchListener) sparseArray2.get(i16));
            newItem.setOnClickListener(this.f29032b);
            int i17 = this.f29037g;
            if (i17 != 0 && i16 == i17) {
                this.f29038h = i13;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.C.f23641f.size() - 1, this.f29038h);
        this.f29038h = min;
        this.C.getItem(min).setChecked(true);
    }

    public final ColorStateList b() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = r3.k.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.assetgro.stockgro.prod.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i10 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = E;
        return new ColorStateList(new int[][]{iArr, D, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i10, defaultColor});
    }

    public final to.h c() {
        if (this.f29055y != null && this.A != null) {
            to.h hVar = new to.h(this.f29055y);
            hVar.n(this.A);
            return hVar;
        }
        return null;
    }

    @Override // l.e0
    public final void d(o oVar) {
        this.C = oVar;
    }

    public SparseArray<xn.a> getBadgeDrawables() {
        return this.f29048r;
    }

    public ColorStateList getIconTintList() {
        return this.f29039i;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.A;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f29051u;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f29053w;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f29054x;
    }

    public to.l getItemActiveIndicatorShapeAppearance() {
        return this.f29055y;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f29052v;
    }

    public Drawable getItemBackground() {
        c[] cVarArr = this.f29036f;
        if (cVarArr != null && cVarArr.length > 0) {
            return cVarArr[0].getBackground();
        }
        return this.f29045o;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f29047q;
    }

    public int getItemIconSize() {
        return this.f29040j;
    }

    public int getItemPaddingBottom() {
        return this.f29050t;
    }

    public int getItemPaddingTop() {
        return this.f29049s;
    }

    public ColorStateList getItemRippleColor() {
        return this.f29046p;
    }

    public int getItemTextAppearanceActive() {
        return this.f29044n;
    }

    public int getItemTextAppearanceInactive() {
        return this.f29043m;
    }

    public ColorStateList getItemTextColor() {
        return this.f29041k;
    }

    public int getLabelVisibilityMode() {
        return this.f29035e;
    }

    public o getMenu() {
        return this.C;
    }

    public int getSelectedItemId() {
        return this.f29037g;
    }

    public int getSelectedItemPosition() {
        return this.f29038h;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) e4.k.e(1, this.C.l().size(), 1).f14993a);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f29039i = colorStateList;
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorDrawable(c());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f29051u = z10;
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorEnabled(z10);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f29053w = i10;
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorHeight(i10);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f29054x = i10;
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorMarginHorizontal(i10);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z10) {
        this.f29056z = z10;
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorResizeable(z10);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(to.l lVar) {
        this.f29055y = lVar;
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorDrawable(c());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f29052v = i10;
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorWidth(i10);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f29045o = drawable;
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.f29047q = i10;
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemBackground(i10);
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.f29040j = i10;
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setIconSize(i10);
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.f29050t = i10;
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemPaddingBottom(i10);
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.f29049s = i10;
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemPaddingTop(i10);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f29046p = colorStateList;
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f29044n = i10;
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextAppearanceActive(i10);
                ColorStateList colorStateList = this.f29041k;
                if (colorStateList != null) {
                    cVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f29043m = i10;
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextAppearanceInactive(i10);
                ColorStateList colorStateList = this.f29041k;
                if (colorStateList != null) {
                    cVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f29041k = colorStateList;
        c[] cVarArr = this.f29036f;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f29035e = i10;
    }

    public void setPresenter(@NonNull g gVar) {
        this.B = gVar;
    }
}
