package androidx.compose.foundation;

import a0.l;
import c2.y0;
import g1.n;
import h2.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import x.i0;
import x.k;
import x.n1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Lc2/y0;", "Lx/i0;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ClickableElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final l f1179b;

    /* renamed from: c, reason: collision with root package name */
    public final n1 f1180c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1181d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1182e;

    /* renamed from: f, reason: collision with root package name */
    public final g f1183f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f1184g;

    public ClickableElement(l lVar, n1 n1Var, boolean z10, String str, g gVar, Function0 function0) {
        this.f1179b = lVar;
        this.f1180c = n1Var;
        this.f1181d = z10;
        this.f1182e = str;
        this.f1183f = gVar;
        this.f1184g = function0;
    }

    @Override // c2.y0
    public final n d() {
        return new k(this.f1179b, this.f1180c, this.f1181d, this.f1182e, this.f1183f, this.f1184g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        if (Intrinsics.a(this.f1179b, clickableElement.f1179b) && Intrinsics.a(this.f1180c, clickableElement.f1180c) && this.f1181d == clickableElement.f1181d && Intrinsics.a(this.f1182e, clickableElement.f1182e) && Intrinsics.a(this.f1183f, clickableElement.f1183f) && Intrinsics.a(this.f1184g, clickableElement.f1184g)) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        l lVar = this.f1179b;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = i10 * 31;
        n1 n1Var = this.f1180c;
        if (n1Var != null) {
            i11 = n1Var.hashCode();
        } else {
            i11 = 0;
        }
        int d10 = v.e.d(this.f1181d, (i14 + i11) * 31, 31);
        String str = this.f1182e;
        if (str != null) {
            i12 = str.hashCode();
        } else {
            i12 = 0;
        }
        int i15 = (d10 + i12) * 31;
        g gVar = this.f1183f;
        if (gVar != null) {
            i13 = Integer.hashCode(gVar.f17821a);
        }
        return this.f1184g.hashCode() + ((i15 + i13) * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        ((i0) nVar).X0(this.f1179b, this.f1180c, this.f1181d, this.f1182e, this.f1183f, this.f1184g);
    }
}
