package ba;

import android.util.SparseIntArray;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ok extends nk {
    public static final SparseIntArray F;
    public final TextView D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 7);
        sparseIntArray.put(R.id.username, 8);
        sparseIntArray.put(R.id.user_display_image_container, 9);
        sparseIntArray.put(R.id.mission_list_recyclerview, 10);
        sparseIntArray.put(R.id.progress_bar, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ok(android.view.View r15) {
        /*
            r14 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.ok.F
            r2 = 12
            r12 = 0
            java.lang.Object[] r13 = m4.m.j(r15, r2, r12, r0)
            r0 = 10
            r0 = r13[r0]
            r3 = r0
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r0 = 11
            r0 = r13[r0]
            r4 = r0
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            r0 = 2
            r0 = r13[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 3
            r0 = r13[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 4
            r0 = r13[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 7
            r0 = r13[r0]
            r8 = r0
            androidx.appcompat.widget.Toolbar r8 = (androidx.appcompat.widget.Toolbar) r8
            r0 = 1
            r0 = r13[r0]
            r9 = r0
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r0 = 5
            r0 = r13[r0]
            r10 = r0
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r0 = 9
            r0 = r13[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 8
            r0 = r13[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r14.E = r0
            r0 = 0
            r0 = r13[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r12)
            r0 = 6
            r0 = r13[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r14.D = r0
            r0.setTag(r12)
            android.widget.TextView r0 = r14.f5577u
            r0.setTag(r12)
            android.widget.TextView r0 = r14.f5578v
            r0.setTag(r12)
            android.widget.TextView r0 = r14.f5579w
            r0.setTag(r12)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r14.f5581y
            r0.setTag(r12)
            android.widget.ImageView r0 = r14.f5582z
            r0.setTag(r12)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r15.setTag(r0, r14)
            r14.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ok.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ok.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.E != 0) {
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
            this.E = 32L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.E |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.E |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
    }
}
