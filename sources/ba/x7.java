package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class x7 extends w7 {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public long f6620z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.menu_button, 4);
        sparseIntArray.put(R.id.chat_button, 5);
        sparseIntArray.put(R.id.cell_divider, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x7(android.view.View r11) {
        /*
            r10 = this;
            r7 = 0
            android.util.SparseIntArray r0 = ba.x7.A
            r1 = 7
            r8 = 0
            java.lang.Object[] r9 = m4.m.j(r11, r1, r8, r0)
            r0 = 6
            r0 = r9[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 5
            r0 = r9[r0]
            r2 = r0
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0 = 2
            r0 = r9[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            r0 = r9[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 4
            r0 = r9[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 3
            r0 = r9[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = r10
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r10.f6620z = r0
            android.widget.TextView r0 = r10.f6510t
            r0.setTag(r8)
            r0 = 0
            r0 = r9[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r8)
            android.widget.ImageView r0 = r10.f6511u
            r0.setTag(r8)
            android.widget.TextView r0 = r10.f6513w
            r0.setTag(r8)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r11.setTag(r0, r10)
            r10.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.x7.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r19)
            long r2 = r1.f6620z     // Catch: java.lang.Throwable -> L8b
            r4 = 0
            r1.f6620z = r4     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L8b
            com.assetgro.stockgro.ui.social.presentation.block.BlockUserListItemViewModel r0 = r1.f6514x
            r6 = 31
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 28
            r9 = 26
            r11 = 0
            r12 = 25
            if (r6 == 0) goto L68
            long r15 = r2 & r12
            int r6 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r6 == 0) goto L32
            if (r0 == 0) goto L25
            androidx.lifecycle.d0 r6 = r0.f10119j
            goto L26
        L25:
            r6 = 0
        L26:
            r1.q(r11, r6)
            if (r6 == 0) goto L32
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            goto L33
        L32:
            r6 = 0
        L33:
            long r15 = r2 & r9
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L4c
            if (r0 == 0) goto L3e
            androidx.lifecycle.d0 r15 = r0.f10116g
            goto L3f
        L3e:
            r15 = 0
        L3f:
            r14 = 1
            r1.q(r14, r15)
            if (r15 == 0) goto L4c
            java.lang.Object r14 = r15.getValue()
            java.lang.String r14 = (java.lang.String) r14
            goto L4d
        L4c:
            r14 = 0
        L4d:
            long r17 = r2 & r7
            int r15 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r15 == 0) goto L66
            if (r0 == 0) goto L58
            androidx.lifecycle.d0 r0 = r0.f10117h
            goto L59
        L58:
            r0 = 0
        L59:
            r15 = 2
            r1.q(r15, r0)
            if (r0 == 0) goto L66
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            goto L6b
        L66:
            r0 = 0
            goto L6b
        L68:
            r0 = 0
            r6 = 0
            r14 = 0
        L6b:
            long r9 = r9 & r2
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L75
            android.widget.TextView r9 = r1.f6510t
            qu.i0.K(r9, r14)
        L75:
            long r9 = r2 & r12
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L80
            android.widget.ImageView r9 = r1.f6511u
            zq.f.X(r9, r6, r11)
        L80:
            long r2 = r2 & r7
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L8a
            android.widget.TextView r2 = r1.f6513w
            qu.i0.K(r2, r0)
        L8a:
            return
        L8b:
            r0 = move-exception
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L8b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.x7.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6620z != 0) {
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
            this.f6620z = 16L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f6620z |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f6620z |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f6620z |= 1;
        }
        return true;
    }
}
