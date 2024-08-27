package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class e6 extends d6 {

    /* renamed from: y, reason: collision with root package name */
    public static final h.c f4576y;

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f4577z;

    /* renamed from: x, reason: collision with root package name */
    public long f4578x;

    static {
        h.c cVar = new h.c(7);
        f4576y = cVar;
        cVar.W(1, new int[]{4}, new int[]{R.layout.content_missions_home_bottom_sheet}, new String[]{"content_missions_home_bottom_sheet"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4577z = sparseIntArray;
        sparseIntArray.put(R.id.layout_no_missions, 3);
        sparseIntArray.put(R.id.space, 5);
        sparseIntArray.put(R.id.date_view, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e6(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            h.c r0 = ba.e6.f4576y
            android.util.SparseIntArray r2 = ba.e6.f4577z
            r3 = 7
            java.lang.Object[] r7 = m4.m.j(r9, r3, r0, r2)
            r0 = 0
            r0 = r7[r0]
            r3 = r0
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r0 = 4
            r0 = r7[r0]
            r4 = r0
            ba.ae r4 = (ba.ae) r4
            r0 = 2
            r0 = r7[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 6
            r0 = r7[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0 = 3
            r0 = r7[r0]
            r6 = r0
            android.view.View r6 = (android.view.View) r6
            r0 = 5
            r0 = r7[r0]
            android.widget.Space r0 = (android.widget.Space) r0
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r8.f4578x = r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.f4446s
            r1 = 0
            r0.setTag(r1)
            ba.ae r0 = r8.f4447t
            if (r0 == 0) goto L41
            r0.f27496j = r8
        L41:
            android.widget.TextView r0 = r8.f4448u
            r0.setTag(r1)
            r0 = 1
            r0 = r7[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.e6.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        androidx.lifecycle.e0 e0Var;
        synchronized (this) {
            j10 = this.f4578x;
            this.f4578x = 0L;
        }
        MissionsHomeViewModel missionsHomeViewModel = this.f4450w;
        long j11 = 14 & j10;
        String str = null;
        if (j11 != 0) {
            if (missionsHomeViewModel != null) {
                e0Var = missionsHomeViewModel.f8924v;
            } else {
                e0Var = null;
            }
            q(1, e0Var);
            if (e0Var != null) {
                str = (String) e0Var.getValue();
            }
        }
        if ((j10 & 12) != 0) {
            be beVar = (be) this.f4447t;
            beVar.A = missionsHomeViewModel;
            synchronized (beVar) {
                beVar.C |= 8;
            }
            beVar.a(24);
            beVar.m();
        }
        if (j11 != 0) {
            qu.i0.K(this.f4448u, str);
        }
        this.f4447t.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4578x != 0) {
                    return true;
                }
                if (this.f4447t.f()) {
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
            this.f4578x = 8L;
        }
        this.f4447t.h();
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
                this.f4578x |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f4578x |= 1;
        }
        return true;
    }

    @Override // m4.m
    public final void p(androidx.lifecycle.t tVar) {
        super.p(tVar);
        this.f4447t.p(tVar);
    }
}
