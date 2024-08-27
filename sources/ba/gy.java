package ba;

import android.util.SparseIntArray;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class gy extends fy {
    public static final SparseIntArray K;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.data_container, 4);
        sparseIntArray.put(R.id.trade_view_performance_title, 5);
        sparseIntArray.put(R.id.tade_view_info, 6);
        sparseIntArray.put(R.id.trade_view_tab_layout_container, 7);
        sparseIntArray.put(R.id.trade_view_tab_layout, 8);
        sparseIntArray.put(R.id.trade_view_performance_container, 9);
        sparseIntArray.put(R.id.hit_rate_progress, 10);
        sparseIntArray.put(R.id.hit_rate_icon, 11);
        sparseIntArray.put(R.id.hit_rate_value, 12);
        sparseIntArray.put(R.id.hit_rate_title, 13);
        sparseIntArray.put(R.id.trade_view_data_container, 14);
        sparseIntArray.put(R.id.total_trade_value, 15);
        sparseIntArray.put(R.id.missed_trade_value, 16);
        sparseIntArray.put(R.id.profit_hit_value, 17);
        sparseIntArray.put(R.id.no_trade_view_performance_container, 18);
        sparseIntArray.put(R.id.no_data_icon, 19);
        sparseIntArray.put(R.id.no_data_message, 20);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public gy(android.view.View r20) {
        /*
            Method dump skipped, instructions count: 192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.gy.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.J     // Catch: java.lang.Throwable -> L40
            r2 = 0
            r8.J = r2     // Catch: java.lang.Throwable -> L40
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L40
            com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto$TradeViewsPerformance r4 = r8.E
            r5 = 3
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L2c
            if (r4 == 0) goto L19
            com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto$TradeViewsPerformance$Config r2 = r4.getConfig()
            goto L1a
        L19:
            r2 = r1
        L1a:
            if (r2 == 0) goto L2c
            java.lang.String r1 = r2.getProfitHitTitle()
            java.lang.String r3 = r2.getMissedTradesTitle()
            java.lang.String r2 = r2.getTotalTradesTitle()
            r7 = r2
            r2 = r1
            r1 = r7
            goto L2e
        L2c:
            r2 = r1
            r3 = r2
        L2e:
            if (r0 == 0) goto L3f
            android.widget.TextView r0 = r8.G
            qu.i0.K(r0, r1)
            android.widget.TextView r0 = r8.H
            qu.i0.K(r0, r3)
            android.widget.TextView r0 = r8.I
            qu.i0.K(r0, r2)
        L3f:
            return
        L40:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L40
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.gy.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.J != 0) {
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
            this.J = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
