package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class gt extends ft {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f4865x;

    /* renamed from: w, reason: collision with root package name */
    public long f4866w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4865x = sparseIntArray;
        sparseIntArray.put(R.id.reward_chip_container, 2);
        sparseIntArray.put(R.id.mission_reward_chip_background, 3);
        sparseIntArray.put(R.id.reward_label, 4);
        sparseIntArray.put(R.id.reward_icon, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public gt(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.gt.f4865x
            r2 = 6
            r6 = 0
            java.lang.Object[] r7 = m4.m.j(r9, r2, r6, r0)
            r0 = 3
            r0 = r7[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0 = 2
            r0 = r7[r0]
            r3 = r0
            com.google.android.material.card.MaterialCardView r3 = (com.google.android.material.card.MaterialCardView) r3
            r0 = 5
            r0 = r7[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 4
            r0 = r7[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 1
            r0 = r7[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f4866w = r0
            r0 = 0
            r0 = r7[r0]
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            r0.setTag(r6)
            android.widget.TextView r0 = r8.f4744u
            r0.setTag(r6)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.gt.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f4866w;
            this.f4866w = 0L;
        }
        String str = this.f4745v;
        if ((j10 & 5) != 0) {
            qu.i0.K(this.f4744u, str);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4866w != 0) {
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
            this.f4866w = 4L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
