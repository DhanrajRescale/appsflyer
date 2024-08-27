package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class t extends s {

    /* renamed from: v, reason: collision with root package name */
    public static final h.c f6133v;

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f6134w;

    /* renamed from: u, reason: collision with root package name */
    public long f6135u;

    static {
        h.c cVar = new h.c(6);
        f6133v = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.layout_create_account_footer}, new String[]{"layout_create_account_footer"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6134w = sparseIntArray;
        sparseIntArray.put(R.id.illustration, 3);
        sparseIntArray.put(R.id.login_account_label, 4);
        sparseIntArray.put(R.id.account_deletion_text, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t(android.view.View r5) {
        /*
            r4 = this;
            h.c r0 = ba.t.f6133v
            android.util.SparseIntArray r1 = ba.t.f6134w
            r2 = 6
            java.lang.Object[] r0 = m4.m.j(r5, r2, r0, r1)
            r1 = 5
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 2
            r2 = r0[r2]
            ba.uq r2 = (ba.uq) r2
            r3 = 3
            r3 = r0[r3]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3 = 4
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3 = 0
            r4.<init>(r3, r5, r1, r2)
            r1 = -1
            r4.f6135u = r1
            ba.uq r1 = r4.f6024t
            if (r1 == 0) goto L2b
            r1.f27496j = r4
        L2b:
            r1 = 0
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1.setTag(r3)
            r1 = 1
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r3)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r5.setTag(r0, r4)
            r4.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.t.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6135u = 0L;
        }
        this.f6024t.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6135u != 0) {
                    return true;
                }
                if (this.f6024t.f()) {
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
            this.f6135u = 2L;
        }
        this.f6024t.h();
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            return false;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f6135u |= 1;
        }
        return true;
    }
}
