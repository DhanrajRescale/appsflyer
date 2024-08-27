package g7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f16682a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f16683b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f16684c;

    /* renamed from: d, reason: collision with root package name */
    public final a1 f16685d;

    /* renamed from: e, reason: collision with root package name */
    public final a1 f16686e;

    public c0(z0 refresh, z0 prepend, z0 append, a1 source, a1 a1Var) {
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Intrinsics.checkNotNullParameter(prepend, "prepend");
        Intrinsics.checkNotNullParameter(append, "append");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f16682a = refresh;
        this.f16683b = prepend;
        this.f16684c = append;
        this.f16685d = source;
        this.f16686e = a1Var;
        boolean z10 = source.f16650e;
        boolean z11 = source.f16649d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (Intrinsics.a(this.f16682a, c0Var.f16682a) && Intrinsics.a(this.f16683b, c0Var.f16683b) && Intrinsics.a(this.f16684c, c0Var.f16684c) && Intrinsics.a(this.f16685d, c0Var.f16685d) && Intrinsics.a(this.f16686e, c0Var.f16686e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f16685d.hashCode() + ((this.f16684c.hashCode() + ((this.f16683b.hashCode() + (this.f16682a.hashCode() * 31)) * 31)) * 31)) * 31;
        a1 a1Var = this.f16686e;
        if (a1Var != null) {
            i10 = a1Var.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.f16682a + ", prepend=" + this.f16683b + ", append=" + this.f16684c + ", source=" + this.f16685d + ", mediator=" + this.f16686e + ')';
    }
}
