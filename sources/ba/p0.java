package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class p0 extends o0 {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f5711x;

    /* renamed from: w, reason: collision with root package name */
    public long f5712w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5711x = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 1);
        sparseIntArray.put(R.id.swipe_refresh_layout, 2);
        sparseIntArray.put(R.id.group_members_nested_scroll_view, 3);
        sparseIntArray.put(R.id.group_members_recycler_view, 4);
        sparseIntArray.put(R.id.progress_bar, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p0(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.p0.f5711x
            r2 = 6
            r7 = 0
            java.lang.Object[] r8 = m4.m.j(r10, r2, r7, r0)
            r0 = 3
            r0 = r8[r0]
            r3 = r0
            com.assetgro.stockgro.widget.TouchDetectableScrollView r3 = (com.assetgro.stockgro.widget.TouchDetectableScrollView) r3
            r0 = 4
            r0 = r8[r0]
            r4 = r0
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r0 = 5
            r0 = r8[r0]
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r0 = 2
            r0 = r8[r0]
            r5 = r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r5 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r5
            r0 = 1
            r0 = r8[r0]
            r6 = r0
            androidx.appcompat.widget.Toolbar r6 = (androidx.appcompat.widget.Toolbar) r6
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r9.f5712w = r0
            r0 = 0
            r0 = r8[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r0.setTag(r7)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r10.setTag(r0, r9)
            r9.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.p0.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5712w = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5712w != 0) {
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
            this.f5712w = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
