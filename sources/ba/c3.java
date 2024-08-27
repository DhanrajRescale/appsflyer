package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;

/* loaded from: classes.dex */
public final class c3 extends b3 {
    public static final h.c D;
    public static final SparseIntArray E;
    public long C;

    static {
        h.c cVar = new h.c(13);
        D = cVar;
        cVar.W(1, new int[]{3}, new int[]{R.layout.layout_timer_container}, new String[]{"layout_timer_container"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 4);
        sparseIntArray.put(R.id.yellow_overlay, 5);
        sparseIntArray.put(R.id.app_bar_layout, 6);
        sparseIntArray.put(R.id.toolbar, 7);
        sparseIntArray.put(R.id.portfolio_collapsed_header, 8);
        sparseIntArray.put(R.id.options_menu, 9);
        sparseIntArray.put(R.id.tab_container, 10);
        sparseIntArray.put(R.id.portfolio_tab_layout, 11);
        sparseIntArray.put(R.id.view_pager, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c3(android.view.View r14) {
        /*
            r13 = this;
            r1 = 0
            h.c r0 = ba.c3.D
            android.util.SparseIntArray r2 = ba.c3.E
            r3 = 13
            java.lang.Object[] r12 = m4.m.j(r14, r3, r0, r2)
            r0 = 2
            r0 = r12[r0]
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0 = 6
            r0 = r12[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 4
            r0 = r12[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 3
            r0 = r12[r0]
            r4 = r0
            ba.tv r4 = (ba.tv) r4
            r0 = 9
            r0 = r12[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 8
            r0 = r12[r0]
            r6 = r0
            com.assetgro.stockgro.widget.PortfolioCollapsedHeaderView r6 = (com.assetgro.stockgro.widget.PortfolioCollapsedHeaderView) r6
            r0 = 11
            r0 = r12[r0]
            r7 = r0
            com.google.android.material.tabs.TabLayout r7 = (com.google.android.material.tabs.TabLayout) r7
            r0 = 1
            r0 = r12[r0]
            r8 = r0
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r0 = 10
            r0 = r12[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 7
            r0 = r12[r0]
            r9 = r0
            androidx.appcompat.widget.Toolbar r9 = (androidx.appcompat.widget.Toolbar) r9
            r0 = 12
            r0 = r12[r0]
            r10 = r0
            androidx.viewpager2.widget.ViewPager2 r10 = (androidx.viewpager2.widget.ViewPager2) r10
            r0 = 5
            r0 = r12[r0]
            r11 = r0
            android.view.View r11 = (android.view.View) r11
            r0 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r13.C = r0
            com.google.android.material.button.MaterialButton r0 = r13.f4246s
            r1 = 0
            r0.setTag(r1)
            ba.tv r0 = r13.f4247t
            if (r0 == 0) goto L6a
            r0.f27496j = r13
        L6a:
            r0 = 0
            r0 = r12[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0.setTag(r1)
            android.widget.RelativeLayout r0 = r13.f4251x
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r14.setTag(r0, r13)
            r13.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.c3.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        androidx.lifecycle.e0 e0Var;
        z9.i iVar;
        synchronized (this) {
            j10 = this.C;
            this.C = 0L;
        }
        PortfolioDetailViewModel portfolioDetailViewModel = this.B;
        long j11 = j10 & 13;
        String str = null;
        if (j11 != 0) {
            if (portfolioDetailViewModel != null) {
                e0Var = portfolioDetailViewModel.K;
            } else {
                e0Var = null;
            }
            q(0, e0Var);
            if (e0Var != null) {
                iVar = (z9.i) e0Var.getValue();
            } else {
                iVar = null;
            }
            if (iVar != null) {
                str = iVar.a(this.f27491e.getContext());
            }
        }
        if (j11 != 0) {
            this.f4246s.setText(str);
        }
        this.f4247t.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.C != 0) {
                    return true;
                }
                if (this.f4247t.f()) {
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
            this.C = 8L;
        }
        this.f4247t.h();
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
                this.C |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    @Override // m4.m
    public final void p(androidx.lifecycle.t tVar) {
        super.p(tVar);
        this.f4247t.p(tVar);
    }
}
