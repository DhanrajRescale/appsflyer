package o8;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: a, reason: collision with root package name */
    public final q1.b f29798a;

    /* renamed from: b, reason: collision with root package name */
    public final y8.e f29799b;

    public f(q1.b bVar, y8.e eVar) {
        this.f29798a = bVar;
        this.f29799b = eVar;
    }

    @Override // o8.i
    public final q1.b a() {
        return this.f29798a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.a(this.f29798a, fVar.f29798a) && Intrinsics.a(this.f29799b, fVar.f29799b);
    }

    public final int hashCode() {
        q1.b bVar = this.f29798a;
        return this.f29799b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f29798a + ", result=" + this.f29799b + ')';
    }
}
