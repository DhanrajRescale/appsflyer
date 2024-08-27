package ol;

import kotlin.jvm.internal.Intrinsics;
import v.e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f30112a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30113b;

    public a(String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f30112a = name;
        this.f30113b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.f30112a, aVar.f30112a) && this.f30113b == aVar.f30113b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f30112a.hashCode() * 31;
        boolean z10 = this.f30113b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GateKeeper(name=");
        sb2.append(this.f30112a);
        sb2.append(", value=");
        return e.k(sb2, this.f30113b, ')');
    }
}
