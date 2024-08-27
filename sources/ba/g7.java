package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class g7 extends f7 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f4782z;

    /* renamed from: y, reason: collision with root package name */
    public long f4783y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4782z = sparseIntArray;
        sparseIntArray.put(R.id.crown_image_view, 1);
        sparseIntArray.put(R.id.name_top_portfolio_user, 2);
        sparseIntArray.put(R.id.stock_change_info_view, 3);
        sparseIntArray.put(R.id.view, 4);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4783y = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4783y != 0) {
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
            this.f4783y = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
