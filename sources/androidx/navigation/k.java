package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f2230a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2231b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2232c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2233d;

    public k(s0 type, boolean z10, Object obj, boolean z11) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!type.f2303a && z10) {
            throw new IllegalArgumentException((type.b() + " does not allow nullable values").toString());
        }
        if (!z10 && z11 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.b() + " has null value but is not nullable.").toString());
        }
        this.f2230a = type;
        this.f2231b = z10;
        this.f2233d = obj;
        this.f2232c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.a(k.class, obj.getClass())) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f2231b != kVar.f2231b || this.f2232c != kVar.f2232c || !Intrinsics.a(this.f2230a, kVar.f2230a)) {
            return false;
        }
        Object obj2 = kVar.f2233d;
        Object obj3 = this.f2233d;
        if (obj3 != null) {
            return Intrinsics.a(obj3, obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = ((((this.f2230a.hashCode() * 31) + (this.f2231b ? 1 : 0)) * 31) + (this.f2232c ? 1 : 0)) * 31;
        Object obj = this.f2233d;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k.class.getSimpleName());
        sb2.append(" Type: " + this.f2230a);
        sb2.append(" Nullable: " + this.f2231b);
        if (this.f2232c) {
            sb2.append(" DefaultValue: " + this.f2233d);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }
}
