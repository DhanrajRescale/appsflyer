package ba;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class l7 extends g {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f5321t;

    /* renamed from: s, reason: collision with root package name */
    public long f5322s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5321t = sparseIntArray;
        sparseIntArray.put(R.id.ongoing_leagues_title, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(View view) {
        super(null, view, 0);
        Object[] j10 = m4.m.j(view, 2, null, f5321t);
        this.f5322s = -1L;
        ((ConstraintLayout) j10[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        h();
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5322s = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5322s != 0) {
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
            this.f5322s = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
