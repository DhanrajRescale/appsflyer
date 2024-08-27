package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class vp extends up {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public long f6462z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.reported_user_banner_container, 1);
        sparseIntArray.put(R.id.reported_user_display_status, 2);
        sparseIntArray.put(R.id.no_stocks_in_other_player_default_portfolio_container, 3);
        sparseIntArray.put(R.id.image, 4);
        sparseIntArray.put(R.id.portfolio_holdings_stocks_chart_layout, 5);
        sparseIntArray.put(R.id.chart_holder_layout, 6);
        sparseIntArray.put(R.id.stock_holdings_pie_chart, 7);
        sparseIntArray.put(R.id.sector_recycler_view, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public vp(android.view.View r13) {
        /*
            r12 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.vp.A
            r2 = 9
            r10 = 0
            java.lang.Object[] r11 = m4.m.j(r13, r2, r10, r0)
            r0 = 6
            r0 = r11[r0]
            r3 = r0
            androidx.cardview.widget.CardView r3 = (androidx.cardview.widget.CardView) r3
            r0 = 4
            r0 = r11[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 3
            r0 = r11[r0]
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0 = 5
            r0 = r11[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 1
            r0 = r11[r0]
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 2
            r0 = r11[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 8
            r0 = r11[r0]
            r8 = r0
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r0 = 7
            r0 = r11[r0]
            r9 = r0
            com.assetgro.stockgro.widget.StockHoldingsPieChartView r9 = (com.assetgro.stockgro.widget.StockHoldingsPieChartView) r9
            r0 = r12
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r12.f6462z = r0
            r0 = 0
            r0 = r11[r0]
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r0.setTag(r10)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r13.setTag(r0, r12)
            r12.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.vp.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6462z = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6462z != 0) {
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
            this.f6462z = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
