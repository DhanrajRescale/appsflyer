package ba;

import android.util.SparseIntArray;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class bj extends g {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f4298t;

    /* renamed from: s, reason: collision with root package name */
    public long f4299s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4298t = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 1);
        sparseIntArray.put(R.id.collapsing_toolbar_layout, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.progress_bar, 4);
        sparseIntArray.put(R.id.portfolio_name, 5);
        sparseIntArray.put(R.id.portfolio_snapshot, 6);
        sparseIntArray.put(R.id.cash_balance, 7);
        sparseIntArray.put(R.id.invested_amount, 8);
        sparseIntArray.put(R.id.portfolio_recycler_view, 9);
        sparseIntArray.put(R.id.add_stock, 10);
        sparseIntArray.put(R.id.proceed, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(View view) {
        super(null, view, 0);
        Object[] j10 = m4.m.j(view, 12, null, f4298t);
        this.f4299s = -1L;
        ((CoordinatorLayout) j10[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        h();
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4299s = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4299s != 0) {
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
            this.f4299s = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
