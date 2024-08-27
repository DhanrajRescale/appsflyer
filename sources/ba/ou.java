package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ou extends nu {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f5695y;

    /* renamed from: x, reason: collision with root package name */
    public long f5696x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5695y = sparseIntArray;
        sparseIntArray.put(R.id.league_icon, 1);
        sparseIntArray.put(R.id.league_name, 2);
        sparseIntArray.put(R.id.asset_class, 3);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5696x = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5696x != 0) {
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
            this.f5696x = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
