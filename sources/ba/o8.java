package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class o8 extends n8 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f5649y;

    /* renamed from: x, reason: collision with root package name */
    public long f5650x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5649y = sparseIntArray;
        sparseIntArray.put(R.id.checkbox, 1);
        sparseIntArray.put(R.id.exit_reason, 2);
        sparseIntArray.put(R.id.exit_reason_editable, 3);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5650x = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5650x != 0) {
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
            this.f5650x = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
