package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class cb extends bb {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public long f4348z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.breakeven_title, 5);
        sparseIntArray.put(R.id.to_breakeven_title, 6);
        sparseIntArray.put(R.id.change_view, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cb(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.cb.A
            r2 = 8
            r8 = 0
            java.lang.Object[] r9 = m4.m.j(r11, r2, r8, r0)
            r0 = 5
            r0 = r9[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 3
            r0 = r9[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 7
            r0 = r9[r0]
            r4 = r0
            com.assetgro.stockgro.widget.StockChangeInfoView r4 = (com.assetgro.stockgro.widget.StockChangeInfoView) r4
            r0 = 2
            r0 = r9[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            r0 = r9[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 6
            r0 = r9[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 4
            r0 = r9[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r10.f4348z = r0
            android.widget.TextView r0 = r10.f4276s
            r0.setTag(r8)
            android.widget.TextView r0 = r10.f4278u
            r0.setTag(r8)
            r0 = 0
            r0 = r9[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r8)
            android.widget.TextView r0 = r10.f4279v
            r0.setTag(r8)
            android.widget.TextView r0 = r10.f4280w
            r0.setTag(r8)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r11.setTag(r0, r10)
            r10.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.cb.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.f4348z     // Catch: java.lang.Throwable -> L5c
            r2 = 0
            r8.f4348z = r2     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5c
            com.assetgro.stockgro.feature_market.presentation.fno.chain.OptionChainItemViewModel r4 = r8.f4281x
            r5 = 7
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L39
            if (r4 == 0) goto L17
            androidx.lifecycle.e0 r2 = r4.f9075c
            goto L18
        L17:
            r2 = r1
        L18:
            r3 = 0
            r8.q(r3, r2)
            if (r2 == 0) goto L25
            java.lang.Object r2 = r2.getValue()
            com.assetgro.stockgro.feature_market.domain.model.OptionContract r2 = (com.assetgro.stockgro.feature_market.domain.model.OptionContract) r2
            goto L26
        L25:
            r2 = r1
        L26:
            if (r2 == 0) goto L39
            java.lang.String r1 = r2.getName()
            double r3 = r2.getBreakEven()
            java.lang.String r5 = r2.getBreakEvenPercentage()
            double r6 = r2.getPremium()
            goto L3d
        L39:
            r3 = 0
            r5 = r1
            r6 = r3
        L3d:
            if (r0 == 0) goto L5b
            android.widget.TextView r0 = r8.f4276s
            java.lang.Double r2 = java.lang.Double.valueOf(r3)
            al.d.N0(r0, r2)
            android.widget.TextView r0 = r8.f4278u
            java.lang.Double r2 = java.lang.Double.valueOf(r6)
            al.d.N0(r0, r2)
            android.widget.TextView r0 = r8.f4279v
            qu.i0.K(r0, r1)
            android.widget.TextView r0 = r8.f4280w
            qu.i0.K(r0, r5)
        L5b:
            return
        L5c:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.cb.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4348z != 0) {
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
            this.f4348z = 4L;
        }
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
            this.f4348z |= 1;
        }
        return true;
    }
}
