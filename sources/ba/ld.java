package ba;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.SubscriptionFeature;
import com.assetgro.stockgro.data.model.SubscriptionPackages;
import com.assetgro.stockgro.ui.subscription.plan.SubscriptionPlanDetailViewModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class ld extends kd implements dc.a {
    public final ConstraintLayout C;
    public final dc.b D;
    public long E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ld(android.view.View r14) {
        /*
            r13 = this;
            r1 = 0
            r0 = 10
            r11 = 0
            java.lang.Object[] r12 = m4.m.j(r14, r0, r11, r11)
            r0 = 5
            r0 = r12[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 9
            r0 = r12[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 4
            r0 = r12[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 8
            r0 = r12[r0]
            r6 = r0
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r0 = 3
            r0 = r12[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 2
            r0 = r12[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 6
            r0 = r12[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 7
            r0 = r12[r0]
            r10 = r0
            androidx.appcompat.widget.LinearLayoutCompat r10 = (androidx.appcompat.widget.LinearLayoutCompat) r10
            r0 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r13.E = r0
            android.widget.TextView r0 = r13.f5217s
            r0.setTag(r11)
            r0 = 0
            r1 = r12[r0]
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r1.setTag(r11)
            r1 = 1
            r1 = r12[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r13.C = r1
            r1.setTag(r11)
            android.widget.TextView r1 = r13.f5218t
            r1.setTag(r11)
            android.widget.TextView r1 = r13.f5219u
            r1.setTag(r11)
            com.google.android.material.button.MaterialButton r1 = r13.f5220v
            r1.setTag(r11)
            android.widget.TextView r1 = r13.f5221w
            r1.setTag(r11)
            android.widget.TextView r1 = r13.f5222x
            r1.setTag(r11)
            android.widget.TextView r1 = r13.f5223y
            r1.setTag(r11)
            androidx.appcompat.widget.LinearLayoutCompat r1 = r13.f5224z
            r1.setTag(r11)
            r1 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r14.setTag(r1, r13)
            dc.b r14 = new dc.b
            r14.<init>(r0, r13)
            r13.D = r14
            r13.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ld.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        List<SubscriptionFeature> list;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        String str7;
        androidx.lifecycle.e0 e0Var;
        SubscriptionPackages subscriptionPackages;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        List<SubscriptionFeature> list2;
        boolean z11;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        int i16;
        int i17;
        long j11;
        long j12;
        long j13;
        synchronized (this) {
            j10 = this.E;
            this.E = 0L;
        }
        SubscriptionPlanDetailViewModel subscriptionPlanDetailViewModel = this.A;
        long j14 = j10 & 7;
        String str13 = null;
        int i18 = 0;
        if (j14 != 0) {
            if (subscriptionPlanDetailViewModel != null) {
                e0Var = subscriptionPlanDetailViewModel.f9075c;
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
                str13 = subscriptionPackages.getCtaTitle();
                str9 = subscriptionPackages.getDescription();
                z11 = subscriptionPackages.getDiscountEnabled();
                z12 = subscriptionPackages.getButtonDisabled();
                str3 = subscriptionPackages.getPrice();
                i14 = subscriptionPackages.getLevel();
                str10 = subscriptionPackages.getTitle();
                str11 = subscriptionPackages.getDiscountPrice();
                str12 = subscriptionPackages.getMessage();
                z13 = subscriptionPackages.getPurchaseEnabled();
                list2 = subscriptionPackages.getFeatures();
                str8 = subscriptionPackages.getValidityTitle();
            } else {
                str8 = null;
                str9 = null;
                str3 = null;
                str10 = null;
                str11 = null;
                str12 = null;
                list2 = null;
                z11 = false;
                z12 = false;
                i14 = 0;
                z13 = false;
            }
            if (j14 != 0) {
                if (z11) {
                    j13 = 64;
                } else {
                    j13 = 32;
                }
                j10 |= j13;
            }
            if ((j10 & 7) != 0) {
                if (z13) {
                    j12 = 272;
                } else {
                    j12 = 136;
                }
                j10 |= j12;
            }
            if (z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            boolean z14 = true;
            boolean z15 = !z12;
            if (i14 == 0) {
                z14 = false;
            }
            if (z13) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            if (z13) {
                i16 = 8;
            } else {
                i16 = 0;
            }
            if ((j10 & 7) != 0) {
                if (z14) {
                    j11 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
                } else {
                    j11 = 512;
                }
                j10 |= j11;
            }
            if (z14) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            str6 = str8;
            i13 = i17;
            z10 = z15;
            i18 = i14;
            str = str12;
            i12 = i16;
            list = list2;
            i11 = i15;
            str5 = str9;
            str2 = str13;
            str13 = str11;
            str4 = str10;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            list = null;
            i10 = 0;
            z10 = false;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        if ((7 & j10) != 0) {
            al.d.O0(this.f5217s, str13);
            gj.g.A(this.C, i18);
            qu.i0.K(this.f5218t, str);
            this.f5218t.setVisibility(i12);
            this.f5219u.setVisibility(i10);
            al.d.d1(this.f5219u, str3);
            qu.i0.K(this.f5220v, str2);
            this.f5220v.setEnabled(z10);
            this.f5220v.setVisibility(i11);
            TextView textView = this.f5221w;
            Intrinsics.checkNotNullParameter(textView, "<this>");
            if (str5 == null || str5.length() == 0) {
                str7 = str5;
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                str7 = str5;
                textView.setText(str7);
            }
            qu.i0.K(this.f5221w, str7);
            qu.i0.K(this.f5222x, str4);
            qu.i0.K(this.f5223y, str6);
            this.f5223y.setVisibility(i13);
            el.l.s0(this.f5224z, list);
        }
        if ((j10 & 4) != 0) {
            this.f5220v.setOnClickListener(this.D);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.E != 0) {
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
            this.E = 4L;
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
            this.E |= 1;
        }
        return true;
    }
}
