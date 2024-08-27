package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class oj extends o7 {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f5668u;

    /* renamed from: t, reason: collision with root package name */
    public long f5669t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5668u = sparseIntArray;
        sparseIntArray.put(R.id.logo, 1);
        sparseIntArray.put(R.id.app_name, 2);
        sparseIntArray.put(R.id.tag_line, 3);
        sparseIntArray.put(R.id.app_update_animation, 4);
        sparseIntArray.put(R.id.message, 5);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5669t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5669t != 0) {
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
            this.f5669t = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
