package zi;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f42462a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42463b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f42464c;

    /* renamed from: d, reason: collision with root package name */
    public final String f42465d;

    public b(String value, String str, Boolean bool, String str2) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f42462a = value;
        this.f42463b = str;
        this.f42464c = bool;
        this.f42465d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.f42462a, bVar.f42462a) && Intrinsics.a(this.f42463b, bVar.f42463b) && Intrinsics.a(this.f42464c, bVar.f42464c) && Intrinsics.a(this.f42465d, bVar.f42465d);
    }

    public final int hashCode() {
        int hashCode = this.f42462a.hashCode() * 31;
        String str = this.f42463b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f42464c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f42465d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataUnit(value=");
        sb2.append(this.f42462a);
        sb2.append(", suffix=");
        sb2.append(this.f42463b);
        sb2.append(", trophy=");
        sb2.append(this.f42464c);
        sb2.append(", prefix=");
        return nn.d.o(sb2, this.f42465d, ")");
    }
}
