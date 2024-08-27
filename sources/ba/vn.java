package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class vn extends un {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 1);
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.stockInfoCollapsedHeader, 3);
        sparseIntArray.put(R.id.nestedScrollView, 4);
        sparseIntArray.put(R.id.form, 5);
        sparseIntArray.put(R.id.portfolioName, 6);
        sparseIntArray.put(R.id.cash_balance_container, 7);
        sparseIntArray.put(R.id.cash_balance_label, 8);
        sparseIntArray.put(R.id.portfolioAmount, 9);
        sparseIntArray.put(R.id.portfolioDivider, 10);
        sparseIntArray.put(R.id.orderTypeInput, 11);
        sparseIntArray.put(R.id.quantityInput, 12);
        sparseIntArray.put(R.id.priceInput, 13);
        sparseIntArray.put(R.id.progressBar, 14);
        sparseIntArray.put(R.id.reviewOrder, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public vn(android.view.View r19) {
        /*
            r18 = this;
            r14 = r18
            r15 = r19
            r1 = 0
            android.util.SparseIntArray r0 = ba.vn.E
            r2 = 16
            r13 = 0
            java.lang.Object[] r16 = m4.m.j(r15, r2, r13, r0)
            r0 = 1
            r0 = r16[r0]
            r3 = r0
            com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
            r0 = 7
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 8
            r0 = r16[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 5
            r0 = r16[r0]
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r0 = 4
            r0 = r16[r0]
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r0 = 11
            r0 = r16[r0]
            r5 = r0
            com.assetgro.stockgro.widget.InputView r5 = (com.assetgro.stockgro.widget.InputView) r5
            r0 = 9
            r0 = r16[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 10
            r0 = r16[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 6
            r0 = r16[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 13
            r0 = r16[r0]
            r8 = r0
            com.assetgro.stockgro.widget.PriceInputView r8 = (com.assetgro.stockgro.widget.PriceInputView) r8
            r0 = 14
            r0 = r16[r0]
            r9 = r0
            android.widget.ProgressBar r9 = (android.widget.ProgressBar) r9
            r0 = 12
            r0 = r16[r0]
            r10 = r0
            com.assetgro.stockgro.widget.InputView r10 = (com.assetgro.stockgro.widget.InputView) r10
            r0 = 15
            r0 = r16[r0]
            r11 = r0
            com.google.android.material.button.MaterialButton r11 = (com.google.android.material.button.MaterialButton) r11
            r0 = 3
            r0 = r16[r0]
            r12 = r0
            com.assetgro.stockgro.widget.MarketAssetToolbarView r12 = (com.assetgro.stockgro.widget.MarketAssetToolbarView) r12
            r0 = 2
            r0 = r16[r0]
            r17 = r0
            androidx.appcompat.widget.Toolbar r17 = (androidx.appcompat.widget.Toolbar) r17
            r0 = r18
            r2 = r19
            r15 = r13
            r13 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = -1
            r14.D = r0
            r0 = 0
            r0 = r16[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r0.setTag(r15)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r1 = r19
            r1.setTag(r0, r14)
            r18.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.vn.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.D = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.D != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m4.m
    public final void h() {
        synchronized (this) {
            this.D = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
