package w;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 implements n {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f38566a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38567b;

    /* renamed from: c, reason: collision with root package name */
    public final long f38568c;

    public k0(c0 c0Var, int i10, long j10) {
        this.f38566a = c0Var;
        this.f38567b = i10;
        this.f38568c = j10;
    }

    @Override // w.n
    public final a2 a(y1 y1Var) {
        return new g2(this.f38566a.a(y1Var), this.f38567b, this.f38568c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (!Intrinsics.a(k0Var.f38566a, this.f38566a) || k0Var.f38567b != this.f38567b) {
            return false;
        }
        if (k0Var.f38568c != this.f38568c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38568c) + ((k.e(this.f38567b) + (this.f38566a.hashCode() * 31)) * 31);
    }
}
