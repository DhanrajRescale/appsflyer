package androidx.compose.foundation.layout;

import b0.w0;
import c2.y0;
import g1.n;
import kotlin.Metadata;
import w.k;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "Lc2/y0;", "Lb0/w0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class IntrinsicHeightElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f1253b = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [b0.w0, g1.n] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f3029n = this.f1253b;
        nVar.f3030o = true;
        return nVar;
    }

    public final boolean equals(Object obj) {
        IntrinsicHeightElement intrinsicHeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntrinsicHeightElement) {
            intrinsicHeightElement = (IntrinsicHeightElement) obj;
        } else {
            intrinsicHeightElement = null;
        }
        if (intrinsicHeightElement != null && this.f1253b == intrinsicHeightElement.f1253b) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        return Boolean.hashCode(true) + (k.e(this.f1253b) * 31);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        w0 w0Var = (w0) nVar;
        w0Var.f3029n = this.f1253b;
        w0Var.f3030o = true;
    }
}
