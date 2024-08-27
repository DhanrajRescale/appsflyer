package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class l extends k {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f5307x;

    /* renamed from: w, reason: collision with root package name */
    public long f5308w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5307x = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 1);
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.swipe_refresh_layout, 3);
        sparseIntArray.put(R.id.champions_recycler_view, 4);
        sparseIntArray.put(R.id.no_champion_container, 5);
        sparseIntArray.put(R.id.image, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(android.view.View r10) {
        /*
            r9 = this;
            r6 = 0
            android.util.SparseIntArray r0 = ba.l.f5307x
            r1 = 7
            r7 = 0
            java.lang.Object[] r8 = m4.m.j(r10, r1, r7, r0)
            r0 = 1
            r0 = r8[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 4
            r0 = r8[r0]
            r4 = r0
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r0 = 6
            r0 = r8[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 5
            r0 = r8[r0]
            r2 = r0
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r0 = 3
            r0 = r8[r0]
            r5 = r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r5 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r5
            r0 = 2
            r0 = r8[r0]
            r3 = r0
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r9.f5308w = r0
            r0 = 0
            r0 = r8[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r0.setTag(r7)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r10.setTag(r0, r9)
            r9.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.l.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5308w = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5308w != 0) {
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
            this.f5308w = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
