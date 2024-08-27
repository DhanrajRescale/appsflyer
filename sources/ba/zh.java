package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class zh extends yh {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public long f6851z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.group_name_layout, 1);
        sparseIntArray.put(R.id.group_name_label, 2);
        sparseIntArray.put(R.id.group_name_edit_text_view, 3);
        sparseIntArray.put(R.id.max_length_label, 4);
        sparseIntArray.put(R.id.max_length_error_label, 5);
        sparseIntArray.put(R.id.chip_group, 6);
        sparseIntArray.put(R.id.action_button_layout, 7);
        sparseIntArray.put(R.id.cancel_button, 8);
        sparseIntArray.put(R.id.save_button, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zh(android.view.View r13) {
        /*
            r12 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.zh.A
            r2 = 10
            r10 = 0
            java.lang.Object[] r11 = m4.m.j(r13, r2, r10, r0)
            r0 = 7
            r0 = r11[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 8
            r0 = r11[r0]
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0 = 6
            r0 = r11[r0]
            r4 = r0
            com.assetgro.stockgro.widget.ChipGroupView r4 = (com.assetgro.stockgro.widget.ChipGroupView) r4
            r0 = 3
            r0 = r11[r0]
            r5 = r0
            android.widget.EditText r5 = (android.widget.EditText) r5
            r0 = 2
            r0 = r11[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 1
            r0 = r11[r0]
            r6 = r0
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r0 = 5
            r0 = r11[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 4
            r0 = r11[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 9
            r0 = r11[r0]
            r9 = r0
            com.google.android.material.button.MaterialButton r9 = (com.google.android.material.button.MaterialButton) r9
            r0 = r12
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r12.f6851z = r0
            r0 = 0
            r0 = r11[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r10)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r13.setTag(r0, r12)
            r12.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.zh.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6851z = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6851z != 0) {
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
            this.f6851z = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
