package m0;

import kotlin.jvm.internal.Intrinsics;
import ut.t;

/* loaded from: classes.dex */
public final class o5 implements x.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26583a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26584b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26585c;

    public o5(boolean z10, float f10, long j10) {
        this.f26583a = z10;
        this.f26584b = f10;
        this.f26585c = j10;
    }

    @Override // x.n1
    public final c2.n a(a0.k kVar) {
        return new v1(kVar, this.f26583a, this.f26584b, new t1(this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj;
        if (this.f26583a != o5Var.f26583a || !w2.e.a(this.f26584b, o5Var.f26584b) || !Intrinsics.a(null, null)) {
            return false;
        }
        return n1.t.d(this.f26585c, o5Var.f26585c);
    }

    public final int hashCode() {
        int a10 = v.e.a(this.f26584b, Boolean.hashCode(this.f26583a) * 31, 961);
        int i10 = n1.t.f28178j;
        t.Companion companion = ut.t.INSTANCE;
        return Long.hashCode(this.f26585c) + a10;
    }
}
