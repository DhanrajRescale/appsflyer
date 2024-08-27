package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class sx extends mf {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f6131u;

    /* renamed from: t, reason: collision with root package name */
    public long f6132t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6131u = sparseIntArray;
        sparseIntArray.put(R.id.facebook_auth_container, 1);
        sparseIntArray.put(R.id.facebook_icon, 2);
        sparseIntArray.put(R.id.socialFacebookButton, 3);
        sparseIntArray.put(R.id.linkedin_auth_container, 4);
        sparseIntArray.put(R.id.linkedin_icon, 5);
        sparseIntArray.put(R.id.socialLinkedInButton, 6);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6132t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6132t != 0) {
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
            this.f6132t = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
