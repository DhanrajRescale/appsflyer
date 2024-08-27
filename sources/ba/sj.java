package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class sj extends rj {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f6093w;

    /* renamed from: v, reason: collision with root package name */
    public long f6094v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6093w = sparseIntArray;
        sparseIntArray.put(R.id.scroll_view, 1);
        sparseIntArray.put(R.id.layout_market_insight, 2);
        sparseIntArray.put(R.id.compose_view, 3);
        sparseIntArray.put(R.id.market_insight_parent_recycler_view, 4);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6094v = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6094v != 0) {
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
            this.f6094v = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
