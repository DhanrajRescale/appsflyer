package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class nm extends mm {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f5586z;

    /* renamed from: y, reason: collision with root package name */
    public long f5587y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5586z = sparseIntArray;
        sparseIntArray.put(R.id.stock_nested_scroll_view, 1);
        sparseIntArray.put(R.id.portfolio_disclaimer, 2);
        sparseIntArray.put(R.id.portfolio_disclaimer_text, 3);
        sparseIntArray.put(R.id.filterSpinner, 4);
        sparseIntArray.put(R.id.order_list_selector, 5);
        sparseIntArray.put(R.id.sort_orders, 6);
        sparseIntArray.put(R.id.orders_recycler_view, 7);
        sparseIntArray.put(R.id.progress_bar, 8);
        sparseIntArray.put(R.id.no_orders_layout, 9);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5587y = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5587y != 0) {
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
            this.f5587y = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
