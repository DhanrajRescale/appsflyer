package j2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final r f20752a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20753b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20754c;

    public q(r2.c cVar, int i10, int i11) {
        this.f20752a = cVar;
        this.f20753b = i10;
        this.f20754c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.a(this.f20752a, qVar.f20752a) && this.f20753b == qVar.f20753b && this.f20754c == qVar.f20754c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20754c) + da.e.f(this.f20753b, this.f20752a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f20752a);
        sb2.append(", startIndex=");
        sb2.append(this.f20753b);
        sb2.append(", endIndex=");
        return a3.a.i(sb2, this.f20754c, ')');
    }
}
