package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class os extends ns {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f5692x;

    /* renamed from: w, reason: collision with root package name */
    public long f5693w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5692x = sparseIntArray;
        sparseIntArray.put(R.id.mission_reward_chip_background, 3);
        sparseIntArray.put(R.id.reward_icon, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public os(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = ba.os.f5692x
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r6, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = 3
            r3 = r0[r3]
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r3 = 4
            r3 = r0[r3]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3 = 2
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r5.<init>(r2, r6, r1, r3)
            r3 = -1
            r5.f5693w = r3
            android.widget.TextView r1 = r5.f5605s
            r1.setTag(r2)
            r1 = 0
            r0 = r0[r1]
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            r0.setTag(r2)
            android.widget.TextView r0 = r5.f5606t
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.os.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f5693w;
            this.f5693w = 0L;
        }
        String str = this.f5608v;
        String str2 = this.f5607u;
        long j11 = 5 & j10;
        if ((j10 & 6) != 0) {
            qu.i0.K(this.f5605s, str2);
        }
        if (j11 != 0) {
            qu.i0.K(this.f5606t, str);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5693w != 0) {
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
            this.f5693w = 4L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }

    @Override // ba.ns
    public final void r(String str) {
        this.f5608v = str;
        synchronized (this) {
            this.f5693w |= 1;
        }
        a(2);
        m();
    }

    @Override // ba.ns
    public final void s(String str) {
        this.f5607u = str;
        synchronized (this) {
            this.f5693w |= 2;
        }
        a(23);
        m();
    }
}
