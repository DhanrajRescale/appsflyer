package ba;

import android.util.SparseIntArray;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class z9 extends g {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f6822t;

    /* renamed from: s, reason: collision with root package name */
    public long f6823s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6822t = sparseIntArray;
        sparseIntArray.put(R.id.background_view, 1);
        sparseIntArray.put(R.id.league_name, 2);
        sparseIntArray.put(R.id.league_icon, 3);
        sparseIntArray.put(R.id.league_start_time, 4);
        sparseIntArray.put(R.id.duration, 5);
        sparseIntArray.put(R.id.league_type, 6);
        sparseIntArray.put(R.id.prize_text, 7);
        sparseIntArray.put(R.id.linearLayoutCompat2, 8);
        sparseIntArray.put(R.id.total_price_money, 9);
        sparseIntArray.put(R.id.special_gift_chance, 10);
        sparseIntArray.put(R.id.player_min_max, 11);
        sparseIntArray.put(R.id.seat_left_progress, 12);
        sparseIntArray.put(R.id.seat_status_container, 13);
        sparseIntArray.put(R.id.min_player, 14);
        sparseIntArray.put(R.id.max_player, 15);
        sparseIntArray.put(R.id.seat_left, 16);
        sparseIntArray.put(R.id.footer, 17);
        sparseIntArray.put(R.id.constraintLayout, 18);
        sparseIntArray.put(R.id.days_left, 19);
        sparseIntArray.put(R.id.cash_left_container, 20);
        sparseIntArray.put(R.id.entry_text, 21);
        sparseIntArray.put(R.id.entry_amount, 22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(View view) {
        super(null, view, 0);
        Object[] j10 = m4.m.j(view, 23, null, f6822t);
        this.f6823s = -1L;
        ((CardView) j10[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        h();
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6823s = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6823s != 0) {
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
            this.f6823s = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
