package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ck extends bk {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f4380v;

    /* renamed from: u, reason: collision with root package name */
    public long f4381u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4380v = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 1);
        sparseIntArray.put(R.id.collapsing_toolbar, 2);
        sparseIntArray.put(R.id.tab_layout, 3);
        sparseIntArray.put(R.id.market_stocks_view_pager, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ck(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = ba.ck.f4380v
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r6, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
            r1 = 2
            r1 = r0[r1]
            com.google.android.material.appbar.CollapsingToolbarLayout r1 = (com.google.android.material.appbar.CollapsingToolbarLayout) r1
            r1 = 4
            r1 = r0[r1]
            androidx.viewpager2.widget.ViewPager2 r1 = (androidx.viewpager2.widget.ViewPager2) r1
            r3 = 3
            r3 = r0[r3]
            com.google.android.material.tabs.TabLayout r3 = (com.google.android.material.tabs.TabLayout) r3
            r5.<init>(r2, r6, r1, r3)
            r3 = -1
            r5.f4381u = r3
            r1 = 0
            r0 = r0[r1]
            com.assetgro.stockgro.widget.NestedScrollCoordinatorLayout r0 = (com.assetgro.stockgro.widget.NestedScrollCoordinatorLayout) r0
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ck.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4381u = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4381u != 0) {
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
            this.f4381u = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
