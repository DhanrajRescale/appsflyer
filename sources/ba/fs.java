package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class fs extends es {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f4740v;

    /* renamed from: u, reason: collision with root package name */
    public long f4741u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4740v = sparseIntArray;
        sparseIntArray.put(R.id.maintenance_anim, 1);
        sparseIntArray.put(R.id.maintenance_message_text, 2);
        sparseIntArray.put(R.id.app_icon, 3);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4741u = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4741u != 0) {
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
            this.f4741u = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
