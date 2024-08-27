package m0;

/* loaded from: classes.dex */
public final class n7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f26546a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26547b;

    public n7(float f10, float f11) {
        this.f26546a = f10;
        this.f26547b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7)) {
            return false;
        }
        n7 n7Var = (n7) obj;
        if (w2.e.a(this.f26546a, n7Var.f26546a) && w2.e.a(this.f26547b, n7Var.f26547b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26547b) + (Float.hashCode(this.f26546a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabPosition(left=");
        float f10 = this.f26546a;
        sb2.append((Object) w2.e.b(f10));
        sb2.append(", right=");
        float f11 = this.f26547b;
        sb2.append((Object) w2.e.b(f10 + f11));
        sb2.append(", width=");
        sb2.append((Object) w2.e.b(f11));
        sb2.append(')');
        return sb2.toString();
    }
}
