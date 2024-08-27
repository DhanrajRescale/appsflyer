package ba;

import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class uc extends tc {
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public final Group I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.approach_narration_icon, 10);
        sparseIntArray.put(R.id.calculated_value, 11);
        sparseIntArray.put(R.id.no_data_icon, 12);
        sparseIntArray.put(R.id.calculated_value_container, 13);
        sparseIntArray.put(R.id.gauge_container, 14);
        sparseIntArray.put(R.id.ic_stock_analysis_v2, 15);
        sparseIntArray.put(R.id.needle, 16);
        sparseIntArray.put(R.id.needle_pivot, 17);
        sparseIntArray.put(R.id.fair_value_title, 18);
        sparseIntArray.put(R.id.market_price_title, 19);
        sparseIntArray.put(R.id.discount_title, 20);
        sparseIntArray.put(R.id.market_slider_1, 21);
        sparseIntArray.put(R.id.market_slider_2, 22);
        sparseIntArray.put(R.id.market_slider_3, 23);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public uc(android.view.View r21) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.uc.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.uc.b():void");
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
            this.J = 64L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return false;
                        }
                        if (i11 != 0) {
                            return false;
                        }
                        synchronized (this) {
                            this.J |= 16;
                        }
                        return true;
                    }
                    if (i11 != 0) {
                        return false;
                    }
                    synchronized (this) {
                        this.J |= 8;
                    }
                    return true;
                }
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.J |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.J |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.J |= 1;
        }
        return true;
    }
}
