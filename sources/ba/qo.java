package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.v2.presentation.overview.StockOverviewV2ViewModel;

/* loaded from: classes.dex */
public final class qo extends po {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f5883y;

    /* renamed from: x, reason: collision with root package name */
    public long f5884x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5883y = sparseIntArray;
        sparseIntArray.put(R.id.stock_nested_scroll_view, 2);
        sparseIntArray.put(R.id.stock_data_source_disclaimer, 3);
        sparseIntArray.put(R.id.section_recycler_view, 4);
    }

    @Override // m4.m
    public final void b() {
        long j10;
        androidx.lifecycle.e0 e0Var;
        long j11;
        synchronized (this) {
            j10 = this.f5884x;
            this.f5884x = 0L;
        }
        StockOverviewV2ViewModel stockOverviewV2ViewModel = this.f5796w;
        long j12 = j10 & 7;
        int i10 = 0;
        if (j12 != 0) {
            Boolean bool = null;
            if (stockOverviewV2ViewModel != null) {
                e0Var = stockOverviewV2ViewModel.f9084g;
            } else {
                e0Var = null;
            }
            q(0, e0Var);
            if (e0Var != null) {
                bool = (Boolean) e0Var.getValue();
            }
            boolean o10 = m4.m.o(bool);
            if (j12 != 0) {
                if (o10) {
                    j11 = 16;
                } else {
                    j11 = 8;
                }
                j10 |= j11;
            }
            if (!o10) {
                i10 = 8;
            }
        }
        if ((j10 & 7) != 0) {
            this.f5792s.setVisibility(i10);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5884x != 0) {
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
            this.f5884x = 4L;
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
            this.f5884x |= 1;
        }
        return true;
    }
}
