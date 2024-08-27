package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class vm extends um {

    /* renamed from: v, reason: collision with root package name */
    public static final h.c f6451v;

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f6452w;

    /* renamed from: u, reason: collision with root package name */
    public long f6453u;

    static {
        h.c cVar = new h.c(4);
        f6451v = cVar;
        cVar.W(0, new int[]{1}, new int[]{R.layout.content_redemption_offers_list}, new String[]{"content_redemption_offers_list"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6452w = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 2);
        sparseIntArray.put(R.id.toolbar, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public vm(android.view.View r5) {
        /*
            r4 = this;
            h.c r0 = ba.vm.f6451v
            android.util.SparseIntArray r1 = ba.vm.f6452w
            r2 = 4
            java.lang.Object[] r0 = m4.m.j(r5, r2, r0, r1)
            r1 = 2
            r1 = r0[r1]
            com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
            r1 = 1
            r1 = r0[r1]
            ba.qe r1 = (ba.qe) r1
            r2 = 3
            r2 = r0[r2]
            androidx.appcompat.widget.Toolbar r2 = (androidx.appcompat.widget.Toolbar) r2
            r3 = 0
            r4.<init>(r3, r5, r1, r2)
            r1 = -1
            r4.f6453u = r1
            ba.qe r1 = r4.f6329s
            if (r1 == 0) goto L26
            r1.f27496j = r4
        L26:
            r1 = 0
            r0 = r0[r1]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r0.setTag(r3)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r5.setTag(r0, r4)
            r4.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.vm.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6453u = 0L;
        }
        this.f6329s.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6453u != 0) {
                    return true;
                }
                if (this.f6329s.f()) {
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
            this.f6453u = 2L;
        }
        this.f6329s.h();
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
            this.f6453u |= 1;
        }
        return true;
    }
}
