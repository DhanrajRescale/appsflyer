package w;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x1 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f38727a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38728b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f38729c;

    public x1(int i10, d0 d0Var, int i11) {
        this((i11 & 1) != 0 ? 300 : i10, 0, (i11 & 4) != 0 ? e0.f38470a : d0Var);
    }

    @Override // w.n
    public final a2 a(y1 y1Var) {
        return new k2(this.f38727a, this.f38728b, this.f38729c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        if (x1Var.f38727a != this.f38727a || x1Var.f38728b != this.f38728b || !Intrinsics.a(x1Var.f38729c, this.f38729c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f38729c.hashCode() + (this.f38727a * 31)) * 31) + this.f38728b;
    }

    @Override // w.c0, w.n
    public final c2 a(y1 y1Var) {
        return new k2(this.f38727a, this.f38728b, this.f38729c);
    }

    public x1(int i10, int i11, d0 d0Var) {
        this.f38727a = i10;
        this.f38728b = i11;
        this.f38729c = d0Var;
    }
}
