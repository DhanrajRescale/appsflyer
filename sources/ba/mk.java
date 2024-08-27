package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.missions.domain.model.HomePageSection;
import com.assetgro.stockgro.missions.domain.model.LifetimeEarnings;
import com.assetgro.stockgro.missions.domain.model.MissionsHomeData;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class mk extends lk {
    public static final h.c E;
    public static final SparseIntArray F;
    public long D;

    static {
        h.c cVar = new h.c(12);
        E = cVar;
        cVar.W(0, new int[]{7}, new int[]{R.layout.bottom_sheet_missions_home}, new String[]{"bottom_sheet_missions_home"});
        cVar.W(1, new int[]{6}, new int[]{R.layout.layout_mission_earnings}, new String[]{"layout_mission_earnings"});
        cVar.W(2, new int[]{5}, new int[]{R.layout.layout_missions_home_user_info}, new String[]{"layout_missions_home_user_info"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 8);
        sparseIntArray.put(R.id.compose_view, 9);
        sparseIntArray.put(R.id.progress_bar, 10);
        sparseIntArray.put(R.id.compose_view_full_screen, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mk(android.view.View r15) {
        /*
            r14 = this;
            r1 = 0
            h.c r0 = ba.mk.E
            android.util.SparseIntArray r2 = ba.mk.F
            r3 = 12
            java.lang.Object[] r13 = m4.m.j(r15, r3, r0, r2)
            r0 = 7
            r0 = r13[r0]
            r3 = r0
            ba.d6 r3 = (ba.d6) r3
            r0 = 9
            r0 = r13[r0]
            r4 = r0
            androidx.compose.ui.platform.ComposeView r4 = (androidx.compose.ui.platform.ComposeView) r4
            r0 = 11
            r0 = r13[r0]
            r5 = r0
            androidx.compose.ui.platform.ComposeView r5 = (androidx.compose.ui.platform.ComposeView) r5
            r0 = 3
            r0 = r13[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 6
            r0 = r13[r0]
            r7 = r0
            ba.ns r7 = (ba.ns) r7
            r0 = 5
            r0 = r13[r0]
            r8 = r0
            ba.kt r8 = (ba.kt) r8
            r0 = 10
            r0 = r13[r0]
            r9 = r0
            android.widget.ProgressBar r9 = (android.widget.ProgressBar) r9
            r0 = 4
            r0 = r13[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 8
            r0 = r13[r0]
            r11 = r0
            androidx.appcompat.widget.Toolbar r11 = (androidx.appcompat.widget.Toolbar) r11
            r0 = 2
            r0 = r13[r0]
            r12 = r0
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            r0 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -1
            r14.D = r0
            ba.d6 r0 = r14.f5361s
            if (r0 == 0) goto L5a
            r0.f27496j = r14
        L5a:
            android.widget.TextView r0 = r14.f5364v
            r1 = 0
            r0.setTag(r1)
            ba.ns r0 = r14.f5365w
            if (r0 == 0) goto L66
            r0.f27496j = r14
        L66:
            ba.kt r0 = r14.f5366x
            if (r0 == 0) goto L6c
            r0.f27496j = r14
        L6c:
            r0 = 0
            r0 = r13[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r0.setTag(r1)
            r0 = 1
            r0 = r13[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r1)
            android.widget.TextView r0 = r14.f5368z
            r0.setTag(r1)
            android.widget.LinearLayout r0 = r14.B
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r15.setTag(r0, r14)
            r14.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.mk.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        String str;
        String str2;
        String str3;
        androidx.lifecycle.e0 e0Var;
        MissionsHomeData missionsHomeData;
        HomePageSection homePageSection;
        LifetimeEarnings lifetimeEarnings;
        synchronized (this) {
            j10 = this.D;
            this.D = 0L;
        }
        MissionsHomeViewModel missionsHomeViewModel = this.C;
        long j11 = 49 & j10;
        String str4 = null;
        if (j11 != 0) {
            if (missionsHomeViewModel != null) {
                e0Var = missionsHomeViewModel.f8918p;
            } else {
                e0Var = null;
            }
            q(0, e0Var);
            if (e0Var != null) {
                missionsHomeData = (MissionsHomeData) e0Var.getValue();
            } else {
                missionsHomeData = null;
            }
            if (missionsHomeData != null) {
                lifetimeEarnings = missionsHomeData.getLifetimeEarnings();
                homePageSection = missionsHomeData.getHomePageSection();
            } else {
                homePageSection = null;
                lifetimeEarnings = null;
            }
            if (lifetimeEarnings != null) {
                str3 = lifetimeEarnings.getTitle();
                str2 = lifetimeEarnings.getAmount();
            } else {
                str2 = null;
                str3 = null;
            }
            if (homePageSection != null) {
                String subText = homePageSection.getSubText();
                String title = homePageSection.getTitle();
                str = subText;
                str4 = title;
            } else {
                str = null;
            }
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        if ((j10 & 48) != 0) {
            e6 e6Var = (e6) this.f5361s;
            e6Var.f4450w = missionsHomeViewModel;
            synchronized (e6Var) {
                e6Var.f4578x |= 4;
            }
            e6Var.a(24);
            e6Var.m();
            this.f5366x.getClass();
        }
        if (j11 != 0) {
            qu.i0.K(this.f5364v, str4);
            this.f5365w.r(str2);
            this.f5365w.s(str3);
            qu.i0.K(this.f5368z, str);
        }
        this.f5366x.c();
        this.f5365w.c();
        this.f5361s.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.D != 0) {
                    return true;
                }
                if (this.f5366x.f() || this.f5365w.f() || this.f5361s.f()) {
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
            this.D = 32L;
        }
        this.f5366x.h();
        this.f5365w.h();
        this.f5361s.h();
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return false;
                    }
                    if (i11 != 0) {
                        return false;
                    }
                    synchronized (this) {
                        this.D |= 8;
                    }
                    return true;
                }
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.D |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.D |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.D |= 1;
        }
        return true;
    }

    @Override // m4.m
    public final void p(androidx.lifecycle.t tVar) {
        super.p(tVar);
        this.f5366x.p(tVar);
        this.f5365w.p(tVar);
        this.f5361s.p(tVar);
    }
}
