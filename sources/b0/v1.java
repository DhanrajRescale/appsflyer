package b0;

import kotlin.jvm.internal.Intrinsics;
import t0.o3;

/* loaded from: classes.dex */
public final class v1 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3027a;

    /* renamed from: b, reason: collision with root package name */
    public final t0.n1 f3028b;

    public v1(v0 v0Var, String str) {
        this.f3027a = str;
        this.f3028b = t0.t.n0(v0Var, o3.f35116a);
    }

    @Override // b0.x1
    public final int a(w2.b bVar, w2.k kVar) {
        return e().f3023a;
    }

    @Override // b0.x1
    public final int b(w2.b bVar) {
        return e().f3026d;
    }

    @Override // b0.x1
    public final int c(w2.b bVar, w2.k kVar) {
        return e().f3025c;
    }

    @Override // b0.x1
    public final int d(w2.b bVar) {
        return e().f3024b;
    }

    public final v0 e() {
        return (v0) this.f3028b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        return Intrinsics.a(e(), ((v1) obj).e());
    }

    public final void f(v0 v0Var) {
        this.f3028b.setValue(v0Var);
    }

    public final int hashCode() {
        return this.f3027a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f3027a);
        sb2.append("(left=");
        sb2.append(e().f3023a);
        sb2.append(", top=");
        sb2.append(e().f3024b);
        sb2.append(", right=");
        sb2.append(e().f3025c);
        sb2.append(", bottom=");
        return a3.a.i(sb2, e().f3026d, ')');
    }
}
