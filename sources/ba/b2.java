package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class b2 extends a2 {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public static final h.c f4244z;

    /* renamed from: y, reason: collision with root package name */
    public long f4245y;

    static {
        h.c cVar = new h.c(12);
        f4244z = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.layout_market_search_results}, new String[]{"layout_market_search_results"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.search_history_layout, 4);
        sparseIntArray.put(R.id.label_recent, 5);
        sparseIntArray.put(R.id.option_clear_history, 6);
        sparseIntArray.put(R.id.search_history_recycler_view, 7);
        sparseIntArray.put(R.id.explainer_search_results_layout, 8);
        sparseIntArray.put(R.id.no_search_results_layout, 9);
        sparseIntArray.put(R.id.text_no_results_found, 10);
        sparseIntArray.put(R.id.progress_bar, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b2(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            h.c r0 = ba.b2.f4244z
            android.util.SparseIntArray r2 = ba.b2.A
            r3 = 12
            java.lang.Object[] r9 = m4.m.j(r11, r3, r0, r2)
            r0 = 8
            r0 = r9[r0]
            r3 = r0
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0 = 5
            r0 = r9[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2
            r0 = r9[r0]
            r4 = r0
            ba.is r4 = (ba.is) r4
            r0 = 9
            r0 = r9[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 6
            r0 = r9[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 11
            r0 = r9[r0]
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r0 = 4
            r0 = r9[r0]
            r6 = r0
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            r0 = 7
            r0 = r9[r0]
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0 = 10
            r0 = r9[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 3
            r0 = r9[r0]
            r8 = r0
            androidx.appcompat.widget.Toolbar r8 = (androidx.appcompat.widget.Toolbar) r8
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -1
            r10.f4245y = r0
            ba.is r0 = r10.f4154t
            if (r0 == 0) goto L56
            r0.f27496j = r10
        L56:
            r0 = 0
            r0 = r9[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r9[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r11.setTag(r0, r10)
            r10.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.b2.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4245y = 0L;
        }
        this.f4154t.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4245y != 0) {
                    return true;
                }
                if (this.f4154t.f()) {
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
            this.f4245y = 2L;
        }
        this.f4154t.h();
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
            this.f4245y |= 1;
        }
        return true;
    }
}
