package b0;

/* loaded from: classes.dex */
public final class i1 implements h1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f2879a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2880b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2881c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2882d;

    public i1(float f10, float f11, float f12, float f13) {
        this.f2879a = f10;
        this.f2880b = f11;
        this.f2881c = f12;
        this.f2882d = f13;
    }

    @Override // b0.h1
    public final float a() {
        return this.f2882d;
    }

    @Override // b0.h1
    public final float b(w2.k kVar) {
        return kVar == w2.k.f38799a ? this.f2881c : this.f2879a;
    }

    @Override // b0.h1
    public final float c() {
        return this.f2880b;
    }

    @Override // b0.h1
    public final float d(w2.k kVar) {
        return kVar == w2.k.f38799a ? this.f2879a : this.f2881c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (!w2.e.a(this.f2879a, i1Var.f2879a) || !w2.e.a(this.f2880b, i1Var.f2880b) || !w2.e.a(this.f2881c, i1Var.f2881c) || !w2.e.a(this.f2882d, i1Var.f2882d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2882d) + v.e.a(this.f2881c, v.e.a(this.f2880b, Float.hashCode(this.f2879a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) w2.e.b(this.f2879a)) + ", top=" + ((Object) w2.e.b(this.f2880b)) + ", end=" + ((Object) w2.e.b(this.f2881c)) + ", bottom=" + ((Object) w2.e.b(this.f2882d)) + ')';
    }
}
