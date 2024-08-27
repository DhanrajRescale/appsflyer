package ba;

import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class jt extends ht {
    public static final h.c D;
    public long C;

    static {
        h.c cVar = new h.c(6);
        D = cVar;
        cVar.W(0, new int[]{5}, new int[]{R.layout.layout_mission_your_reward_chip}, new String[]{"layout_mission_your_reward_chip"});
        cVar.W(1, new int[]{4}, new int[]{R.layout.layout_mission_time_status_chip}, new String[]{"layout_mission_time_status_chip"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public jt(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            h.c r0 = ba.jt.D
            r2 = 6
            r8 = 0
            java.lang.Object[] r9 = m4.m.j(r11, r2, r0, r8)
            r0 = 1
            r0 = r9[r0]
            r3 = r0
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r0 = 5
            r0 = r9[r0]
            r4 = r0
            ba.ft r4 = (ba.ft) r4
            r0 = 4
            r0 = r9[r0]
            r5 = r0
            ba.dt r5 = (ba.dt) r5
            r0 = 2
            r0 = r9[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 3
            r0 = r9[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r10.C = r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.f4971s
            r0.setTag(r8)
            r0 = 0
            r0 = r9[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r8)
            ba.ft r0 = r10.f4972t
            if (r0 == 0) goto L43
            r0.f27496j = r10
        L43:
            ba.dt r0 = r10.f4973u
            if (r0 == 0) goto L49
            r0.f27496j = r10
        L49:
            android.widget.TextView r0 = r10.f4974v
            r0.setTag(r8)
            android.widget.ImageView r0 = r10.f4975w
            r0.setTag(r8)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r11.setTag(r0, r10)
            r10.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.jt.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.C;
            this.C = 0L;
        }
        String str = this.f4977y;
        String str2 = this.f4976x;
        String str3 = this.A;
        String str4 = this.f4978z;
        long j11 = 132 & j10;
        long j12 = 136 & j10;
        long j13 = 144 & j10;
        long j14 = 160 & j10;
        long j15 = j10 & 192;
        if (j13 != 0) {
            gt gtVar = (gt) this.f4972t;
            gtVar.f4745v = str3;
            synchronized (gtVar) {
                gtVar.f4866w |= 1;
            }
            gtVar.a(18);
            gtVar.m();
        }
        if (j14 != 0) {
            this.f4972t.getClass();
        }
        if (j15 != 0) {
            et etVar = (et) this.f4973u;
            etVar.f4523w = str4;
            synchronized (etVar) {
                etVar.f4645x = 1 | etVar.f4645x;
            }
            etVar.a(22);
            etVar.m();
        }
        if (j12 != 0) {
            qu.i0.K(this.f4974v, str2);
        }
        if (j11 != 0) {
            zq.f.X(this.f4975w, str, 0);
        }
        this.f4973u.c();
        this.f4972t.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.C != 0) {
                    return true;
                }
                if (this.f4973u.f() || this.f4972t.f()) {
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
        this.f4973u.h();
        this.f4972t.h();
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
}
