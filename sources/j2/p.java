package j2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final o f20745a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20746b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20747c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20748d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20749e;

    /* renamed from: f, reason: collision with root package name */
    public final float f20750f;

    /* renamed from: g, reason: collision with root package name */
    public final float f20751g;

    public p(a aVar, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f20745a = aVar;
        this.f20746b = i10;
        this.f20747c = i11;
        this.f20748d = i12;
        this.f20749e = i13;
        this.f20750f = f10;
        this.f20751g = f11;
    }

    public final int a(int i10) {
        int i11 = this.f20747c;
        int i12 = this.f20746b;
        return kotlin.ranges.d.f(i10, i12, i11) - i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.a(this.f20745a, pVar.f20745a) && this.f20746b == pVar.f20746b && this.f20747c == pVar.f20747c && this.f20748d == pVar.f20748d && this.f20749e == pVar.f20749e && Float.compare(this.f20750f, pVar.f20750f) == 0 && Float.compare(this.f20751g, pVar.f20751g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f20751g) + v.e.a(this.f20750f, da.e.f(this.f20749e, da.e.f(this.f20748d, da.e.f(this.f20747c, da.e.f(this.f20746b, this.f20745a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f20745a);
        sb2.append(", startIndex=");
        sb2.append(this.f20746b);
        sb2.append(", endIndex=");
        sb2.append(this.f20747c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f20748d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f20749e);
        sb2.append(", top=");
        sb2.append(this.f20750f);
        sb2.append(", bottom=");
        return nn.d.l(sb2, this.f20751g, ')');
    }
}
