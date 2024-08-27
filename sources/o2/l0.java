package o2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l0 implements q {

    /* renamed from: a, reason: collision with root package name */
    public final int f29505a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f29506b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29507c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f29508d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29509e;

    public l0(int i10, d0 d0Var, int i11, c0 c0Var, int i12) {
        this.f29505a = i10;
        this.f29506b = d0Var;
        this.f29507c = i11;
        this.f29508d = c0Var;
        this.f29509e = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f29505a != l0Var.f29505a) {
            return false;
        }
        if (!Intrinsics.a(this.f29506b, l0Var.f29506b)) {
            return false;
        }
        if (!z.a(this.f29507c, l0Var.f29507c) || !Intrinsics.a(this.f29508d, l0Var.f29508d)) {
            return false;
        }
        if (hl.f.X(this.f29509e, l0Var.f29509e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29508d.f29458a.hashCode() + da.e.f(this.f29509e, da.e.f(this.f29507c, ((this.f29505a * 31) + this.f29506b.f29469a) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.f29505a + ", weight=" + this.f29506b + ", style=" + ((Object) z.b(this.f29507c)) + ", loadingStrategy=" + ((Object) hl.f.j1(this.f29509e)) + ')';
    }
}
