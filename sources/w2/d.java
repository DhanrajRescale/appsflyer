package w2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final float f38779a;

    /* renamed from: b, reason: collision with root package name */
    public final float f38780b;

    /* renamed from: c, reason: collision with root package name */
    public final x2.a f38781c;

    public d(float f10, float f11, x2.a aVar) {
        this.f38779a = f10;
        this.f38780b = f11;
        this.f38781c = aVar;
    }

    @Override // w2.b
    public final float Y() {
        return this.f38780b;
    }

    @Override // w2.b
    public final float b() {
        return this.f38779a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f38779a, dVar.f38779a) == 0 && Float.compare(this.f38780b, dVar.f38780b) == 0 && Intrinsics.a(this.f38781c, dVar.f38781c);
    }

    public final int hashCode() {
        return this.f38781c.hashCode() + v.e.a(this.f38780b, Float.hashCode(this.f38779a) * 31, 31);
    }

    @Override // w2.b
    public final long o(float f10) {
        return yk.j.i1(4294967296L, this.f38781c.a(f10));
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f38779a + ", fontScale=" + this.f38780b + ", converter=" + this.f38781c + ')';
    }

    @Override // w2.b
    public final float x(long j10) {
        if (n.a(m.b(j10), 4294967296L)) {
            return this.f38781c.b(m.c(j10));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }
}
