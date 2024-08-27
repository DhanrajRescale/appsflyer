package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class yu extends xu {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f6782x;

    /* renamed from: w, reason: collision with root package name */
    public long f6783w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6782x = sparseIntArray;
        sparseIntArray.put(R.id.start_attach_container, 1);
        sparseIntArray.put(R.id.images_list_container, 2);
        sparseIntArray.put(R.id.additional_attach_option, 3);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6783w = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6783w != 0) {
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
            this.f6783w = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
