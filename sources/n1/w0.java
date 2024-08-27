package n1;

import ut.t;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: d, reason: collision with root package name */
    public static final w0 f28204d = new w0();

    /* renamed from: a, reason: collision with root package name */
    public final long f28205a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28206b;

    /* renamed from: c, reason: collision with root package name */
    public final float f28207c;

    public w0(long j10, long j11, float f10) {
        this.f28205a = j10;
        this.f28206b = j11;
        this.f28207c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (t.d(this.f28205a, w0Var.f28205a) && m1.c.b(this.f28206b, w0Var.f28206b) && this.f28207c == w0Var.f28207c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = t.f28178j;
        t.Companion companion = ut.t.INSTANCE;
        int hashCode = Long.hashCode(this.f28205a) * 31;
        int i11 = m1.c.f27236e;
        return Float.hashCode(this.f28207c) + v.e.c(this.f28206b, hashCode, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        v.e.t(this.f28205a, sb2, ", offset=");
        sb2.append((Object) m1.c.j(this.f28206b));
        sb2.append(", blurRadius=");
        return nn.d.l(sb2, this.f28207c, ')');
    }

    public w0() {
        this(androidx.compose.ui.graphics.a.d(4278190080L), m1.c.f27233b, s0.g.f34069a);
    }
}
