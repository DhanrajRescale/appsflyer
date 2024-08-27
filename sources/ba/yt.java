package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class yt extends xt {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f6780y;

    /* renamed from: x, reason: collision with root package name */
    public long f6781x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6780y = sparseIntArray;
        sparseIntArray.put(R.id.cash_balance_league_title, 1);
        sparseIntArray.put(R.id.cash_balance_league, 2);
        sparseIntArray.put(R.id.separator, 3);
        sparseIntArray.put(R.id.pending_order_amount_league, 4);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6781x = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6781x != 0) {
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
            this.f6781x = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
