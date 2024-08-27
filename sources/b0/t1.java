package b0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t1 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final x1 f3008a;

    /* renamed from: b, reason: collision with root package name */
    public final x1 f3009b;

    public t1(x1 x1Var, x1 x1Var2) {
        this.f3008a = x1Var;
        this.f3009b = x1Var2;
    }

    @Override // b0.x1
    public final int a(w2.b bVar, w2.k kVar) {
        return Math.max(this.f3008a.a(bVar, kVar), this.f3009b.a(bVar, kVar));
    }

    @Override // b0.x1
    public final int b(w2.b bVar) {
        return Math.max(this.f3008a.b(bVar), this.f3009b.b(bVar));
    }

    @Override // b0.x1
    public final int c(w2.b bVar, w2.k kVar) {
        return Math.max(this.f3008a.c(bVar, kVar), this.f3009b.c(bVar, kVar));
    }

    @Override // b0.x1
    public final int d(w2.b bVar) {
        return Math.max(this.f3008a.d(bVar), this.f3009b.d(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        if (Intrinsics.a(t1Var.f3008a, this.f3008a) && Intrinsics.a(t1Var.f3009b, this.f3009b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3009b.hashCode() * 31) + this.f3008a.hashCode();
    }

    public final String toString() {
        return "(" + this.f3008a + " ∪ " + this.f3009b + ')';
    }
}
