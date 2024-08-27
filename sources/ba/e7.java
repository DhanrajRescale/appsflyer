package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class e7 extends d7 {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public long f4579z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.option_image, 5);
        sparseIntArray.put(R.id.sector_background, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e7(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.e7.A
            r2 = 7
            r8 = 0
            java.lang.Object[] r9 = m4.m.j(r11, r2, r8, r0)
            r0 = 3
            r0 = r9[r0]
            r3 = r0
            com.assetgro.stockgro.widget.StockChangeInfoView r3 = (com.assetgro.stockgro.widget.StockChangeInfoView) r3
            r0 = 2
            r0 = r9[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 5
            r0 = r9[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 1
            r0 = r9[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 4
            r0 = r9[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 6
            r0 = r9[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r10.f4579z = r0
            com.assetgro.stockgro.widget.StockChangeInfoView r0 = r10.f4452s
            r0.setTag(r8)
            android.widget.TextView r0 = r10.f4453t
            r0.setTag(r8)
            r0 = 0
            r0 = r9[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0.setTag(r8)
            android.widget.TextView r0 = r10.f4455v
            r0.setTag(r8)
            android.widget.TextView r0 = r10.f4456w
            r0.setTag(r8)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r11.setTag(r0, r10)
            r10.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.e7.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
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
            long r0 = r7.f4579z     // Catch: java.lang.Throwable -> L64
            r2 = 0
            r7.f4579z = r2     // Catch: java.lang.Throwable -> L64
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L64
            com.assetgro.stockgro.feature_market.presentation.market.search.adapter.AdvancedSearchStocksItemViewModel r4 = r7.f4457x
            r5 = 7
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L3b
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
            if (r2 == 0) goto L3b
            java.lang.String r1 = r2.getName()
            java.lang.String r3 = r2.getSector()
            com.assetgro.stockgro.data.model.ChangeDto r4 = r2.getChange()
            double r5 = r2.getLtp()
            r2 = r1
            r1 = r4
            goto L3f
        L3b:
            r5 = 0
            r2 = r1
            r3 = r2
        L3f:
            if (r0 == 0) goto L63
            com.assetgro.stockgro.widget.StockChangeInfoView r0 = r7.f4452s
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "changeDto"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            r0.a(r1)
            android.widget.TextView r0 = r7.f4453t
            java.lang.Double r1 = java.lang.Double.valueOf(r5)
            al.d.N0(r0, r1)
            android.widget.TextView r0 = r7.f4455v
            qu.i0.K(r0, r2)
            android.widget.TextView r0 = r7.f4456w
            qu.i0.K(r0, r3)
        L63:
            return
        L64:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L64
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.e7.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4579z != 0) {
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
            this.f4579z = 4L;
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
            this.f4579z |= 1;
        }
        return true;
    }
}
