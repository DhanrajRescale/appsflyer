package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class rx extends qx {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.input_title, 1);
        sparseIntArray.put(R.id.input_value, 2);
        sparseIntArray.put(R.id.country_container_constraint_layout, 3);
        sparseIntArray.put(R.id.display_value_image, 4);
        sparseIntArray.put(R.id.display_value_multiple_country, 5);
        sparseIntArray.put(R.id.display_value_chevron, 6);
        sparseIntArray.put(R.id.icon, 7);
        sparseIntArray.put(R.id.error_view_1, 8);
        sparseIntArray.put(R.id.error_view_2, 9);
        sparseIntArray.put(R.id.error_line_group, 10);
        sparseIntArray.put(R.id.error_text, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public rx(android.view.View r15) {
        /*
            r14 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.rx.D
            r2 = 12
            r12 = 0
            java.lang.Object[] r13 = m4.m.j(r15, r2, r12, r0)
            r0 = 3
            r0 = r13[r0]
            r3 = r0
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r0 = 6
            r0 = r13[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 4
            r0 = r13[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 5
            r0 = r13[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 10
            r0 = r13[r0]
            r7 = r0
            androidx.constraintlayout.widget.Group r7 = (androidx.constraintlayout.widget.Group) r7
            r0 = 11
            r0 = r13[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 8
            r0 = r13[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 9
            r0 = r13[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 7
            r0 = r13[r0]
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0 = 1
            r0 = r13[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 2
            r0 = r13[r0]
            r11 = r0
            android.widget.EditText r11 = (android.widget.EditText) r11
            r0 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r14.C = r0
            r0 = 0
            r0 = r13[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r12)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r15.setTag(r0, r14)
            r14.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.rx.<init>(android.view.View):void");
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
