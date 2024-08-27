package com.google.android.material.chip;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import e4.k;
import fo.e;
import fo.f;
import fo.g;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mo.d;

/* loaded from: classes2.dex */
public class ChipGroup extends d {

    /* renamed from: e, reason: collision with root package name */
    public int f11255e;

    /* renamed from: f, reason: collision with root package name */
    public int f11256f;

    /* renamed from: g, reason: collision with root package name */
    public g f11257g;

    /* renamed from: h, reason: collision with root package name */
    public final l7.g f11258h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11259i;

    /* renamed from: j, reason: collision with root package name */
    public final a4.d f11260j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ChipGroup(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            r3 = 2130968785(0x7f0400d1, float:1.7546233E38)
            r0 = 2132083904(0x7f1504c0, float:1.9807963E38)
            android.content.Context r10 = ap.a.a(r10, r11, r3, r0)
            r9.<init>(r10, r11, r3)
            r6 = 0
            r9.f27908c = r6
            android.content.res.Resources$Theme r10 = r10.getTheme()
            int[] r0 = un.a.f37307r
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r0, r6, r6)
            r7 = 1
            int r0 = r10.getDimensionPixelSize(r7, r6)
            r9.f27906a = r0
            int r0 = r10.getDimensionPixelSize(r6, r6)
            r9.f27907b = r0
            r10.recycle()
            l7.g r10 = new l7.g
            r10.<init>()
            r9.f11258h = r10
            a4.d r8 = new a4.d
            r8.<init>(r9, r6)
            r9.f11260j = r8
            android.content.Context r0 = r9.getContext()
            int[] r2 = un.a.f37298i
            r4 = 2132083904(0x7f1504c0, float:1.9807963E38)
            int[] r5 = new int[r6]
            r1 = r11
            android.content.res.TypedArray r11 = mo.c0.f(r0, r1, r2, r3, r4, r5)
            int r0 = r11.getDimensionPixelOffset(r7, r6)
            r1 = 2
            int r1 = r11.getDimensionPixelOffset(r1, r0)
            r9.setChipSpacingHorizontal(r1)
            r1 = 3
            int r0 = r11.getDimensionPixelOffset(r1, r0)
            r9.setChipSpacingVertical(r0)
            r0 = 5
            boolean r0 = r11.getBoolean(r0, r6)
            r9.setSingleLine(r0)
            r0 = 6
            boolean r0 = r11.getBoolean(r0, r6)
            r9.setSingleSelection(r0)
            r0 = 4
            boolean r0 = r11.getBoolean(r0, r6)
            r9.setSelectionRequired(r0)
            r0 = -1
            int r0 = r11.getResourceId(r6, r0)
            r9.f11259i = r0
            r11.recycle()
            ek.h0 r11 = new ek.h0
            r0 = 9
            r11.<init>(r9, r0)
            r10.f24119e = r11
            super.setOnHierarchyChangeListener(r8)
            java.util.WeakHashMap r10 = d4.n1.f13788a
            d4.v0.s(r9, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getVisibleChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof Chip) && getChildAt(i11).getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof e)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f11258h.c();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.f11258h.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f11255e;
    }

    public int getChipSpacingVertical() {
        return this.f11256f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f11259i;
        if (i10 != -1) {
            l7.g gVar = this.f11258h;
            mo.g gVar2 = (mo.g) ((Map) gVar.f24117c).get(Integer.valueOf(i10));
            if (gVar2 != null && gVar.a(gVar2)) {
                gVar.e();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f27908c) {
            i10 = getVisibleChipCount();
        } else {
            i10 = -1;
        }
        int rowCount = getRowCount();
        if (this.f11258h.f24115a) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) k.e(rowCount, i10, i11).f14993a);
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f11255e != i10) {
            this.f11255e = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f11256f != i10) {
            this.f11256f = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(f fVar) {
        if (fVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new wn.e(2, this, fVar));
        }
    }

    public void setOnCheckedStateChangeListener(g gVar) {
        this.f11257g = gVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f11260j.f163b = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f11258h.f24116b = z10;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // mo.d
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        l7.g gVar = this.f11258h;
        if (gVar.f24115a != z10) {
            gVar.f24115a = z10;
            boolean z11 = !((Set) gVar.f24118d).isEmpty();
            Iterator it = ((Map) gVar.f24117c).values().iterator();
            while (it.hasNext()) {
                gVar.f((mo.g) it.next(), false);
            }
            if (z11) {
                gVar.e();
            }
        }
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
