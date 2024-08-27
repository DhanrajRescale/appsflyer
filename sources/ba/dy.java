package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class dy extends yd {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f4544u;

    /* renamed from: t, reason: collision with root package name */
    public long f4545t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4544u = sparseIntArray;
        sparseIntArray.put(R.id.image, 1);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4545t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4545t != 0) {
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
            this.f4545t = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
