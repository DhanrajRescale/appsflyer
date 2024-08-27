package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class s3 extends r3 {

    /* renamed from: u, reason: collision with root package name */
    public static final h.c f6038u;

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f6039v;

    /* renamed from: t, reason: collision with root package name */
    public long f6040t;

    static {
        h.c cVar = new h.c(3);
        f6038u = cVar;
        cVar.W(0, new int[]{1}, new int[]{R.layout.layout_search_stocks}, new String[]{"layout_search_stocks"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6039v = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s3(android.view.View r5) {
        /*
            r4 = this;
            h.c r0 = ba.s3.f6038u
            android.util.SparseIntArray r1 = ba.s3.f6039v
            r2 = 3
            java.lang.Object[] r0 = m4.m.j(r5, r2, r0, r1)
            r1 = 1
            r2 = r0[r1]
            ba.bv r2 = (ba.bv) r2
            r3 = 2
            r3 = r0[r3]
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            r3 = 0
            r4.<init>(r3, r5, r1, r2)
            r1 = -1
            r4.f6040t = r1
            java.lang.Object r1 = r4.f5927s
            ba.bv r1 = (ba.bv) r1
            if (r1 == 0) goto L23
            r1.f27496j = r4
        L23:
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r3)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r5.setTag(r0, r4)
            r4.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.s3.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6040t = 0L;
        }
        ((bv) this.f5927s).c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6040t != 0) {
                    return true;
                }
                if (((bv) this.f5927s).f()) {
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
            this.f6040t = 2L;
        }
        ((bv) this.f5927s).h();
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
            this.f6040t |= 1;
        }
        return true;
    }
}
