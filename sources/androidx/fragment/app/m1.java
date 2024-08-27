package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class m1 extends x7.a {

    /* renamed from: c, reason: collision with root package name */
    public final d1 f1762c;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1768i;

    /* renamed from: e, reason: collision with root package name */
    public a f1764e = null;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1765f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1766g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public g0 f1767h = null;

    /* renamed from: d, reason: collision with root package name */
    public final int f1763d = 1;

    public m1(d1 d1Var) {
        this.f1762c = d1Var;
    }

    @Override // x7.a
    public final void a(int i10, Object obj) {
        ArrayList arrayList;
        f0 f0Var;
        g0 g0Var = (g0) obj;
        a aVar = this.f1764e;
        d1 d1Var = this.f1762c;
        if (aVar == null) {
            d1Var.getClass();
            this.f1764e = new a(d1Var);
        }
        while (true) {
            arrayList = this.f1765f;
            if (arrayList.size() > i10) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        if (g0Var.isAdded()) {
            f0Var = d1Var.X(g0Var);
        } else {
            f0Var = null;
        }
        arrayList.set(i10, f0Var);
        this.f1766g.set(i10, null);
        this.f1764e.l(g0Var);
        if (g0Var.equals(this.f1767h)) {
            this.f1767h = null;
        }
    }

    @Override // x7.a
    public final void b() {
        a aVar = this.f1764e;
        if (aVar != null) {
            if (!this.f1768i) {
                try {
                    this.f1768i = true;
                    aVar.d();
                    aVar.f1584q.y(aVar, true);
                } finally {
                    this.f1768i = false;
                }
            }
            this.f1764e = null;
        }
    }

    @Override // x7.a
    public final g0 d(int i10, ViewGroup viewGroup) {
        f0 f0Var;
        g0 g0Var;
        ArrayList arrayList = this.f1766g;
        if (arrayList.size() > i10 && (g0Var = (g0) arrayList.get(i10)) != null) {
            return g0Var;
        }
        if (this.f1764e == null) {
            d1 d1Var = this.f1762c;
            d1Var.getClass();
            this.f1764e = new a(d1Var);
        }
        g0 j10 = j(i10);
        ArrayList arrayList2 = this.f1765f;
        if (arrayList2.size() > i10 && (f0Var = (f0) arrayList2.get(i10)) != null) {
            j10.setInitialSavedState(f0Var);
        }
        while (arrayList.size() <= i10) {
            arrayList.add(null);
        }
        j10.setMenuVisibility(false);
        int i11 = this.f1763d;
        if (i11 == 0) {
            j10.setUserVisibleHint(false);
        }
        arrayList.set(i10, j10);
        this.f1764e.e(viewGroup.getId(), j10, null, 1);
        if (i11 == 1) {
            this.f1764e.m(j10, androidx.lifecycle.n.f1950d);
        }
        return j10;
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
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList arrayList = this.f1765f;
            arrayList.clear();
            ArrayList arrayList2 = this.f1766g;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add((f0) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    g0 E = this.f1762c.E(bundle, str);
                    if (E != null) {
                        while (arrayList2.size() <= parseInt) {
                            arrayList2.add(null);
                        }
                        E.setMenuVisibility(false);
                        arrayList2.set(parseInt, E);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key ".concat(str));
                    }
                }
            }
        }
    }

    @Override // x7.a
    public final Parcelable g() {
        Bundle bundle;
        ArrayList arrayList = this.f1765f;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            f0[] f0VarArr = new f0[arrayList.size()];
            arrayList.toArray(f0VarArr);
            bundle.putParcelableArray("states", f0VarArr);
        } else {
            bundle = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f1766g;
            if (i10 < arrayList2.size()) {
                g0 g0Var = (g0) arrayList2.get(i10);
                if (g0Var != null && g0Var.isAdded()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    this.f1762c.S(bundle, g0Var, jr.h.n("f", i10));
                }
                i10++;
            } else {
                return bundle;
            }
        }
    }

    @Override // x7.a
    public final void h(Object obj) {
        g0 g0Var = (g0) obj;
        g0 g0Var2 = this.f1767h;
        if (g0Var != g0Var2) {
            d1 d1Var = this.f1762c;
            int i10 = this.f1763d;
            if (g0Var2 != null) {
                g0Var2.setMenuVisibility(false);
                if (i10 == 1) {
                    if (this.f1764e == null) {
                        d1Var.getClass();
                        this.f1764e = new a(d1Var);
                    }
                    this.f1764e.m(this.f1767h, androidx.lifecycle.n.f1950d);
                } else {
                    this.f1767h.setUserVisibleHint(false);
                }
            }
            g0Var.setMenuVisibility(true);
            if (i10 == 1) {
                if (this.f1764e == null) {
                    d1Var.getClass();
                    this.f1764e = new a(d1Var);
                }
                this.f1764e.m(g0Var, androidx.lifecycle.n.f1951e);
            } else {
                g0Var.setUserVisibleHint(true);
            }
            this.f1767h = g0Var;
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
