package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class rv extends qv {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.stock_holdings_item_avg_price, 1);
        sparseIntArray.put(R.id.stock_holdings_item_cmp, 2);
        sparseIntArray.put(R.id.separator_1, 3);
        sparseIntArray.put(R.id.profit_loss_text, 4);
        sparseIntArray.put(R.id.stock_holdings_item_profit_loss_value, 5);
        sparseIntArray.put(R.id.view, 6);
        sparseIntArray.put(R.id.stock_holdings_item_purchase_value_text, 7);
        sparseIntArray.put(R.id.stock_holdings_item_purchase_value, 8);
        sparseIntArray.put(R.id.stock_holdings_item_market_value, 9);
        sparseIntArray.put(R.id.separator, 10);
        sparseIntArray.put(R.id.stock_holdings_item_quantity, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public rv(android.view.View r14) {
        /*
            r13 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.rv.B
            r2 = 12
            r11 = 0
            java.lang.Object[] r12 = m4.m.j(r14, r2, r11, r0)
            r0 = 4
            r0 = r12[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 10
            r0 = r12[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 3
            r0 = r12[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 1
            r0 = r12[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2
            r0 = r12[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 9
            r0 = r12[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 5
            r0 = r12[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 8
            r0 = r12[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 7
            r0 = r12[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 11
            r0 = r12[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 6
            r0 = r12[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r13.A = r0
            r0 = 0
            r0 = r12[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r11)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r14.setTag(r0, r13)
            r13.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.rv.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.A = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.A != 0) {
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
            this.A = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
