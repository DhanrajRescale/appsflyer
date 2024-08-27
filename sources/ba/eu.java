package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class eu extends du {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.asset_text, 1);
        sparseIntArray.put(R.id.flip_chart_list_view, 2);
        sparseIntArray.put(R.id.filter_stock_holdings, 3);
        sparseIntArray.put(R.id.portfolio_holdings_stocks_list_layout, 4);
        sparseIntArray.put(R.id.stock_holdings_recycler_view, 5);
        sparseIntArray.put(R.id.portfolio_holdings_stocks_chart_layout, 6);
        sparseIntArray.put(R.id.chart_holder_layout, 7);
        sparseIntArray.put(R.id.stock_holdings_pie_chart, 8);
        sparseIntArray.put(R.id.sector_tab_layout, 9);
        sparseIntArray.put(R.id.sector_recycler_view, 10);
        sparseIntArray.put(R.id.pager, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public eu(android.view.View r15) {
        /*
            r14 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.eu.C
            r2 = 12
            r12 = 0
            java.lang.Object[] r13 = m4.m.j(r15, r2, r12, r0)
            r0 = 1
            r0 = r13[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 7
            r0 = r13[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0 = 3
            r0 = r13[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 2
            r0 = r13[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 11
            r0 = r13[r0]
            r5 = r0
            androidx.viewpager2.widget.ViewPager2 r5 = (androidx.viewpager2.widget.ViewPager2) r5
            r0 = 6
            r0 = r13[r0]
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 4
            r0 = r13[r0]
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0 = 10
            r0 = r13[r0]
            r8 = r0
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r0 = 9
            r0 = r13[r0]
            r9 = r0
            com.google.android.material.tabs.TabLayout r9 = (com.google.android.material.tabs.TabLayout) r9
            r0 = 8
            r0 = r13[r0]
            r10 = r0
            com.assetgro.stockgro.widget.StockHoldingsPieChartView r10 = (com.assetgro.stockgro.widget.StockHoldingsPieChartView) r10
            r0 = 5
            r0 = r13[r0]
            r11 = r0
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            r0 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r14.B = r0
            r0 = 0
            r0 = r13[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r12)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r15.setTag(r0, r14)
            r14.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.eu.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.B = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.B != 0) {
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
            this.B = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
