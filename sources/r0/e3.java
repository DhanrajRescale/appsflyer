package r0;

/* loaded from: classes.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f32386a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32387b;

    /* renamed from: c, reason: collision with root package name */
    public final float f32388c;

    public e3(float f10, float f11, float f12) {
        this.f32386a = f10;
        this.f32387b = f11;
        this.f32388c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        if (w2.e.a(this.f32386a, e3Var.f32386a) && w2.e.a(this.f32387b, e3Var.f32387b) && w2.e.a(this.f32388c, e3Var.f32388c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32388c) + v.e.a(this.f32387b, Float.hashCode(this.f32386a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabPosition(left=");
        float f10 = this.f32386a;
        sb2.append((Object) w2.e.b(f10));
        sb2.append(", right=");
        float f11 = this.f32387b;
        sb2.append((Object) w2.e.b(f10 + f11));
        sb2.append(", width=");
        sb2.append((Object) w2.e.b(f11));
        sb2.append(", contentWidth=");
        sb2.append((Object) w2.e.b(this.f32388c));
        sb2.append(')');
        return sb2.toString();
    }
}
