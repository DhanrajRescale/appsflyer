package ba;

/* loaded from: classes.dex */
public final class q8 extends p8 {

    /* renamed from: x, reason: collision with root package name */
    public long f5841x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q8(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            r0 = 4
            r6 = 0
            java.lang.Object[] r7 = m4.m.j(r9, r0, r6, r6)
            r0 = 1
            r0 = r7[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 3
            r0 = r7[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2
            r0 = r7[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f5841x = r0
            android.widget.ImageView r0 = r8.f5729s
            r0.setTag(r6)
            android.widget.TextView r0 = r8.f5730t
            r0.setTag(r6)
            r0 = 0
            r0 = r7[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r6)
            android.widget.TextView r0 = r8.f5731u
            r0.setTag(r6)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.q8.<init>(android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.q8.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5841x != 0) {
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
            this.f5841x = 16L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f5841x |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f5841x |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f5841x |= 1;
        }
        return true;
    }
}
