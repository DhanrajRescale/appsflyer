package androidx.compose.foundation.layout;

import b0.q0;
import c2.y0;
import g1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "Lc2/y0;", "Lb0/q0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class HorizontalAlignElement extends y0 {

    /* renamed from: b, reason: collision with root package name */
    public final g1.b f1252b;

    public HorizontalAlignElement(g1.e eVar) {
        this.f1252b = eVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b0.q0, g1.n] */
    @Override // c2.y0
    public final n d() {
        ?? nVar = new n();
        nVar.f2980n = this.f1252b;
        return nVar;
    }

    public final boolean equals(Object obj) {
        HorizontalAlignElement horizontalAlignElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof HorizontalAlignElement) {
            horizontalAlignElement = (HorizontalAlignElement) obj;
        } else {
            horizontalAlignElement = null;
        }
        if (horizontalAlignElement == null) {
            return false;
        }
        return Intrinsics.a(this.f1252b, horizontalAlignElement.f1252b);
    }

    @Override // c2.y0
    public final int hashCode() {
        return Float.hashCode(((g1.e) this.f1252b).f16395a);
    }

    @Override // c2.y0
    public final void j(n nVar) {
        ((q0) nVar).f2980n = this.f1252b;
    }
}
