package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class dm extends cm {
    public static final SparseIntArray G;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 1);
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.compose_view, 3);
        sparseIntArray.put(R.id.swipe_refresh_layout, 4);
        sparseIntArray.put(R.id.model_portfolios_container, 5);
        sparseIntArray.put(R.id.model_portfolios_title, 6);
        sparseIntArray.put(R.id.model_portfolios_sub_title, 7);
        sparseIntArray.put(R.id.model_portfolio_view_pager, 8);
        sparseIntArray.put(R.id.model_portfolios_indicator, 9);
        sparseIntArray.put(R.id.league_portfolios_container, 10);
        sparseIntArray.put(R.id.league_portfolios_title, 11);
        sparseIntArray.put(R.id.league_portfolios_sub_title, 12);
        sparseIntArray.put(R.id.league_portfolio_view_pager, 13);
        sparseIntArray.put(R.id.league_portfolios_indicator, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dm(android.view.View r21) {
        /*
            r20 = this;
            r15 = r20
            r14 = r21
            r1 = 0
            android.util.SparseIntArray r0 = ba.dm.G
            r2 = 15
            r13 = 0
            java.lang.Object[] r16 = m4.m.j(r14, r2, r13, r0)
            r0 = 1
            r0 = r16[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 3
            r0 = r16[r0]
            r3 = r0
            androidx.compose.ui.platform.ComposeView r3 = (androidx.compose.ui.platform.ComposeView) r3
            r0 = 13
            r0 = r16[r0]
            r4 = r0
            com.assetgro.stockgro.widget.WrapContentViewPager r4 = (com.assetgro.stockgro.widget.WrapContentViewPager) r4
            r0 = 10
            r0 = r16[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 14
            r0 = r16[r0]
            r6 = r0
            me.relex.circleindicator.CircleIndicator r6 = (me.relex.circleindicator.CircleIndicator) r6
            r0 = 12
            r0 = r16[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 11
            r0 = r16[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 8
            r0 = r16[r0]
            r9 = r0
            com.assetgro.stockgro.widget.WrapContentViewPager r9 = (com.assetgro.stockgro.widget.WrapContentViewPager) r9
            r0 = 5
            r0 = r16[r0]
            r10 = r0
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r0 = 9
            r0 = r16[r0]
            r11 = r0
            me.relex.circleindicator.CircleIndicator r11 = (me.relex.circleindicator.CircleIndicator) r11
            r0 = 7
            r0 = r16[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 6
            r0 = r16[r0]
            r17 = r0
            android.widget.TextView r17 = (android.widget.TextView) r17
            r0 = 4
            r0 = r16[r0]
            r18 = r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r18 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r18
            r0 = 2
            r0 = r16[r0]
            r19 = r0
            androidx.appcompat.widget.Toolbar r19 = (androidx.appcompat.widget.Toolbar) r19
            r0 = r20
            r2 = r21
            r13 = r17
            r14 = r18
            r15 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = -1
            r2 = r20
            r2.F = r0
            r0 = 0
            r0 = r16[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r1 = r21
            r1.setTag(r0, r2)
            r20.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.dm.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.F = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.F != 0) {
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
            this.F = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
