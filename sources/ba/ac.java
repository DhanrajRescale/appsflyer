package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ac extends zb {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.offer_image, 1);
        sparseIntArray.put(R.id.coupon_title, 2);
        sparseIntArray.put(R.id.total_amount_value, 3);
        sparseIntArray.put(R.id.view_1, 4);
        sparseIntArray.put(R.id.date_details, 5);
        sparseIntArray.put(R.id.redeemed_on, 6);
        sparseIntArray.put(R.id.separator1, 7);
        sparseIntArray.put(R.id.expiry_date, 8);
        sparseIntArray.put(R.id.view_2, 9);
        sparseIntArray.put(R.id.coupon_code, 10);
        sparseIntArray.put(R.id.option_copy_button, 11);
        sparseIntArray.put(R.id.vendor_site_link, 12);
        sparseIntArray.put(R.id.layout_coupon_instruction, 13);
        sparseIntArray.put(R.id.coupon_instruction, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ac(android.view.View r15) {
        /*
            r14 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.ac.D
            r2 = 15
            r12 = 0
            java.lang.Object[] r13 = m4.m.j(r15, r2, r12, r0)
            r0 = 10
            r0 = r13[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 14
            r0 = r13[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2
            r0 = r13[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 5
            r0 = r13[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 8
            r0 = r13[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 13
            r0 = r13[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 1
            r0 = r13[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 11
            r0 = r13[r0]
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 6
            r0 = r13[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 7
            r0 = r13[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 3
            r0 = r13[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 12
            r0 = r13[r0]
            r11 = r0
            com.google.android.material.button.MaterialButton r11 = (com.google.android.material.button.MaterialButton) r11
            r0 = 4
            r0 = r13[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 9
            r0 = r13[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r14.C = r0
            r0 = 0
            r0 = r13[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0.setTag(r12)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r15.setTag(r0, r14)
            r14.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ac.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.C = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.C != 0) {
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
            this.C = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
