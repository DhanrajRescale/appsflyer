package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailViewModel;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class s6 extends r6 {

    /* renamed from: w, reason: collision with root package name */
    public static final h.c f6045w;

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f6046x;

    /* renamed from: v, reason: collision with root package name */
    public long f6047v;

    static {
        h.c cVar = new h.c(4);
        f6045w = cVar;
        cVar.W(1, new int[]{2}, new int[]{R.layout.layout_content_mission_detail}, new String[]{"layout_content_mission_detail"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6046x = sparseIntArray;
        sparseIntArray.put(R.id.space, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s6(android.view.View r5) {
        /*
            r4 = this;
            h.c r0 = ba.s6.f6045w
            android.util.SparseIntArray r1 = ba.s6.f6046x
            r2 = 4
            java.lang.Object[] r0 = m4.m.j(r5, r2, r0, r1)
            r1 = 0
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r2 = 2
            r2 = r0[r2]
            ba.oq r2 = (ba.oq) r2
            r3 = 3
            r3 = r0[r3]
            android.widget.Space r3 = (android.widget.Space) r3
            r3 = 0
            r4.<init>(r3, r5, r1, r2)
            r1 = -1
            r4.f6047v = r1
            androidx.constraintlayout.widget.ConstraintLayout r1 = r4.f5931s
            r1.setTag(r3)
            ba.oq r1 = r4.f5932t
            if (r1 == 0) goto L2b
            r1.f27496j = r4
        L2b:
            r1 = 1
            r0 = r0[r1]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r3)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r5.setTag(r0, r4)
            r4.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.s6.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f6047v;
            this.f6047v = 0L;
        }
        MissionTaskDetailViewModel missionTaskDetailViewModel = this.f5933u;
        if ((j10 & 6) != 0) {
            pq pqVar = (pq) this.f5932t;
            pqVar.B = missionTaskDetailViewModel;
            synchronized (pqVar) {
                pqVar.C |= 32;
            }
            pqVar.a(24);
            pqVar.m();
        }
        this.f5932t.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6047v != 0) {
                    return true;
                }
                if (this.f5932t.f()) {
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
            this.f6047v = 4L;
        }
        this.f5932t.h();
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
            this.f6047v |= 1;
        }
        return true;
    }

    @Override // m4.m
    public final void p(androidx.lifecycle.t tVar) {
        super.p(tVar);
        this.f5932t.p(tVar);
    }
}
