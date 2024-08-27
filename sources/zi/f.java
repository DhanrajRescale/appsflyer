package zi;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f42472a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f42473b;

    /* renamed from: c, reason: collision with root package name */
    public final c f42474c;

    /* renamed from: d, reason: collision with root package name */
    public final g f42475d;

    public f(String sectionTitle, boolean z10, c cVar, g gVar) {
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        this.f42472a = sectionTitle;
        this.f42473b = z10;
        this.f42474c = cVar;
        this.f42475d = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.a(this.f42472a, fVar.f42472a) && this.f42473b == fVar.f42473b && Intrinsics.a(this.f42474c, fVar.f42474c) && Intrinsics.a(this.f42475d, fVar.f42475d);
    }

    public final int hashCode() {
        int hashCode;
        int d10 = v.e.d(this.f42473b, this.f42472a.hashCode() * 31, 31);
        int i10 = 0;
        c cVar = this.f42474c;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.f42466a.hashCode();
        }
        int i11 = (d10 + hashCode) * 31;
        g gVar = this.f42475d;
        if (gVar != null) {
            i10 = gVar.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "MarketOverviewSection(sectionTitle=" + this.f42472a + ", showEmptyDataUi=" + this.f42473b + ", emptyData=" + this.f42474c + ", marketSectionData=" + this.f42475d + ")";
    }
}
