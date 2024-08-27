package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class xm extends wm {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public long f6670z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.redemption_status_image_view, 1);
        sparseIntArray.put(R.id.redemption_status_text_view, 2);
        sparseIntArray.put(R.id.button_layout, 3);
        sparseIntArray.put(R.id.redemption_success_button_layout, 4);
        sparseIntArray.put(R.id.go_to_redeemed, 5);
        sparseIntArray.put(R.id.redemption_failed_button_layout, 6);
        sparseIntArray.put(R.id.redemption_close_button, 7);
        sparseIntArray.put(R.id.redemption_retry_button, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public xm(android.view.View r13) {
        /*
            r12 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.xm.A
            r2 = 9
            r10 = 0
            java.lang.Object[] r11 = m4.m.j(r13, r2, r10, r0)
            r0 = 3
            r0 = r11[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 5
            r0 = r11[r0]
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0 = 7
            r0 = r11[r0]
            r4 = r0
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            r0 = 6
            r0 = r11[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 8
            r0 = r11[r0]
            r6 = r0
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r0 = 1
            r0 = r11[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 2
            r0 = r11[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 4
            r0 = r11[r0]
            r9 = r0
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r0 = r12
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r12.f6670z = r0
            r0 = 0
            r0 = r11[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r10)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r13.setTag(r0, r12)
            r12.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.xm.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6670z = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6670z != 0) {
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
            this.f6670z = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
