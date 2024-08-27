package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class uv extends tv {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f6359y;

    /* renamed from: x, reason: collision with root package name */
    public long f6360x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6359y = sparseIntArray;
        sparseIntArray.put(R.id.timer_label, 1);
        sparseIntArray.put(R.id.timer_background, 2);
        sparseIntArray.put(R.id.timer_icon, 3);
        sparseIntArray.put(R.id.timer, 4);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6360x = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6360x != 0) {
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
            this.f6360x = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
