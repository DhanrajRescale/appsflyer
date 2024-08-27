package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ov extends nv {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f5697w;

    /* renamed from: v, reason: collision with root package name */
    public long f5698v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5697w = sparseIntArray;
        sparseIntArray.put(R.id.empty_stocks_text, 1);
        sparseIntArray.put(R.id.pie_chart, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ov(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = ba.ov.f5697w
            r1 = 3
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r6, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = 2
            r3 = r0[r3]
            com.github.mikephil.charting.charts.PieChart r3 = (com.github.mikephil.charting.charts.PieChart) r3
            r5.<init>(r2, r6, r1, r3)
            r3 = -1
            r5.f5698v = r3
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ov.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f5698v = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5698v != 0) {
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
            this.f5698v = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
