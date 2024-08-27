package o8;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final q1.b f29801a;

    /* renamed from: b, reason: collision with root package name */
    public final y8.p f29802b;

    public h(q1.b bVar, y8.p pVar) {
        this.f29801a = bVar;
        this.f29802b = pVar;
    }

    @Override // o8.i
    public final q1.b a() {
        return this.f29801a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.a(this.f29801a, hVar.f29801a) && Intrinsics.a(this.f29802b, hVar.f29802b);
    }

    public final int hashCode() {
        return this.f29802b.hashCode() + (this.f29801a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f29801a + ", result=" + this.f29802b + ')';
    }
}
