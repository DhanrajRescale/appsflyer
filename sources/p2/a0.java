package p2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final j2.e f30518a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30519b;

    public a0(String str, int i10) {
        this.f30518a = new j2.e(str, null, 6);
        this.f30519b = i10;
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
        j2.e eVar = this.f30518a;
        if (z10) {
            kVar.d(i10, kVar.f30586e, eVar.f20699a);
            String str = eVar.f20699a;
            if (str.length() > 0) {
                kVar.e(i10, str.length() + i10);
            }
        } else {
            int i12 = kVar.f30583b;
            kVar.d(i12, kVar.f30584c, eVar.f20699a);
            String str2 = eVar.f20699a;
            if (str2.length() > 0) {
                kVar.e(i12, str2.length() + i12);
            }
        }
        int i13 = kVar.f30583b;
        int i14 = kVar.f30584c;
        if (i13 == i14) {
            i11 = i14;
        }
        int i15 = this.f30519b;
        if (i15 > 0) {
            length = (i11 + i15) - 1;
        } else {
            length = (i11 + i15) - eVar.f20699a.length();
        }
        int f10 = kotlin.ranges.d.f(length, 0, kVar.f30582a.a());
        kVar.f(f10, f10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (Intrinsics.a(this.f30518a.f20699a, a0Var.f30518a.f20699a) && this.f30519b == a0Var.f30519b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30518a.f20699a.hashCode() * 31) + this.f30519b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f30518a.f20699a);
        sb2.append("', newCursorPosition=");
        return a3.a.i(sb2, this.f30519b, ')');
    }
}
