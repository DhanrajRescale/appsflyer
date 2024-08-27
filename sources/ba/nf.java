package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class nf extends mf {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f5563u;

    /* renamed from: t, reason: collision with root package name */
    public long f5564t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5563u = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 1);
        sparseIntArray.put(R.id.collapsing_toolbar, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.asset_nav, 4);
        sparseIntArray.put(R.id.asset_navigation, 5);
        sparseIntArray.put(R.id.view_shadow, 6);
        sparseIntArray.put(R.id.arena_asset_container, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public nf(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = ba.nf.f5563u
            r1 = 8
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r6, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
            r1 = 7
            r1 = r0[r1]
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1 = 4
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 5
            r1 = r0[r1]
            com.google.android.material.bottomnavigation.BottomNavigationView r1 = (com.google.android.material.bottomnavigation.BottomNavigationView) r1
            r1 = 2
            r1 = r0[r1]
            com.google.android.material.appbar.CollapsingToolbarLayout r1 = (com.google.android.material.appbar.CollapsingToolbarLayout) r1
            r3 = 3
            r3 = r0[r3]
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            r3 = 6
            r3 = r0[r3]
            android.view.View r3 = (android.view.View) r3
            r5.<init>(r2, r6, r1)
            r3 = -1
            r5.f5564t = r3
            r1 = 0
            r0 = r0[r1]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.nf.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5564t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5564t != 0) {
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
            this.f5564t = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
