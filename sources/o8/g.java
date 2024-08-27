package o8;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    public final q1.b f29800a;

    public g(q1.b bVar) {
        this.f29800a = bVar;
    }

    @Override // o8.i
    public final q1.b a() {
        return this.f29800a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.a(this.f29800a, ((g) obj).f29800a);
    }

    public final int hashCode() {
        q1.b bVar = this.f29800a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f29800a + ')';
    }
}
