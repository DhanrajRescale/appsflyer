package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class lh extends kh {
    public static final SparseIntArray F;
    public ed D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 5);
        sparseIntArray.put(R.id.toolbar, 6);
        sparseIntArray.put(R.id.header, 7);
        sparseIntArray.put(R.id.loading_progress_bar, 8);
        sparseIntArray.put(R.id.swipe_refresh_layout, 9);
        sparseIntArray.put(R.id.option_detail_container, 10);
        sparseIntArray.put(R.id.narration_icon, 11);
        sparseIntArray.put(R.id.narration_title, 12);
        sparseIntArray.put(R.id.understanding_option_click_reciever, 13);
        sparseIntArray.put(R.id.option_chain_recycler_view, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public lh(android.view.View r18) {
        /*
            r17 = this;
            r13 = r17
            r14 = r18
            r1 = 0
            android.util.SparseIntArray r0 = ba.lh.F
            r2 = 15
            r15 = 0
            java.lang.Object[] r16 = m4.m.j(r14, r2, r15, r0)
            r0 = 5
            r0 = r16[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 3
            r0 = r16[r0]
            r3 = r0
            androidx.appcompat.widget.SwitchCompat r3 = (androidx.appcompat.widget.SwitchCompat) r3
            r0 = 7
            r0 = r16[r0]
            r4 = r0
            com.assetgro.stockgro.widget.MarketAssetToolbarView r4 = (com.assetgro.stockgro.widget.MarketAssetToolbarView) r4
            r0 = 8
            r0 = r16[r0]
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r0 = 11
            r0 = r16[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 12
            r0 = r16[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 14
            r0 = r16[r0]
            r5 = r0
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            r0 = 10
            r0 = r16[r0]
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 9
            r0 = r16[r0]
            r7 = r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r7 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r7
            r0 = 2
            r0 = r16[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 1
            r0 = r16[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 4
            r0 = r16[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 6
            r0 = r16[r0]
            r11 = r0
            androidx.appcompat.widget.Toolbar r11 = (androidx.appcompat.widget.Toolbar) r11
            r0 = 13
            r0 = r16[r0]
            r12 = r0
            android.view.View r12 = (android.view.View) r12
            r0 = r17
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -1
            r13.E = r0
            androidx.appcompat.widget.SwitchCompat r0 = r13.f5243s
            r0.setTag(r15)
            r0 = 0
            r0 = r16[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r0.setTag(r15)
            android.widget.TextView r0 = r13.f5248x
            r0.setTag(r15)
            android.widget.TextView r0 = r13.f5249y
            r0.setTag(r15)
            android.widget.TextView r0 = r13.f5250z
            r0.setTag(r15)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r14.setTag(r0, r13)
            r17.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.lh.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.lh.b():void");
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
            this.E = 8L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
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
