package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class zm extends ym {

    /* renamed from: w, reason: collision with root package name */
    public static final h.c f6866w;

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f6867x;

    /* renamed from: v, reason: collision with root package name */
    public long f6868v;

    static {
        h.c cVar = new h.c(5);
        f6866w = cVar;
        cVar.W(1, new int[]{2, 3}, new int[]{R.layout.view_allow_contact_access, R.layout.layout_search_contact}, new String[]{"view_allow_contact_access", "layout_search_contact"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6867x = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zm(android.view.View r8) {
        /*
            r7 = this;
            r1 = 0
            h.c r0 = ba.zm.f6866w
            android.util.SparseIntArray r2 = ba.zm.f6867x
            r3 = 5
            java.lang.Object[] r6 = m4.m.j(r8, r3, r0, r2)
            r0 = 2
            r0 = r6[r0]
            r3 = r0
            ba.zx r3 = (ba.zx) r3
            r0 = 3
            r0 = r6[r0]
            r4 = r0
            ba.zu r4 = (ba.zu) r4
            r0 = 4
            r0 = r6[r0]
            r5 = r0
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            r0 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r7.f6868v = r0
            ba.zx r0 = r7.f6751s
            if (r0 == 0) goto L2b
            r0.f27496j = r7
        L2b:
            ba.zu r0 = r7.f6752t
            if (r0 == 0) goto L31
            r0.f27496j = r7
        L31:
            r0 = 0
            r0 = r6[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r6[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r8.setTag(r0, r7)
            r7.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.zm.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6868v = 0L;
        }
        this.f6751s.c();
        this.f6752t.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6868v != 0) {
                    return true;
                }
                if (this.f6751s.f() || this.f6752t.f()) {
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
            this.f6868v = 4L;
        }
        this.f6751s.h();
        this.f6752t.h();
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f6868v |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f6868v |= 1;
        }
        return true;
    }
}
