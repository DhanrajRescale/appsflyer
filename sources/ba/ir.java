package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ir extends hr {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f5076u;

    /* renamed from: t, reason: collision with root package name */
    public long f5077t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5076u = sparseIntArray;
        sparseIntArray.put(R.id.portfolio_secondary_information_container, 1);
        sparseIntArray.put(R.id.realised_profit_label, 2);
        sparseIntArray.put(R.id.realised_profit, 3);
        sparseIntArray.put(R.id.unrealised_profit_label, 4);
        sparseIntArray.put(R.id.unrealised_profit, 5);
        sparseIntArray.put(R.id.transaction_charges_label, 6);
        sparseIntArray.put(R.id.transaction_charges, 7);
        sparseIntArray.put(R.id.pending_order_amount, 8);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5077t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5077t != 0) {
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
            this.f5077t = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
