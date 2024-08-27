package u2;

import kotlin.jvm.internal.Intrinsics;
import n1.t;
import n1.v0;

/* loaded from: classes.dex */
public final class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f36668a;

    /* renamed from: b, reason: collision with root package name */
    public final float f36669b;

    public b(v0 v0Var, float f10) {
        this.f36668a = v0Var;
        this.f36669b = f10;
    }

    @Override // u2.n
    public final long a() {
        int i10 = t.f28178j;
        return t.f28177i;
    }

    @Override // u2.n
    public final n1.p b() {
        return this.f36668a;
    }

    @Override // u2.n
    public final float c() {
        return this.f36669b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.f36668a, bVar.f36668a) && Float.compare(this.f36669b, bVar.f36669b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f36669b) + (this.f36668a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f36668a);
        sb2.append(", alpha=");
        return nn.d.l(sb2, this.f36669b, ')');
    }
}
