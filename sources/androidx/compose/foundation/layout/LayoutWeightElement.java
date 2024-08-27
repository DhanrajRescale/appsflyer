package androidx.compose.foundation.layout;

import b0.z0;
import c2.y0;
import g1.n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Lc2/y0;", "Lb0/z0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LayoutWeightElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f1255b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1256c;

    public LayoutWeightElement(float f10, boolean z10) {
        this.f1255b = f10;
        this.f1256c = z10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, b0.z0] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f3064n = this.f1255b;
        nVar.f3065o = this.f1256c;
        return nVar;
    }

    public final boolean equals(Object obj) {
        LayoutWeightElement layoutWeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutWeightElement) {
            layoutWeightElement = (LayoutWeightElement) obj;
        } else {
            layoutWeightElement = null;
        }
        if (layoutWeightElement == null) {
            return false;
        }
        if (this.f1255b == layoutWeightElement.f1255b && this.f1256c == layoutWeightElement.f1256c) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        return Boolean.hashCode(this.f1256c) + (Float.hashCode(this.f1255b) * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        z0 z0Var = (z0) nVar;
        z0Var.f3064n = this.f1255b;
        z0Var.f3065o = this.f1256c;
    }
}
