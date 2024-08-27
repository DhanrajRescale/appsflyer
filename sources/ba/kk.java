package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailViewModel;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class kk extends jk {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public static final h.c f5257z;

    /* renamed from: y, reason: collision with root package name */
    public long f5258y;

    static {
        h.c cVar = new h.c(7);
        f5257z = cVar;
        cVar.W(0, new int[]{1}, new int[]{R.layout.bottom_sheet_task_detail}, new String[]{"bottom_sheet_task_detail"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.mission_banner_container, 3);
        sparseIntArray.put(R.id.mission_banner, 4);
        sparseIntArray.put(R.id.mission_detail_widget, 5);
        sparseIntArray.put(R.id.progress_bar, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kk(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            h.c r0 = ba.kk.f5257z
            android.util.SparseIntArray r2 = ba.kk.A
            r3 = 7
            java.lang.Object[] r8 = m4.m.j(r10, r3, r0, r2)
            r0 = 1
            r0 = r8[r0]
            r3 = r0
            ba.r6 r3 = (ba.r6) r3
            r0 = 4
            r0 = r8[r0]
            r4 = r0
            com.assetgro.stockgro.missions.presentation.widget.MissionTaskBannerView r4 = (com.assetgro.stockgro.missions.presentation.widget.MissionTaskBannerView) r4
            r0 = 3
            r0 = r8[r0]
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r0 = 5
            r0 = r8[r0]
            r6 = r0
            com.assetgro.stockgro.missions.presentation.widget.MissionDetailCTAWidget r6 = (com.assetgro.stockgro.missions.presentation.widget.MissionDetailCTAWidget) r6
            r0 = 6
            r0 = r8[r0]
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r0 = 2
            r0 = r8[r0]
            r7 = r0
            androidx.appcompat.widget.Toolbar r7 = (androidx.appcompat.widget.Toolbar) r7
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r9.f5258y = r0
            ba.r6 r0 = r9.f5149s
            if (r0 == 0) goto L3c
            r0.f27496j = r9
        L3c:
            r0 = 0
            r0 = r8[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r10.setTag(r0, r9)
            r9.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.kk.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f5258y;
            this.f5258y = 0L;
        }
        MissionTaskDetailViewModel missionTaskDetailViewModel = this.f5154x;
        if ((j10 & 6) != 0) {
            s6 s6Var = (s6) this.f5149s;
            s6Var.f5933u = missionTaskDetailViewModel;
            synchronized (s6Var) {
                s6Var.f6047v |= 2;
            }
            s6Var.a(24);
            s6Var.m();
        }
        this.f5149s.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5258y != 0) {
                    return true;
                }
                if (this.f5149s.f()) {
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
            this.f5258y = 4L;
        }
        this.f5149s.h();
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
            this.f5258y |= 1;
        }
        return true;
    }

    @Override // m4.m
    public final void p(androidx.lifecycle.t tVar) {
        super.p(tVar);
        this.f5149s.p(tVar);
    }
}
