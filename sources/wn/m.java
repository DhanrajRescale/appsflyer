package wn;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public abstract class m extends o3.b {

    /* renamed from: a, reason: collision with root package name */
    public n f39346a;

    /* renamed from: b, reason: collision with root package name */
    public int f39347b = 0;

    public m() {
    }

    @Override // o3.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        t(coordinatorLayout, view, i10);
        if (this.f39346a == null) {
            this.f39346a = new n(view);
        }
        n nVar = this.f39346a;
        View view2 = nVar.f39348a;
        nVar.f39349b = view2.getTop();
        nVar.f39350c = view2.getLeft();
        this.f39346a.a();
        int i11 = this.f39347b;
        if (i11 != 0) {
            this.f39346a.b(i11);
            this.f39347b = 0;
            return true;
        }
        return true;
    }

    public final int s() {
        n nVar = this.f39346a;
        if (nVar != null) {
            return nVar.f39351d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.r(view, i10);
    }

    public m(int i10) {
    }
}
