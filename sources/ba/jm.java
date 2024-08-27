package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class jm extends im {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f5156z;

    /* renamed from: y, reason: collision with root package name */
    public long f5157y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5156z = sparseIntArray;
        sparseIntArray.put(R.id.stock_nested_scroll_view, 1);
        sparseIntArray.put(R.id.portfolio_disclaimer, 2);
        sparseIntArray.put(R.id.filterHistorySpinner, 3);
        sparseIntArray.put(R.id.history_list_selector, 4);
        sparseIntArray.put(R.id.sort_orders_history, 5);
        sparseIntArray.put(R.id.history_recycler_view, 6);
        sparseIntArray.put(R.id.progress_bar, 7);
        sparseIntArray.put(R.id.no_history_layout, 8);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5157y = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5157y != 0) {
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
            this.f5157y = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
