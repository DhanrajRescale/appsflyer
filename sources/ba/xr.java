package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class xr extends wr {
    public static final SparseIntArray K;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.portfolio_value, 1);
        sparseIntArray.put(R.id.cash_balance_container, 2);
        sparseIntArray.put(R.id.cash_balance_title, 3);
        sparseIntArray.put(R.id.cash_balance, 4);
        sparseIntArray.put(R.id.cash_balance_separator, 5);
        sparseIntArray.put(R.id.invested_amount_title, 6);
        sparseIntArray.put(R.id.invested_amount, 7);
        sparseIntArray.put(R.id.profit_gained_label, 8);
        sparseIntArray.put(R.id.profit_gained, 9);
        sparseIntArray.put(R.id.percentage_container, 10);
        sparseIntArray.put(R.id.change_percentage, 11);
        sparseIntArray.put(R.id.change_type_icon, 12);
        sparseIntArray.put(R.id.transaction_charges_separator, 13);
        sparseIntArray.put(R.id.transaction_charges_layout, 14);
        sparseIntArray.put(R.id.transaction_charges_title, 15);
        sparseIntArray.put(R.id.transaction_charges, 16);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.J = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.J != 0) {
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
            this.J = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
