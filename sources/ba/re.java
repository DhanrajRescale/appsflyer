package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class re extends qe {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f5963w;

    /* renamed from: v, reason: collision with root package name */
    public long f5964v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5963w = sparseIntArray;
        sparseIntArray.put(R.id.nested_scroll_view, 1);
        sparseIntArray.put(R.id.no_offer_layout, 2);
        sparseIntArray.put(R.id.image, 3);
        sparseIntArray.put(R.id.offers_recycler_view, 4);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5964v = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5964v != 0) {
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
            this.f5964v = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
