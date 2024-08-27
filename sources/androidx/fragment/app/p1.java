package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class p1 {

    /* renamed from: b, reason: collision with root package name */
    public int f1799b;

    /* renamed from: c, reason: collision with root package name */
    public int f1800c;

    /* renamed from: d, reason: collision with root package name */
    public int f1801d;

    /* renamed from: e, reason: collision with root package name */
    public int f1802e;

    /* renamed from: f, reason: collision with root package name */
    public int f1803f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1804g;

    /* renamed from: i, reason: collision with root package name */
    public String f1806i;

    /* renamed from: j, reason: collision with root package name */
    public int f1807j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1808k;

    /* renamed from: l, reason: collision with root package name */
    public int f1809l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f1810m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1811n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f1812o;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1798a = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f1805h = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1813p = false;

    public final void b(o1 o1Var) {
        this.f1798a.add(o1Var);
        o1Var.f1790d = this.f1799b;
        o1Var.f1791e = this.f1800c;
        o1Var.f1792f = this.f1801d;
        o1Var.f1793g = this.f1802e;
    }

    public final void c(String str) {
        if (this.f1805h) {
            this.f1804g = true;
            this.f1806i = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public final void d() {
        if (!this.f1804g) {
            this.f1805h = false;
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public abstract void e(int i10, g0 g0Var, String str, int i11);

    public final void f(int i10, g0 g0Var, String str) {
        if (i10 != 0) {
            e(i10, g0Var, str, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
}
