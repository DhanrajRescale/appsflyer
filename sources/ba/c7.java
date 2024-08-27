package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class c7 extends b7 {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.option_image, 5);
        sparseIntArray.put(R.id.change_view, 6);
        sparseIntArray.put(R.id.sector_background, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c7(android.view.View r12) {
        /*
            r11 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.c7.B
            r2 = 8
            r9 = 0
            java.lang.Object[] r10 = m4.m.j(r12, r2, r9, r0)
            r0 = 6
            r0 = r10[r0]
            r3 = r0
            com.assetgro.stockgro.widget.StockChangeInfoView r3 = (com.assetgro.stockgro.widget.StockChangeInfoView) r3
            r0 = 3
            r0 = r10[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 5
            r0 = r10[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 1
            r0 = r10[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 4
            r0 = r10[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 7
            r0 = r10[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 2
            r0 = r10[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -1
            r11.A = r0
            android.widget.TextView r0 = r11.f4263t
            r0.setTag(r9)
            r0 = 0
            r0 = r10[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0.setTag(r9)
            android.widget.TextView r0 = r11.f4265v
            r0.setTag(r9)
            android.widget.TextView r0 = r11.f4266w
            r0.setTag(r9)
            android.widget.TextView r0 = r11.f4267x
            r0.setTag(r9)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r12.setTag(r0, r11)
            r11.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.c7.<init>(android.view.View):void");
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
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.A     // Catch: java.lang.Throwable -> L58
            r2 = 0
            r7.A = r2     // Catch: java.lang.Throwable -> L58
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L58
            com.assetgro.stockgro.feature_market.presentation.market.search.adapter.AdvancedSearchOptionsItemViewModel r4 = r7.f4268y
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
            r7.q(r3, r2)
            if (r2 == 0) goto L25
            java.lang.Object r2 = r2.getValue()
            com.assetgro.stockgro.feature_market.data.remote.FnoOptionDto r2 = (com.assetgro.stockgro.feature_market.data.remote.FnoOptionDto) r2
            goto L26
        L25:
            r2 = r1
        L26:
            if (r2 == 0) goto L39
            java.lang.String r1 = r2.getName()
            java.lang.String r3 = r2.getSector()
            double r4 = r2.getLtp()
            java.lang.String r2 = r2.getTag()
            goto L3d
        L39:
            r4 = 0
            r2 = r1
            r3 = r2
        L3d:
            if (r0 == 0) goto L57
            android.widget.TextView r0 = r7.f4263t
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            al.d.N0(r0, r4)
            android.widget.TextView r0 = r7.f4265v
            qu.i0.K(r0, r1)
            android.widget.TextView r0 = r7.f4266w
            qu.i0.K(r0, r3)
            android.widget.TextView r0 = r7.f4267x
            qu.i0.K(r0, r2)
        L57:
            return
        L58:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L58
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.c7.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.A != 0) {
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
            this.A = 4L;
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
            this.A |= 1;
        }
        return true;
    }
}
