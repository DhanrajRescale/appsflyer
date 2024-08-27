package androidx.compose.foundation.layout;

import b0.b1;
import b0.c1;
import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Lc2/y0;", "Lb0/c1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OffsetElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f1257b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1258c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f1259d;

    public OffsetElement(float f10, float f11, b1 b1Var) {
        this.f1257b = f10;
        this.f1258c = f11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, b0.c1] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f2840n = this.f1257b;
        nVar.f2841o = this.f1258c;
        nVar.f2842p = true;
        return nVar;
    }

    public final boolean equals(Object obj) {
        OffsetElement offsetElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetElement) {
            offsetElement = (OffsetElement) obj;
        } else {
            offsetElement = null;
        }
        if (offsetElement == null) {
            return false;
        }
        if (w2.e.a(this.f1257b, offsetElement.f1257b) && w2.e.a(this.f1258c, offsetElement.f1258c)) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        return Boolean.hashCode(true) + v.e.a(this.f1258c, Float.hashCode(this.f1257b) * 31, 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        c1 c1Var = (c1) nVar;
        c1Var.f2840n = this.f1257b;
        c1Var.f2841o = this.f1258c;
        c1Var.f2842p = true;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) w2.e.b(this.f1257b)) + ", y=" + ((Object) w2.e.b(this.f1258c)) + ", rtlAware=true)";
    }
}
