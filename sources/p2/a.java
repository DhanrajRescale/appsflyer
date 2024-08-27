package p2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final j2.e f30516a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30517b;

    public a(j2.e eVar, int i10) {
        this.f30516a = eVar;
        this.f30517b = i10;
    }

    @Override // p2.i
    public final void a(k kVar) {
        boolean z10;
        int length;
        int i10 = kVar.f30585d;
        int i11 = -1;
        if (i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        j2.e eVar = this.f30516a;
        if (z10) {
            kVar.d(i10, kVar.f30586e, eVar.f20699a);
        } else {
            kVar.d(kVar.f30583b, kVar.f30584c, eVar.f20699a);
        }
        int i12 = kVar.f30583b;
        int i13 = kVar.f30584c;
        if (i12 == i13) {
            i11 = i13;
        }
        int i14 = this.f30517b;
        if (i14 > 0) {
            length = (i11 + i14) - 1;
        } else {
            length = (i11 + i14) - eVar.f20699a.length();
        }
        int f10 = kotlin.ranges.d.f(length, 0, kVar.f30582a.a());
        kVar.f(f10, f10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Intrinsics.a(this.f30516a.f20699a, aVar.f30516a.f20699a) && this.f30517b == aVar.f30517b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30516a.f20699a.hashCode() * 31) + this.f30517b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f30516a.f20699a);
        sb2.append("', newCursorPosition=");
        return a3.a.i(sb2, this.f30517b, ')');
    }

    public a(String str, int i10) {
        this(new j2.e(str, null, 6), i10);
    }
}
