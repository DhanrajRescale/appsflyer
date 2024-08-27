package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class u9 extends t9 {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f6282w;

    /* renamed from: v, reason: collision with root package name */
    public long f6283v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6282w = sparseIntArray;
        sparseIntArray.put(R.id.bullet, 1);
        sparseIntArray.put(R.id.rule, 2);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6283v = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6283v != 0) {
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
            this.f6283v = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
