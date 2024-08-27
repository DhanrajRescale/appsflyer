package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class iu extends hu {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f5086v;

    /* renamed from: u, reason: collision with root package name */
    public long f5087u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5086v = sparseIntArray;
        sparseIntArray.put(R.id.portfolio_returns_container, 1);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5087u = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5087u != 0) {
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
            this.f5087u = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
