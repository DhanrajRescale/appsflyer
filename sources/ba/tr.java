package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class tr extends sr {
    public static final SparseIntArray F;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.input_title, 1);
        sparseIntArray.put(R.id.input_value, 2);
        sparseIntArray.put(R.id.price_symbol, 3);
        sparseIntArray.put(R.id.display_value, 4);
        sparseIntArray.put(R.id.spinner, 5);
        sparseIntArray.put(R.id.tab_container, 6);
        sparseIntArray.put(R.id.tab_one, 7);
        sparseIntArray.put(R.id.tab_two, 8);
        sparseIntArray.put(R.id.tooltip_icon, 9);
        sparseIntArray.put(R.id.icon, 10);
        sparseIntArray.put(R.id.error_view_1, 11);
        sparseIntArray.put(R.id.error_view_2, 12);
        sparseIntArray.put(R.id.error_line_group, 13);
        sparseIntArray.put(R.id.error_text, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tr(android.view.View r19) {
        /*
            r18 = this;
            r14 = r18
            r15 = r19
            r1 = 0
            android.util.SparseIntArray r0 = ba.tr.F
            r2 = 15
            r13 = 0
            java.lang.Object[] r16 = m4.m.j(r15, r2, r13, r0)
            r0 = 4
            r0 = r16[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 13
            r0 = r16[r0]
            r4 = r0
            androidx.constraintlayout.widget.Group r4 = (androidx.constraintlayout.widget.Group) r4
            r0 = 14
            r0 = r16[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 11
            r0 = r16[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 12
            r0 = r16[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 10
            r0 = r16[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 1
            r0 = r16[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 2
            r0 = r16[r0]
            r8 = r0
            android.widget.EditText r8 = (android.widget.EditText) r8
            r0 = 3
            r0 = r16[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 5
            r0 = r16[r0]
            r10 = r0
            android.widget.Spinner r10 = (android.widget.Spinner) r10
            r0 = 6
            r0 = r16[r0]
            r11 = r0
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r0 = 7
            r0 = r16[r0]
            r12 = r0
            com.google.android.material.button.MaterialButton r12 = (com.google.android.material.button.MaterialButton) r12
            r0 = 8
            r0 = r16[r0]
            r17 = r0
            com.google.android.material.button.MaterialButton r17 = (com.google.android.material.button.MaterialButton) r17
            r0 = 9
            r0 = r16[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = r18
            r2 = r19
            r15 = r13
            r13 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = -1
            r14.E = r0
            r0 = 0
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r15)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r1 = r19
            r1.setTag(r0, r14)
            r18.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.tr.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.E = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.E != 0) {
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
            this.E = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
