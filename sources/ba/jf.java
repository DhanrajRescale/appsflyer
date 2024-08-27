package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class jf extends Cif {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.constraintContainer, 1);
        sparseIntArray.put(R.id.custom_dialog_title_container, 2);
        sparseIntArray.put(R.id.custom_dialog_title_icon, 3);
        sparseIntArray.put(R.id.custom_dialog_title, 4);
        sparseIntArray.put(R.id.custom_dialog_text, 5);
        sparseIntArray.put(R.id.custom_dialog_subtext, 6);
        sparseIntArray.put(R.id.custom_dialog_checkbox_container, 7);
        sparseIntArray.put(R.id.custom_dialog_checkbox, 8);
        sparseIntArray.put(R.id.custom_dialog_checkbox_text, 9);
        sparseIntArray.put(R.id.view, 10);
        sparseIntArray.put(R.id.custom_dialog_button_positive, 11);
        sparseIntArray.put(R.id.custom_dialog_button_negative, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public jf(android.view.View r19) {
        /*
            r18 = this;
            r14 = r18
            r15 = r19
            r1 = 0
            android.util.SparseIntArray r0 = ba.jf.E
            r2 = 13
            r13 = 0
            java.lang.Object[] r16 = m4.m.j(r15, r2, r13, r0)
            r0 = 1
            r0 = r16[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0 = 12
            r0 = r16[r0]
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0 = 11
            r0 = r16[r0]
            r4 = r0
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            r0 = 8
            r0 = r16[r0]
            r5 = r0
            android.widget.CheckBox r5 = (android.widget.CheckBox) r5
            r0 = 7
            r0 = r16[r0]
            r6 = r0
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            r0 = 9
            r0 = r16[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 6
            r0 = r16[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 5
            r0 = r16[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 4
            r0 = r16[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 2
            r0 = r16[r0]
            r11 = r0
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r0 = 3
            r0 = r16[r0]
            r12 = r0
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r0 = 10
            r0 = r16[r0]
            r17 = r0
            android.view.View r17 = (android.view.View) r17
            r0 = r18
            r2 = r19
            r15 = r13
            r13 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = -1
            r14.D = r0
            r0 = 0
            r0 = r16[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r15)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r1 = r19
            r1.setTag(r0, r14)
            r18.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.jf.<init>(android.view.View):void");
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
