package zi;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final o f42503a;

    /* renamed from: b, reason: collision with root package name */
    public final o f42504b;

    /* renamed from: c, reason: collision with root package name */
    public final o f42505c;

    /* renamed from: d, reason: collision with root package name */
    public final float f42506d;

    /* renamed from: e, reason: collision with root package name */
    public final float f42507e;

    public n(o userInput1, o userInput2, o userInput3, float f10, float f11) {
        Intrinsics.checkNotNullParameter(userInput1, "userInput1");
        Intrinsics.checkNotNullParameter(userInput2, "userInput2");
        Intrinsics.checkNotNullParameter(userInput3, "userInput3");
        this.f42503a = userInput1;
        this.f42504b = userInput2;
        this.f42505c = userInput3;
        this.f42506d = f10;
        this.f42507e = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.a(this.f42503a, nVar.f42503a) && Intrinsics.a(this.f42504b, nVar.f42504b) && Intrinsics.a(this.f42505c, nVar.f42505c) && Float.compare(this.f42506d, nVar.f42506d) == 0 && Float.compare(this.f42507e, nVar.f42507e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f42507e) + v.e.a(this.f42506d, (this.f42505c.hashCode() + ((this.f42504b.hashCode() + (this.f42503a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "StockAnalysisConfig(userInput1=" + this.f42503a + ", userInput2=" + this.f42504b + ", userInput3=" + this.f42505c + ", marketData3=" + this.f42506d + ", marketData2=" + this.f42507e + ")";
    }
}
