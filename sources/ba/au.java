package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class au extends zt {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public long f4231z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.current_value_text, 1);
        sparseIntArray.put(R.id.portfolio_current_value_amount, 2);
        sparseIntArray.put(R.id.view, 3);
        sparseIntArray.put(R.id.invested_amount_text, 4);
        sparseIntArray.put(R.id.invested_amount, 5);
        sparseIntArray.put(R.id.separator, 6);
        sparseIntArray.put(R.id.profit_gained_text, 7);
        sparseIntArray.put(R.id.profit_gained, 8);
        sparseIntArray.put(R.id.change_percentage, 9);
        sparseIntArray.put(R.id.change_type_icon, 10);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4231z = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4231z != 0) {
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
            this.f4231z = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
