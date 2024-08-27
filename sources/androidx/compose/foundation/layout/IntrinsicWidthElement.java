package androidx.compose.foundation.layout;

import c2.y0;
import g1.n;
import kotlin.Metadata;
import w.k;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "Lc2/y0;", "Lb0/y0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class IntrinsicWidthElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f1254b = 2;

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.n, b0.y0] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f3040n = this.f1254b;
        nVar.f3041o = true;
        return nVar;
    }

    public final boolean equals(Object obj) {
        IntrinsicWidthElement intrinsicWidthElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntrinsicWidthElement) {
            intrinsicWidthElement = (IntrinsicWidthElement) obj;
        } else {
            intrinsicWidthElement = null;
        }
        if (intrinsicWidthElement != null && this.f1254b == intrinsicWidthElement.f1254b) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        return Boolean.hashCode(true) + (k.e(this.f1254b) * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        b0.y0 y0Var = (b0.y0) nVar;
        y0Var.f3040n = this.f1254b;
        y0Var.f3041o = true;
    }
}
