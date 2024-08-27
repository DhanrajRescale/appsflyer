package k7;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f22423a;

    /* renamed from: e, reason: collision with root package name */
    public View f22427e;

    /* renamed from: d, reason: collision with root package name */
    public int f22426d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final l5.j f22424b = new l5.j(3);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f22425c = new ArrayList();

    public j(x0 x0Var) {
        this.f22423a = x0Var;
    }

    public final void a(View view, int i10, boolean z10) {
        int f10;
        x0 x0Var = this.f22423a;
        if (i10 < 0) {
            f10 = x0Var.f22614a.getChildCount();
        } else {
            f10 = f(i10);
        }
        this.f22424b.g(f10, z10);
        if (z10) {
            i(view);
        }
        RecyclerView recyclerView = x0Var.f22614a;
        recyclerView.addView(view, f10);
        y1 N = RecyclerView.N(view);
        z0 z0Var = recyclerView.f2400m;
        if (z0Var != null && N != null) {
            z0Var.l(N);
        }
        ArrayList arrayList = recyclerView.C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((k1) recyclerView.C.get(size)).c(view);
            }
        }
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int f10;
        x0 x0Var = this.f22423a;
        if (i10 < 0) {
            f10 = x0Var.f22614a.getChildCount();
        } else {
            f10 = f(i10);
        }
        this.f22424b.g(f10, z10);
        if (z10) {
            i(view);
        }
        x0Var.getClass();
        y1 N = RecyclerView.N(view);
        RecyclerView recyclerView = x0Var.f22614a;
        if (N != null) {
            if (!N.n() && !N.s()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(N);
                throw new IllegalArgumentException(nn.d.i(recyclerView, sb2));
            }
            if (RecyclerView.V0) {
                Log.d("RecyclerView", "reAttach " + N);
            }
            N.f22638j &= -257;
        } else if (RecyclerView.U0) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            sb3.append(", index: ");
            sb3.append(f10);
            throw new IllegalArgumentException(nn.d.i(recyclerView, sb3));
        }
        recyclerView.attachViewToParent(view, f10, layoutParams);
    }

    public final void c(int i10) {
        int f10 = f(i10);
        this.f22424b.i(f10);
        RecyclerView recyclerView = this.f22423a.f22614a;
        View childAt = recyclerView.getChildAt(f10);
        if (childAt != null) {
            y1 N = RecyclerView.N(childAt);
            if (N != null) {
                if (N.n() && !N.s()) {
                    StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                    sb2.append(N);
                    throw new IllegalArgumentException(nn.d.i(recyclerView, sb2));
                }
                if (RecyclerView.V0) {
                    Log.d("RecyclerView", "tmpDetach " + N);
                }
                N.b(256);
            }
        } else if (RecyclerView.U0) {
            StringBuilder sb3 = new StringBuilder("No view at offset ");
            sb3.append(f10);
            throw new IllegalArgumentException(nn.d.i(recyclerView, sb3));
        }
        recyclerView.detachViewFromParent(f10);
    }

    public final View d(int i10) {
        return this.f22423a.f22614a.getChildAt(f(i10));
    }

    public final int e() {
        return this.f22423a.f22614a.getChildCount() - this.f22425c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int childCount = this.f22423a.f22614a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            l5.j jVar = this.f22424b;
            int c10 = i10 - (i11 - jVar.c(i11));
            if (c10 == 0) {
                while (jVar.f(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += c10;
        }
        return -1;
    }

    public final View g(int i10) {
        return this.f22423a.f22614a.getChildAt(i10);
    }

    public final int h() {
        return this.f22423a.f22614a.getChildCount();
    }

    public final void i(View view) {
        this.f22425c.add(view);
        x0 x0Var = this.f22423a;
        x0Var.getClass();
        y1 N = RecyclerView.N(view);
        if (N != null) {
            int i10 = N.f22645q;
            View view2 = N.f22629a;
            if (i10 != -1) {
                N.f22644p = i10;
            } else {
                WeakHashMap weakHashMap = d4.n1.f13788a;
                N.f22644p = d4.v0.c(view2);
            }
            RecyclerView recyclerView = x0Var.f22614a;
            if (recyclerView.Q()) {
                N.f22645q = 4;
                recyclerView.M0.add(N);
            } else {
                WeakHashMap weakHashMap2 = d4.n1.f13788a;
                d4.v0.s(view2, 4);
            }
        }
    }

    public final int j(View view) {
        int indexOfChild = this.f22423a.f22614a.indexOfChild(view);
        if (indexOfChild == -1) {
            return -1;
        }
        l5.j jVar = this.f22424b;
        if (jVar.f(indexOfChild)) {
            return -1;
        }
        return indexOfChild - jVar.c(indexOfChild);
    }

    public final boolean k(View view) {
        return this.f22425c.contains(view);
    }

    public final void l(int i10) {
        x0 x0Var = this.f22423a;
        int i11 = this.f22426d;
        if (i11 != 1) {
            if (i11 != 2) {
                try {
                    int f10 = f(i10);
                    View childAt = x0Var.f22614a.getChildAt(f10);
                    if (childAt == null) {
                        this.f22426d = 0;
                        this.f22427e = null;
                        return;
                    }
                    this.f22426d = 1;
                    this.f22427e = childAt;
                    if (this.f22424b.i(f10)) {
                        m(childAt);
                    }
                    x0Var.k(f10);
                    this.f22426d = 0;
                    this.f22427e = null;
                    return;
                } catch (Throwable th2) {
                    this.f22426d = 0;
                    this.f22427e = null;
                    throw th2;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public final void m(View view) {
        if (this.f22425c.remove(view)) {
            x0 x0Var = this.f22423a;
            x0Var.getClass();
            y1 N = RecyclerView.N(view);
            if (N != null) {
                int i10 = N.f22644p;
                RecyclerView recyclerView = x0Var.f22614a;
                if (recyclerView.Q()) {
                    N.f22645q = i10;
                    recyclerView.M0.add(N);
                } else {
                    WeakHashMap weakHashMap = d4.n1.f13788a;
                    d4.v0.s(N.f22629a, i10);
                }
                N.f22644p = 0;
            }
        }
    }

    public final String toString() {
        return this.f22424b.toString() + ", hidden list:" + this.f22425c.size();
    }
}
