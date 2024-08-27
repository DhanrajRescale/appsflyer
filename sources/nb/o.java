package nb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final b f28589b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f28590c;

    public o(b bVar, Boolean bool) {
        this.f28589b = bVar;
        this.f28590c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f28589b == oVar.f28589b && Intrinsics.a(this.f28590c, oVar.f28590c);
    }

    public final int hashCode() {
        b bVar = this.f28589b;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        Boolean bool = this.f28590c;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "ShowProgressBar(progressBarType=" + this.f28589b + ", isStories=" + this.f28590c + ")";
    }
}
