package l0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final p f23808a;

    /* renamed from: b, reason: collision with root package name */
    public final p f23809b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23810c;

    public q(p pVar, p pVar2, boolean z10) {
        this.f23808a = pVar;
        this.f23809b = pVar2;
        this.f23810c = z10;
    }

    public static q a(q qVar, p pVar, p pVar2, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            pVar = qVar.f23808a;
        }
        if ((i10 & 2) != 0) {
            pVar2 = qVar.f23809b;
        }
        if ((i10 & 4) != 0) {
            z10 = qVar.f23810c;
        }
        qVar.getClass();
        return new q(pVar, pVar2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.a(this.f23808a, qVar.f23808a) && Intrinsics.a(this.f23809b, qVar.f23809b) && this.f23810c == qVar.f23810c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23810c) + ((this.f23809b.hashCode() + (this.f23808a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Selection(start=");
        sb2.append(this.f23808a);
        sb2.append(", end=");
        sb2.append(this.f23809b);
        sb2.append(", handlesCrossed=");
        return v.e.k(sb2, this.f23810c, ')');
    }
}
