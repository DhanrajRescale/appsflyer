package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class pt extends ot {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f5804u;

    /* renamed from: t, reason: collision with root package name */
    public long f5805t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5804u = sparseIntArray;
        sparseIntArray.put(R.id.ic_no_internet, 1);
        sparseIntArray.put(R.id.label_no_internet, 2);
        sparseIntArray.put(R.id.sub_label_no_internet, 3);
        sparseIntArray.put(R.id.retry_button, 4);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5805t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5805t != 0) {
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
            this.f5805t = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
