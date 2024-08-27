package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class tf extends sf {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public long f6191z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 1);
        sparseIntArray.put(R.id.collapsing_toolbar, 2);
        sparseIntArray.put(R.id.tab_layout, 3);
        sparseIntArray.put(R.id.whats_new_prepzone, 4);
        sparseIntArray.put(R.id.upcoming_swipe_refresh, 5);
        sparseIntArray.put(R.id.rv_arena_upcoming_recycler, 6);
        sparseIntArray.put(R.id.no_my_league_container, 7);
        sparseIntArray.put(R.id.image, 8);
        sparseIntArray.put(R.id.btn_go_to_portfolio, 9);
        sparseIntArray.put(R.id.progressBar, 10);
        sparseIntArray.put(R.id.progress, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tf(android.view.View r13) {
        /*
            r12 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.tf.A
            r2 = 12
            r10 = 0
            java.lang.Object[] r11 = m4.m.j(r13, r2, r10, r0)
            r0 = 1
            r0 = r11[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 9
            r0 = r11[r0]
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0 = 2
            r0 = r11[r0]
            r4 = r0
            com.google.android.material.appbar.CollapsingToolbarLayout r4 = (com.google.android.material.appbar.CollapsingToolbarLayout) r4
            r0 = 8
            r0 = r11[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 7
            r0 = r11[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 11
            r0 = r11[r0]
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r0 = 10
            r0 = r11[r0]
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r0 = 6
            r0 = r11[r0]
            r6 = r0
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r0 = 3
            r0 = r11[r0]
            r7 = r0
            com.google.android.material.tabs.TabLayout r7 = (com.google.android.material.tabs.TabLayout) r7
            r0 = 5
            r0 = r11[r0]
            r8 = r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r8 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r8
            r0 = 4
            r0 = r11[r0]
            r9 = r0
            com.assetgro.stockgro.feature_arena.widget.PrepZoneWhatsNewWidget r9 = (com.assetgro.stockgro.feature_arena.widget.PrepZoneWhatsNewWidget) r9
            r0 = r12
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r12.f6191z = r0
            r0 = 0
            r0 = r11[r0]
            com.assetgro.stockgro.widget.NestedScrollCoordinatorLayout r0 = (com.assetgro.stockgro.widget.NestedScrollCoordinatorLayout) r0
            r0.setTag(r10)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r13.setTag(r0, r12)
            r12.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.tf.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6191z = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6191z != 0) {
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
            this.f6191z = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
