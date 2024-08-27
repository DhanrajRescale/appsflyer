package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class qj extends pj {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f5873x;

    /* renamed from: w, reason: collision with root package name */
    public long f5874w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5873x = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 1);
        sparseIntArray.put(R.id.collapsing_toolbar, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.fno_new_annimation, 4);
        sparseIntArray.put(R.id.asset_nav, 5);
        sparseIntArray.put(R.id.asset_navigation, 6);
        sparseIntArray.put(R.id.view_shadow, 7);
        sparseIntArray.put(R.id.market_asset_container, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public qj(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.qj.f5873x
            r2 = 9
            r7 = 0
            java.lang.Object[] r8 = m4.m.j(r10, r2, r7, r0)
            r0 = 1
            r0 = r8[r0]
            r3 = r0
            com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
            r0 = 5
            r0 = r8[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0 = 6
            r0 = r8[r0]
            r4 = r0
            com.google.android.material.bottomnavigation.BottomNavigationView r4 = (com.google.android.material.bottomnavigation.BottomNavigationView) r4
            r0 = 2
            r0 = r8[r0]
            r5 = r0
            com.google.android.material.appbar.CollapsingToolbarLayout r5 = (com.google.android.material.appbar.CollapsingToolbarLayout) r5
            r0 = 4
            r0 = r8[r0]
            com.airbnb.lottie.LottieAnimationView r0 = (com.airbnb.lottie.LottieAnimationView) r0
            r0 = 8
            r0 = r8[r0]
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0 = 3
            r0 = r8[r0]
            r6 = r0
            androidx.appcompat.widget.Toolbar r6 = (androidx.appcompat.widget.Toolbar) r6
            r0 = 7
            r0 = r8[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r9.f5874w = r0
            r0 = 0
            r0 = r8[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r0.setTag(r7)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r10.setTag(r0, r9)
            r9.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.qj.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5874w = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5874w != 0) {
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
            this.f5874w = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
