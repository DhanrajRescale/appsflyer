package o1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f29375a;

    /* renamed from: b, reason: collision with root package name */
    public final long f29376b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29377c;

    public d(String str, long j10, int i10) {
        this.f29375a = str;
        this.f29376b = j10;
        this.f29377c = i10;
        if (str.length() != 0) {
            if (i10 >= -1 && i10 <= 63) {
                return;
            } else {
                throw new IllegalArgumentException("The id must be between -1 and 63");
            }
        }
        throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
    }

    public abstract float a(int i10);

    public abstract float b(int i10);

    public boolean c() {
        return false;
    }

    public abstract long d(float f10, float f11, float f12);

    public abstract float e(float f10, float f11, float f12);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f29377c != dVar.f29377c || !Intrinsics.a(this.f29375a, dVar.f29375a)) {
            return false;
        }
        return c.a(this.f29376b, dVar.f29376b);
    }

    public abstract long f(float f10, float f11, float f12, float f13, d dVar);

    public int hashCode() {
        int hashCode = this.f29375a.hashCode() * 31;
        int i10 = c.f29374e;
        return v.e.c(this.f29376b, hashCode, 31) + this.f29377c;
    }

    public final String toString() {
        return this.f29375a + " (id=" + this.f29377c + ", model=" + ((Object) c.b(this.f29376b)) + ')';
    }
}
