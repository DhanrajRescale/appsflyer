package zi;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final k f42494a;

    /* renamed from: b, reason: collision with root package name */
    public final n f42495b;

    /* renamed from: c, reason: collision with root package name */
    public final c f42496c;

    /* renamed from: d, reason: collision with root package name */
    public String f42497d;

    public l(k approach, n nVar, c cVar) {
        Intrinsics.checkNotNullParameter(approach, "approach");
        this.f42494a = approach;
        this.f42495b = nVar;
        this.f42496c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.a(this.f42494a, lVar.f42494a) && Intrinsics.a(this.f42495b, lVar.f42495b) && Intrinsics.a(this.f42496c, lVar.f42496c);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f42494a.hashCode() * 31;
        int i10 = 0;
        n nVar = this.f42495b;
        if (nVar == null) {
            hashCode = 0;
        } else {
            hashCode = nVar.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        c cVar = this.f42496c;
        if (cVar != null) {
            i10 = cVar.f42466a.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "StockAnalysis(approach=" + this.f42494a + ", config=" + this.f42495b + ", emptyData=" + this.f42496c + ")";
    }
}
