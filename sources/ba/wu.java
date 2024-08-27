package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class wu extends vu {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.portfolio_secondary_information_container, 1);
        sparseIntArray.put(R.id.realised_profit_label, 2);
        sparseIntArray.put(R.id.realised_profit, 3);
        sparseIntArray.put(R.id.unrealised_profit_label, 4);
        sparseIntArray.put(R.id.unrealised_profit, 5);
        sparseIntArray.put(R.id.transaction_charges_label, 6);
        sparseIntArray.put(R.id.transaction_charges, 7);
        sparseIntArray.put(R.id.label_text, 8);
        sparseIntArray.put(R.id.pending_order_amount, 9);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.C = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.C != 0) {
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
            this.C = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
