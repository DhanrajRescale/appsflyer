package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class te extends se {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 1);
        sparseIntArray.put(R.id.collapsing_toolbar, 2);
        sparseIntArray.put(R.id.tab_layout, 3);
        sparseIntArray.put(R.id.social_view_pager, 4);
        sparseIntArray.put(R.id.menu_fab, 5);
        sparseIntArray.put(R.id.deactivated_members_fab, 6);
        sparseIntArray.put(R.id.contact_stockgro_fab, 7);
        sparseIntArray.put(R.id.add_friend_fab, 8);
        sparseIntArray.put(R.id.create_private_group_fab, 9);
        sparseIntArray.put(R.id.create_social_group_fab, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public te(android.view.View r15) {
        /*
            r14 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.te.C
            r2 = 11
            r12 = 0
            java.lang.Object[] r13 = m4.m.j(r15, r2, r12, r0)
            r0 = 8
            r0 = r13[r0]
            r3 = r0
            com.github.clans.fab.FloatingActionButton r3 = (com.github.clans.fab.FloatingActionButton) r3
            r0 = 1
            r0 = r13[r0]
            r4 = r0
            com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
            r0 = 2
            r0 = r13[r0]
            com.google.android.material.appbar.CollapsingToolbarLayout r0 = (com.google.android.material.appbar.CollapsingToolbarLayout) r0
            r0 = 7
            r0 = r13[r0]
            r5 = r0
            com.github.clans.fab.FloatingActionButton r5 = (com.github.clans.fab.FloatingActionButton) r5
            r0 = 9
            r0 = r13[r0]
            r6 = r0
            com.github.clans.fab.FloatingActionButton r6 = (com.github.clans.fab.FloatingActionButton) r6
            r0 = 10
            r0 = r13[r0]
            r7 = r0
            com.github.clans.fab.FloatingActionButton r7 = (com.github.clans.fab.FloatingActionButton) r7
            r0 = 6
            r0 = r13[r0]
            r8 = r0
            com.github.clans.fab.FloatingActionButton r8 = (com.github.clans.fab.FloatingActionButton) r8
            r0 = 5
            r0 = r13[r0]
            r9 = r0
            com.github.clans.fab.FloatingActionMenu r9 = (com.github.clans.fab.FloatingActionMenu) r9
            r0 = 4
            r0 = r13[r0]
            r10 = r0
            androidx.viewpager2.widget.ViewPager2 r10 = (androidx.viewpager2.widget.ViewPager2) r10
            r0 = 3
            r0 = r13[r0]
            r11 = r0
            com.google.android.material.tabs.TabLayout r11 = (com.google.android.material.tabs.TabLayout) r11
            r0 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r14.B = r0
            r0 = 0
            r0 = r13[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0.setTag(r12)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r15.setTag(r0, r14)
            r14.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.te.<init>(android.view.View):void");
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
