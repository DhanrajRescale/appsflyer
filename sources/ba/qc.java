package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.search.history.SearchHistoryItemViewModel;

/* loaded from: classes.dex */
public final class qc extends pc {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f5842w;

    /* renamed from: v, reason: collision with root package name */
    public long f5843v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5842w = sparseIntArray;
        sparseIntArray.put(R.id.ic_search_history, 2);
        sparseIntArray.put(R.id.ic_search_history_expand, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public qc(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = ba.qc.f5842w
            r1 = 4
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r6, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 3
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 1
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5.<init>(r2, r6, r1)
            r3 = -1
            r5.f5843v = r3
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            android.widget.TextView r0 = r5.f5758s
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.qc.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        androidx.lifecycle.d0 d0Var;
        synchronized (this) {
            j10 = this.f5843v;
            this.f5843v = 0L;
        }
        SearchHistoryItemViewModel searchHistoryItemViewModel = this.f5759t;
        long j11 = j10 & 7;
        String str = null;
        if (j11 != 0) {
            if (searchHistoryItemViewModel != null) {
                d0Var = searchHistoryItemViewModel.f9449g;
            } else {
                d0Var = null;
            }
            q(0, d0Var);
            if (d0Var != null) {
                str = (String) d0Var.getValue();
            }
        }
        if (j11 != 0) {
            qu.i0.K(this.f5758s, str);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5843v != 0) {
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
            this.f5843v = 4L;
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
            this.f5843v |= 1;
        }
        return true;
    }
}
