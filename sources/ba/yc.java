package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class yc extends xc {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f6715v;

    /* renamed from: u, reason: collision with root package name */
    public long f6716u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6715v = sparseIntArray;
        sparseIntArray.put(R.id.gyan_mentor, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public yc(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = ba.yc.f6715v
            r1 = 2
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r6, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r5.<init>(r2, r6, r1)
            r3 = -1
            r5.f6716u = r3
            r1 = 0
            r0 = r0[r1]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.yc.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6716u = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6716u != 0) {
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
            this.f6716u = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
