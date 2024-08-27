package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class hs extends gs {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public long f4970z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.stock_icon, 1);
        sparseIntArray.put(R.id.stock_name, 2);
        sparseIntArray.put(R.id.stock_price, 3);
        sparseIntArray.put(R.id.stock_change_info_view, 4);
        sparseIntArray.put(R.id.modeled_data_disclaimer, 5);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4970z = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4970z != 0) {
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
            this.f4970z = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
