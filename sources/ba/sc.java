package ba;

/* loaded from: classes.dex */
public final class sc extends rc {

    /* renamed from: y, reason: collision with root package name */
    public long f6059y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public sc(android.view.View r10) {
        /*
            r9 = this;
            r6 = 0
            r0 = 5
            r7 = 0
            java.lang.Object[] r8 = m4.m.j(r10, r0, r7, r7)
            r0 = 4
            r0 = r8[r0]
            r5 = r0
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r0 = 2
            r0 = r8[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 1
            r0 = r8[r0]
            r2 = r0
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0 = 3
            r0 = r8[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r9.f6059y = r0
            com.google.android.material.button.MaterialButton r0 = r9.f5958s
            r0.setTag(r7)
            r0 = 0
            r0 = r8[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r7)
            android.widget.TextView r0 = r9.f5959t
            r0.setTag(r7)
            android.widget.ImageView r0 = r9.f5960u
            r0.setTag(r7)
            android.widget.TextView r0 = r9.f5961v
            r0.setTag(r7)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r10.setTag(r0, r9)
            r9.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.sc.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0071  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.sc.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6059y != 0) {
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
            this.f6059y = 128L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return false;
                            }
                            if (i11 != 0) {
                                return false;
                            }
                            synchronized (this) {
                                this.f6059y |= 32;
                            }
                            return true;
                        }
                        if (i11 != 0) {
                            return false;
                        }
                        synchronized (this) {
                            this.f6059y |= 16;
                        }
                        return true;
                    }
                    if (i11 != 0) {
                        return false;
                    }
                    synchronized (this) {
                        this.f6059y |= 8;
                    }
                    return true;
                }
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f6059y |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f6059y |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f6059y |= 1;
        }
        return true;
    }
}
