package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class cg extends bg {
    public static final SparseIntArray H;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.all_categories_item, 1);
        sparseIntArray.put(R.id.all_categories_icon, 2);
        sparseIntArray.put(R.id.portfolio_item, 3);
        sparseIntArray.put(R.id.portfolio_icon, 4);
        sparseIntArray.put(R.id.league_item, 5);
        sparseIntArray.put(R.id.league_icon, 6);
        sparseIntArray.put(R.id.social_item, 7);
        sparseIntArray.put(R.id.social_icon, 8);
        sparseIntArray.put(R.id.payment_item, 9);
        sparseIntArray.put(R.id.payment_icon, 10);
        sparseIntArray.put(R.id.profile_item, 11);
        sparseIntArray.put(R.id.profile_icon, 12);
        sparseIntArray.put(R.id.reset_button, 13);
        sparseIntArray.put(R.id.apply_button, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cg(android.view.View r20) {
        /*
            r19 = this;
            r2 = r19
            r1 = r20
            r17 = 0
            android.util.SparseIntArray r0 = ba.cg.H
            r3 = 15
            r15 = 0
            java.lang.Object[] r18 = m4.m.j(r1, r3, r15, r0)
            r0 = 2
            r0 = r18[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 1
            r0 = r18[r0]
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0 = 14
            r0 = r18[r0]
            r5 = r0
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r0 = 6
            r0 = r18[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 5
            r0 = r18[r0]
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0 = 10
            r0 = r18[r0]
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 9
            r0 = r18[r0]
            r9 = r0
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r0 = 4
            r0 = r18[r0]
            r10 = r0
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r0 = 3
            r0 = r18[r0]
            r11 = r0
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r0 = 12
            r0 = r18[r0]
            r12 = r0
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r0 = 11
            r0 = r18[r0]
            r13 = r0
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r0 = 13
            r0 = r18[r0]
            r14 = r0
            com.google.android.material.button.MaterialButton r14 = (com.google.android.material.button.MaterialButton) r14
            r0 = 8
            r0 = r18[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r15 = r0
            r0 = 7
            r0 = r18[r0]
            r16 = r0
            android.widget.LinearLayout r16 = (android.widget.LinearLayout) r16
            r0 = r19
            r1 = r17
            r2 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = -1
            r2 = r19
            r2.G = r0
            r0 = 0
            r0 = r18[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r1 = r20
            r1.setTag(r0, r2)
            r19.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.cg.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.G != 0) {
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
            this.G = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
