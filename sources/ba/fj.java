package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class fj extends ej {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f4714u;

    /* renamed from: t, reason: collision with root package name */
    public long f4715t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4714u = sparseIntArray;
        sparseIntArray.put(R.id.progress_bar, 1);
        sparseIntArray.put(R.id.data_container, 2);
        sparseIntArray.put(R.id.select_portfolio_label, 3);
        sparseIntArray.put(R.id.select_portfolio_container, 4);
        sparseIntArray.put(R.id.select_portfolio_recycler_view, 5);
        sparseIntArray.put(R.id.no_portfolio_available_container, 6);
        sparseIntArray.put(R.id.image, 7);
        sparseIntArray.put(R.id.unlock_portfolio, 8);
        sparseIntArray.put(R.id.footer_container, 9);
        sparseIntArray.put(R.id.join_container, 10);
        sparseIntArray.put(R.id.join, 11);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4715t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4715t != 0) {
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
            this.f4715t = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
