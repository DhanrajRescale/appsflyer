package r0;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f32343a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32344b;

    /* renamed from: c, reason: collision with root package name */
    public final float f32345c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32346d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32347e;

    public c0(float f10, float f11, float f12, float f13, float f14) {
        this.f32343a = f10;
        this.f32344b = f11;
        this.f32345c = f12;
        this.f32346d = f13;
        this.f32347e = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (w2.e.a(this.f32343a, c0Var.f32343a) && w2.e.a(this.f32344b, c0Var.f32344b) && w2.e.a(this.f32345c, c0Var.f32345c) && w2.e.a(this.f32346d, c0Var.f32346d) && w2.e.a(this.f32347e, c0Var.f32347e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32347e) + v.e.a(this.f32346d, v.e.a(this.f32345c, v.e.a(this.f32344b, Float.hashCode(this.f32343a) * 31, 31), 31), 31);
    }
}
