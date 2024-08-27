package ba;

import android.util.SparseIntArray;
import android.widget.TextView;
import com.assetgro.stockgro.missions.domain.model.MissionsHistoryConsolidated;
import com.assetgro.stockgro.missions.presentation.history.MissionHistoryViewModel;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qs extends ps {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f5895v;

    /* renamed from: u, reason: collision with root package name */
    public long f5896u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5895v = sparseIntArray;
        sparseIntArray.put(R.id.label_completed, 2);
        sparseIntArray.put(R.id.label_see_more, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public qs(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = ba.qs.f5895v
            r1 = 4
            r2 = 0
            java.lang.Object[] r0 = m4.m.j(r6, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 3
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 1
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5.<init>(r2, r6, r1)
            r3 = -1
            r5.f5896u = r3
            r1 = 0
            r0 = r0[r1]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0.setTag(r2)
            android.widget.TextView r0 = r5.f5802s
            r0.setTag(r2)
            r0 = 2131362422(0x7f0a0276, float:1.8344624E38)
            r6.setTag(r0, r5)
            r5.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.qs.<init>(android.view.View):void");
    }

    @Override // m4.m
    public final void b() {
        long j10;
        androidx.lifecycle.e0 e0Var;
        synchronized (this) {
            j10 = this.f5896u;
            this.f5896u = 0L;
        }
        MissionHistoryViewModel missionHistoryViewModel = this.f5803t;
        long j11 = j10 & 7;
        int i10 = 0;
        if (j11 != 0) {
            MissionsHistoryConsolidated missionsHistoryConsolidated = null;
            if (missionHistoryViewModel != null) {
                e0Var = missionHistoryViewModel.f8883o;
            } else {
                e0Var = null;
            }
            q(0, e0Var);
            if (e0Var != null) {
                missionsHistoryConsolidated = (MissionsHistoryConsolidated) e0Var.getValue();
            }
            if (missionsHistoryConsolidated != null) {
                i10 = missionsHistoryConsolidated.getCompleted();
            }
        }
        if (j11 != 0) {
            TextView textView = this.f5802s;
            Intrinsics.checkNotNullParameter(textView, "<this>");
            textView.setText(String.valueOf(i10));
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f5896u != 0) {
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
            this.f5896u = 4L;
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
            this.f5896u |= 1;
        }
        return true;
    }
}
