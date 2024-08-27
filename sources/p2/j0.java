package p2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final j2.e f30580a;

    /* renamed from: b, reason: collision with root package name */
    public final v f30581b;

    public j0(j2.e eVar, v vVar) {
        this.f30580a = eVar;
        this.f30581b = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (Intrinsics.a(this.f30580a, j0Var.f30580a) && Intrinsics.a(this.f30581b, j0Var.f30581b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30581b.hashCode() + (this.f30580a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f30580a) + ", offsetMapping=" + this.f30581b + ')';
    }
}
