package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class rt extends qt {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f6005w;

    /* renamed from: v, reason: collision with root package name */
    public long f6006v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6005w = sparseIntArray;
        sparseIntArray.put(R.id.error_icon, 2);
    }

    @Override // m4.m
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f6006v;
            this.f6006v = 0L;
        }
        String str = this.f5899u;
        if ((j10 & 3) != 0) {
            qu.i0.K(this.f5898t, str);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6006v != 0) {
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
            this.f6006v = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }

    @Override // ba.qt
    public final void r(String str) {
        this.f5899u = str;
        synchronized (this) {
            this.f6006v |= 1;
        }
        a(7);
        m();
    }
}
