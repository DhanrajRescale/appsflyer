package ba;

import android.util.SparseIntArray;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ua extends ta {
    public static final h.c M;
    public static final SparseIntArray N;
    public final ImageView J;
    public final LinearLayout K;
    public long L;

    static {
        h.c cVar = new h.c(29);
        M = cVar;
        cVar.W(1, new int[]{16}, new int[]{R.layout.cell_my_league_header_layout}, new String[]{"cell_my_league_header_layout"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.rank_container, 17);
        sparseIntArray.put(R.id.rank_text_subtitle, 18);
        sparseIntArray.put(R.id.rewards_won_container, 19);
        sparseIntArray.put(R.id.rewards_won_title, 20);
        sparseIntArray.put(R.id.percentage_container, 21);
        sparseIntArray.put(R.id.cl_profit_section_ongoing, 22);
        sparseIntArray.put(R.id.profit_text_completed, 23);
        sparseIntArray.put(R.id.player_min_max, 24);
        sparseIntArray.put(R.id.min_player, 25);
        sparseIntArray.put(R.id.max_player, 26);
        sparseIntArray.put(R.id.seat_left, 27);
        sparseIntArray.put(R.id.completed_league_bottom_text, 28);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ua(android.view.View r21) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ua.<init>(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x0158, code lost:
    
        if (r3.equals("W") == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0171, code lost:
    
        r3 = r0.getRank();
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0175, code lost:
    
        if (r3 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x017b, code lost:
    
        if (r3.length() != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0188, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r0.getRank(), "0") == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x019a, code lost:
    
        r2.setText("of " + r0.getTotalParticipants());
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0192, code lost:
    
        if (r0.getAmountWon() > 0.0d) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0194, code lost:
    
        r2.setText("No order executed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x016e, code lost:
    
        if (r3.equals("C") == false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x037d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03d1  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ua.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.L != 0) {
                    return true;
                }
                if (this.f6178x.f()) {
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
            this.L = 8L;
        }
        this.f6178x.h();
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
            this.L |= 1;
        }
        return true;
    }

    @Override // ba.ta
    public final void r(ArenaGame arenaGame) {
        this.H = arenaGame;
        synchronized (this) {
            this.L |= 2;
        }
        a(6);
        m();
    }
}
