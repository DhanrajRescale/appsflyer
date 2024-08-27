package androidx.compose.foundation.layout;

import b0.w;
import g1.g;
import g1.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements w {

    /* renamed from: a, reason: collision with root package name */
    public final w2.b f1282a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1283b;

    public c(w2.b bVar, long j10) {
        this.f1282a = bVar;
        this.f1283b = j10;
    }

    @Override // b0.w
    public final o a(o oVar, g gVar) {
        return oVar.g(new BoxChildDataElement(gVar, false));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.a(this.f1282a, cVar.f1282a) && w2.a.b(this.f1283b, cVar.f1283b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f1283b) + (this.f1282a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f1282a + ", constraints=" + ((Object) w2.a.k(this.f1283b)) + ')';
    }
}
