package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class v2 extends u2 {

    /* renamed from: w, reason: collision with root package name */
    public static final h.c f6369w;

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f6370x;

    /* renamed from: v, reason: collision with root package name */
    public long f6371v;

    static {
        h.c cVar = new h.c(4);
        f6369w = cVar;
        cVar.W(0, new int[]{1}, new int[]{R.layout.content_offer_details}, new String[]{"content_offer_details"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6370x = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.progress_bar, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v2(android.view.View r8) {
        /*
            r7 = this;
            r1 = 0
            h.c r0 = ba.v2.f6369w
            android.util.SparseIntArray r2 = ba.v2.f6370x
            r3 = 4
            java.lang.Object[] r6 = m4.m.j(r8, r3, r0, r2)
            r0 = 1
            r0 = r6[r0]
            r3 = r0
            ba.me r3 = (ba.me) r3
            r0 = 3
            r0 = r6[r0]
            r4 = r0
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            r0 = 2
            r0 = r6[r0]
            r5 = r0
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            r0 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r7.f6371v = r0
            ba.me r0 = r7.f6263s
            if (r0 == 0) goto L2b
            r0.f27496j = r7
        L2b:
            r0 = 0
            r0 = r6[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r8.setTag(r0, r7)
            r7.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.v2.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6371v = 0L;
        }
        this.f6263s.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6371v != 0) {
                    return true;
                }
                if (this.f6263s.f()) {
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
            this.f6371v = 2L;
        }
        this.f6263s.h();
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
            this.f6371v |= 1;
        }
        return true;
    }
}
