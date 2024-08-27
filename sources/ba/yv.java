package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class yv extends xv {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f6784x;

    /* renamed from: w, reason: collision with root package name */
    public long f6785w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6784x = sparseIntArray;
        sparseIntArray.put(R.id.withdrawal_mode_text, 1);
        sparseIntArray.put(R.id.text_transaction_id, 2);
        sparseIntArray.put(R.id.transaction_id, 3);
        sparseIntArray.put(R.id.go_to_wallet, 4);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6785w = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6785w != 0) {
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
            this.f6785w = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
