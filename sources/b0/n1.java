package b0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public float f2954a = s0.g.f34069a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2955b = true;

    /* renamed from: c, reason: collision with root package name */
    public e f2956c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return Float.compare(this.f2954a, n1Var.f2954a) == 0 && this.f2955b == n1Var.f2955b && Intrinsics.a(this.f2956c, n1Var.f2956c) && Intrinsics.a(null, null);
    }

    public final int hashCode() {
        int hashCode;
        int d10 = v.e.d(this.f2955b, Float.hashCode(this.f2954a) * 31, 31);
        e eVar = this.f2956c;
        if (eVar == null) {
            hashCode = 0;
        } else {
            hashCode = eVar.hashCode();
        }
        return (d10 + hashCode) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f2954a + ", fill=" + this.f2955b + ", crossAxisAlignment=" + this.f2956c + ", flowLayoutData=null)";
    }
}
