package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class n1 extends m1 {
    public static final h.c B;
    public static final SparseIntArray C;
    public long A;

    static {
        h.c cVar = new h.c(12);
        B = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.layout_timer_container}, new String[]{"layout_timer_container"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 3);
        sparseIntArray.put(R.id.yellow_overlay, 4);
        sparseIntArray.put(R.id.app_bar_layout, 5);
        sparseIntArray.put(R.id.toolbar, 6);
        sparseIntArray.put(R.id.collapsed_toolbar_view, 7);
        sparseIntArray.put(R.id.chat_toolbar, 8);
        sparseIntArray.put(R.id.tab_container, 9);
        sparseIntArray.put(R.id.tab_layout, 10);
        sparseIntArray.put(R.id.view_pager, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n1(android.view.View r13) {
        /*
            r12 = this;
            r1 = 0
            h.c r0 = ba.n1.B
            android.util.SparseIntArray r2 = ba.n1.C
            r3 = 12
            java.lang.Object[] r11 = m4.m.j(r13, r3, r0, r2)
            r0 = 5
            r0 = r11[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 8
            r0 = r11[r0]
            r3 = r0
            com.assetgro.stockgro.widget.ChatToolbar r3 = (com.assetgro.stockgro.widget.ChatToolbar) r3
            r0 = 7
            r0 = r11[r0]
            r4 = r0
            com.assetgro.stockgro.widget.PrepZoneHeaderView r4 = (com.assetgro.stockgro.widget.PrepZoneHeaderView) r4
            r0 = 3
            r0 = r11[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 2
            r0 = r11[r0]
            r5 = r0
            ba.tv r5 = (ba.tv) r5
            r0 = 1
            r0 = r11[r0]
            r6 = r0
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            r0 = 9
            r0 = r11[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 10
            r0 = r11[r0]
            r7 = r0
            com.google.android.material.tabs.TabLayout r7 = (com.google.android.material.tabs.TabLayout) r7
            r0 = 6
            r0 = r11[r0]
            r8 = r0
            androidx.appcompat.widget.Toolbar r8 = (androidx.appcompat.widget.Toolbar) r8
            r0 = 11
            r0 = r11[r0]
            r9 = r0
            androidx.viewpager2.widget.ViewPager2 r9 = (androidx.viewpager2.widget.ViewPager2) r9
            r0 = 4
            r0 = r11[r0]
            r10 = r0
            android.view.View r10 = (android.view.View) r10
            r0 = r12
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r12.A = r0
            ba.tv r0 = r12.f5418u
            if (r0 == 0) goto L5d
            r0.f27496j = r12
        L5d:
            r0 = 0
            r0 = r11[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r1 = 0
            r0.setTag(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r12.f5419v
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r13.setTag(r0, r12)
            r12.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.n1.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.A = 0L;
        }
        this.f5418u.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.A != 0) {
                    return true;
                }
                if (this.f5418u.f()) {
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
            this.A = 2L;
        }
        this.f5418u.h();
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
            this.A |= 1;
        }
        return true;
    }
}
