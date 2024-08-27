package ba;

import android.util.SparseIntArray;
import com.assetgro.stockgro.missions.domain.model.MissionDetail;
import com.assetgro.stockgro.missions.domain.model.TaskDetails;
import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailViewModel;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class ws extends vs {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f6581x;

    /* renamed from: w, reason: collision with root package name */
    public long f6582w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6581x = sparseIntArray;
        sparseIntArray.put(R.id.icon, 2);
        sparseIntArray.put(R.id.label, 3);
        sparseIntArray.put(R.id.icon_arrow, 4);
        sparseIntArray.put(R.id.toggle_instructions_view, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ws(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            android.util.SparseIntArray r0 = ba.ws.f6581x
            r2 = 6
            r6 = 0
            java.lang.Object[] r7 = m4.m.j(r9, r2, r6, r0)
            r0 = 2
            r0 = r7[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 4
            r0 = r7[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 1
            r0 = r7[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 3
            r0 = r7[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 5
            r0 = r7[r0]
            r5 = r0
            android.view.View r5 = (android.view.View) r5
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f6582w = r0
            android.widget.TextView r0 = r8.f6466t
            r0.setTag(r6)
            r0 = 0
            r0 = r7[r0]
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            r0.setTag(r6)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r9.setTag(r0, r8)
            r8.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.ws.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        androidx.lifecycle.e0 e0Var;
        MissionDetail missionDetail;
        TaskDetails taskDetails;
        synchronized (this) {
            j10 = this.f6582w;
            this.f6582w = 0L;
        }
        MissionTaskDetailViewModel missionTaskDetailViewModel = this.f6468v;
        long j11 = j10 & 7;
        String str = null;
        if (j11 != 0) {
            if (missionTaskDetailViewModel != null) {
                e0Var = missionTaskDetailViewModel.f8864o;
            } else {
                e0Var = null;
            }
            q(0, e0Var);
            if (e0Var != null) {
                missionDetail = (MissionDetail) e0Var.getValue();
            } else {
                missionDetail = null;
            }
            if (missionDetail != null) {
                taskDetails = missionDetail.getTaskDetails();
            } else {
                taskDetails = null;
            }
            if (taskDetails != null) {
                str = taskDetails.getInstructions();
            }
        }
        if (j11 != 0) {
            qu.i0.K(this.f6466t, str);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6582w != 0) {
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
            this.f6582w = 4L;
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
            this.f6582w |= 1;
        }
        return true;
    }
}
