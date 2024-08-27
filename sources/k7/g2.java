package k7;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f22362a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f22363b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f22364c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f22365d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f22366e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f22367f;

    public g2(StaggeredGridLayoutManager staggeredGridLayoutManager, int i10) {
        this.f22367f = staggeredGridLayoutManager;
        this.f22366e = i10;
    }

    public final void a() {
        View view = (View) jr.h.l(this.f22362a, 1);
        d2 d2Var = (d2) view.getLayoutParams();
        this.f22364c = this.f22367f.f2429r.b(view);
        d2Var.getClass();
    }

    public final void b() {
        this.f22362a.clear();
        this.f22363b = Integer.MIN_VALUE;
        this.f22364c = Integer.MIN_VALUE;
        this.f22365d = 0;
    }

    public final int c() {
        boolean z10 = this.f22367f.f2434w;
        ArrayList arrayList = this.f22362a;
        if (z10) {
            return e(arrayList.size() - 1, -1);
        }
        return e(0, arrayList.size());
    }

    public final int d() {
        boolean z10 = this.f22367f.f2434w;
        ArrayList arrayList = this.f22362a;
        if (z10) {
            return e(0, arrayList.size());
        }
        return e(arrayList.size() - 1, -1);
    }

    public final int e(int i10, int i11) {
        int i12;
        boolean z10;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f22367f;
        int f10 = staggeredGridLayoutManager.f2429r.f();
        int e10 = staggeredGridLayoutManager.f2429r.e();
        if (i11 > i10) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        while (i10 != i11) {
            View view = (View) this.f22362a.get(i10);
            int d10 = staggeredGridLayoutManager.f2429r.d(view);
            int b10 = staggeredGridLayoutManager.f2429r.b(view);
            boolean z11 = false;
            if (d10 <= e10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (b10 >= f10) {
                z11 = true;
            }
            if (z10 && z11 && (d10 < f10 || b10 > e10)) {
                return i1.H(view);
            }
            i10 += i12;
        }
        return -1;
    }

    public final int f(int i10) {
        int i11 = this.f22364c;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (this.f22362a.size() == 0) {
            return i10;
        }
        a();
        return this.f22364c;
    }

    public final View g(int i10, int i11) {
        ArrayList arrayList = this.f22362a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f22367f;
        View view = null;
        if (i11 == -1) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                View view2 = (View) arrayList.get(i12);
                if ((staggeredGridLayoutManager.f2434w && i1.H(view2) <= i10) || ((!staggeredGridLayoutManager.f2434w && i1.H(view2) >= i10) || !view2.hasFocusable())) {
                    break;
                }
                i12++;
                view = view2;
            }
        } else {
            int size2 = arrayList.size() - 1;
            while (size2 >= 0) {
                View view3 = (View) arrayList.get(size2);
                if ((staggeredGridLayoutManager.f2434w && i1.H(view3) >= i10) || ((!staggeredGridLayoutManager.f2434w && i1.H(view3) <= i10) || !view3.hasFocusable())) {
                    break;
                }
                size2--;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i10) {
        int i11 = this.f22363b;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (this.f22362a.size() == 0) {
            return i10;
        }
        View view = (View) this.f22362a.get(0);
        d2 d2Var = (d2) view.getLayoutParams();
        this.f22363b = this.f22367f.f2429r.d(view);
        d2Var.getClass();
        return this.f22363b;
    }
}
