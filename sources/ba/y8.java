package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class y8 extends x8 {
    public static final SparseIntArray G;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.image_icon_container, 1);
        sparseIntArray.put(R.id.stock_holdings_item_image, 2);
        sparseIntArray.put(R.id.percentage_layout, 3);
        sparseIntArray.put(R.id.change_percentage, 4);
        sparseIntArray.put(R.id.change_type_icon, 5);
        sparseIntArray.put(R.id.stock_holdings_item_stock_name, 6);
        sparseIntArray.put(R.id.short_chip, 7);
        sparseIntArray.put(R.id.quantity, 8);
        sparseIntArray.put(R.id.profit_loss_text, 9);
        sparseIntArray.put(R.id.stock_holdings_item_profit_loss_value, 10);
        sparseIntArray.put(R.id.view, 11);
        sparseIntArray.put(R.id.avg_buy_price_label, 12);
        sparseIntArray.put(R.id.avg_buy_price, 13);
        sparseIntArray.put(R.id.avg_sell_price_label, 14);
        sparseIntArray.put(R.id.avg_sell_price, 15);
        sparseIntArray.put(R.id.space, 16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y8(android.view.View r20) {
        /*
            r19 = this;
            r15 = r19
            r14 = r20
            r1 = 0
            android.util.SparseIntArray r0 = ba.y8.G
            r2 = 17
            r13 = 0
            java.lang.Object[] r16 = m4.m.j(r14, r2, r13, r0)
            r0 = 13
            r0 = r16[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 12
            r0 = r16[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 15
            r0 = r16[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 14
            r0 = r16[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 4
            r0 = r16[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 5
            r0 = r16[r0]
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 1
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 3
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 9
            r0 = r16[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 8
            r0 = r16[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 7
            r0 = r16[r0]
            r11 = r0
            com.assetgro.stockgro.widget.ChipView r11 = (com.assetgro.stockgro.widget.ChipView) r11
            r0 = 16
            r0 = r16[r0]
            androidx.legacy.widget.Space r0 = (androidx.legacy.widget.Space) r0
            r0 = 2
            r0 = r16[r0]
            r12 = r0
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r0 = 10
            r0 = r16[r0]
            r17 = r0
            android.widget.TextView r17 = (android.widget.TextView) r17
            r0 = 6
            r0 = r16[r0]
            r18 = r0
            android.widget.TextView r18 = (android.widget.TextView) r18
            r0 = 11
            r0 = r16[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = r19
            r2 = r20
            r13 = r17
            r14 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = -1
            r15.F = r0
            r0 = 0
            r0 = r16[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r1 = r20
            r1.setTag(r0, r15)
            r19.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.y8.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.F = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.F != 0) {
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
            this.F = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
