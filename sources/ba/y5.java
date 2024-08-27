package ba;

import com.assetgro.stockgro.data.model.portfolio.WithdrawPreCheckData;

/* loaded from: classes.dex */
public final class y5 extends x5 {

    /* renamed from: w, reason: collision with root package name */
    public long f6709w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y5(android.view.View r5) {
        /*
            r4 = this;
            r0 = 3
            r1 = 0
            java.lang.Object[] r0 = m4.m.j(r5, r0, r1, r1)
            r2 = 2
            r2 = r0[r2]
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            r3 = 1
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4.<init>(r5, r3, r2, r1)
            r2 = -1
            r4.f6709w = r2
            com.google.android.material.button.MaterialButton r2 = r4.f6609s
            r2.setTag(r1)
            android.widget.TextView r2 = r4.f6610t
            r2.setTag(r1)
            r2 = 0
            r0 = r0[r2]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r1)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r5.setTag(r0, r4)
            r4.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.y5.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        String str;
        String str2;
        synchronized (this) {
            j10 = this.f6709w;
            this.f6709w = 0L;
        }
        WithdrawPreCheckData withdrawPreCheckData = this.f6611u;
        long j11 = j10 & 3;
        if (j11 != 0 && withdrawPreCheckData != null) {
            str = withdrawPreCheckData.getCtaTitle();
            str2 = withdrawPreCheckData.getErrorMessage();
        } else {
            str = null;
            str2 = null;
        }
        if (j11 != 0) {
            qu.i0.K(this.f6609s, str);
            el.l.A0(this.f6610t, str2);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6709w != 0) {
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
            this.f6709w = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
