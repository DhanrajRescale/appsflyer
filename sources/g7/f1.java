package g7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f1 extends j1 {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f16746a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16747b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16748c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16749d;

    public f1(b1 loadType, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        this.f16746a = loadType;
        this.f16747b = i10;
        this.f16748c = i11;
        this.f16749d = i12;
        if (loadType != b1.f16663a) {
            if (a() > 0) {
                if (i12 >= 0) {
                    return;
                } else {
                    throw new IllegalArgumentException(jr.h.n("Invalid placeholdersRemaining ", i12).toString());
                }
            } else {
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + a()).toString());
            }
        }
        throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
    }

    public final int a() {
        return (this.f16748c - this.f16747b) + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return this.f16746a == f1Var.f16746a && this.f16747b == f1Var.f16747b && this.f16748c == f1Var.f16748c && this.f16749d == f1Var.f16749d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16749d) + da.e.f(this.f16748c, da.e.f(this.f16747b, this.f16746a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str;
        int ordinal = this.f16746a.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                str = "end";
            } else {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
        } else {
            str = "front";
        }
        StringBuilder s7 = da.e.s("PageEvent.Drop from the ", str, " (\n                    |   minPageOffset: ");
        s7.append(this.f16747b);
        s7.append("\n                    |   maxPageOffset: ");
        s7.append(this.f16748c);
        s7.append("\n                    |   placeholdersRemaining: ");
        s7.append(this.f16749d);
        s7.append("\n                    |)");
        return kotlin.text.l.c(s7.toString());
    }
}
