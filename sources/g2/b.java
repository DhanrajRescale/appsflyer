package g2;

import kotlin.jvm.internal.Intrinsics;
import r1.f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final f f16429a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16430b;

    public b(f fVar, int i10) {
        this.f16429a = fVar;
        this.f16430b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.f16429a, bVar.f16429a) && this.f16430b == bVar.f16430b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16430b) + (this.f16429a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb2.append(this.f16429a);
        sb2.append(", configFlags=");
        return a3.a.i(sb2, this.f16430b, ')');
    }
}
