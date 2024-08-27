package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class pq extends oq {
    public static final h.c D;
    public static final SparseIntArray E;
    public long C;

    static {
        h.c cVar = new h.c(11);
        D = cVar;
        cVar.W(1, new int[]{6, 7, 8}, new int[]{R.layout.layout_mission_how_to_play, R.layout.layout_mission_input_view, R.layout.layout_content_mission_task_completed}, new String[]{"layout_mission_how_to_play", "layout_mission_input_view", "layout_content_mission_task_completed"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.title, 9);
        sparseIntArray.put(R.id.space, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public pq(android.view.View r14) {
        /*
            r13 = this;
            r1 = 0
            h.c r0 = ba.pq.D
            android.util.SparseIntArray r2 = ba.pq.E
            r3 = 11
            java.lang.Object[] r12 = m4.m.j(r14, r3, r0, r2)
            r0 = 8
            r0 = r12[r0]
            r3 = r0
            ba.qq r3 = (ba.qq) r3
            r0 = 6
            r0 = r12[r0]
            r4 = r0
            ba.vs r4 = (ba.vs) r4
            r0 = 7
            r0 = r12[r0]
            r5 = r0
            ba.xs r5 = (ba.xs) r5
            r0 = 3
            r0 = r12[r0]
            r6 = r0
            com.airbnb.lottie.LottieAnimationView r6 = (com.airbnb.lottie.LottieAnimationView) r6
            r0 = 0
            r0 = r12[r0]
            r7 = r0
            androidx.core.widget.NestedScrollView r7 = (androidx.core.widget.NestedScrollView) r7
            r0 = 5
            r0 = r12[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 4
            r0 = r12[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 10
            r0 = r12[r0]
            android.widget.Space r0 = (android.widget.Space) r0
            r0 = 2
            r0 = r12[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 9
            r0 = r12[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1
            r13.C = r0
            ba.qq r0 = r13.f5682s
            if (r0 == 0) goto L58
            r0.f27496j = r13
        L58:
            ba.vs r0 = r13.f5683t
            if (r0 == 0) goto L5e
            r0.f27496j = r13
        L5e:
            ba.xs r0 = r13.f5684u
            if (r0 == 0) goto L64
            r0.f27496j = r13
        L64:
            r0 = 1
            r0 = r12[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1 = 0
            r0.setTag(r1)
            com.airbnb.lottie.LottieAnimationView r0 = r13.f5685v
            r0.setTag(r1)
            androidx.core.widget.NestedScrollView r0 = r13.f5686w
            r0.setTag(r1)
            android.widget.TextView r0 = r13.f5687x
            r0.setTag(r1)
            android.widget.TextView r0 = r13.f5688y
            r0.setTag(r1)
            android.widget.TextView r0 = r13.f5689z
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r14.setTag(r0, r13)
            r13.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.pq.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0072  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.pq.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.C != 0) {
                    return true;
                }
                if (this.f5683t.f() || this.f5684u.f() || this.f5682s.f()) {
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
            this.C = 64L;
        }
        this.f5683t.h();
        this.f5684u.h();
        this.f5682s.h();
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return false;
                        }
                        if (i11 != 0) {
                            return false;
                        }
                        synchronized (this) {
                            this.C |= 16;
                        }
                        return true;
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
        this.f5683t.p(tVar);
        this.f5684u.p(tVar);
        this.f5682s.p(tVar);
    }
}
