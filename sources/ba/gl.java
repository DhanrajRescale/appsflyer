package ba;

import android.util.SparseIntArray;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class gl extends fl {
    public static final SparseIntArray R;
    public final ProgressBar O;
    public final ConstraintLayout P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 19);
        sparseIntArray.put(R.id.toolbar, 20);
        sparseIntArray.put(R.id.my_subscription_refresh_layout, 21);
        sparseIntArray.put(R.id.title_my_subscription, 22);
        sparseIntArray.put(R.id.flow_icon, 23);
        sparseIntArray.put(R.id.my_plan_detail_container, 24);
        sparseIntArray.put(R.id.my_plan_container, 25);
        sparseIntArray.put(R.id.title_plan_type, 26);
        sparseIntArray.put(R.id.view_details, 27);
        sparseIntArray.put(R.id.view_details_click_reciever, 28);
        sparseIntArray.put(R.id.title_more_plans, 29);
        sparseIntArray.put(R.id.subscription_plan_overview_recycle_view, 30);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public gl(android.view.View r27) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.gl.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0167  */
    @Override // m4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 883
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.gl.b():void");
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.Q != 0) {
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
            this.Q = 16L;
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
                    this.Q |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.Q |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.Q |= 1;
        }
        return true;
    }
}
