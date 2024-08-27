package androidx.compose.foundation.selection;

import a0.l;
import c2.y0;
import g1.n;
import h2.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import v.e;
import x.k;
import x.n1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "Lc2/y0;", "Lg0/b;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SelectableElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1294b;

    /* renamed from: c, reason: collision with root package name */
    public final l f1295c;

    /* renamed from: d, reason: collision with root package name */
    public final n1 f1296d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1297e;

    /* renamed from: f, reason: collision with root package name */
    public final g f1298f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f1299g;

    public SelectableElement(boolean z10, l lVar, n1 n1Var, boolean z11, g gVar, Function0 function0) {
        this.f1294b = z10;
        this.f1295c = lVar;
        this.f1296d = n1Var;
        this.f1297e = z11;
        this.f1298f = gVar;
        this.f1299g = function0;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [g0.b, x.k, g1.n] */
    @Override // c2.y0
    public final n d() {
        ?? kVar = new k(this.f1295c, this.f1296d, this.f1297e, null, this.f1298f, this.f1299g);
        kVar.F = this.f1294b;
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        if (this.f1294b == selectableElement.f1294b && Intrinsics.a(this.f1295c, selectableElement.f1295c) && Intrinsics.a(this.f1296d, selectableElement.f1296d) && this.f1297e == selectableElement.f1297e && Intrinsics.a(this.f1298f, selectableElement.f1298f) && Intrinsics.a(this.f1299g, selectableElement.f1299g)) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = Boolean.hashCode(this.f1294b) * 31;
        int i12 = 0;
        l lVar = this.f1295c;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (hashCode + i10) * 31;
        n1 n1Var = this.f1296d;
        if (n1Var != null) {
            i11 = n1Var.hashCode();
        } else {
            i11 = 0;
        }
        int d10 = e.d(this.f1297e, (i13 + i11) * 31, 31);
        g gVar = this.f1298f;
        if (gVar != null) {
            i12 = Integer.hashCode(gVar.f17821a);
        }
        return this.f1299g.hashCode() + ((d10 + i12) * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        g0.b bVar = (g0.b) nVar;
        l lVar = this.f1295c;
        n1 n1Var = this.f1296d;
        boolean z10 = this.f1297e;
        g gVar = this.f1298f;
        Function0 function0 = this.f1299g;
        boolean z11 = bVar.F;
        boolean z12 = this.f1294b;
        if (z11 != z12) {
            bVar.F = z12;
            c2.g.u(bVar);
        }
        bVar.X0(lVar, n1Var, z10, null, gVar, function0);
    }
}
