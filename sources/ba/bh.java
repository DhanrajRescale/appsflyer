package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class bh extends ah {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f4294w;

    /* renamed from: v, reason: collision with root package name */
    public long f4295v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4294w = sparseIntArray;
        sparseIntArray.put(R.id.title, 1);
        sparseIntArray.put(R.id.pin_view, 2);
        sparseIntArray.put(R.id.key_pad, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bh(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = ba.bh.f4294w
            r1 = 4
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r6, r1, r2, r0)
            r1 = 3
            r1 = r0[r1]
            com.assetgro.stockgro.widget.CustomKeyboard r1 = (com.assetgro.stockgro.widget.CustomKeyboard) r1
            r3 = 2
            r3 = r0[r3]
            com.chaos.view.PinView r3 = (com.chaos.view.PinView) r3
            r4 = 1
            r4 = r0[r4]
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5.<init>(r2, r6, r1, r3)
            r3 = -1
            r5.f4295v = r3
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.bh.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4295v = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4295v != 0) {
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
            this.f4295v = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
