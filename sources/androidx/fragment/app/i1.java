package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class i1 extends x7.a {

    /* renamed from: c, reason: collision with root package name */
    public final d1 f1718c;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1722g;

    /* renamed from: e, reason: collision with root package name */
    public a f1720e = null;

    /* renamed from: f, reason: collision with root package name */
    public g0 f1721f = null;

    /* renamed from: d, reason: collision with root package name */
    public final int f1719d = 1;

    public i1(d1 d1Var) {
        this.f1718c = d1Var;
    }

    @Override // x7.a
    public final void a(int i10, Object obj) {
        g0 g0Var = (g0) obj;
        if (this.f1720e == null) {
            d1 d1Var = this.f1718c;
            d1Var.getClass();
            this.f1720e = new a(d1Var);
        }
        a aVar = this.f1720e;
        aVar.getClass();
        d1 d1Var2 = g0Var.mFragmentManager;
        if (d1Var2 != null && d1Var2 != aVar.f1584q) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + g0Var.toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new o1(g0Var, 6));
        if (g0Var.equals(this.f1721f)) {
            this.f1721f = null;
        }
    }

    @Override // x7.a
    public final void b() {
        a aVar = this.f1720e;
        if (aVar != null) {
            if (!this.f1722g) {
                try {
                    this.f1722g = true;
                    aVar.d();
                    aVar.f1584q.y(aVar, true);
                } finally {
                    this.f1722g = false;
                }
            }
            this.f1720e = null;
        }
    }

    @Override // x7.a
    public final g0 d(int i10, ViewGroup viewGroup) {
        a aVar = this.f1720e;
        d1 d1Var = this.f1718c;
        if (aVar == null) {
            d1Var.getClass();
            this.f1720e = new a(d1Var);
        }
        long j10 = i10;
        g0 C = d1Var.C("android:switcher:" + viewGroup.getId() + ":" + j10);
        if (C != null) {
            a aVar2 = this.f1720e;
            aVar2.getClass();
            aVar2.b(new o1(C, 7));
        } else {
            C = j(i10);
            this.f1720e.e(viewGroup.getId(), C, "android:switcher:" + viewGroup.getId() + ":" + j10, 1);
        }
        if (C != this.f1721f) {
            C.setMenuVisibility(false);
            if (this.f1719d == 1) {
                this.f1720e.m(C, androidx.lifecycle.n.f1950d);
            } else {
                C.setUserVisibleHint(false);
            }
        }
        return C;
    }

    @Override // x7.a
    public final boolean e(View view, Object obj) {
        if (((g0) obj).getView() == view) {
            return true;
        }
        return false;
    }

    @Override // x7.a
    public final void f(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // x7.a
    public final Parcelable g() {
        return null;
    }

    @Override // x7.a
    public final void h(Object obj) {
        g0 g0Var = (g0) obj;
        g0 g0Var2 = this.f1721f;
        if (g0Var != g0Var2) {
            d1 d1Var = this.f1718c;
            int i10 = this.f1719d;
            if (g0Var2 != null) {
                g0Var2.setMenuVisibility(false);
                if (i10 == 1) {
                    if (this.f1720e == null) {
                        d1Var.getClass();
                        this.f1720e = new a(d1Var);
                    }
                    this.f1720e.m(this.f1721f, androidx.lifecycle.n.f1950d);
                } else {
                    this.f1721f.setUserVisibleHint(false);
                }
            }
            g0Var.setMenuVisibility(true);
            if (i10 == 1) {
                if (this.f1720e == null) {
                    d1Var.getClass();
                    this.f1720e = new a(d1Var);
                }
                this.f1720e.m(g0Var, androidx.lifecycle.n.f1951e);
            } else {
                g0Var.setUserVisibleHint(true);
            }
            this.f1721f = g0Var;
        }
    }

    @Override // x7.a
    public final void i(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract g0 j(int i10);
}
