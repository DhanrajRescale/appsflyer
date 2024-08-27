package androidx.compose.foundation;

import a0.l;
import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x.x0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "Lc2/y0;", "Lx/x0;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FocusableElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final l f1194b;

    public FocusableElement(l lVar) {
        this.f1194b = lVar;
    }

    @Override // c2.y0
    public final n d() {
        return new x0(this.f1194b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FocusableElement)) {
            return false;
        }
        if (Intrinsics.a(this.f1194b, ((FocusableElement) obj).f1194b)) {
            return true;
        }
        return false;
    }

    @Override // c2.y0
    public final int hashCode() {
        l lVar = this.f1194b;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    @Override // c2.y0
    public final void j(n nVar) {
        ((x0) nVar).T0(this.f1194b);
    }
}
