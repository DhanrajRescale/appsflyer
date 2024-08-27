package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class il extends hl {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f5057x;

    /* renamed from: w, reason: collision with root package name */
    public long f5058w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5057x = sparseIntArray;
        sparseIntArray.put(R.id.illustration, 1);
        sparseIntArray.put(R.id.login_account_label, 2);
        sparseIntArray.put(R.id.input_view, 3);
        sparseIntArray.put(R.id.next, 4);
        sparseIntArray.put(R.id.terms_and_conditions, 5);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5058w = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5058w != 0) {
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
            this.f5058w = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
