package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class jj extends ij {
    public static final h.c R;
    public static final SparseIntArray S;
    public long Q;

    static {
        h.c cVar = new h.c(30);
        R = cVar;
        cVar.W(1, new int[]{3}, new int[]{R.layout.layout_league_winner}, new String[]{"layout_league_winner"});
        cVar.W(2, new int[]{4}, new int[]{R.layout.cell_league_declared_winner_board}, new String[]{"cell_league_declared_winner_board"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(R.id.swipe_refresh_layout, 5);
        sparseIntArray.put(R.id.cancelled_task_message_container, 6);
        sparseIntArray.put(R.id.league_not_started_container, 7);
        sparseIntArray.put(R.id.image, 8);
        sparseIntArray.put(R.id.data_container, 9);
        sparseIntArray.put(R.id.progress_bar, 10);
        sparseIntArray.put(R.id.past_winner_label, 11);
        sparseIntArray.put(R.id.past_winner_recycler_view, 12);
        sparseIntArray.put(R.id.leader_board_label, 13);
        sparseIntArray.put(R.id.leader_board_container, 14);
        sparseIntArray.put(R.id.arrow_slider, 15);
        sparseIntArray.put(R.id.leader_board_view_pager, 16);
        sparseIntArray.put(R.id.leader_board_sub_title, 17);
        sparseIntArray.put(R.id.leader_board_icon, 18);
        sparseIntArray.put(R.id.leader_board_sub_title_description, 19);
        sparseIntArray.put(R.id.current_user_leader_title, 20);
        sparseIntArray.put(R.id.current_user_leader_board_recycler_view, 21);
        sparseIntArray.put(R.id.all_user_leader_title, 22);
        sparseIntArray.put(R.id.leader_board_recycler_view, 23);
        sparseIntArray.put(R.id.winner_container, 24);
        sparseIntArray.put(R.id.share_achievement, 25);
        sparseIntArray.put(R.id.winner_recycler_view, 26);
        sparseIntArray.put(R.id.view_all_winner, 27);
        sparseIntArray.put(R.id.chat_room_button, 28);
        sparseIntArray.put(R.id.winner_animation, 29);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public jj(android.view.View r30) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.jj.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.Q = 0L;
        }
        this.B.c();
        this.f5052v.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.Q != 0) {
                    return true;
                }
                if (this.B.f() || this.f5052v.f()) {
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
            this.Q = 4L;
        }
        this.B.h();
        this.f5052v.h();
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.Q |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.Q |= 1;
        }
        return true;
    }
}
