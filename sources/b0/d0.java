package b0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d0 extends e {

    /* renamed from: h, reason: collision with root package name */
    public final g1.c f2847h;

    public d0(g1.c cVar) {
        this.f2847h = cVar;
    }

    @Override // b0.e
    public final int a(int i10, w2.k kVar) {
        return ((g1.f) this.f2847h).a(0, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.a(this.f2847h, ((d0) obj).f2847h);
    }

    public final int hashCode() {
        return Float.hashCode(((g1.f) this.f2847h).f16396a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f2847h + ')';
    }
}
