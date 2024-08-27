package b0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f0 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final x1 f2860a;

    /* renamed from: b, reason: collision with root package name */
    public final x1 f2861b;

    public f0(x1 x1Var, x1 x1Var2) {
        this.f2860a = x1Var;
        this.f2861b = x1Var2;
    }

    @Override // b0.x1
    public final int a(w2.b bVar, w2.k kVar) {
        int a10 = this.f2860a.a(bVar, kVar) - this.f2861b.a(bVar, kVar);
        if (a10 < 0) {
            return 0;
        }
        return a10;
    }

    @Override // b0.x1
    public final int b(w2.b bVar) {
        int b10 = this.f2860a.b(bVar) - this.f2861b.b(bVar);
        if (b10 < 0) {
            return 0;
        }
        return b10;
    }

    @Override // b0.x1
    public final int c(w2.b bVar, w2.k kVar) {
        int c10 = this.f2860a.c(bVar, kVar) - this.f2861b.c(bVar, kVar);
        if (c10 < 0) {
            return 0;
        }
        return c10;
    }

    @Override // b0.x1
    public final int d(w2.b bVar) {
        int d10 = this.f2860a.d(bVar) - this.f2861b.d(bVar);
        if (d10 < 0) {
            return 0;
        }
        return d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (Intrinsics.a(f0Var.f2860a, this.f2860a) && Intrinsics.a(f0Var.f2861b, this.f2861b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2861b.hashCode() + (this.f2860a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f2860a + " - " + this.f2861b + ')';
    }
}
