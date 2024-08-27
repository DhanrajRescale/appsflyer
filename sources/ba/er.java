package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class er extends dr {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f4640x;

    /* renamed from: w, reason: collision with root package name */
    public long f4641w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4640x = sparseIntArray;
        sparseIntArray.put(R.id.input_title, 1);
        sparseIntArray.put(R.id.input_value, 2);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4641w = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4641w != 0) {
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
            this.f4641w = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
