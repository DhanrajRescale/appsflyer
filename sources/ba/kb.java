package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class kb extends jb {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.image_icon_container, 1);
        sparseIntArray.put(R.id.sector_stock_image, 2);
        sparseIntArray.put(R.id.sector_stock_name, 3);
        sparseIntArray.put(R.id.short_chip, 4);
        sparseIntArray.put(R.id.percentage_container, 5);
        sparseIntArray.put(R.id.change_percentage, 6);
        sparseIntArray.put(R.id.change_type_icon, 7);
        sparseIntArray.put(R.id.separator, 8);
        sparseIntArray.put(R.id.container_one, 9);
        sparseIntArray.put(R.id.sector_stock_order_quantity, 10);
        sparseIntArray.put(R.id.profit_loss_text, 11);
        sparseIntArray.put(R.id.profit_amount, 12);
        sparseIntArray.put(R.id.container_two, 13);
        sparseIntArray.put(R.id.purchase_price, 14);
        sparseIntArray.put(R.id.market_price, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kb(android.view.View r18) {
        /*
            r17 = this;
            r13 = r17
            r14 = r18
            r1 = 0
            android.util.SparseIntArray r0 = ba.kb.E
            r2 = 16
            r15 = 0
            java.lang.Object[] r16 = m4.m.j(r14, r2, r15, r0)
            r0 = 6
            r0 = r16[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 7
            r0 = r16[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 9
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 13
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 1
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 15
            r0 = r16[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 5
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 12
            r0 = r16[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 11
            r0 = r16[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 14
            r0 = r16[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 2
            r0 = r16[r0]
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0 = 3
            r0 = r16[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 10
            r0 = r16[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 8
            r0 = r16[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 4
            r0 = r16[r0]
            r12 = r0
            com.assetgro.stockgro.widget.ChipView r12 = (com.assetgro.stockgro.widget.ChipView) r12
            r0 = r17
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -1
            r13.D = r0
            r0 = 0
            r0 = r16[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0.setTag(r15)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r14.setTag(r0, r13)
            r17.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.kb.<init>(android.view.View):void");
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
