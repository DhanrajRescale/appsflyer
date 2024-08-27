package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class b8 extends a8 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.user_image, 1);
        sparseIntArray.put(R.id.name_champion, 2);
        sparseIntArray.put(R.id.vertical_divider, 3);
        sparseIntArray.put(R.id.sp_text_view, 4);
        sparseIntArray.put(R.id.tp_text_view, 5);
        sparseIntArray.put(R.id.horizontal_divider, 6);
        sparseIntArray.put(R.id.money_won_text, 7);
        sparseIntArray.put(R.id.total_text_view_container, 8);
        sparseIntArray.put(R.id.total_text_view, 9);
        sparseIntArray.put(R.id.winning_progress_bar, 10);
        sparseIntArray.put(R.id.games_participated_info_panel, 11);
        sparseIntArray.put(R.id.games_participated_count_text_view, 12);
        sparseIntArray.put(R.id.games_won_count_text_view, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b8(android.view.View r14) {
        /*
            r13 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.b8.C
            r2 = 14
            r11 = 0
            java.lang.Object[] r12 = m4.m.j(r14, r2, r11, r0)
            r0 = 12
            r0 = r12[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 11
            r0 = r12[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 13
            r0 = r12[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 6
            r0 = r12[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 7
            r0 = r12[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2
            r0 = r12[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 4
            r0 = r12[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 9
            r0 = r12[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 8
            r0 = r12[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 5
            r0 = r12[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 1
            r0 = r12[r0]
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0 = 3
            r0 = r12[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 10
            r0 = r12[r0]
            r10 = r0
            android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
            r0 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r13.B = r0
            r0 = 0
            r0 = r12[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0.setTag(r11)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r14.setTag(r0, r13)
            r13.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.b8.<init>(android.view.View):void");
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
