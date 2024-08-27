package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class su extends ru {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.input_title, 1);
        sparseIntArray.put(R.id.clear_price_button_container, 2);
        sparseIntArray.put(R.id.clear_input_text, 3);
        sparseIntArray.put(R.id.input_field, 4);
        sparseIntArray.put(R.id.price_symbol, 5);
        sparseIntArray.put(R.id.error_underline, 6);
        sparseIntArray.put(R.id.error_text, 7);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.A = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.A != 0) {
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
            this.A = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
