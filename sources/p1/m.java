package p1;

import kotlin.jvm.internal.Intrinsics;
import n1.q0;
import n1.s0;

/* loaded from: classes.dex */
public final class m extends i {

    /* renamed from: a, reason: collision with root package name */
    public final float f30511a;

    /* renamed from: b, reason: collision with root package name */
    public final float f30512b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30513c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30514d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f30515e;

    public m(float f10, float f11, int i10, int i11, n1.i iVar, int i12) {
        f10 = (i12 & 1) != 0 ? s0.g.f34069a : f10;
        f11 = (i12 & 2) != 0 ? 4.0f : f11;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        iVar = (i12 & 16) != 0 ? null : iVar;
        this.f30511a = f10;
        this.f30512b = f11;
        this.f30513c = i10;
        this.f30514d = i11;
        this.f30515e = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f30511a == mVar.f30511a && this.f30512b == mVar.f30512b && s0.e(this.f30513c, mVar.f30513c) && s0.f(this.f30514d, mVar.f30514d) && Intrinsics.a(this.f30515e, mVar.f30515e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int f10 = da.e.f(this.f30514d, da.e.f(this.f30513c, v.e.a(this.f30512b, Float.hashCode(this.f30511a) * 31, 31), 31), 31);
        q0 q0Var = this.f30515e;
        if (q0Var != null) {
            i10 = q0Var.hashCode();
        } else {
            i10 = 0;
        }
        return f10 + i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f30511a);
        sb2.append(", miter=");
        sb2.append(this.f30512b);
        sb2.append(", cap=");
        int i10 = this.f30513c;
        String str2 = "Unknown";
        if (s0.e(i10, 0)) {
            str = "Butt";
        } else if (s0.e(i10, 1)) {
            str = "Round";
        } else if (!s0.e(i10, 2)) {
            str = "Unknown";
        } else {
            str = "Square";
        }
        sb2.append((Object) str);
        sb2.append(", join=");
        int i11 = this.f30514d;
        if (s0.f(i11, 0)) {
            str2 = "Miter";
        } else if (s0.f(i11, 1)) {
            str2 = "Round";
        } else if (s0.f(i11, 2)) {
            str2 = "Bevel";
        }
        sb2.append((Object) str2);
        sb2.append(", pathEffect=");
        sb2.append(this.f30515e);
        sb2.append(')');
        return sb2.toString();
    }
}
