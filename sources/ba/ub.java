package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ub extends r3 {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f6284u;

    /* renamed from: t, reason: collision with root package name */
    public long f6285t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6284u = sparseIntArray;
        sparseIntArray.put(R.id.post_image_view, 1);
        sparseIntArray.put(R.id.remove_image_button, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ub(android.view.View r7) {
        /*
            r6 = this;
            android.util.SparseIntArray r0 = ba.ub.f6284u
            r1 = 3
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r7, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r3 = 2
            r3 = r0[r3]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3 = 0
            r6.<init>(r2, r7, r3, r1)
            r4 = -1
            r6.f6285t = r4
            r0 = r0[r3]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r7.setTag(r0, r6)
            r6.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ub.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6285t = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6285t != 0) {
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
            this.f6285t = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
