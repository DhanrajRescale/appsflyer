package v;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final g1.d f37608a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f37609b;

    /* renamed from: c, reason: collision with root package name */
    public final w.f0 f37610c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37611d;

    public t(w.f0 f0Var, g1.d dVar, Function1 function1, boolean z10) {
        this.f37608a = dVar;
        this.f37609b = function1;
        this.f37610c = f0Var;
        this.f37611d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.a(this.f37608a, tVar.f37608a) && Intrinsics.a(this.f37609b, tVar.f37609b) && Intrinsics.a(this.f37610c, tVar.f37610c) && this.f37611d == tVar.f37611d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37611d) + ((this.f37610c.hashCode() + ((this.f37609b.hashCode() + (this.f37608a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChangeSize(alignment=");
        sb2.append(this.f37608a);
        sb2.append(", size=");
        sb2.append(this.f37609b);
        sb2.append(", animationSpec=");
        sb2.append(this.f37610c);
        sb2.append(", clip=");
        return e.k(sb2, this.f37611d, ')');
    }
}
