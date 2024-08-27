package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class r0 extends q0 {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public long f5922z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.toolbar_header_layout, 1);
        sparseIntArray.put(R.id.toolbar_layout, 2);
        sparseIntArray.put(R.id.header_layout, 3);
        sparseIntArray.put(R.id.toolbar_title, 4);
        sparseIntArray.put(R.id.options_toolbar_layout, 5);
        sparseIntArray.put(R.id.option_back_button, 6);
        sparseIntArray.put(R.id.options_menu, 7);
        sparseIntArray.put(R.id.group_pinned_messages_recycler_view, 8);
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5922z = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5922z != 0) {
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
            this.f5922z = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
