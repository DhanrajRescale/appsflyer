package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class jv extends iv {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f5180y;

    /* renamed from: x, reason: collision with root package name */
    public long f5181x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5180y = sparseIntArray;
        sparseIntArray.put(R.id.change_price, 1);
        sparseIntArray.put(R.id.separator, 2);
        sparseIntArray.put(R.id.change_percentage, 3);
        sparseIntArray.put(R.id.change_type_icon, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public jv(android.view.View r10) {
        /*
            r9 = this;
            r6 = 0
            android.util.SparseIntArray r0 = ba.jv.f5180y
            r1 = 5
            r7 = 0
            java.lang.Object[] r8 = m4.m.j(r10, r1, r7, r0)
            r0 = 3
            r0 = r8[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 1
            r0 = r8[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 4
            r0 = r8[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 2
            r0 = r8[r0]
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r9.f5181x = r0
            r0 = 0
            r0 = r8[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r7)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r10.setTag(r0, r9)
            r9.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.jv.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5181x = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5181x != 0) {
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
            this.f5181x = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
