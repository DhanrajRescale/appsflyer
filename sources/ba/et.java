package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class et extends dt {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f4644y;

    /* renamed from: x, reason: collision with root package name */
    public long f4645x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4644y = sparseIntArray;
        sparseIntArray.put(R.id.chip_background, 2);
        sparseIntArray.put(R.id.mission_status_lottie, 3);
    }

    @Override // m4.m
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f4645x;
            this.f4645x = 0L;
        }
        String str = this.f4523w;
        if ((j10 & 3) != 0) {
            qu.i0.K(this.f4521u, str);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4645x != 0) {
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
            this.f4645x = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
