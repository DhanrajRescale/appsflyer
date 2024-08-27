package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class le extends ke {
    public static final SparseIntArray J;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.portfolio_today_container, 1);
        sparseIntArray.put(R.id.champions_chart_layout, 2);
        sparseIntArray.put(R.id.missons_full_container, 3);
        sparseIntArray.put(R.id.sg_missions_layout, 4);
        sparseIntArray.put(R.id.ic_missions, 5);
        sparseIntArray.put(R.id.missions_text, 6);
        sparseIntArray.put(R.id.follow_following, 7);
        sparseIntArray.put(R.id.text_follow_following, 8);
        sparseIntArray.put(R.id.new_tag_container, 9);
        sparseIntArray.put(R.id.invite_a_friend_layout, 10);
        sparseIntArray.put(R.id.champions_chart_divider, 11);
        sparseIntArray.put(R.id.invite_friend_divider, 12);
        sparseIntArray.put(R.id.stock_gyan_layout, 13);
        sparseIntArray.put(R.id.rate_a_app_layout, 14);
        sparseIntArray.put(R.id.app_about_layout, 15);
        sparseIntArray.put(R.id.faqs_layout, 16);
        sparseIntArray.put(R.id.tutorial_layout, 17);
        sparseIntArray.put(R.id.help_and_support_layout, 18);
        sparseIntArray.put(R.id.update_app_layout, 19);
        sparseIntArray.put(R.id.logout, 20);
        sparseIntArray.put(R.id.version_code, 21);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public le(android.view.View r22) {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.le.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.I = 0L;
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.I != 0) {
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
            this.I = 1L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
