package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class h2 extends g2 {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f4885x;

    /* renamed from: w, reason: collision with root package name */
    public long f4886w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4885x = sparseIntArray;
        sparseIntArray.put(R.id.surface, 1);
        sparseIntArray.put(R.id.play_video_button, 2);
        sparseIntArray.put(R.id.progress_bar, 3);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4886w = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4886w != 0) {
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
            this.f4886w = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
