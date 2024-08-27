package androidx.compose.foundation.layout;

import b0.g1;
import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import s0.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Lc2/y0;", "Lb0/g1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PaddingElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f1262b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1263c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1264d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1265e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f1266f;

    public PaddingElement(float f10, float f11, float f12, float f13, Function1 function1) {
        this.f1262b = f10;
        this.f1263c = f11;
        this.f1264d = f12;
        this.f1265e = f13;
        this.f1266f = function1;
        if ((f10 < g.f34069a && !w2.e.a(f10, Float.NaN)) || ((f11 < g.f34069a && !w2.e.a(f11, Float.NaN)) || ((f12 < g.f34069a && !w2.e.a(f12, Float.NaN)) || (f13 < g.f34069a && !w2.e.a(f13, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b0.g1, g1.n] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f2864n = this.f1262b;
        nVar.f2865o = this.f1263c;
        nVar.f2866p = this.f1264d;
        nVar.f2867q = this.f1265e;
        nVar.f2868r = true;
        return nVar;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement;
        if (obj instanceof PaddingElement) {
            paddingElement = (PaddingElement) obj;
        } else {
            paddingElement = null;
        }
        if (paddingElement == null || !w2.e.a(this.f1262b, paddingElement.f1262b) || !w2.e.a(this.f1263c, paddingElement.f1263c) || !w2.e.a(this.f1264d, paddingElement.f1264d) || !w2.e.a(this.f1265e, paddingElement.f1265e)) {
            return false;
        }
        return true;
    }

    @Override // c2.y0
    public final int hashCode() {
        return Boolean.hashCode(true) + v.e.a(this.f1265e, v.e.a(this.f1264d, v.e.a(this.f1263c, Float.hashCode(this.f1262b) * 31, 31), 31), 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        g1 g1Var = (g1) nVar;
        g1Var.f2864n = this.f1262b;
        g1Var.f2865o = this.f1263c;
        g1Var.f2866p = this.f1264d;
        g1Var.f2867q = this.f1265e;
        g1Var.f2868r = true;
    }
}
