package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.prod.R;
import d4.n1;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1009a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1010b;

    /* renamed from: c, reason: collision with root package name */
    public int f1011c;

    public ButtonBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1011c = -1;
        int[] iArr = g.a.f16359k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        n1.m(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f1009a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1009a);
        }
    }

    private void setStacked(boolean z10) {
        int i10;
        int i11;
        if (this.f1010b != z10) {
            if (!z10 || this.f1009a) {
                this.f1010b = z10;
                setOrientation(z10 ? 1 : 0);
                if (z10) {
                    i10 = 8388613;
                } else {
                    i10 = 80;
                }
                setGravity(i10);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    if (z10) {
                        i11 = 8;
                    } else {
                        i11 = 4;
                    }
                    findViewById.setVisibility(i11);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r1 != false) goto L24;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            boolean r1 = r6.f1009a
            r2 = 0
            if (r1 == 0) goto L16
            int r1 = r6.f1011c
            if (r0 <= r1) goto L14
            boolean r1 = r6.f1010b
            if (r1 == 0) goto L14
            r6.setStacked(r2)
        L14:
            r6.f1011c = r0
        L16:
            boolean r1 = r6.f1010b
            r3 = 1
            if (r1 != 0) goto L2b
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L2b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = r3
            goto L2d
        L2b:
            r0 = r7
            r1 = r2
        L2d:
            super.onMeasure(r0, r8)
            boolean r0 = r6.f1009a
            if (r0 == 0) goto L47
            boolean r0 = r6.f1010b
            if (r0 != 0) goto L47
            int r0 = r6.getMeasuredWidthAndState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r4) goto L47
            r6.setStacked(r3)
            goto L49
        L47:
            if (r1 == 0) goto L4c
        L49:
            super.onMeasure(r7, r8)
        L4c:
            int r0 = r6.getChildCount()
            r1 = r2
        L51:
            r4 = -1
            if (r1 >= r0) goto L62
            android.view.View r5 = r6.getChildAt(r1)
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L5f
            goto L63
        L5f:
            int r1 = r1 + 1
            goto L51
        L62:
            r1 = r4
        L63:
            if (r1 < 0) goto Lbc
            android.view.View r0 = r6.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r5 = r6.getPaddingTop()
            int r0 = r0.getMeasuredHeight()
            int r0 = r0 + r5
            int r5 = r2.topMargin
            int r0 = r0 + r5
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            boolean r2 = r6.f1010b
            if (r2 == 0) goto Lb6
            int r1 = r1 + r3
            int r2 = r6.getChildCount()
        L87:
            if (r1 >= r2) goto L98
            android.view.View r3 = r6.getChildAt(r1)
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L95
            r4 = r1
            goto L98
        L95:
            int r1 = r1 + 1
            goto L87
        L98:
            if (r4 < 0) goto Lb4
            android.view.View r1 = r6.getChildAt(r4)
            int r1 = r1.getPaddingTop()
            android.content.res.Resources r2 = r6.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 * r3
            int r2 = (int) r2
            int r1 = r1 + r2
            int r1 = r1 + r0
            r2 = r1
            goto Lbc
        Lb4:
            r2 = r0
            goto Lbc
        Lb6:
            int r1 = r6.getPaddingBottom()
            int r2 = r1 + r0
        Lbc:
            java.util.WeakHashMap r0 = d4.n1.f13788a
            int r0 = d4.v0.d(r6)
            if (r0 == r2) goto Lcc
            r6.setMinimumHeight(r2)
            if (r8 != 0) goto Lcc
            super.onMeasure(r7, r8)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }

    public void setAllowStacking(boolean z10) {
        if (this.f1009a != z10) {
            this.f1009a = z10;
            if (!z10 && this.f1010b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
