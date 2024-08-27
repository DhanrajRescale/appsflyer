package ba;

import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.SubscriptionPackages;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.subscription.plan.SubscriptionPlanOverviewViewModel;

/* loaded from: classes.dex */
public final class ib extends hb {
    public static final SparseIntArray C;
    public final ConstraintLayout A;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.view_feature, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ib(android.view.View r12) {
        /*
            r11 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.ib.C
            r2 = 7
            r9 = 0
            java.lang.Object[] r10 = m4.m.j(r12, r2, r9, r0)
            r0 = 4
            r0 = r10[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 3
            r0 = r10[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2
            r0 = r10[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            r0 = r10[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 5
            r0 = r10[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 6
            r0 = r10[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -1
            r11.B = r0
            android.widget.TextView r0 = r11.f4922s
            r0.setTag(r9)
            android.widget.TextView r0 = r11.f4923t
            r0.setTag(r9)
            r0 = 0
            r0 = r10[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r11.A = r0
            r0.setTag(r9)
            android.widget.TextView r0 = r11.f4924u
            r0.setTag(r9)
            android.widget.TextView r0 = r11.f4925v
            r0.setTag(r9)
            android.widget.TextView r0 = r11.f4926w
            r0.setTag(r9)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r12.setTag(r0, r11)
            r11.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ib.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        String str;
        String str2;
        String str3;
        int i10;
        int i11;
        int i12;
        androidx.lifecycle.e0 e0Var;
        SubscriptionPackages subscriptionPackages;
        String str4;
        boolean z10;
        boolean z11;
        int i13;
        boolean z12;
        long j11;
        long j12;
        long j13;
        synchronized (this) {
            j10 = this.B;
            this.B = 0L;
        }
        SubscriptionPlanOverviewViewModel subscriptionPlanOverviewViewModel = this.f4928y;
        long j14 = j10 & 7;
        String str5 = null;
        int i14 = 0;
        if (j14 != 0) {
            if (subscriptionPlanOverviewViewModel != null) {
                e0Var = subscriptionPlanOverviewViewModel.f9075c;
            } else {
                e0Var = null;
            }
            q(0, e0Var);
            if (e0Var != null) {
                subscriptionPackages = (SubscriptionPackages) e0Var.getValue();
            } else {
                subscriptionPackages = null;
            }
            if (subscriptionPackages != null) {
                z10 = subscriptionPackages.getDiscountEnabled();
                str2 = subscriptionPackages.getPrice();
                i11 = subscriptionPackages.getLevel();
                str3 = subscriptionPackages.getTitle();
                str4 = subscriptionPackages.getDiscountPrice();
                z11 = subscriptionPackages.getPriceEnabled();
                str = subscriptionPackages.getValidityTitle();
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                z10 = false;
                i11 = 0;
                z11 = false;
            }
            if (j14 != 0) {
                if (z10) {
                    j13 = 16;
                } else {
                    j13 = 8;
                }
                j10 |= j13;
            }
            if ((j10 & 7) != 0) {
                if (z11) {
                    j12 = 64;
                } else {
                    j12 = 32;
                }
                j10 |= j12;
            }
            if (z10) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            if (i11 != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            if ((j10 & 7) != 0) {
                if (z12) {
                    j11 = 256;
                } else {
                    j11 = 128;
                }
                j10 |= j11;
            }
            if (!z12) {
                i14 = 8;
            }
            i10 = i13;
            str5 = str4;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        if ((j10 & 7) != 0) {
            al.d.O0(this.f4922s, str5);
            this.f4922s.setVisibility(i14);
            this.f4923t.setVisibility(i12);
            gj.g.A(this.A, i11);
            this.f4924u.setVisibility(i10);
            al.d.d1(this.f4924u, str2);
            qu.i0.K(this.f4925v, str3);
            qu.i0.K(this.f4926w, str);
            this.f4926w.setVisibility(i14);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.B != 0) {
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
            this.B = 4L;
        }
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
            this.B |= 1;
        }
        return true;
    }
}
