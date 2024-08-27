package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class rh extends qh {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f5970z;

    /* renamed from: y, reason: collision with root package name */
    public long f5971y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5970z = sparseIntArray;
        sparseIntArray.put(R.id.group_description_layout, 1);
        sparseIntArray.put(R.id.group_description_label, 2);
        sparseIntArray.put(R.id.group_description_edit_text_view, 3);
        sparseIntArray.put(R.id.max_length_label, 4);
        sparseIntArray.put(R.id.max_length_error_label, 5);
        sparseIntArray.put(R.id.action_button_layout, 6);
        sparseIntArray.put(R.id.cancel_button, 7);
        sparseIntArray.put(R.id.save_button, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public rh(android.view.View r12) {
        /*
            r11 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.rh.f5970z
            r2 = 9
            r9 = 0
            java.lang.Object[] r10 = m4.m.j(r12, r2, r9, r0)
            r0 = 6
            r0 = r10[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 7
            r0 = r10[r0]
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0 = 3
            r0 = r10[r0]
            r4 = r0
            android.widget.EditText r4 = (android.widget.EditText) r4
            r0 = 2
            r0 = r10[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 1
            r0 = r10[r0]
            r5 = r0
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            r0 = 5
            r0 = r10[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 4
            r0 = r10[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 8
            r0 = r10[r0]
            r8 = r0
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            r0 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -1
            r11.f5971y = r0
            r0 = 0
            r0 = r10[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r9)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r12.setTag(r0, r11)
            r11.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.rh.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5971y = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5971y != 0) {
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
            this.f5971y = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
