package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ow extends nw {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f5699u;

    /* renamed from: t, reason: collision with root package name */
    public long f5700t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5699u = sparseIntArray;
        sparseIntArray.put(R.id.user_star_message, 1);
        sparseIntArray.put(R.id.group_pin_message, 2);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5700t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5700t != 0) {
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
            this.f5700t = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
