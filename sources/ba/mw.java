package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class mw extends lw {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f5504w;

    /* renamed from: v, reason: collision with root package name */
    public long f5505v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5504w = sparseIntArray;
        sparseIntArray.put(R.id.withdrawal_upi_id_input_view, 1);
        sparseIntArray.put(R.id.withdrawal_upi_money_input_view, 2);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5505v = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5505v != 0) {
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
            this.f5505v = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
