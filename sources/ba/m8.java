package ba;

import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class m8 extends l8 {

    /* renamed from: x, reason: collision with root package name */
    public static final h.c f5447x;

    /* renamed from: w, reason: collision with root package name */
    public long f5448w;

    static {
        h.c cVar = new h.c(4);
        f5447x = cVar;
        cVar.W(1, new int[]{2, 3}, new int[]{R.layout.layout_horizontal_discover_category, R.layout.layout_vertical_discover_category}, new String[]{"layout_horizontal_discover_category", "layout_vertical_discover_category"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m8(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            h.c r0 = ba.m8.f5447x
            r2 = 4
            r6 = 0
            java.lang.Object[] r7 = m4.m.j(r9, r2, r0, r6)
            r0 = 1
            r0 = r7[r0]
            r3 = r0
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0 = 2
            r0 = r7[r0]
            r4 = r0
            ba.pr r4 = (ba.pr) r4
            r0 = 3
            r0 = r7[r0]
            r5 = r0
            ba.aw r5 = (ba.aw) r5
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f5448w = r0
            android.widget.LinearLayout r0 = r8.f5324s
            r0.setTag(r6)
            ba.pr r0 = r8.f5325t
            if (r0 == 0) goto L2f
            r0.f27496j = r8
        L2f:
            ba.aw r0 = r8.f5326u
            if (r0 == 0) goto L35
            r0.f27496j = r8
        L35:
            r0 = 0
            r0 = r7[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r6)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.m8.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5448w = 0L;
        }
        this.f5325t.c();
        this.f5326u.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5448w != 0) {
                    return true;
                }
                if (this.f5325t.f() || this.f5326u.f()) {
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
            this.f5448w = 4L;
        }
        this.f5325t.h();
        this.f5326u.h();
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
                this.f5448w |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f5448w |= 1;
        }
        return true;
    }
}
