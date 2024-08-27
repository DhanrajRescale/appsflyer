package androidx.compose.foundation.selection;

import a0.l;
import c2.y0;
import g0.d;
import g1.n;
import h2.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v.e;
import x.n1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "Lc2/y0;", "Lg0/d;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ToggleableElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1300b;

    /* renamed from: c, reason: collision with root package name */
    public final l f1301c;

    /* renamed from: d, reason: collision with root package name */
    public final n1 f1302d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1303e;

    /* renamed from: f, reason: collision with root package name */
    public final g f1304f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f1305g;

    public ToggleableElement(boolean z10, l lVar, n1 n1Var, boolean z11, g gVar, Function1 function1) {
        this.f1300b = z10;
        this.f1301c = lVar;
        this.f1302d = n1Var;
        this.f1303e = z11;
        this.f1304f = gVar;
        this.f1305g = function1;
    }

    @Override // c2.y0
    public final n d() {
        return new d(this.f1300b, this.f1301c, this.f1302d, this.f1303e, this.f1304f, this.f1305g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        if (this.f1300b == toggleableElement.f1300b && Intrinsics.a(this.f1301c, toggleableElement.f1301c) && Intrinsics.a(this.f1302d, toggleableElement.f1302d) && this.f1303e == toggleableElement.f1303e && Intrinsics.a(this.f1304f, toggleableElement.f1304f) && Intrinsics.a(this.f1305g, toggleableElement.f1305g)) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = Boolean.hashCode(this.f1300b) * 31;
        int i12 = 0;
        l lVar = this.f1301c;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (hashCode + i10) * 31;
        n1 n1Var = this.f1302d;
        if (n1Var != null) {
            i11 = n1Var.hashCode();
        } else {
            i11 = 0;
        }
        int d10 = e.d(this.f1303e, (i13 + i11) * 31, 31);
        g gVar = this.f1304f;
        if (gVar != null) {
            i12 = Integer.hashCode(gVar.f17821a);
        }
        return this.f1305g.hashCode() + ((d10 + i12) * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        d dVar = (d) nVar;
        l lVar = this.f1301c;
        n1 n1Var = this.f1302d;
        boolean z10 = this.f1303e;
        g gVar = this.f1304f;
        boolean z11 = dVar.F;
        boolean z12 = this.f1300b;
        if (z11 != z12) {
            dVar.F = z12;
            c2.g.u(dVar);
        }
        dVar.G = this.f1305g;
        dVar.X0(lVar, n1Var, z10, null, gVar, dVar.H);
    }
}
