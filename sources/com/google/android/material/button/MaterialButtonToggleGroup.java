package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import ap.a;
import bo.d;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.timepicker.h;
import d2.p0;
import d4.n1;
import d4.q;
import d4.v0;
import d4.w0;
import e4.k;
import in.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import ll.o;
import mo.c0;
import s0.g;
import to.l;
import x7.e;

/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f11214k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11215a;

    /* renamed from: b, reason: collision with root package name */
    public final o f11216b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f11217c;

    /* renamed from: d, reason: collision with root package name */
    public final p0 f11218d;

    /* renamed from: e, reason: collision with root package name */
    public Integer[] f11219e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11220f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11221g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11222h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11223i;

    /* renamed from: j, reason: collision with root package name */
    public HashSet f11224j;

    public MaterialButtonToggleGroup(@NonNull Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2132083918), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f11215a = new ArrayList();
        this.f11216b = new o(this);
        this.f11217c = new LinkedHashSet();
        this.f11218d = new p0(this, 4);
        this.f11220f = false;
        this.f11224j = new HashSet();
        TypedArray f10 = c0.f(getContext(), attributeSet, un.a.f37313x, R.attr.materialButtonToggleGroupStyle, 2132083918, new int[0]);
        setSingleSelection(f10.getBoolean(3, false));
        this.f11223i = f10.getResourceId(1, -1);
        this.f11222h = f10.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(f10.getBoolean(0, true));
        f10.recycle();
        WeakHashMap weakHashMap = n1.f13788a;
        v0.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (c(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && c(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = n1.f13788a;
            materialButton.setId(w0.a());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f11216b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i10 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                q.g(layoutParams, 0);
                q.h(layoutParams, -min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                q.h(layoutParams, 0);
            }
            materialButton.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
            } else {
                q.g(layoutParams3, 0);
                q.h(layoutParams3, 0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        l shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f11215a.add(new d(shapeAppearanceModel.f36283e, shapeAppearanceModel.f36286h, shapeAppearanceModel.f36284f, shapeAppearanceModel.f36285g));
        materialButton.setEnabled(isEnabled());
        n1.n(materialButton, new e(this, 2));
    }

    public final void b(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f11224j);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f11221g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else if (!z10 && hashSet.contains(Integer.valueOf(i10))) {
            if (!this.f11222h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        } else {
            return;
        }
        d(hashSet);
    }

    public final boolean c(int i10) {
        if (getChildAt(i10).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f11224j;
        this.f11224j = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = ((MaterialButton) getChildAt(i10)).getId();
            boolean contains = set.contains(Integer.valueOf(id2));
            View findViewById = findViewById(id2);
            if (findViewById instanceof MaterialButton) {
                this.f11220f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f11220f = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator it = this.f11217c.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f11218d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put((MaterialButton) getChildAt(i10), Integer.valueOf(i10));
        }
        this.f11219e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        boolean z10;
        d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            if (materialButton.getVisibility() != 8) {
                i f10 = materialButton.getShapeAppearanceModel().f();
                d dVar2 = (d) this.f11215a.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    to.a aVar = d.f7229e;
                    if (i10 == firstVisibleChildIndex) {
                        if (z10) {
                            if (pn.e.o(this)) {
                                dVar = new d(aVar, aVar, dVar2.f7231b, dVar2.f7232c);
                            } else {
                                dVar = new d(dVar2.f7230a, dVar2.f7233d, aVar, aVar);
                            }
                        } else {
                            dVar = new d(dVar2.f7230a, aVar, dVar2.f7231b, aVar);
                        }
                    } else if (i10 == lastVisibleChildIndex) {
                        if (z10) {
                            if (pn.e.o(this)) {
                                dVar = new d(dVar2.f7230a, dVar2.f7233d, aVar, aVar);
                            } else {
                                dVar = new d(aVar, aVar, dVar2.f7231b, dVar2.f7232c);
                            }
                        } else {
                            dVar = new d(aVar, dVar2.f7233d, aVar, dVar2.f7232c);
                        }
                    } else {
                        dVar2 = null;
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    f10.c(g.f34069a);
                } else {
                    f10.f20166e = dVar2.f7230a;
                    f10.f20169h = dVar2.f7233d;
                    f10.f20167f = dVar2.f7231b;
                    f10.f20168g = dVar2.f7232c;
                }
                materialButton.setShapeAppearanceModel(f10.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (this.f11221g && !this.f11224j.isEmpty()) {
            return ((Integer) this.f11224j.iterator().next()).intValue();
        }
        return -1;
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = ((MaterialButton) getChildAt(i10)).getId();
            if (this.f11224j.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f11219e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f11223i;
        if (i10 != -1) {
            d(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f11221g) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) k.e(1, visibleButtonCount, i10).f14993a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        e();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f11215a.remove(indexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f11222h = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f11221g != z10) {
            this.f11221g = z10;
            d(new HashSet());
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setA11yClassName((this.f11221g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
