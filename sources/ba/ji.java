package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ji extends ii {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f5147v;

    /* renamed from: u, reason: collision with root package name */
    public long f5148u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5147v = sparseIntArray;
        sparseIntArray.put(R.id.illustration, 1);
        sparseIntArray.put(R.id.kyc_text_icon, 2);
        sparseIntArray.put(R.id.kyc_text_message, 3);
        sparseIntArray.put(R.id.kyc_message_pointers, 4);
        sparseIntArray.put(R.id.back_to_account, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ji(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = ba.ji.f5147v
            r1 = 6
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r6, r1, r2, r0)
            r1 = 5
            r1 = r0[r1]
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r3 = 1
            r3 = r0[r3]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3 = 4
            r3 = r0[r3]
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r4 = 2
            r4 = r0[r4]
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r4 = 3
            r4 = r0[r4]
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5.<init>(r2, r6, r1, r3)
            r3 = -1
            r5.f5148u = r3
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ji.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5148u = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5148u != 0) {
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
            this.f5148u = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
