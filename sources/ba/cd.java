package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class cd extends bd {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f4351v;

    /* renamed from: u, reason: collision with root package name */
    public long f4352u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4351v = sparseIntArray;
        sparseIntArray.put(R.id.stock_holdings_pie_chart, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cd(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = ba.cd.f4351v
            r1 = 2
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r6, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            com.assetgro.stockgro.widget.StockHoldingsPieChartView r1 = (com.assetgro.stockgro.widget.StockHoldingsPieChartView) r1
            r5.<init>(r2, r6, r1)
            r3 = -1
            r5.f4352u = r3
            r1 = 0
            r0 = r0[r1]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.cd.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4352u = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4352u != 0) {
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
            this.f4352u = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
