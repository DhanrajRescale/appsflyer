package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class l1 extends k1 {
    public static final h.c A;
    public static final SparseIntArray B;

    /* renamed from: z, reason: collision with root package name */
    public long f5311z;

    static {
        h.c cVar = new h.c(11);
        A = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.layout_league_portfolio_snapshot}, new String[]{"layout_league_portfolio_snapshot"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 3);
        sparseIntArray.put(R.id.toolbar, 4);
        sparseIntArray.put(R.id.toolbar_contents, 5);
        sparseIntArray.put(R.id.user_icon, 6);
        sparseIntArray.put(R.id.user_name, 7);
        sparseIntArray.put(R.id.league_name, 8);
        sparseIntArray.put(R.id.swipe_refresh_layout, 9);
        sparseIntArray.put(R.id.recycler_view, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l1(android.view.View r12) {
        /*
            r11 = this;
            r1 = 0
            h.c r0 = ba.l1.A
            android.util.SparseIntArray r2 = ba.l1.B
            r3 = 11
            java.lang.Object[] r10 = m4.m.j(r12, r3, r0, r2)
            r0 = 3
            r0 = r10[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 2
            r0 = r10[r0]
            r3 = r0
            ba.wr r3 = (ba.wr) r3
            r0 = 8
            r0 = r10[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 10
            r0 = r10[r0]
            r5 = r0
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            r0 = 9
            r0 = r10[r0]
            r6 = r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r6 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r6
            r0 = 4
            r0 = r10[r0]
            r7 = r0
            androidx.appcompat.widget.Toolbar r7 = (androidx.appcompat.widget.Toolbar) r7
            r0 = 5
            r0 = r10[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0 = 6
            r0 = r10[r0]
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 7
            r0 = r10[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r11.f5311z = r0
            ba.wr r0 = r11.f5192s
            if (r0 == 0) goto L51
            r0.f27496j = r11
        L51:
            r0 = 0
            r0 = r10[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r10[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r12.setTag(r0, r11)
            r11.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.l1.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5311z = 0L;
        }
        this.f5192s.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5311z != 0) {
                    return true;
                }
                if (this.f5192s.f()) {
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
            this.f5311z = 2L;
        }
        this.f5192s.h();
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            return false;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f5311z |= 1;
        }
        return true;
    }
}
