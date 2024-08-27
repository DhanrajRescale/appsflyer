package b0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u0 implements h1 {

    /* renamed from: a, reason: collision with root package name */
    public final x1 f3017a;

    /* renamed from: b, reason: collision with root package name */
    public final w2.b f3018b;

    public u0(x1 x1Var, a2.k1 k1Var) {
        this.f3017a = x1Var;
        this.f3018b = k1Var;
    }

    @Override // b0.h1
    public final float a() {
        x1 x1Var = this.f3017a;
        w2.b bVar = this.f3018b;
        return bVar.N(x1Var.b(bVar));
    }

    @Override // b0.h1
    public final float b(w2.k kVar) {
        x1 x1Var = this.f3017a;
        w2.b bVar = this.f3018b;
        return bVar.N(x1Var.c(bVar, kVar));
    }

    @Override // b0.h1
    public final float c() {
        x1 x1Var = this.f3017a;
        w2.b bVar = this.f3018b;
        return bVar.N(x1Var.d(bVar));
    }

    @Override // b0.h1
    public final float d(w2.k kVar) {
        x1 x1Var = this.f3017a;
        w2.b bVar = this.f3018b;
        return bVar.N(x1Var.a(bVar, kVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (Intrinsics.a(this.f3017a, u0Var.f3017a) && Intrinsics.a(this.f3018b, u0Var.f3018b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3018b.hashCode() + (this.f3017a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f3017a + ", density=" + this.f3018b + ')';
    }
}
