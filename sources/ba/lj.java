package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class lj extends kj {

    /* renamed from: w, reason: collision with root package name */
    public static final h.c f5358w;

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f5359x;

    /* renamed from: v, reason: collision with root package name */
    public long f5360v;

    static {
        h.c cVar = new h.c(5);
        f5358w = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.layout_league_portfolio_container}, new String[]{"layout_league_portfolio_container"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5359x = sparseIntArray;
        sparseIntArray.put(R.id.swipe_refresh_layout, 3);
        sparseIntArray.put(R.id.action, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public lj(android.view.View r8) {
        /*
            r7 = this;
            r1 = 0
            h.c r0 = ba.lj.f5358w
            android.util.SparseIntArray r2 = ba.lj.f5359x
            r3 = 5
            java.lang.Object[] r6 = m4.m.j(r8, r3, r0, r2)
            r0 = 4
            r0 = r6[r0]
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0 = 2
            r0 = r6[r0]
            r4 = r0
            ba.ur r4 = (ba.ur) r4
            r0 = 3
            r0 = r6[r0]
            r5 = r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r5 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r5
            r0 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r7.f5360v = r0
            ba.ur r0 = r7.f5255t
            if (r0 == 0) goto L2b
            r0.f27496j = r7
        L2b:
            r0 = 0
            r0 = r6[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r6[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r8.setTag(r0, r7)
            r7.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.lj.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5360v = 0L;
        }
        this.f5255t.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5360v != 0) {
                    return true;
                }
                if (this.f5255t.f()) {
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
            this.f5360v = 2L;
        }
        this.f5255t.h();
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
            this.f5360v |= 1;
        }
        return true;
    }
}
