package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class t0 extends s0 {
    public static final h.c C;
    public static final SparseIntArray D;
    public long B;

    static {
        h.c cVar = new h.c(17);
        C = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.layout_proof_upload_view}, new String[]{"layout_proof_upload_view"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 3);
        sparseIntArray.put(R.id.toolbar, 4);
        sparseIntArray.put(R.id.issue_description_layout, 5);
        sparseIntArray.put(R.id.issue_description_label, 6);
        sparseIntArray.put(R.id.issue_desc_edit_text, 7);
        sparseIntArray.put(R.id.issue_desc_error_text, 8);
        sparseIntArray.put(R.id.email_id_layout, 9);
        sparseIntArray.put(R.id.email_id_label, 10);
        sparseIntArray.put(R.id.email_id_edit_text, 11);
        sparseIntArray.put(R.id.email_id_error_text, 12);
        sparseIntArray.put(R.id.mobile_no_layout, 13);
        sparseIntArray.put(R.id.mobile_no_label, 14);
        sparseIntArray.put(R.id.mobile_no_edit_text, 15);
        sparseIntArray.put(R.id.send_button, 16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t0(android.view.View r14) {
        /*
            r13 = this;
            r1 = 0
            h.c r0 = ba.t0.C
            android.util.SparseIntArray r2 = ba.t0.D
            r3 = 17
            java.lang.Object[] r12 = m4.m.j(r14, r3, r0, r2)
            r0 = 3
            r0 = r12[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 1
            r0 = r12[r0]
            r3 = r0
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r0 = 11
            r0 = r12[r0]
            r4 = r0
            android.widget.EditText r4 = (android.widget.EditText) r4
            r0 = 12
            r0 = r12[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 10
            r0 = r12[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 9
            r0 = r12[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 7
            r0 = r12[r0]
            r6 = r0
            android.widget.EditText r6 = (android.widget.EditText) r6
            r0 = 8
            r0 = r12[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 6
            r0 = r12[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 5
            r0 = r12[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 2
            r0 = r12[r0]
            r8 = r0
            ba.xu r8 = (ba.xu) r8
            r0 = 15
            r0 = r12[r0]
            r9 = r0
            android.widget.EditText r9 = (android.widget.EditText) r9
            r0 = 14
            r0 = r12[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 13
            r0 = r12[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 16
            r0 = r12[r0]
            r10 = r0
            com.google.android.material.button.MaterialButton r10 = (com.google.android.material.button.MaterialButton) r10
            r0 = 4
            r0 = r12[r0]
            r11 = r0
            androidx.appcompat.widget.Toolbar r11 = (androidx.appcompat.widget.Toolbar) r11
            r0 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r13.B = r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.f6025s
            r1 = 0
            r0.setTag(r1)
            ba.xu r0 = r13.f6030x
            if (r0 == 0) goto L82
            r0.f27496j = r13
        L82:
            r0 = 0
            r0 = r12[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r14.setTag(r0, r13)
            r13.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.t0.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.B = 0L;
        }
        this.f6030x.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.B != 0) {
                    return true;
                }
                if (this.f6030x.f()) {
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
            this.B = 2L;
        }
        this.f6030x.h();
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            return false;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 1;
        }
        return true;
    }
}
