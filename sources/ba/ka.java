package ba;

import android.util.SparseIntArray;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public final class ka extends ja {
    public static final SparseIntArray C;
    public final TextView A;
    public long B;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialCardView f5214z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.reward_container, 6);
        sparseIntArray.put(R.id.mission_progress_bar_view, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ka(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.ka.C
            r2 = 8
            r8 = 0
            java.lang.Object[] r9 = m4.m.j(r11, r2, r8, r0)
            r0 = 3
            r0 = r9[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 1
            r0 = r9[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 7
            r0 = r9[r0]
            r5 = r0
            com.assetgro.stockgro.missions.presentation.widget.MissionProgressBarView r5 = (com.assetgro.stockgro.missions.presentation.widget.MissionProgressBarView) r5
            r0 = 4
            r0 = r9[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 6
            r0 = r9[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0 = 5
            r0 = r9[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r10.B = r0
            android.widget.TextView r0 = r10.f5124s
            r0.setTag(r8)
            r0 = 0
            r0 = r9[r0]
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            r10.f5214z = r0
            r0.setTag(r8)
            r0 = 2
            r0 = r9[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.A = r0
            r0.setTag(r8)
            android.widget.ImageView r0 = r10.f5125t
            r0.setTag(r8)
            android.widget.TextView r0 = r10.f5127v
            r0.setTag(r8)
            android.widget.ImageView r0 = r10.f5128w
            r0.setTag(r8)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r11.setTag(r0, r10)
            r10.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ka.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ka.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.B != 0) {
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
            this.B = 128L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return false;
                            }
                            if (i11 != 0) {
                                return false;
                            }
                            synchronized (this) {
                                this.B |= 32;
                            }
                            return true;
                        }
                        if (i11 != 0) {
                            return false;
                        }
                        synchronized (this) {
                            this.B |= 16;
                        }
                        return true;
                    }
                    if (i11 != 0) {
                        return false;
                    }
                    synchronized (this) {
                        this.B |= 8;
                    }
                    return true;
                }
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.B |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.B |= 2;
            }
            return true;
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
