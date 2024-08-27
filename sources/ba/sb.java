package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class sb extends rb {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f6057z;

    /* renamed from: y, reason: collision with root package name */
    public long f6058y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6057z = sparseIntArray;
        sparseIntArray.put(R.id.portfolio_name, 1);
        sparseIntArray.put(R.id.portfolio_feature, 2);
        sparseIntArray.put(R.id.portfolio_price_layout, 3);
        sparseIntArray.put(R.id.portfolio_price, 4);
        sparseIntArray.put(R.id.ic_money_view, 5);
        sparseIntArray.put(R.id.linearLayout7, 6);
        sparseIntArray.put(R.id.portfolio_balance_text, 7);
        sparseIntArray.put(R.id.portfolio_balance_value, 8);
        sparseIntArray.put(R.id.space, 9);
        sparseIntArray.put(R.id.buy_container, 10);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6058y = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6058y != 0) {
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
            this.f6058y = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
