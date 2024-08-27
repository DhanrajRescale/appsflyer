package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class lp extends kp {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f5381z;

    /* renamed from: y, reason: collision with root package name */
    public long f5382y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5381z = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 4);
        sparseIntArray.put(R.id.toolbar, 5);
        sparseIntArray.put(R.id.plan_confirmation_container, 6);
        sparseIntArray.put(R.id.congratulations, 7);
        sparseIntArray.put(R.id.illustration, 8);
        sparseIntArray.put(R.id.back_to_home, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public lp(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.lp.f5381z
            r2 = 10
            r8 = 0
            java.lang.Object[] r9 = m4.m.j(r11, r2, r8, r0)
            r0 = 4
            r0 = r9[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 9
            r0 = r9[r0]
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0 = 7
            r0 = r9[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 8
            r0 = r9[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 2
            r0 = r9[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 6
            r0 = r9[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0 = 1
            r0 = r9[r0]
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r0 = 3
            r0 = r9[r0]
            r6 = r0
            androidx.appcompat.widget.LinearLayoutCompat r6 = (androidx.appcompat.widget.LinearLayoutCompat) r6
            r0 = 5
            r0 = r9[r0]
            r7 = r0
            androidx.appcompat.widget.Toolbar r7 = (androidx.appcompat.widget.Toolbar) r7
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r10.f5382y = r0
            r0 = 0
            r0 = r9[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r8)
            android.widget.TextView r0 = r10.f5280t
            r0.setTag(r8)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.f5281u
            r0.setTag(r8)
            androidx.appcompat.widget.LinearLayoutCompat r0 = r10.f5282v
            r0.setTag(r8)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r11.setTag(r0, r10)
            r10.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.lp.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r19)
            long r2 = r1.f5382y     // Catch: java.lang.Throwable -> Lab
            r4 = 0
            r1.f5382y = r4     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r19)     // Catch: java.lang.Throwable -> Lab
            com.assetgro.stockgro.ui.subscription.purchase.SubscriptionPurchaseStatusViewModel r0 = r1.f5284x
            r6 = 31
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 28
            r9 = 26
            r11 = 25
            r13 = 0
            if (r6 == 0) goto L89
            long r15 = r2 & r11
            int r6 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r6 == 0) goto L32
            if (r0 == 0) goto L25
            androidx.lifecycle.e0 r6 = r0.f10578t
            goto L26
        L25:
            r6 = 0
        L26:
            r1.q(r13, r6)
            if (r6 == 0) goto L32
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            goto L33
        L32:
            r6 = 0
        L33:
            long r15 = r2 & r9
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L62
            if (r0 == 0) goto L3e
            androidx.lifecycle.e0 r13 = r0.f10582x
            goto L3f
        L3e:
            r13 = 0
        L3f:
            r14 = 1
            r1.q(r14, r13)
            if (r13 == 0) goto L4c
            java.lang.Object r13 = r13.getValue()
            kj.j r13 = (kj.j) r13
            goto L4d
        L4c:
            r13 = 0
        L4d:
            if (r13 != 0) goto L50
            goto L51
        L50:
            r14 = 0
        L51:
            if (r15 == 0) goto L5d
            if (r14 == 0) goto L5a
            r17 = 64
        L57:
            long r2 = r2 | r17
            goto L5d
        L5a:
            r17 = 32
            goto L57
        L5d:
            if (r14 == 0) goto L62
            r13 = 8
            goto L63
        L62:
            r13 = 0
        L63:
            long r14 = r2 & r7
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 == 0) goto L86
            if (r0 == 0) goto L6e
            androidx.lifecycle.e0 r0 = r0.f10575q
            goto L6f
        L6e:
            r0 = 0
        L6f:
            r14 = 2
            r1.q(r14, r0)
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r0.getValue()
            com.assetgro.stockgro.data.remote.response.SubscriptionPurchaseResponse r0 = (com.assetgro.stockgro.data.remote.response.SubscriptionPurchaseResponse) r0
            goto L7d
        L7c:
            r0 = 0
        L7d:
            if (r0 == 0) goto L86
            java.util.List r14 = r0.getFeatures()
            r0 = r14
            r14 = r6
            goto L8c
        L86:
            r14 = r6
            r0 = 0
            goto L8c
        L89:
            r0 = 0
            r13 = 0
            r14 = 0
        L8c:
            long r11 = r11 & r2
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 == 0) goto L96
            android.widget.TextView r6 = r1.f5280t
            el.l.A0(r6, r14)
        L96:
            long r9 = r9 & r2
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 == 0) goto La0
            androidx.constraintlayout.widget.ConstraintLayout r6 = r1.f5281u
            r6.setVisibility(r13)
        La0:
            long r2 = r2 & r7
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto Laa
            androidx.appcompat.widget.LinearLayoutCompat r2 = r1.f5282v
            el.l.s0(r2, r0)
        Laa:
            return
        Lab:
            r0 = move-exception
            monitor-exit(r19)     // Catch: java.lang.Throwable -> Lab
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.lp.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5382y != 0) {
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
            this.f5382y = 16L;
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
                    this.f5382y |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f5382y |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f5382y |= 1;
        }
        return true;
    }
}
