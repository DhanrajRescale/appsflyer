package x;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public n1.h0 f39765a = null;

    /* renamed from: b, reason: collision with root package name */
    public n1.r f39766b = null;

    /* renamed from: c, reason: collision with root package name */
    public p1.c f39767c = null;

    /* renamed from: d, reason: collision with root package name */
    public n1.p0 f39768d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.a(this.f39765a, xVar.f39765a) && Intrinsics.a(this.f39766b, xVar.f39766b) && Intrinsics.a(this.f39767c, xVar.f39767c) && Intrinsics.a(this.f39768d, xVar.f39768d);
    }

    public final int hashCode() {
        n1.h0 h0Var = this.f39765a;
        int hashCode = (h0Var == null ? 0 : h0Var.hashCode()) * 31;
        n1.r rVar = this.f39766b;
        int hashCode2 = (hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        p1.c cVar = this.f39767c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        n1.p0 p0Var = this.f39768d;
        return hashCode3 + (p0Var != null ? p0Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f39765a + ", canvas=" + this.f39766b + ", canvasDrawScope=" + this.f39767c + ", borderPath=" + this.f39768d + ')';
    }
}
