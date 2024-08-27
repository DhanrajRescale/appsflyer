package ba;

import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public final class ga extends fa {
    public long A;

    /* renamed from: y, reason: collision with root package name */
    public final MaterialCardView f4788y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f4789z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ga(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            r0 = 6
            r7 = 0
            java.lang.Object[] r8 = m4.m.j(r10, r0, r7, r7)
            r0 = 3
            r0 = r8[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 1
            r0 = r8[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 4
            r0 = r8[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 5
            r0 = r8[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r9.A = r0
            android.widget.TextView r0 = r9.f4689s
            r0.setTag(r7)
            r0 = 0
            r0 = r8[r0]
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            r9.f4788y = r0
            r0.setTag(r7)
            r0 = 2
            r0 = r8[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.f4789z = r0
            r0.setTag(r7)
            android.widget.ImageView r0 = r9.f4690t
            r0.setTag(r7)
            android.widget.TextView r0 = r9.f4691u
            r0.setTag(r7)
            android.widget.ImageView r0 = r9.f4692v
            r0.setTag(r7)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r10.setTag(r0, r9)
            r9.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ga.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ga.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.A != 0) {
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
            this.A = 16L;
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
                    this.A |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.A |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 1;
        }
        return true;
    }
}
