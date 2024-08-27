package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.completed.CompletedLeaguePortfolioViewModel;

/* loaded from: classes.dex */
public final class rg extends qg {

    /* renamed from: y, reason: collision with root package name */
    public static final h.c f5967y;

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f5968z;

    /* renamed from: x, reason: collision with root package name */
    public long f5969x;

    static {
        h.c cVar = new h.c(6);
        f5967y = cVar;
        cVar.W(1, new int[]{3}, new int[]{R.layout.layout_league_portfolio_snapshot}, new String[]{"layout_league_portfolio_snapshot"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5968z = sparseIntArray;
        sparseIntArray.put(R.id.swipe_refresh_layout, 4);
        sparseIntArray.put(R.id.portfolio_stock_recycler_view, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public rg(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            h.c r0 = ba.rg.f5967y
            android.util.SparseIntArray r2 = ba.rg.f5968z
            r3 = 6
            java.lang.Object[] r7 = m4.m.j(r9, r3, r0, r2)
            r0 = 3
            r0 = r7[r0]
            r3 = r0
            ba.wr r3 = (ba.wr) r3
            r0 = 2
            r0 = r7[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 5
            r0 = r7[r0]
            r5 = r0
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            r0 = 4
            r0 = r7[r0]
            r6 = r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r6 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r6
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r8.f5969x = r0
            ba.wr r0 = r8.f5858s
            if (r0 == 0) goto L31
            r0.f27496j = r8
        L31:
            r0 = 0
            r0 = r7[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r7[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r1)
            android.widget.TextView r0 = r8.f5859t
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.rg.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        androidx.lifecycle.d0 d0Var;
        synchronized (this) {
            j10 = this.f5969x;
            this.f5969x = 0L;
        }
        CompletedLeaguePortfolioViewModel completedLeaguePortfolioViewModel = this.f5862w;
        long j11 = j10 & 14;
        String str = null;
        if (j11 != 0) {
            if (completedLeaguePortfolioViewModel != null) {
                d0Var = completedLeaguePortfolioViewModel.A;
            } else {
                d0Var = null;
            }
            q(1, d0Var);
            if (d0Var != null) {
                str = (String) d0Var.getValue();
            }
        }
        if (j11 != 0) {
            qu.i0.K(this.f5859t, str);
        }
        this.f5858s.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5969x != 0) {
                    return true;
                }
                if (this.f5858s.f()) {
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
            this.f5969x = 8L;
        }
        this.f5858s.h();
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
                this.f5969x |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f5969x |= 1;
        }
        return true;
    }
}
