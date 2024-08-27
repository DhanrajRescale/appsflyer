package m1;

import s0.g;
import t0.t;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f27238e = new d(g.f34069a, g.f34069a, g.f34069a, g.f34069a);

    /* renamed from: a, reason: collision with root package name */
    public final float f27239a;

    /* renamed from: b, reason: collision with root package name */
    public final float f27240b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27241c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27242d;

    public d(float f10, float f11, float f12, float f13) {
        this.f27239a = f10;
        this.f27240b = f11;
        this.f27241c = f12;
        this.f27242d = f13;
    }

    public final long a() {
        return t.g((c() / 2.0f) + this.f27239a, (b() / 2.0f) + this.f27240b);
    }

    public final float b() {
        return this.f27242d - this.f27240b;
    }

    public final float c() {
        return this.f27241c - this.f27239a;
    }

    public final d d(d dVar) {
        return new d(Math.max(this.f27239a, dVar.f27239a), Math.max(this.f27240b, dVar.f27240b), Math.min(this.f27241c, dVar.f27241c), Math.min(this.f27242d, dVar.f27242d));
    }

    public final boolean e(d dVar) {
        if (this.f27241c <= dVar.f27239a || dVar.f27241c <= this.f27239a || this.f27242d <= dVar.f27240b || dVar.f27242d <= this.f27240b) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f27239a, dVar.f27239a) == 0 && Float.compare(this.f27240b, dVar.f27240b) == 0 && Float.compare(this.f27241c, dVar.f27241c) == 0 && Float.compare(this.f27242d, dVar.f27242d) == 0;
    }

    public final d f(float f10, float f11) {
        return new d(this.f27239a + f10, this.f27240b + f11, this.f27241c + f10, this.f27242d + f11);
    }

    public final d g(long j10) {
        return new d(c.d(j10) + this.f27239a, c.e(j10) + this.f27240b, c.d(j10) + this.f27241c, c.e(j10) + this.f27242d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f27242d) + v.e.a(this.f27241c, v.e.a(this.f27240b, Float.hashCode(this.f27239a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + t.G0(this.f27239a) + ", " + t.G0(this.f27240b) + ", " + t.G0(this.f27241c) + ", " + t.G0(this.f27242d) + ')';
    }
}
