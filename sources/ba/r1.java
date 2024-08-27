package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class r1 extends q1 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f5923y;

    /* renamed from: x, reason: collision with root package name */
    public long f5924x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5923y = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 1);
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.collapsed_toolbar_view, 3);
        sparseIntArray.put(R.id.winner_container, 4);
        sparseIntArray.put(R.id.select_portfolio_label, 5);
        sparseIntArray.put(R.id.arrow_slider, 6);
        sparseIntArray.put(R.id.winner_recycler_view, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r1(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.r1.f5923y
            r2 = 8
            r8 = 0
            java.lang.Object[] r9 = m4.m.j(r11, r2, r8, r0)
            r0 = 1
            r0 = r9[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 6
            r0 = r9[r0]
            r3 = r0
            com.assetgro.stockgro.widget.ArrowSlider r3 = (com.assetgro.stockgro.widget.ArrowSlider) r3
            r0 = 3
            r0 = r9[r0]
            r4 = r0
            com.assetgro.stockgro.widget.PrepZoneHeaderView r4 = (com.assetgro.stockgro.widget.PrepZoneHeaderView) r4
            r0 = 5
            r0 = r9[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2
            r0 = r9[r0]
            r5 = r0
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            r0 = 4
            r0 = r9[r0]
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 7
            r0 = r9[r0]
            r7 = r0
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r10.f5924x = r0
            r0 = 0
            r0 = r9[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r0.setTag(r8)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r11.setTag(r0, r10)
            r10.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.r1.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5924x = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5924x != 0) {
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
            this.f5924x = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
