package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class wb extends vb {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f6517z;

    /* renamed from: y, reason: collision with root package name */
    public long f6518y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6517z = sparseIntArray;
        sparseIntArray.put(R.id.prize_cell, 1);
        sparseIntArray.put(R.id.rank_icon, 2);
        sparseIntArray.put(R.id.bullet, 3);
        sparseIntArray.put(R.id.prize_icon, 4);
        sparseIntArray.put(R.id.prize_amount, 5);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6518y = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6518y != 0) {
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
            this.f6518y = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
