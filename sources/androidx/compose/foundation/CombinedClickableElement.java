package androidx.compose.foundation;

import a0.l;
import c2.y0;
import g1.n;
import h2.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import x.k;
import x.m0;
import x.n1;
import x1.i0;
import x1.o0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Lc2/y0;", "Lx/m0;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class CombinedClickableElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final l f1185b;

    /* renamed from: c, reason: collision with root package name */
    public final n1 f1186c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1187d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1188e;

    /* renamed from: f, reason: collision with root package name */
    public final g f1189f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f1190g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1191h;

    /* renamed from: i, reason: collision with root package name */
    public final Function0 f1192i;

    /* renamed from: j, reason: collision with root package name */
    public final Function0 f1193j;

    public CombinedClickableElement(n1 n1Var, l lVar, g gVar, String str, String str2, Function0 function0, Function0 function02, Function0 function03, boolean z10) {
        this.f1185b = lVar;
        this.f1186c = n1Var;
        this.f1187d = z10;
        this.f1188e = str;
        this.f1189f = gVar;
        this.f1190g = function0;
        this.f1191h = str2;
        this.f1192i = function02;
        this.f1193j = function03;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [x.k, g1.n, x.m0] */
    @Override // c2.y0
    public final n d() {
        ?? kVar = new k(this.f1185b, this.f1186c, this.f1187d, this.f1188e, this.f1189f, this.f1190g);
        kVar.F = this.f1191h;
        kVar.G = this.f1192i;
        kVar.H = this.f1193j;
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        if (Intrinsics.a(this.f1185b, combinedClickableElement.f1185b) && Intrinsics.a(this.f1186c, combinedClickableElement.f1186c) && this.f1187d == combinedClickableElement.f1187d && Intrinsics.a(this.f1188e, combinedClickableElement.f1188e) && Intrinsics.a(this.f1189f, combinedClickableElement.f1189f) && Intrinsics.a(this.f1190g, combinedClickableElement.f1190g) && Intrinsics.a(this.f1191h, combinedClickableElement.f1191h) && Intrinsics.a(this.f1192i, combinedClickableElement.f1192i) && Intrinsics.a(this.f1193j, combinedClickableElement.f1193j)) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        l lVar = this.f1185b;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        int i17 = i10 * 31;
        n1 n1Var = this.f1186c;
        if (n1Var != null) {
            i11 = n1Var.hashCode();
        } else {
            i11 = 0;
        }
        int d10 = v.e.d(this.f1187d, (i17 + i11) * 31, 31);
        String str = this.f1188e;
        if (str != null) {
            i12 = str.hashCode();
        } else {
            i12 = 0;
        }
        int i18 = (d10 + i12) * 31;
        g gVar = this.f1189f;
        if (gVar != null) {
            i13 = Integer.hashCode(gVar.f17821a);
        } else {
            i13 = 0;
        }
        int hashCode = (this.f1190g.hashCode() + ((i18 + i13) * 31)) * 31;
        String str2 = this.f1191h;
        if (str2 != null) {
            i14 = str2.hashCode();
        } else {
            i14 = 0;
        }
        int i19 = (hashCode + i14) * 31;
        Function0 function0 = this.f1192i;
        if (function0 != null) {
            i15 = function0.hashCode();
        } else {
            i15 = 0;
        }
        int i20 = (i19 + i15) * 31;
        Function0 function02 = this.f1193j;
        if (function02 != null) {
            i16 = function02.hashCode();
        }
        return i20 + i16;
    }

    @Override // c2.y0
    public final void j(n nVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        i0 i0Var;
        m0 m0Var = (m0) nVar;
        Function0 function0 = this.f1190g;
        l lVar = this.f1185b;
        n1 n1Var = this.f1186c;
        boolean z14 = this.f1187d;
        String str = this.f1188e;
        g gVar = this.f1189f;
        String str2 = m0Var.F;
        String str3 = this.f1191h;
        if (!Intrinsics.a(str2, str3)) {
            m0Var.F = str3;
            c2.g.u(m0Var);
        }
        boolean z15 = true;
        boolean z16 = false;
        if (m0Var.G == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Function0 function02 = this.f1192i;
        if (function02 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            m0Var.V0();
            z12 = true;
        } else {
            z12 = false;
        }
        if (!Intrinsics.a(m0Var.G, function02)) {
            m0Var.G = function02;
            c2.g.u(m0Var);
        }
        if (m0Var.H == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        Function0 function03 = this.f1193j;
        if (function03 == null) {
            z16 = true;
        }
        if (z13 != z16) {
            z12 = true;
        }
        m0Var.H = function03;
        if (m0Var.f39606t == z14) {
            z15 = z12;
        }
        m0Var.X0(lVar, n1Var, z14, str, gVar, function0);
        if (z15 && (i0Var = m0Var.f39610x) != null) {
            ((o0) i0Var).S0();
            Unit unit = Unit.f23355a;
        }
    }
}
