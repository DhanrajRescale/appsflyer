package ba;

import android.util.SparseIntArray;
import android.widget.TextView;
import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailViewModel;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class rq extends qq {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f5998y;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f5999w;

    /* renamed from: x, reason: collision with root package name */
    public long f6000x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5998y = sparseIntArray;
        sparseIntArray.put(R.id.user_display_image_container, 4);
        sparseIntArray.put(R.id.task_accomplished_message, 5);
        sparseIntArray.put(R.id.container, 6);
        sparseIntArray.put(R.id.reward_icon, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public rq(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.rq.f5998y
            r2 = 8
            r6 = 0
            java.lang.Object[] r7 = m4.m.j(r9, r2, r6, r0)
            r0 = 2
            r0 = r7[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 6
            r0 = r7[r0]
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            r0 = 7
            r0 = r7[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 5
            r0 = r7[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 1
            r0 = r7[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 4
            r0 = r7[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f6000x = r0
            android.widget.TextView r0 = r8.f5889s
            r0.setTag(r6)
            r0 = 0
            r0 = r7[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r6)
            r0 = 3
            r0 = r7[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f5999w = r0
            r0.setTag(r6)
            android.widget.ImageView r0 = r8.f5891u
            r0.setTag(r6)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.rq.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        String str;
        String str2;
        int i10;
        String str3;
        androidx.lifecycle.d0 d0Var;
        synchronized (this) {
            j10 = this.f6000x;
            this.f6000x = 0L;
        }
        MissionTaskDetailViewModel missionTaskDetailViewModel = this.f5892v;
        long j11 = 7 & j10;
        int i11 = 0;
        String str4 = null;
        if (j11 != 0) {
            if ((j10 & 6) != 0 && missionTaskDetailViewModel != null) {
                str2 = missionTaskDetailViewModel.D;
                i10 = missionTaskDetailViewModel.E;
                str3 = missionTaskDetailViewModel.C;
            } else {
                i10 = 0;
                str2 = null;
                str3 = null;
            }
            if (missionTaskDetailViewModel != null) {
                d0Var = missionTaskDetailViewModel.f8873x;
            } else {
                d0Var = null;
            }
            q(0, d0Var);
            if (d0Var != null) {
                str4 = (String) d0Var.getValue();
            }
            str = str4;
            i11 = i10;
            str4 = str3;
        } else {
            str = null;
            str2 = null;
        }
        if ((j10 & 6) != 0) {
            qu.i0.K(this.f5889s, str4);
            zq.f.X(this.f5891u, str2, i11);
        }
        if (j11 != 0) {
            qu.i0.K(this.f5999w, str);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6000x != 0) {
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
            this.f6000x = 4L;
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
            this.f6000x |= 1;
        }
        return true;
    }
}
