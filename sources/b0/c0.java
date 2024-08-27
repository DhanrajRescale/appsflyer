package b0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c0 extends e {

    /* renamed from: h, reason: collision with root package name */
    public final g1.b f2839h;

    public c0(g1.b bVar) {
        this.f2839h = bVar;
    }

    @Override // b0.e
    public final int a(int i10, w2.k kVar) {
        return ((g1.e) this.f2839h).a(0, i10, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.a(this.f2839h, ((c0) obj).f2839h);
    }

    public final int hashCode() {
        return Float.hashCode(((g1.e) this.f2839h).f16395a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f2839h + ')';
    }
}
