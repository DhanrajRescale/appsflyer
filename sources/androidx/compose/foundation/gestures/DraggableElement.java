package androidx.compose.foundation.gestures;

import a0.l;
import c2.y0;
import g1.n;
import hu.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v.e;
import y.g1;
import y.h0;
import y.i0;
import y.v0;
import y.w0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Lc2/y0;", "Ly/v0;", "kq/e", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DraggableElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final w0 f1222b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f1223c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1224d;

    /* renamed from: e, reason: collision with root package name */
    public final l f1225e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1226f;

    /* renamed from: g, reason: collision with root package name */
    public final c f1227g;

    /* renamed from: h, reason: collision with root package name */
    public final c f1228h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1229i;

    public DraggableElement(w0 w0Var, g1 g1Var, boolean z10, l lVar, boolean z11, c cVar, c cVar2, boolean z12) {
        this.f1222b = w0Var;
        this.f1223c = g1Var;
        this.f1224d = z10;
        this.f1225e = lVar;
        this.f1226f = z11;
        this.f1227g = cVar;
        this.f1228h = cVar2;
        this.f1229i = z12;
    }

    @Override // c2.y0
    public final n d() {
        i0 i0Var;
        w0 w0Var = this.f1222b;
        h0 h0Var = h0.f40747c;
        g1 g1Var = this.f1223c;
        boolean z10 = this.f1224d;
        l lVar = this.f1225e;
        if (this.f1226f) {
            i0Var = i0.f40767e;
        } else {
            i0Var = i0.f40766d;
        }
        return new v0(w0Var, h0Var, g1Var, z10, lVar, i0Var, this.f1227g, this.f1228h, this.f1229i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        if (Intrinsics.a(this.f1222b, draggableElement.f1222b) && this.f1223c == draggableElement.f1223c && this.f1224d == draggableElement.f1224d && Intrinsics.a(this.f1225e, draggableElement.f1225e) && this.f1226f == draggableElement.f1226f && Intrinsics.a(this.f1227g, draggableElement.f1227g) && Intrinsics.a(this.f1228h, draggableElement.f1228h) && this.f1229i == draggableElement.f1229i) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        int i10;
        int d10 = e.d(this.f1224d, (this.f1223c.hashCode() + (this.f1222b.hashCode() * 31)) * 31, 31);
        l lVar = this.f1225e;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        return Boolean.hashCode(this.f1229i) + ((this.f1228h.hashCode() + ((this.f1227g.hashCode() + e.d(this.f1226f, (d10 + i10) * 31, 31)) * 31)) * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        i0 i0Var;
        v0 v0Var = (v0) nVar;
        w0 w0Var = this.f1222b;
        h0 h0Var = h0.f40747c;
        g1 g1Var = this.f1223c;
        boolean z10 = this.f1224d;
        l lVar = this.f1225e;
        if (this.f1226f) {
            i0Var = i0.f40767e;
        } else {
            i0Var = i0.f40766d;
        }
        v0Var.Y0(w0Var, h0Var, g1Var, z10, lVar, i0Var, this.f1227g, this.f1228h, this.f1229i);
    }
}
