package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ql extends pl {
    public static final SparseIntArray H;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.illustration, 1);
        sparseIntArray.put(R.id.back_arrow, 2);
        sparseIntArray.put(R.id.back, 3);
        sparseIntArray.put(R.id.enter_otp_label, 4);
        sparseIntArray.put(R.id.timer, 5);
        sparseIntArray.put(R.id.pin_label, 6);
        sparseIntArray.put(R.id.pin_view, 7);
        sparseIntArray.put(R.id.did_not_recieve_text, 8);
        sparseIntArray.put(R.id.first_otp_choice, 9);
        sparseIntArray.put(R.id.first_option_text, 10);
        sparseIntArray.put(R.id.text_or, 11);
        sparseIntArray.put(R.id.second_otp_choice, 12);
        sparseIntArray.put(R.id.second_option_text, 13);
        sparseIntArray.put(R.id.text_or_2, 14);
        sparseIntArray.put(R.id.third_otp_choice, 15);
        sparseIntArray.put(R.id.third_option_text, 16);
        sparseIntArray.put(R.id.verify, 17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ql(android.view.View r20) {
        /*
            r19 = this;
            r2 = r19
            r1 = r20
            r17 = 0
            android.util.SparseIntArray r0 = ba.ql.H
            r3 = 18
            r15 = 0
            java.lang.Object[] r18 = m4.m.j(r1, r3, r15, r0)
            r0 = 3
            r0 = r18[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 2
            r0 = r18[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 8
            r0 = r18[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 4
            r0 = r18[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 10
            r0 = r18[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 9
            r0 = r18[r0]
            r6 = r0
            androidx.cardview.widget.CardView r6 = (androidx.cardview.widget.CardView) r6
            r0 = 1
            r0 = r18[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 6
            r0 = r18[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 7
            r0 = r18[r0]
            r8 = r0
            com.chaos.view.PinView r8 = (com.chaos.view.PinView) r8
            r0 = 13
            r0 = r18[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 12
            r0 = r18[r0]
            r10 = r0
            androidx.cardview.widget.CardView r10 = (androidx.cardview.widget.CardView) r10
            r0 = 11
            r0 = r18[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 14
            r0 = r18[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 16
            r0 = r18[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 15
            r0 = r18[r0]
            r14 = r0
            androidx.cardview.widget.CardView r14 = (androidx.cardview.widget.CardView) r14
            r0 = 5
            r0 = r18[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r15 = r0
            r0 = 17
            r0 = r18[r0]
            r16 = r0
            com.google.android.material.button.MaterialButton r16 = (com.google.android.material.button.MaterialButton) r16
            r0 = r19
            r1 = r17
            r2 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = -1
            r2 = r19
            r2.G = r0
            r0 = 0
            r0 = r18[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r1 = r20
            r1.setTag(r0, r2)
            r19.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ql.<init>(android.view.View):void");
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
