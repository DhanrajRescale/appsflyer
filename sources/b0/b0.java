package b0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 implements b2.d {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f2825b;

    /* renamed from: c, reason: collision with root package name */
    public x1 f2826c;

    public b0(Function1 function1) {
        this.f2825b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        return Intrinsics.a(((b0) obj).f2825b, this.f2825b);
    }

    @Override // b2.d
    public final void f(b2.h hVar) {
        x1 x1Var = (x1) hVar.c(a2.f2821a);
        if (!Intrinsics.a(x1Var, this.f2826c)) {
            this.f2826c = x1Var;
            this.f2825b.invoke(x1Var);
        }
    }

    public final int hashCode() {
        return this.f2825b.hashCode();
    }
}
