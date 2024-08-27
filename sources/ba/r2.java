package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class r2 extends q2 {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f5925w;

    /* renamed from: v, reason: collision with root package name */
    public long f5926v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5925w = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 1);
        sparseIntArray.put(R.id.progress_bar, 2);
        sparseIntArray.put(R.id.container_fragment, 3);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5926v = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5926v != 0) {
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
            this.f5926v = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
