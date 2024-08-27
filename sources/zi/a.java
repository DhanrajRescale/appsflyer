package zi;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f42459a;

    /* renamed from: b, reason: collision with root package name */
    public final i f42460b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f42461c;

    public a(String title, i iVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f42459a = title;
        this.f42460b = iVar;
        this.f42461c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.f42459a, aVar.f42459a) && Intrinsics.a(this.f42460b, aVar.f42460b) && Intrinsics.a(this.f42461c, aVar.f42461c);
    }

    public final int hashCode() {
        int hashCode = this.f42459a.hashCode() * 31;
        i iVar = this.f42460b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Boolean bool = this.f42461c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AxisUnit(title=" + this.f42459a + ", narration=" + this.f42460b + ", isUnplottable=" + this.f42461c + ")";
    }
}
