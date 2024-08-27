package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* renamed from: ba.do, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cdo extends co {

    /* renamed from: w, reason: collision with root package name */
    public static final h.c f4508w;

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f4509x;

    /* renamed from: v, reason: collision with root package name */
    public long f4510v;

    static {
        h.c cVar = new h.c(5);
        f4508w = cVar;
        cVar.W(0, new int[]{1}, new int[]{R.layout.content_stock}, new String[]{"content_stock"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4509x = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.toolbar_two, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Cdo(android.view.View r8) {
        /*
            r7 = this;
            r1 = 0
            h.c r0 = ba.Cdo.f4508w
            android.util.SparseIntArray r2 = ba.Cdo.f4509x
            r3 = 5
            java.lang.Object[] r6 = m4.m.j(r8, r3, r0, r2)
            r0 = 2
            r0 = r6[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 1
            r0 = r6[r0]
            r3 = r0
            ba.ue r3 = (ba.ue) r3
            r0 = 3
            r0 = r6[r0]
            r4 = r0
            androidx.appcompat.widget.Toolbar r4 = (androidx.appcompat.widget.Toolbar) r4
            r0 = 4
            r0 = r6[r0]
            r5 = r0
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            r0 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r7.f4510v = r0
            ba.ue r0 = r7.f4395s
            if (r0 == 0) goto L30
            r0.f27496j = r7
        L30:
            r0 = 0
            r0 = r6[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r8.setTag(r0, r7)
            r7.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.Cdo.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4510v = 0L;
        }
        this.f4395s.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4510v != 0) {
                    return true;
                }
                if (this.f4395s.f()) {
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
            this.f4510v = 2L;
        }
        this.f4395s.h();
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
            this.f4510v |= 1;
        }
        return true;
    }
}
