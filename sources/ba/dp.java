package ba;

import android.util.SparseIntArray;
import androidx.constraintlayout.widget.Group;
import com.assetgro.stockgro.data.model.SubscriptionFeature;
import com.assetgro.stockgro.data.remote.response.SubscriptionDowngradePromptResponse;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.subscription.SubscriptionDowngradePromptViewModel;
import java.util.List;

/* loaded from: classes.dex */
public final class dp extends cp {
    public static final SparseIntArray A;

    /* renamed from: y, reason: collision with root package name */
    public final Group f4511y;

    /* renamed from: z, reason: collision with root package name */
    public long f4512z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 4);
        sparseIntArray.put(R.id.toolbar, 5);
        sparseIntArray.put(R.id.plan_confirmation_container, 6);
        sparseIntArray.put(R.id.kyc_status_container, 7);
        sparseIntArray.put(R.id.illustration, 8);
        sparseIntArray.put(R.id.stay_current_plan, 9);
        sparseIntArray.put(R.id.change, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dp(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.dp.A
            r2 = 11
            r8 = 0
            java.lang.Object[] r9 = m4.m.j(r11, r2, r8, r0)
            r0 = 4
            r0 = r9[r0]
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r0 = 10
            r0 = r9[r0]
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0 = 8
            r0 = r9[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 7
            r0 = r9[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0 = 2
            r0 = r9[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 6
            r0 = r9[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0 = 9
            r0 = r9[r0]
            r5 = r0
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
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
            r10.f4512z = r0
            r0 = 0
            r0 = r9[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r8)
            r0 = 1
            r0 = r9[r0]
            androidx.constraintlayout.widget.Group r0 = (androidx.constraintlayout.widget.Group) r0
            r10.f4511y = r0
            r0.setTag(r8)
            android.widget.TextView r0 = r10.f4399t
            r0.setTag(r8)
            androidx.appcompat.widget.LinearLayoutCompat r0 = r10.f4401v
            r0.setTag(r8)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r11.setTag(r0, r10)
            r10.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.dp.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        List<SubscriptionFeature> list;
        androidx.lifecycle.e0 e0Var;
        SubscriptionDowngradePromptResponse subscriptionDowngradePromptResponse;
        boolean z10;
        long j11;
        synchronized (this) {
            j10 = this.f4512z;
            this.f4512z = 0L;
        }
        SubscriptionDowngradePromptViewModel subscriptionDowngradePromptViewModel = this.f4403x;
        long j12 = j10 & 7;
        int i10 = 0;
        String str = null;
        if (j12 != 0) {
            if (subscriptionDowngradePromptViewModel != null) {
                e0Var = subscriptionDowngradePromptViewModel.f10535p;
            } else {
                e0Var = null;
            }
            q(0, e0Var);
            if (e0Var != null) {
                subscriptionDowngradePromptResponse = (SubscriptionDowngradePromptResponse) e0Var.getValue();
            } else {
                subscriptionDowngradePromptResponse = null;
            }
            if (subscriptionDowngradePromptResponse != null) {
                str = subscriptionDowngradePromptResponse.getNote();
                list = subscriptionDowngradePromptResponse.getMissingFeatures();
            } else {
                list = null;
            }
            if (subscriptionDowngradePromptResponse != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (j12 != 0) {
                if (z10) {
                    j11 = 16;
                } else {
                    j11 = 8;
                }
                j10 |= j11;
            }
            if (!z10) {
                i10 = 8;
            }
        } else {
            list = null;
        }
        if ((j10 & 7) != 0) {
            this.f4511y.setVisibility(i10);
            el.l.A0(this.f4399t, str);
            el.l.s0(this.f4401v, list);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4512z != 0) {
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
            this.f4512z = 4L;
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
            this.f4512z |= 1;
        }
        return true;
    }
}
