package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class g8 extends r3 {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f4784u;

    /* renamed from: t, reason: collision with root package name */
    public long f4785t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4784u = sparseIntArray;
        sparseIntArray.put(R.id.empty_view, 1);
        sparseIntArray.put(R.id.compose_view, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g8(android.view.View r7) {
        /*
            r6 = this;
            android.util.SparseIntArray r0 = ba.g8.f4784u
            r1 = 3
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r7, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            androidx.compose.ui.platform.ComposeView r1 = (androidx.compose.ui.platform.ComposeView) r1
            r3 = 1
            r3 = r0[r3]
            android.view.View r3 = (android.view.View) r3
            r3 = 0
            r6.<init>(r2, r7, r3, r1)
            r4 = -1
            r6.f4785t = r4
            r0 = r0[r3]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r7.setTag(r0, r6)
            r6.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.g8.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4785t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4785t != 0) {
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
            this.f4785t = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
