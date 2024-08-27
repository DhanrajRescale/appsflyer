package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ix extends hx {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f5095u;

    /* renamed from: t, reason: collision with root package name */
    public long f5096t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5095u = sparseIntArray;
        sparseIntArray.put(R.id.rl_document_container, 1);
        sparseIntArray.put(R.id.document_chat_file_thumbnail, 2);
        sparseIntArray.put(R.id.tvDocumentName, 3);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5096t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5096t != 0) {
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
            this.f5096t = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
