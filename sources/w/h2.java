package w;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final t f38518a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f38519b;

    /* renamed from: c, reason: collision with root package name */
    public final e f38520c;

    public h2(t tVar, d0 d0Var, e eVar) {
        this.f38518a = tVar;
        this.f38519b = d0Var;
        this.f38520c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return Intrinsics.a(this.f38518a, h2Var.f38518a) && Intrinsics.a(this.f38519b, h2Var.f38519b) && Intrinsics.a(this.f38520c, h2Var.f38520c);
    }

    public final int hashCode() {
        return this.f38520c.hashCode() + ((this.f38519b.hashCode() + (this.f38518a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f38518a + ", easing=" + this.f38519b + ", arcMode=" + this.f38520c + ')';
    }
}
