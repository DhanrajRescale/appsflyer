package g7;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.relex.circleindicator.CircleIndicator2;
import me.relex.circleindicator.CircleIndicator3;

/* loaded from: classes.dex */
public final class d3 extends k7.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16715b;

    public /* synthetic */ d3(Object obj, int i10) {
        this.f16714a = i10;
        this.f16715b = obj;
    }

    @Override // k7.b1
    public final void a() {
        int i10;
        View e10;
        View e11;
        int H;
        int i11;
        int i12 = this.f16714a;
        int i13 = -1;
        int i14 = 0;
        Object obj = this.f16715b;
        switch (i12) {
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.k(null);
                recyclerView.f2424y0.f22591f = true;
                recyclerView.Z(true);
                if (!recyclerView.f2384e.g()) {
                    recyclerView.requestLayout();
                    return;
                }
                return;
            case 2:
                ((z7.d) obj).b(true);
                return;
            case 3:
                ((yo.n) obj).b();
                return;
            case 4:
                CircleIndicator2 circleIndicator2 = (CircleIndicator2) obj;
                RecyclerView recyclerView2 = circleIndicator2.f27726k;
                if (recyclerView2 != null) {
                    k7.z0 adapter = recyclerView2.getAdapter();
                    if (adapter != null) {
                        i10 = adapter.a();
                    } else {
                        i10 = 0;
                    }
                    if (i10 != circleIndicator2.getChildCount()) {
                        if (circleIndicator2.f42842j < i10) {
                            k7.i1 layoutManager = circleIndicator2.f27726k.getLayoutManager();
                            if (layoutManager == null || (e11 = circleIndicator2.f27727l.e(layoutManager)) == null) {
                                H = -1;
                            } else {
                                H = k7.i1.H(e11);
                            }
                            circleIndicator2.f42842j = H;
                        } else {
                            circleIndicator2.f42842j = -1;
                        }
                        k7.z0 adapter2 = circleIndicator2.f27726k.getAdapter();
                        if (adapter2 != null) {
                            i14 = adapter2.a();
                        }
                        k7.i1 layoutManager2 = circleIndicator2.f27726k.getLayoutManager();
                        if (layoutManager2 != null && (e10 = circleIndicator2.f27727l.e(layoutManager2)) != null) {
                            i13 = k7.i1.H(e10);
                        }
                        circleIndicator2.b(i14, i13);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                CircleIndicator3 circleIndicator3 = (CircleIndicator3) obj;
                ViewPager2 viewPager2 = circleIndicator3.f27730k;
                if (viewPager2 != null) {
                    k7.z0 adapter3 = viewPager2.getAdapter();
                    if (adapter3 != null) {
                        i11 = adapter3.a();
                    } else {
                        i11 = 0;
                    }
                    if (i11 != circleIndicator3.getChildCount()) {
                        if (circleIndicator3.f42842j < i11) {
                            circleIndicator3.f42842j = circleIndicator3.f27730k.getCurrentItem();
                        } else {
                            circleIndicator3.f42842j = -1;
                        }
                        k7.z0 adapter4 = circleIndicator3.f27730k.getAdapter();
                        if (adapter4 != null) {
                            i14 = adapter4.a();
                        }
                        circleIndicator3.b(i14, circleIndicator3.f27730k.getCurrentItem());
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // k7.b1
    public final void b(int i10, int i11, Object obj) {
        int i12 = this.f16714a;
        Object obj2 = this.f16715b;
        switch (i12) {
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj2;
                recyclerView.k(null);
                k7.b bVar = recyclerView.f2384e;
                if (i11 < 1) {
                    bVar.getClass();
                    return;
                }
                ArrayList arrayList = bVar.f22274b;
                arrayList.add(bVar.h(obj, 4, i10, i11));
                bVar.f22278f |= 4;
                if (arrayList.size() == 1) {
                    h();
                    return;
                }
                return;
            case 2:
                a();
                return;
            case 3:
                ((yo.n) obj2).b();
                return;
            case 4:
                g();
                a();
                return;
            case 5:
                g();
                a();
                return;
            default:
                g();
                return;
        }
    }

    @Override // k7.b1
    public final void c(int i10, int i11) {
        int i12 = this.f16714a;
        Object obj = this.f16715b;
        switch (i12) {
            case 0:
                f3 f3Var = (f3) obj;
                if (f3Var.f22653c == k7.y0.f22626c && !f3Var.f16766d) {
                    f3Var.r(k7.y0.f22624a);
                }
                f3Var.f22651a.unregisterObserver(this);
                return;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.k(null);
                k7.b bVar = recyclerView.f2384e;
                if (i11 < 1) {
                    bVar.getClass();
                    return;
                }
                ArrayList arrayList = bVar.f22274b;
                arrayList.add(bVar.h(null, 1, i10, i11));
                bVar.f22278f |= 1;
                if (arrayList.size() == 1) {
                    h();
                    return;
                }
                return;
            case 2:
                a();
                return;
            case 3:
                ((yo.n) obj).b();
                return;
            case 4:
                a();
                return;
            default:
                a();
                return;
        }
    }

    @Override // k7.b1
    public final void d(int i10, int i11) {
        int i12 = this.f16714a;
        Object obj = this.f16715b;
        switch (i12) {
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.k(null);
                k7.b bVar = recyclerView.f2384e;
                bVar.getClass();
                if (i10 != i11) {
                    ArrayList arrayList = bVar.f22274b;
                    arrayList.add(bVar.h(null, 8, i10, i11));
                    bVar.f22278f |= 8;
                    if (arrayList.size() == 1) {
                        h();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                a();
                return;
            case 3:
                ((yo.n) obj).b();
                return;
            case 4:
                a();
                return;
            case 5:
                a();
                return;
            default:
                return;
        }
    }

    @Override // k7.b1
    public final void e(int i10, int i11) {
        int i12 = this.f16714a;
        Object obj = this.f16715b;
        switch (i12) {
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.k(null);
                k7.b bVar = recyclerView.f2384e;
                if (i11 < 1) {
                    bVar.getClass();
                    return;
                }
                ArrayList arrayList = bVar.f22274b;
                arrayList.add(bVar.h(null, 2, i10, i11));
                bVar.f22278f |= 2;
                if (arrayList.size() == 1) {
                    h();
                    return;
                }
                return;
            case 2:
                a();
                return;
            case 3:
                ((yo.n) obj).b();
                return;
            case 4:
                a();
                return;
            case 5:
                a();
                return;
            default:
                return;
        }
    }

    @Override // k7.b1
    public final void f() {
        k7.z0 z0Var;
        switch (this.f16714a) {
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.f16715b;
                if (recyclerView.f2383d != null && (z0Var = recyclerView.f2400m) != null) {
                    int ordinal = z0Var.f22653c.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return;
                        }
                    } else if (z0Var.a() <= 0) {
                        return;
                    }
                    recyclerView.requestLayout();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void g() {
        switch (this.f16714a) {
            case 2:
                a();
                return;
            case 3:
                ((yo.n) this.f16715b).b();
                return;
            case 4:
                a();
                return;
            case 5:
                a();
                return;
            default:
                return;
        }
    }

    public final void h() {
        boolean z10 = RecyclerView.Z0;
        Object obj = this.f16715b;
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) obj;
            if (recyclerView.f2413t && recyclerView.f2411s) {
                k7.w0 w0Var = recyclerView.f2392i;
                WeakHashMap weakHashMap = d4.n1.f13788a;
                d4.v0.m(recyclerView, w0Var);
                return;
            }
        }
        RecyclerView recyclerView2 = (RecyclerView) obj;
        recyclerView2.A = true;
        recyclerView2.requestLayout();
    }

    public d3(z7.d dVar) {
        this.f16714a = 2;
        this.f16715b = dVar;
    }
}
