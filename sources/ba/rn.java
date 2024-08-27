package ba;

import android.util.SparseIntArray;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.Group;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.v2.presentation.analysis.StockAnalysisViewModel;

/* loaded from: classes.dex */
public final class rn extends qn {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f5984y;

    /* renamed from: v, reason: collision with root package name */
    public final ProgressBar f5985v;

    /* renamed from: w, reason: collision with root package name */
    public final Group f5986w;

    /* renamed from: x, reason: collision with root package name */
    public long f5987x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5984y = sparseIntArray;
        sparseIntArray.put(R.id.stock_analysis_tab_layout, 3);
        sparseIntArray.put(R.id.stock_analysis_view_pager, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public rn(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = ba.rn.f5984y
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r6, r1, r2, r0)
            r1 = 3
            r1 = r0[r1]
            com.google.android.material.tabs.TabLayout r1 = (com.google.android.material.tabs.TabLayout) r1
            r3 = 4
            r3 = r0[r3]
            androidx.viewpager2.widget.ViewPager2 r3 = (androidx.viewpager2.widget.ViewPager2) r3
            r5.<init>(r2, r6, r1, r3)
            r3 = -1
            r5.f5987x = r3
            r1 = 0
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1.setTag(r2)
            r1 = 1
            r1 = r0[r1]
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r5.f5985v = r1
            r1.setTag(r2)
            r1 = 2
            r0 = r0[r1]
            androidx.constraintlayout.widget.Group r0 = (androidx.constraintlayout.widget.Group) r0
            r5.f5986w = r0
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.rn.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        int i10;
        androidx.lifecycle.e0 e0Var;
        long j11;
        synchronized (this) {
            j10 = this.f5987x;
            this.f5987x = 0L;
        }
        StockAnalysisViewModel stockAnalysisViewModel = this.f5882u;
        long j12 = j10 & 7;
        int i11 = 0;
        if (j12 != 0) {
            Boolean bool = null;
            if (stockAnalysisViewModel != null) {
                e0Var = stockAnalysisViewModel.f9084g;
            } else {
                e0Var = null;
            }
            q(0, e0Var);
            if (e0Var != null) {
                bool = (Boolean) e0Var.getValue();
            }
            boolean o10 = m4.m.o(bool);
            if (j12 != 0) {
                if (o10) {
                    j11 = 80;
                } else {
                    j11 = 40;
                }
                j10 |= j11;
            }
            if (o10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            if (!o10) {
                i11 = 8;
            }
        } else {
            i10 = 0;
        }
        if ((j10 & 7) != 0) {
            this.f5985v.setVisibility(i11);
            this.f5986w.setVisibility(i10);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5987x != 0) {
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
            this.f5987x = 4L;
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
            this.f5987x |= 1;
        }
        return true;
    }
}
