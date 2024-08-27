package zn;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.assetgro.stockgro.prod.R;
import d4.n1;
import d4.w0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.o;
import no.e;

/* loaded from: classes2.dex */
public final class b extends e {
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public boolean J;

    /* renamed from: e0, reason: collision with root package name */
    public final ArrayList f42579e0;

    public b(Context context) {
        super(context);
        this.f42579e0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.F = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.G = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.H = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.I = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                WeakHashMap weakHashMap = n1.f13788a;
                if (w0.d(this) == 1) {
                    int i18 = i14 - i16;
                    childAt.layout(i18 - childAt.getMeasuredWidth(), 0, i18, i15);
                } else {
                    childAt.layout(i16, 0, childAt.getMeasuredWidth() + i16, i15);
                }
                i16 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        o menu = getMenu();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.f42579e0;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int labelVisibilityMode = getLabelVisibilityMode();
        int i15 = 1;
        if (labelVisibilityMode != -1 ? labelVisibilityMode == 0 : size2 > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i16 = this.H;
        if (z10 && this.J) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int i17 = this.I;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE), makeMeasureSpec);
                i17 = Math.max(i17, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            int i18 = size2 - i13;
            int min = Math.min(size - (this.G * i18), Math.min(i17, i16));
            int i19 = size - min;
            if (i18 != 0) {
                i15 = i18;
            }
            int min2 = Math.min(i19 / i15, this.F);
            int i20 = i19 - (i18 * min2);
            for (int i21 = 0; i21 < childCount; i21++) {
                if (getChildAt(i21).getVisibility() != 8) {
                    if (i21 == getSelectedItemPosition()) {
                        i14 = min;
                    } else {
                        i14 = min2;
                    }
                    if (i20 > 0) {
                        i14++;
                        i20--;
                    }
                } else {
                    i14 = 0;
                }
                arrayList.add(Integer.valueOf(i14));
            }
        } else {
            if (size2 != 0) {
                i15 = size2;
            }
            int min3 = Math.min(size / i15, i16);
            int i22 = size - (size2 * min3);
            for (int i23 = 0; i23 < childCount; i23++) {
                if (getChildAt(i23).getVisibility() != 8) {
                    if (i22 > 0) {
                        i12 = min3 + 1;
                        i22--;
                    } else {
                        i12 = min3;
                    }
                } else {
                    i12 = 0;
                }
                arrayList.add(Integer.valueOf(i12));
            }
        }
        int i24 = 0;
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt2 = getChildAt(i25);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i25)).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i24 = childAt2.getMeasuredWidth() + i24;
            }
        }
        setMeasuredDimension(i24, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.J = z10;
    }
}
