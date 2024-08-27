package ba;

import android.util.SparseIntArray;
import android.widget.ImageView;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class be extends ae {
    public static final SparseIntArray D;
    public final ImageView B;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.progress_layout, 5);
        sparseIntArray.put(R.id.mission_progress_bar, 6);
        sparseIntArray.put(R.id.imageViewPointer, 7);
        sparseIntArray.put(R.id.gift_icon, 8);
        sparseIntArray.put(R.id.label_missions, 9);
        sparseIntArray.put(R.id.placeholder, 10);
        sparseIntArray.put(R.id.mission_list_recyclerview, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public be(android.view.View r14) {
        /*
            r13 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.be.D
            r2 = 12
            r11 = 0
            java.lang.Object[] r12 = m4.m.j(r14, r2, r11, r0)
            r0 = 4
            r0 = r12[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 8
            r0 = r12[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 7
            r0 = r12[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 2
            r0 = r12[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 9
            r0 = r12[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 1
            r0 = r12[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 11
            r0 = r12[r0]
            r7 = r0
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r0 = 6
            r0 = r12[r0]
            r8 = r0
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8
            r0 = 0
            r0 = r12[r0]
            r9 = r0
            androidx.core.widget.NestedScrollView r9 = (androidx.core.widget.NestedScrollView) r9
            r0 = 10
            r0 = r12[r0]
            r10 = r0
            android.widget.Space r10 = (android.widget.Space) r10
            r0 = 5
            r0 = r12[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r13.C = r0
            android.widget.TextView r0 = r13.f4182s
            r0.setTag(r11)
            android.widget.TextView r0 = r13.f4184u
            r0.setTag(r11)
            android.widget.TextView r0 = r13.f4185v
            r0.setTag(r11)
            r0 = 3
            r0 = r12[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r13.B = r0
            r0.setTag(r11)
            androidx.core.widget.NestedScrollView r0 = r13.f4188y
            r0.setTag(r11)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r14.setTag(r0, r13)
            r13.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.be.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0087  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.be.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.C != 0) {
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
            this.C = 16L;
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
                    this.C |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.C |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }
}
