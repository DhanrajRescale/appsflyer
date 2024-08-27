package androidx.compose.foundation;

import a0.k;
import c2.o;
import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x.m1;
import x.n1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Lc2/y0;", "Lx/m1;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class IndicationModifierElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final k f1195b;

    /* renamed from: c, reason: collision with root package name */
    public final n1 f1196c;

    public IndicationModifierElement(k kVar, n1 n1Var) {
        this.f1195b = kVar;
        this.f1196c = n1Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, c2.o, x.m1] */
    @Override // c2.y0
    public final n d() {
        c2.n a10 = this.f1196c.a(this.f1195b);
        ?? oVar = new o();
        oVar.f39633p = a10;
        oVar.Q0(a10);
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        if (Intrinsics.a(this.f1195b, indicationModifierElement.f1195b) && Intrinsics.a(this.f1196c, indicationModifierElement.f1196c)) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        return this.f1196c.hashCode() + (this.f1195b.hashCode() * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        m1 m1Var = (m1) nVar;
        c2.n a10 = this.f1196c.a(this.f1195b);
        m1Var.R0(m1Var.f39633p);
        m1Var.f39633p = a10;
        m1Var.Q0(a10);
    }
}
