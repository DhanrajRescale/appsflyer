package g7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h1 extends j1 {

    /* renamed from: a, reason: collision with root package name */
    public final a1 f16806a;

    /* renamed from: b, reason: collision with root package name */
    public final a1 f16807b;

    public h1(a1 source, a1 a1Var) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f16806a = source;
        this.f16807b = a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Intrinsics.a(this.f16806a, h1Var.f16806a) && Intrinsics.a(this.f16807b, h1Var.f16807b);
    }

    public final int hashCode() {
        int hashCode = this.f16806a.hashCode() * 31;
        a1 a1Var = this.f16807b;
        return hashCode + (a1Var == null ? 0 : a1Var.hashCode());
    }

    public final String toString() {
        String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.f16806a + "\n                    ";
        a1 a1Var = this.f16807b;
        if (a1Var != null) {
            str = str + "|   mediatorLoadStates: " + a1Var + '\n';
        }
        return kotlin.text.l.c(str + "|)");
    }
}
