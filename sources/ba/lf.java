package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class lf extends kf {
    public static final SparseIntArray I;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.keyboard, 1);
        sparseIntArray.put(R.id.key_1, 2);
        sparseIntArray.put(R.id.key_2, 3);
        sparseIntArray.put(R.id.key_3, 4);
        sparseIntArray.put(R.id.key_4, 5);
        sparseIntArray.put(R.id.key_5, 6);
        sparseIntArray.put(R.id.key_6, 7);
        sparseIntArray.put(R.id.key_7, 8);
        sparseIntArray.put(R.id.key_8, 9);
        sparseIntArray.put(R.id.key_9, 10);
        sparseIntArray.put(R.id.key_clear, 11);
        sparseIntArray.put(R.id.key_0, 12);
        sparseIntArray.put(R.id.key_forward, 13);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.H = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.H != 0) {
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
            this.H = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
