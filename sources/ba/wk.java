package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class wk extends vk {

    /* renamed from: w, reason: collision with root package name */
    public static final h.c f6540w;

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f6541x;

    /* renamed from: v, reason: collision with root package name */
    public long f6542v;

    static {
        h.c cVar = new h.c(5);
        f6540w = cVar;
        cVar.W(0, new int[]{1}, new int[]{R.layout.content_modify_order_confirmation}, new String[]{"content_modify_order_confirmation"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6541x = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.buy, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public wk(android.view.View r8) {
        /*
            r7 = this;
            r1 = 0
            h.c r0 = ba.wk.f6540w
            android.util.SparseIntArray r2 = ba.wk.f6541x
            r3 = 5
            java.lang.Object[] r6 = m4.m.j(r8, r3, r0, r2)
            r0 = 2
            r0 = r6[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 4
            r0 = r6[r0]
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0 = 1
            r0 = r6[r0]
            r4 = r0
            ba.ce r4 = (ba.ce) r4
            r0 = 3
            r0 = r6[r0]
            r5 = r0
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            r0 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r7.f6542v = r0
            ba.ce r0 = r7.f6446t
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
        throw new UnsupportedOperationException("Method not decompiled: ba.wk.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6542v = 0L;
        }
        this.f6446t.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6542v != 0) {
                    return true;
                }
                if (this.f6446t.f()) {
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
            this.f6542v = 2L;
        }
        this.f6446t.h();
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
            this.f6542v |= 1;
        }
        return true;
    }
}
