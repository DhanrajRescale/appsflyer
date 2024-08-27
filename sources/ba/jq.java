package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class jq extends iq {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f5167w;

    /* renamed from: v, reason: collision with root package name */
    public long f5168v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5167w = sparseIntArray;
        sparseIntArray.put(R.id.chip_group, 1);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5168v = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5168v != 0) {
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
            this.f5168v = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
