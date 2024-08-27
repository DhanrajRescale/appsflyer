package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class w3 extends v3 {
    public static final h.c D;
    public static final SparseIntArray E;
    public long C;

    static {
        h.c cVar = new h.c(12);
        D = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.layout_social_search_results}, new String[]{"layout_social_search_results"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
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
    public w3(android.view.View r15) {
        /*
            r14 = this;
            r1 = 0
            h.c r0 = ba.w3.D
            android.util.SparseIntArray r2 = ba.w3.E
            r3 = 12
            java.lang.Object[] r13 = m4.m.j(r15, r3, r0, r2)
            r0 = 8
            r0 = r13[r0]
            r3 = r0
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0 = 5
            r0 = r13[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2
            r0 = r13[r0]
            r4 = r0
            ba.gv r4 = (ba.gv) r4
            r0 = 9
            r0 = r13[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 6
            r0 = r13[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 11
            r0 = r13[r0]
            r7 = r0
            android.widget.ProgressBar r7 = (android.widget.ProgressBar) r7
            r0 = 4
            r0 = r13[r0]
            r8 = r0
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r0 = 7
            r0 = r13[r0]
            r9 = r0
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            r0 = 1
            r0 = r13[r0]
            r10 = r0
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r0 = 10
            r0 = r13[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 3
            r0 = r13[r0]
            r12 = r0
            androidx.appcompat.widget.Toolbar r12 = (androidx.appcompat.widget.Toolbar) r12
            r0 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -1
            r14.C = r0
            ba.gv r0 = r14.f6373t
            if (r0 == 0) goto L5f
            r0.f27496j = r14
        L5f:
            r0 = 0
            r0 = r13[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1 = 0
            r0.setTag(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r14.f6379z
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r15.setTag(r0, r14)
            r14.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.w3.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.C = 0L;
        }
        this.f6373t.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.C != 0) {
                    return true;
                }
                if (this.f6373t.f()) {
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
            this.C = 2L;
        }
        this.f6373t.h();
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
            this.C |= 1;
        }
        return true;
    }
}
