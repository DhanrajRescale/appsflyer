package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class p1 extends o1 {
    public static final h.c L;
    public static final SparseIntArray M;
    public long K;

    static {
        h.c cVar = new h.c(25);
        L = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.cell_maintenance_view}, new String[]{"cell_maintenance_view"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 3);
        sparseIntArray.put(R.id.toolbar, 4);
        sparseIntArray.put(R.id.main_layout, 5);
        sparseIntArray.put(R.id.progress_bar, 6);
        sparseIntArray.put(R.id.league_nested_scroll_view, 7);
        sparseIntArray.put(R.id.data_container, 8);
        sparseIntArray.put(R.id.compose_league_info, 9);
        sparseIntArray.put(R.id.customButton2, 10);
        sparseIntArray.put(R.id.prize_distribution_recycler_view, 11);
        sparseIntArray.put(R.id.game_rules_selector, 12);
        sparseIntArray.put(R.id.game_rule_icon, 13);
        sparseIntArray.put(R.id.game_rule_card, 14);
        sparseIntArray.put(R.id.game_rule_container, 15);
        sparseIntArray.put(R.id.next_container, 16);
        sparseIntArray.put(R.id.custom_progress_bar, 17);
        sparseIntArray.put(R.id.seats_left_remaining_text, 18);
        sparseIntArray.put(R.id.payment_confirmation_container, 19);
        sparseIntArray.put(R.id.tnc_check_button, 20);
        sparseIntArray.put(R.id.tnc_label, 21);
        sparseIntArray.put(R.id.next, 22);
        sparseIntArray.put(R.id.compose_portfolio_state, 23);
        sparseIntArray.put(R.id.compose_maintainence_state, 24);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p1(android.view.View r24) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.p1.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.K = 0L;
        }
        this.f5634s.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.K != 0) {
                    return true;
                }
                if (this.f5634s.f()) {
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
            this.K = 2L;
        }
        this.f5634s.h();
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
            this.K |= 1;
        }
        return true;
    }

    @Override // m4.m
    public final void p(androidx.lifecycle.t tVar) {
        super.p(tVar);
        this.f5634s.p(tVar);
    }
}
