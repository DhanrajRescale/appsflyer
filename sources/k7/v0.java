package k7;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class v0 extends l1 {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f22605a;

    /* renamed from: b, reason: collision with root package name */
    public final b2 f22606b = new b2(this);

    /* renamed from: c, reason: collision with root package name */
    public s0 f22607c;

    /* renamed from: d, reason: collision with root package name */
    public s0 f22608d;

    public static int c(View view, t0 t0Var) {
        return ((t0Var.c(view) / 2) + t0Var.d(view)) - ((t0Var.g() / 2) + t0Var.f());
    }

    public static View d(i1 i1Var, t0 t0Var) {
        int v10 = i1Var.v();
        View view = null;
        if (v10 == 0) {
            return null;
        }
        int g10 = (t0Var.g() / 2) + t0Var.f();
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i11 = 0; i11 < v10; i11++) {
            View u10 = i1Var.u(i11);
            int abs = Math.abs(((t0Var.c(u10) / 2) + t0Var.d(u10)) - g10);
            if (abs < i10) {
                view = u10;
                i10 = abs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f22605a;
        if (recyclerView2 != recyclerView) {
            b2 b2Var = this.f22606b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.A0;
                if (arrayList != null) {
                    arrayList.remove(b2Var);
                }
                this.f22605a.setOnFlingListener(null);
            }
            this.f22605a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    this.f22605a.j(b2Var);
                    this.f22605a.setOnFlingListener(this);
                    new Scroller(this.f22605a.getContext(), new DecelerateInterpolator());
                    h();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public final int[] b(i1 i1Var, View view) {
        int[] iArr = new int[2];
        if (i1Var.d()) {
            iArr[0] = c(view, f(i1Var));
        } else {
            iArr[0] = 0;
        }
        if (i1Var.e()) {
            iArr[1] = c(view, g(i1Var));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View e(i1 i1Var) {
        if (i1Var.e()) {
            return d(i1Var, g(i1Var));
        }
        if (i1Var.d()) {
            return d(i1Var, f(i1Var));
        }
        return null;
    }

    public final t0 f(i1 i1Var) {
        s0 s0Var = this.f22608d;
        if (s0Var == null || s0Var.f22577a != i1Var) {
            this.f22608d = new s0(i1Var, 0);
        }
        return this.f22608d;
    }

    public final t0 g(i1 i1Var) {
        s0 s0Var = this.f22607c;
        if (s0Var == null || s0Var.f22577a != i1Var) {
            this.f22607c = new s0(i1Var, 1);
        }
        return this.f22607c;
    }

    public final void h() {
        i1 layoutManager;
        View e10;
        RecyclerView recyclerView = this.f22605a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (e10 = e(layoutManager)) != null) {
            int[] b10 = b(layoutManager, e10);
            int i10 = b10[0];
            if (i10 != 0 || b10[1] != 0) {
                this.f22605a.k0(i10, b10[1], false);
            }
        }
    }
}
