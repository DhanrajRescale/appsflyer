package tu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h1 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f36460a;

    /* renamed from: b, reason: collision with root package name */
    public final long f36461b;

    public h1(long j10, long j11) {
        this.f36460a = j10;
        this.f36461b = j11;
        if (j10 >= 0) {
            if (j11 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
        }
        throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [au.i, kotlin.jvm.functions.Function2] */
    @Override // tu.b1
    public final f a(uu.c0 c0Var) {
        f1 f1Var = new f1(this, null);
        int i10 = a0.f36404a;
        return el.l.J(new u(new uu.n(f1Var, c0Var, kotlin.coroutines.k.f23369a, -2, su.a.f34776a), new au.i(2, null), 0));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h1) {
            h1 h1Var = (h1) obj;
            if (this.f36460a == h1Var.f36460a && this.f36461b == h1Var.f36461b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f36461b) + (Long.hashCode(this.f36460a) * 31);
    }

    public final String toString() {
        wt.c builder = new wt.c(2);
        long j10 = this.f36460a;
        if (j10 > 0) {
            builder.add("stopTimeout=" + j10 + "ms");
        }
        long j11 = this.f36461b;
        if (j11 < Long.MAX_VALUE) {
            builder.add("replayExpiration=" + j11 + "ms");
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.k();
        builder.f39458c = true;
        if (builder.f39457b <= 0) {
            builder = wt.c.f39455d;
        }
        return nn.d.n(new StringBuilder("SharingStarted.WhileSubscribed("), vt.g0.B(builder, null, null, null, null, 63), ')');
    }
}
