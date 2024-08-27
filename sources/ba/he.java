package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class he extends ge {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.stock_image, 1);
        sparseIntArray.put(R.id.stock_name_large, 2);
        sparseIntArray.put(R.id.exchange, 3);
        sparseIntArray.put(R.id.quantity_display_view, 4);
        sparseIntArray.put(R.id.price_display_view, 5);
        sparseIntArray.put(R.id.order_type_display_view, 6);
        sparseIntArray.put(R.id.total_amount_display_view, 7);
        sparseIntArray.put(R.id.portfolio_name, 8);
        sparseIntArray.put(R.id.portfolio_amount, 9);
        sparseIntArray.put(R.id.progress_bar, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public he(android.view.View r15) {
        /*
            r14 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.he.C
            r2 = 11
            r12 = 0
            java.lang.Object[] r13 = m4.m.j(r15, r2, r12, r0)
            r0 = 3
            r0 = r13[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 6
            r0 = r13[r0]
            r3 = r0
            com.assetgro.stockgro.widget.DisplayView r3 = (com.assetgro.stockgro.widget.DisplayView) r3
            r0 = 9
            r0 = r13[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 8
            r0 = r13[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 5
            r0 = r13[r0]
            r6 = r0
            com.assetgro.stockgro.widget.DisplayView r6 = (com.assetgro.stockgro.widget.DisplayView) r6
            r0 = 10
            r0 = r13[r0]
            r7 = r0
            android.widget.ProgressBar r7 = (android.widget.ProgressBar) r7
            r0 = 4
            r0 = r13[r0]
            r8 = r0
            com.assetgro.stockgro.widget.DisplayView r8 = (com.assetgro.stockgro.widget.DisplayView) r8
            r0 = 1
            r0 = r13[r0]
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0 = 2
            r0 = r13[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 7
            r0 = r13[r0]
            r11 = r0
            com.assetgro.stockgro.widget.DisplayView r11 = (com.assetgro.stockgro.widget.DisplayView) r11
            r0 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r14.B = r0
            r0 = 0
            r0 = r13[r0]
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r0.setTag(r12)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r15.setTag(r0, r14)
            r14.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.he.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.B = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.B != 0) {
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
            this.B = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
