package ba;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class z3 extends g {

    /* renamed from: s, reason: collision with root package name */
    public long f6796s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(View view) {
        super(null, view, 0);
        Object[] j10 = m4.m.j(view, 1, null, null);
        this.f6796s = -1L;
        ((ConstraintLayout) j10[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        h();
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6796s = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6796s != 0) {
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
            this.f6796s = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
