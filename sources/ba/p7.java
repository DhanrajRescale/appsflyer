package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class p7 extends o7 {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f5726u;

    /* renamed from: t, reason: collision with root package name */
    public long f5727t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5726u = sparseIntArray;
        sparseIntArray.put(R.id.upcoming_swipe_refresh, 1);
        sparseIntArray.put(R.id.rv_arena_upcoming_recycler, 2);
        sparseIntArray.put(R.id.no_my_league_container, 3);
        sparseIntArray.put(R.id.image, 4);
        sparseIntArray.put(R.id.btn_go_to_portfolio, 5);
        sparseIntArray.put(R.id.progressBar, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p7(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = ba.p7.f5726u
            r1 = 7
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r6, r1, r2, r0)
            r1 = 5
            r1 = r0[r1]
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r1 = 4
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 3
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 6
            r1 = r0[r1]
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r1 = 2
            r1 = r0[r1]
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r3 = 1
            r3 = r0[r3]
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r3 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r3
            r5.<init>(r2, r6, r1)
            r3 = -1
            r5.f5727t = r3
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.p7.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5727t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5727t != 0) {
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
            this.f5727t = 8L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
