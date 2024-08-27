package ba;

import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class nt extends mt {

    /* renamed from: v, reason: collision with root package name */
    public static final h.c f5609v;

    /* renamed from: u, reason: collision with root package name */
    public long f5610u;

    static {
        h.c cVar = new h.c(3);
        f5609v = cVar;
        cVar.W(0, new int[]{1, 2}, new int[]{R.layout.content_navigation_drawer_header, R.layout.content_navigation_drawer_items}, new String[]{"content_navigation_drawer_header", "content_navigation_drawer_items"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public nt(android.view.View r6) {
        /*
            r5 = this;
            h.c r0 = ba.nt.f5609v
            r1 = 3
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r6, r1, r0, r2)
            r1 = 1
            r1 = r0[r1]
            ba.ie r1 = (ba.ie) r1
            r3 = 2
            r3 = r0[r3]
            ba.ke r3 = (ba.ke) r3
            r5.<init>(r2, r6, r1, r3)
            r3 = -1
            r5.f5610u = r3
            ba.ie r1 = r5.f5498s
            if (r1 == 0) goto L1f
            r1.f27496j = r5
        L1f:
            ba.ke r1 = r5.f5499t
            if (r1 == 0) goto L25
            r1.f27496j = r5
        L25:
            r1 = 0
            r0 = r0[r1]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.nt.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5610u = 0L;
        }
        this.f5498s.c();
        this.f5499t.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5610u != 0) {
                    return true;
                }
                if (this.f5498s.f() || this.f5499t.f()) {
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
            this.f5610u = 4L;
        }
        this.f5498s.h();
        this.f5499t.h();
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
                this.f5610u |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f5610u |= 1;
        }
        return true;
    }
}
