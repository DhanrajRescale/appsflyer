package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class tm extends sm {

    /* renamed from: u, reason: collision with root package name */
    public static final h.c f6209u;

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f6210v;

    /* renamed from: t, reason: collision with root package name */
    public long f6211t;

    static {
        h.c cVar = new h.c(4);
        f6209u = cVar;
        cVar.W(0, new int[]{1}, new int[]{R.layout.content_redeemed_offers}, new String[]{"content_redeemed_offers"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6210v = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 2);
        sparseIntArray.put(R.id.toolbar, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tm(android.view.View r6) {
        /*
            r5 = this;
            h.c r0 = ba.tm.f6209u
            android.util.SparseIntArray r1 = ba.tm.f6210v
            r2 = 4
            java.lang.Object[] r0 = m4.m.j(r6, r2, r0, r1)
            r1 = 2
            r1 = r0[r1]
            com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
            r1 = 1
            r1 = r0[r1]
            ba.oe r1 = (ba.oe) r1
            r2 = 3
            r2 = r0[r2]
            androidx.appcompat.widget.Toolbar r2 = (androidx.appcompat.widget.Toolbar) r2
            r2 = 0
            r5.<init>(r2, r6, r1)
            r3 = -1
            r5.f6211t = r3
            ba.oe r1 = r5.f6104s
            if (r1 == 0) goto L26
            r1.f27496j = r5
        L26:
            r1 = 0
            r0 = r0[r1]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.tm.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6211t = 0L;
        }
        this.f6104s.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6211t != 0) {
                    return true;
                }
                if (this.f6104s.f()) {
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
            this.f6211t = 2L;
        }
        this.f6104s.h();
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
            this.f6211t |= 1;
        }
        return true;
    }
}
