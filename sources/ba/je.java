package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class je extends ie {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f5141z;

    /* renamed from: y, reason: collision with root package name */
    public long f5142y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5141z = sparseIntArray;
        sparseIntArray.put(R.id.top_background, 1);
        sparseIntArray.put(R.id.user_profile_container, 2);
        sparseIntArray.put(R.id.user_image, 3);
        sparseIntArray.put(R.id.name_navigation_drawer_header, 4);
        sparseIntArray.put(R.id.subscription_layout, 5);
        sparseIntArray.put(R.id.payment_options_layout, 6);
        sparseIntArray.put(R.id.stockgro_exchange_options_layout, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public je(android.view.View r12) {
        /*
            r11 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.je.f5141z
            r2 = 8
            r9 = 0
            java.lang.Object[] r10 = m4.m.j(r12, r2, r9, r0)
            r0 = 4
            r0 = r10[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 6
            r0 = r10[r0]
            r4 = r0
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            r0 = 7
            r0 = r10[r0]
            r5 = r0
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r0 = 5
            r0 = r10[r0]
            r6 = r0
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r0 = 1
            r0 = r10[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 3
            r0 = r10[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 2
            r0 = r10[r0]
            r8 = r0
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r0 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -1
            r11.f5142y = r0
            r0 = 0
            r0 = r10[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r9)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r12.setTag(r0, r11)
            r11.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.je.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5142y = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5142y != 0) {
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
            this.f5142y = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
