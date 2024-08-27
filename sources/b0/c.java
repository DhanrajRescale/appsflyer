package b0;

import d4.d3;
import t0.o3;

/* loaded from: classes.dex */
public final class c implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2835a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2836b;

    /* renamed from: c, reason: collision with root package name */
    public final t0.n1 f2837c;

    /* renamed from: d, reason: collision with root package name */
    public final t0.n1 f2838d;

    public c(int i10, String str) {
        this.f2835a = i10;
        this.f2836b = str;
        u3.c cVar = u3.c.f36703e;
        o3 o3Var = o3.f35116a;
        this.f2837c = t0.t.n0(cVar, o3Var);
        this.f2838d = t0.t.n0(Boolean.TRUE, o3Var);
    }

    @Override // b0.x1
    public final int a(w2.b bVar, w2.k kVar) {
        return e().f36704a;
    }

    @Override // b0.x1
    public final int b(w2.b bVar) {
        return e().f36707d;
    }

    @Override // b0.x1
    public final int c(w2.b bVar, w2.k kVar) {
        return e().f36706c;
    }

    @Override // b0.x1
    public final int d(w2.b bVar) {
        return e().f36705b;
    }

    public final u3.c e() {
        return (u3.c) this.f2837c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        if (this.f2835a == ((c) obj).f2835a) {
            return true;
        }
        return false;
    }

    public final void f(d3 d3Var, int i10) {
        int i11 = this.f2835a;
        if (i10 == 0 || (i10 & i11) != 0) {
            this.f2837c.setValue(d3Var.f13731a.f(i11));
            this.f2838d.setValue(Boolean.valueOf(d3Var.f13731a.p(i11)));
        }
    }

    public final int hashCode() {
        return this.f2835a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2836b);
        sb2.append('(');
        sb2.append(e().f36704a);
        sb2.append(", ");
        sb2.append(e().f36705b);
        sb2.append(", ");
        sb2.append(e().f36706c);
        sb2.append(", ");
        return a3.a.i(sb2, e().f36707d, ')');
    }
}
