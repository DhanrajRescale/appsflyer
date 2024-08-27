package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class sv extends aa {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f6129u;

    /* renamed from: t, reason: collision with root package name */
    public long f6130t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6129u = sparseIntArray;
        sparseIntArray.put(R.id.subscription_chip_all, 1);
        sparseIntArray.put(R.id.subscription_chip_basic, 2);
        sparseIntArray.put(R.id.subscription_chip_advanced, 3);
        sparseIntArray.put(R.id.subscription_chip_expert, 4);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6130t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6130t != 0) {
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
            this.f6130t = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
