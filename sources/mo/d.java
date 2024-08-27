package mo;

import android.view.View;
import android.view.ViewGroup;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.common.api.Api;
import com.google.android.material.chip.ChipGroup;
import d4.n1;
import d4.w0;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class d extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f27906a;

    /* renamed from: b, reason: collision with root package name */
    public int f27907b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27908c;

    /* renamed from: d, reason: collision with root package name */
    public int f27909d;

    public int getItemSpacing() {
        return this.f27907b;
    }

    public int getLineSpacing() {
        return this.f27906a;
    }

    public int getRowCount() {
        return this.f27909d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        if (getChildCount() == 0) {
            this.f27909d = 0;
            return;
        }
        this.f27909d = 1;
        WeakHashMap weakHashMap = n1.f13788a;
        if (w0.d(this) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z11) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i16 = (i12 - i10) - paddingRight;
        int i17 = paddingLeft;
        int i18 = paddingTop;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i15 = d4.q.c(marginLayoutParams);
                    i14 = d4.q.b(marginLayoutParams);
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i17 + i15;
                if (!this.f27908c && measuredWidth > i16) {
                    i18 = this.f27906a + paddingTop;
                    this.f27909d++;
                    i17 = paddingLeft;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f27909d - 1));
                int i20 = i17 + i15;
                int measuredWidth2 = childAt.getMeasuredWidth() + i20;
                int measuredHeight = childAt.getMeasuredHeight() + i18;
                if (z11) {
                    childAt.layout(i16 - measuredWidth2, i18, (i16 - i17) - i15, measuredHeight);
                } else {
                    childAt.layout(i20, i18, measuredWidth2, measuredHeight);
                }
                i17 += childAt.getMeasuredWidth() + i15 + i14 + this.f27907b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        } else {
            i12 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i12 - getPaddingRight();
        int i17 = paddingTop;
        int i18 = 0;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i15 = marginLayoutParams.leftMargin;
                    i14 = marginLayoutParams.rightMargin;
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                int i20 = paddingLeft;
                if (childAt.getMeasuredWidth() + paddingLeft + i15 > paddingRight && !((ChipGroup) this).f27908c) {
                    i16 = getPaddingLeft();
                    i17 = this.f27906a + paddingTop;
                } else {
                    i16 = i20;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i16 + i15;
                int measuredHeight = childAt.getMeasuredHeight() + i17;
                if (measuredWidth > i18) {
                    i18 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i15 + i14 + this.f27907b + i16;
                if (i19 == getChildCount() - 1) {
                    i18 += i14;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i18;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i13 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i13 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != i13) {
                size2 = paddingBottom;
            }
        } else {
            size2 = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i10) {
        this.f27907b = i10;
    }

    public void setLineSpacing(int i10) {
        this.f27906a = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f27908c = z10;
    }
}
