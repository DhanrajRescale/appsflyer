package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ak extends zj {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f4208v;

    /* renamed from: u, reason: collision with root package name */
    public long f4209u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4208v = sparseIntArray;
        sparseIntArray.put(R.id.stock_nested_scroll_view, 2);
        sparseIntArray.put(R.id.market_options_container, 3);
        sparseIntArray.put(R.id.market_options_title, 4);
        sparseIntArray.put(R.id.option_recycler_view, 5);
        sparseIntArray.put(R.id.progress_bar, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ak(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = ba.ak.f4208v
            r1 = 7
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r6, r1, r2, r0)
            r1 = 3
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 4
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 5
            r1 = r0[r1]
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r3 = 6
            r3 = r0[r3]
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            r3 = 2
            r3 = r0[r3]
            androidx.core.widget.NestedScrollView r3 = (androidx.core.widget.NestedScrollView) r3
            r3 = 1
            r3 = r0[r3]
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r3 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r3
            r5.<init>(r2, r6, r1, r3)
            r3 = -1
            r5.f4209u = r3
            r1 = 0
            r0 = r0[r1]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0.setTag(r2)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r5.f6855t
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ak.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f4209u;
            this.f4209u = 0L;
        }
        long j11 = j10 & 7;
        boolean z10 = false;
        if (j11 != 0) {
            q(0, null);
            z10 = m4.m.o(null);
        }
        if (j11 != 0) {
            this.f6855t.setRefreshing(z10);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4209u != 0) {
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
            this.f4209u = 4L;
        }
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
            this.f4209u |= 1;
        }
        return true;
    }
}
