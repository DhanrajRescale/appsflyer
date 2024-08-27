package ba;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f4879t;

    /* renamed from: s, reason: collision with root package name */
    public long f4880s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4879t = sparseIntArray;
        sparseIntArray.put(R.id.arena_tutorial_view_pager, 1);
        sparseIntArray.put(R.id.page_indicator, 2);
        sparseIntArray.put(R.id.next, 3);
        sparseIntArray.put(R.id.prev, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view) {
        super(null, view, 0);
        Object[] j10 = m4.m.j(view, 5, null, f4879t);
        this.f4880s = -1L;
        ((ConstraintLayout) j10[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        h();
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4880s = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4880s != 0) {
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
            this.f4880s = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
