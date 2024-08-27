package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class iw extends hw {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f5093x;

    /* renamed from: w, reason: collision with root package name */
    public long f5094w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5093x = sparseIntArray;
        sparseIntArray.put(R.id.withdrawal_bank_money_input_view, 1);
        sparseIntArray.put(R.id.withdrawal_account_number_input_view, 2);
        sparseIntArray.put(R.id.withdrawal_ifsc_code_input_view, 3);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5094w = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5094w != 0) {
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
            this.f5094w = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
