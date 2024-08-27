package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class oy extends ny {
    public static final SparseIntArray H;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.keyboard, 1);
        sparseIntArray.put(R.id.key_1, 2);
        sparseIntArray.put(R.id.key_2, 3);
        sparseIntArray.put(R.id.key_3, 4);
        sparseIntArray.put(R.id.key_4, 5);
        sparseIntArray.put(R.id.key_5, 6);
        sparseIntArray.put(R.id.key_6, 7);
        sparseIntArray.put(R.id.key_7, 8);
        sparseIntArray.put(R.id.key_8, 9);
        sparseIntArray.put(R.id.key_9, 10);
        sparseIntArray.put(R.id.key_clear, 11);
        sparseIntArray.put(R.id.key_0, 12);
        sparseIntArray.put(R.id.key_forward, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public oy(android.view.View r21) {
        /*
            r20 = this;
            r15 = r20
            r14 = r21
            r1 = 0
            android.util.SparseIntArray r0 = ba.oy.H
            r2 = 14
            r13 = 0
            java.lang.Object[] r16 = m4.m.j(r14, r2, r13, r0)
            r0 = 12
            r0 = r16[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 2
            r0 = r16[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 3
            r0 = r16[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 4
            r0 = r16[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 5
            r0 = r16[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 6
            r0 = r16[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 7
            r0 = r16[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 8
            r0 = r16[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 9
            r0 = r16[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 10
            r0 = r16[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 11
            r0 = r16[r0]
            r17 = r0
            android.widget.ImageButton r17 = (android.widget.ImageButton) r17
            r0 = 13
            r0 = r16[r0]
            r18 = r0
            android.widget.ImageButton r18 = (android.widget.ImageButton) r18
            r0 = 1
            r0 = r16[r0]
            r19 = r0
            android.widget.TableLayout r19 = (android.widget.TableLayout) r19
            r0 = r20
            r2 = r21
            r13 = r17
            r14 = r18
            r15 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = -1
            r2 = r20
            r2.G = r0
            r0 = 0
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r1 = r21
            r1.setTag(r0, r2)
            r20.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.oy.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.G != 0) {
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
            this.G = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
