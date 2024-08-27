package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.missions.presentation.history.MissionHistoryViewModel;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ik extends hk {
    public static final h.c D;
    public static final SparseIntArray E;
    public long C;

    static {
        h.c cVar = new h.c(11);
        D = cVar;
        cVar.W(0, new int[]{2}, new int[]{R.layout.layout_mission_earnings}, new String[]{"layout_mission_earnings"});
        cVar.W(1, new int[]{3, 4, 5}, new int[]{R.layout.layout_mission_history_under_review, R.layout.layout_mission_history_completed, R.layout.layout_mission_history_failed}, new String[]{"layout_mission_history_under_review", "layout_mission_history_completed", "layout_mission_history_failed"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.toolbar_layout, 6);
        sparseIntArray.put(R.id.toolbar, 7);
        sparseIntArray.put(R.id.user_display_image, 8);
        sparseIntArray.put(R.id.user_image, 9);
        sparseIntArray.put(R.id.username, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ik(android.view.View r12) {
        /*
            r11 = this;
            r1 = 0
            h.c r0 = ba.ik.D
            android.util.SparseIntArray r2 = ba.ik.E
            r3 = 11
            java.lang.Object[] r10 = m4.m.j(r12, r3, r0, r2)
            r0 = 2
            r0 = r10[r0]
            r3 = r0
            ba.ns r3 = (ba.ns) r3
            r0 = 4
            r0 = r10[r0]
            r4 = r0
            ba.ps r4 = (ba.ps) r4
            r0 = 5
            r0 = r10[r0]
            r5 = r0
            ba.rs r5 = (ba.rs) r5
            r0 = 3
            r0 = r10[r0]
            r6 = r0
            ba.ts r6 = (ba.ts) r6
            r0 = 7
            r0 = r10[r0]
            r7 = r0
            androidx.appcompat.widget.Toolbar r7 = (androidx.appcompat.widget.Toolbar) r7
            r0 = 6
            r0 = r10[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 8
            r0 = r10[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 9
            r0 = r10[r0]
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 10
            r0 = r10[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r11.C = r0
            ba.ns r0 = r11.f4943s
            if (r0 == 0) goto L51
            r0.f27496j = r11
        L51:
            ba.ps r0 = r11.f4944t
            if (r0 == 0) goto L57
            r0.f27496j = r11
        L57:
            ba.rs r0 = r11.f4945u
            if (r0 == 0) goto L5d
            r0.f27496j = r11
        L5d:
            ba.ts r0 = r11.f4946v
            if (r0 == 0) goto L63
            r0.f27496j = r11
        L63:
            r0 = 0
            r0 = r10[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r10[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r12.setTag(r0, r11)
            r11.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ik.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.C;
            this.C = 0L;
        }
        String str = this.A;
        String str2 = this.f4950z;
        MissionHistoryViewModel missionHistoryViewModel = this.B;
        long j11 = 144 & j10;
        long j12 = 160 & j10;
        long j13 = j10 & 192;
        if (j11 != 0) {
            this.f4943s.r(str);
        }
        if (j12 != 0) {
            this.f4943s.s(str2);
        }
        if (j13 != 0) {
            qs qsVar = (qs) this.f4944t;
            qsVar.f5803t = missionHistoryViewModel;
            synchronized (qsVar) {
                qsVar.f5896u |= 2;
            }
            qsVar.a(24);
            qsVar.m();
            ss ssVar = (ss) this.f4945u;
            ssVar.f6004t = missionHistoryViewModel;
            synchronized (ssVar) {
                ssVar.f6127u |= 2;
            }
            ssVar.a(24);
            ssVar.m();
            us usVar = (us) this.f4946v;
            usVar.f6225t = missionHistoryViewModel;
            synchronized (usVar) {
                usVar.f6356u |= 2;
            }
            usVar.a(24);
            usVar.m();
        }
        this.f4943s.c();
        this.f4946v.c();
        this.f4944t.c();
        this.f4945u.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.C != 0) {
                    return true;
                }
                if (this.f4943s.f() || this.f4946v.f() || this.f4944t.f() || this.f4945u.f()) {
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
            this.C = 128L;
        }
        this.f4943s.h();
        this.f4946v.h();
        this.f4944t.h();
        this.f4945u.h();
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
                        this.C |= 8;
                    }
                    return true;
                }
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.C |= 4;
                }
                return true;
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
        this.f4943s.p(tVar);
        this.f4946v.p(tVar);
        this.f4944t.p(tVar);
        this.f4945u.p(tVar);
    }
}
