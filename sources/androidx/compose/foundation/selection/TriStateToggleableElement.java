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

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/TriStateToggleableElement;", "Lc2/y0;", "Lg0/e;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TriStateToggleableElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final i2.a f1306b;

    /* renamed from: c, reason: collision with root package name */
    public final l f1307c;

    /* renamed from: d, reason: collision with root package name */
    public final n1 f1308d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1309e;

    /* renamed from: f, reason: collision with root package name */
    public final g f1310f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f1311g;

    public TriStateToggleableElement(i2.a aVar, l lVar, n1 n1Var, boolean z10, g gVar, Function0 function0) {
        this.f1306b = aVar;
        this.f1307c = lVar;
        this.f1308d = n1Var;
        this.f1309e = z10;
        this.f1310f = gVar;
        this.f1311g = function0;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [x.k, g1.n, g0.e] */
    @Override // c2.y0
    public final n d() {
        ?? kVar = new k(this.f1307c, this.f1308d, this.f1309e, null, this.f1310f, this.f1311g);
        kVar.F = this.f1306b;
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        if (this.f1306b == triStateToggleableElement.f1306b && Intrinsics.a(this.f1307c, triStateToggleableElement.f1307c) && Intrinsics.a(this.f1308d, triStateToggleableElement.f1308d) && this.f1309e == triStateToggleableElement.f1309e && Intrinsics.a(this.f1310f, triStateToggleableElement.f1310f) && Intrinsics.a(this.f1311g, triStateToggleableElement.f1311g)) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f1306b.hashCode() * 31;
        int i12 = 0;
        l lVar = this.f1307c;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (hashCode + i10) * 31;
        n1 n1Var = this.f1308d;
        if (n1Var != null) {
            i11 = n1Var.hashCode();
        } else {
            i11 = 0;
        }
        int d10 = e.d(this.f1309e, (i13 + i11) * 31, 31);
        g gVar = this.f1310f;
        if (gVar != null) {
            i12 = Integer.hashCode(gVar.f17821a);
        }
        return this.f1311g.hashCode() + ((d10 + i12) * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        g0.e eVar = (g0.e) nVar;
        l lVar = this.f1307c;
        n1 n1Var = this.f1308d;
        boolean z10 = this.f1309e;
        g gVar = this.f1310f;
        Function0 function0 = this.f1311g;
        i2.a aVar = eVar.F;
        i2.a aVar2 = this.f1306b;
        if (aVar != aVar2) {
            eVar.F = aVar2;
            c2.g.u(eVar);
        }
        eVar.X0(lVar, n1Var, z10, null, gVar, function0);
    }
}
