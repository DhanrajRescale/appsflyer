package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.assetgro.stockgro.prod.R;
import d4.n1;
import d4.v0;
import java.util.HashMap;
import java.util.WeakHashMap;
import o3.e;
import vn.d;

@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i, reason: collision with root package name */
    public HashMap f11573i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void s(View view, View view2, boolean z10, boolean z11) {
        boolean z12;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f11573i = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt.getLayoutParams() instanceof e) && (((e) childAt.getLayoutParams()).f29544a instanceof FabTransformationScrimBehavior)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (childAt != view2 && !z12) {
                    if (!z10) {
                        HashMap hashMap = this.f11573i;
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            int intValue = ((Integer) this.f11573i.get(childAt)).intValue();
                            WeakHashMap weakHashMap = n1.f13788a;
                            v0.s(childAt, intValue);
                        }
                    } else {
                        this.f11573i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap weakHashMap2 = n1.f13788a;
                        v0.s(childAt, 4);
                    }
                }
            }
            if (!z10) {
                this.f11573i = null;
            }
        }
        super.s(view, view2, z10, z11);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final wn.e z(Context context, boolean z10) {
        int i10;
        if (z10) {
            i10 = R.animator.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i10 = R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        }
        wn.e eVar = new wn.e(4);
        eVar.f39327b = d.b(i10, context);
        eVar.f39328c = new Object();
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
