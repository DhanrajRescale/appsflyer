package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class xi extends wi {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f6658x;

    /* renamed from: w, reason: collision with root package name */
    public long f6659w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6658x = sparseIntArray;
        sparseIntArray.put(R.id.review_text, 1);
        sparseIntArray.put(R.id.illustration, 2);
        sparseIntArray.put(R.id.kyc_text_icon, 3);
        sparseIntArray.put(R.id.kyc_text_message, 4);
        sparseIntArray.put(R.id.submitted_on_date, 5);
        sparseIntArray.put(R.id.kyc_document_submitted_message, 6);
        sparseIntArray.put(R.id.kyc_verification_pending_icon, 7);
        sparseIntArray.put(R.id.kyc_verification_pending_message, 8);
        sparseIntArray.put(R.id.kyc_verification_pending_days, 9);
        sparseIntArray.put(R.id.vertical_line, 10);
        sparseIntArray.put(R.id.back_to_account, 11);
        sparseIntArray.put(R.id.need_help_layout, 12);
        sparseIntArray.put(R.id.need_help, 13);
        sparseIntArray.put(R.id.contact_support, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public xi(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.xi.f6658x
            r2 = 15
            r7 = 0
            java.lang.Object[] r8 = m4.m.j(r10, r2, r7, r0)
            r0 = 11
            r0 = r8[r0]
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0 = 14
            r0 = r8[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2
            r0 = r8[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 6
            r0 = r8[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 3
            r0 = r8[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 4
            r0 = r8[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 9
            r0 = r8[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 7
            r0 = r8[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 8
            r0 = r8[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 13
            r0 = r8[r0]
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r0 = 12
            r0 = r8[r0]
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r0 = 1
            r0 = r8[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 5
            r0 = r8[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 10
            r0 = r8[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r9.f6659w = r0
            r0 = 0
            r0 = r8[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r7)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r10.setTag(r0, r9)
            r9.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.xi.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6659w = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6659w != 0) {
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
            this.f6659w = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
