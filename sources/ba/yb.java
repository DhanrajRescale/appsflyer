package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class yb extends xb {
    public static final SparseIntArray L;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.league_icon, 1);
        sparseIntArray.put(R.id.view2, 2);
        sparseIntArray.put(R.id.league_name, 3);
        sparseIntArray.put(R.id.league_date, 4);
        sparseIntArray.put(R.id.user_info_container, 5);
        sparseIntArray.put(R.id.user_rank_text, 6);
        sparseIntArray.put(R.id.user_image_view, 7);
        sparseIntArray.put(R.id.user_name, 8);
        sparseIntArray.put(R.id.user_profit_info_view, 9);
        sparseIntArray.put(R.id.textView7, 10);
        sparseIntArray.put(R.id.user_prize_amount_icon, 11);
        sparseIntArray.put(R.id.user_prize_amount, 12);
        sparseIntArray.put(R.id.view_user_portfolio, 13);
        sparseIntArray.put(R.id.winner_profit_info_view, 14);
        sparseIntArray.put(R.id.winner_info_container, 15);
        sparseIntArray.put(R.id.winner_rank_text, 16);
        sparseIntArray.put(R.id.winner_image_view, 17);
        sparseIntArray.put(R.id.winner_name, 18);
        sparseIntArray.put(R.id.textView8, 19);
        sparseIntArray.put(R.id.winner_prize_amount_icon, 20);
        sparseIntArray.put(R.id.winner_prize_amount, 21);
        sparseIntArray.put(R.id.view_winner_portfolio, 22);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public yb(android.view.View r23) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.yb.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.K = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.K != 0) {
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
            this.K = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
